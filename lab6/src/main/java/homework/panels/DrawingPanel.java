package homework.panels;

import homework.frames.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Random;

/**
 * this class has methods for drawing lines within a frame
 */
public class DrawingPanel extends JPanel {
    private final MainFrame frame;
    int rows, cols;
    int canvasWidth = 400, canvasHeight = 400;
    int boardWidth, boardHeight;
    int cellWidth, cellHeight;
    int padX, padY;
    int stoneSize = 20;

    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        init(10, 10);
    }

    /**
     * initialization of dimensions
     *
     * @param rows number of rows
     * @param cols number of columns
     */
    final void init(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.padX = stoneSize + 10;
        this.padY = stoneSize + 10;
        this.cellWidth = (canvasWidth - 2 * padX) / (cols - 1);
        this.cellHeight = (canvasHeight - 2 * padY) / (rows - 1);
        this.boardWidth = (cols - 1) * cellWidth;
        this.boardHeight = (rows - 1) * cellHeight;
        setPreferredSize(new Dimension(canvasWidth, canvasHeight));
    }

    /**
     * paints the component
     *
     * @param graphics 2dGraphics object
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, canvasWidth, canvasHeight);
        paintGrid(g);
    }

    /**
     * this method paints the grid based on rows
     *
     * @param g Graphics2D object reference
     */
    private void paintGrid(Graphics2D g) {
        Random random = new Random();
        g.setColor(Color.DARK_GRAY);
        for (int row = 0; row < rows; row++) {
            int x1 = padX;
            int y1 = padY + row * cellHeight;
            int x2 = padX + boardWidth;
            int y2 = y1;
            g.drawLine(x1, y1, x2, y2);
        }
        //
        Stroke stroke = new BasicStroke(2f);
        g.setStroke(stroke);
        for (int row = 0; row < rows; row++) {
            int x1 = padX + random.nextInt(padX * 5);
            int y1 = padY + row * cellHeight;
            int x2 = x1 * random.nextInt(5) + cellWidth;
            int y2 = y1;
            g.drawLine(x1, y1, x2, y2);
        }
        // trying to do random Y
        for (int row = 0; row < rows; row++) {
            int x1 = padX + row * cellWidth;
            int y1 = padY + random.nextInt(padY * 5);
            int y2 = padX + random.nextInt(padY * 10);
            int x2 = x1;
            g.drawLine(x1, y1, x2, y2);
        }
        //
        stroke = new BasicStroke();
        g.setStroke(stroke);
        for (int row = 0; row < rows; row++) {
            int x1 = padX + row * cellWidth;
            int y1 = padY;
            int y2 = padX + boardHeight;
            int x2 = x1;
            g.drawLine(x1, y1, x2, y2);
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int x = padX + col * cellWidth;
                int y = padY + row * cellHeight;
                g.setColor(Color.LIGHT_GRAY);
                g.drawOval(x - stoneSize / 2, y - stoneSize / 2, stoneSize, stoneSize);
            }
        }
    }
}
