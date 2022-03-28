package extra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MathQuizGame extends JFrame implements ActionListener {

    JLabel titleLabel = new JLabel("Math");
    JLabel questionLabel = new JLabel();
    JLabel answerLabel = new JLabel("Answer: ");

    JButton playButton = new JButton("PLAY");
    JButton mulButton = new JButton("x");
    JButton addButton = new JButton("+");
    JButton subButton = new JButton("-");
    JButton divButton = new JButton("/");

    JTextField answerField = new JTextField(10);
    JTextField remarksField = new JTextField(10);
    JTextField rightCounterField = new JTextField(10);
    JTextField wrongCounterField = new JTextField(10);

    Random random = new Random();
    int digit1 = 0;
    int digit2 = 0;
    int correctAnswer = 0;
    String operator = null;
    int rightCounter = 0;
    int wrongCounter = 0;

    public MathQuizGame(){

        setLayout(new FlowLayout());
        add(titleLabel);
        add(questionLabel);
        add(answerLabel);
        add(answerField);
        add(mulButton);
        add(addButton);
        add(subButton);
        add(divButton);
        add(rightCounterField);
        add(wrongCounterField);
        add(playButton);

        questionLabel.setVisible(false);
        answerLabel.setVisible(false);
        answerField.setVisible(false);
        mulButton.setVisible(false);
        addButton.setVisible(false);
        subButton.setVisible(false);
        divButton.setVisible(false);
        rightCounterField.setVisible(false);
        wrongCounterField.setVisible(false);;
        playButton.setVisible(true);

        playButton.addActionListener(this);
        mulButton.addActionListener(this);
        answerField.addActionListener(this);

        setTitle("Randm game");
        setSize(600,500);
//        setLocation(900,100);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == playButton){
            playButton.setVisible(false);
            questionLabel.setVisible(true);
            answerLabel.setVisible(true);
            answerField.setVisible(true);
            mulButton.setVisible(true);
            addButton.setVisible(true);
            subButton.setVisible(true);
            divButton.setVisible(true);
            rightCounterField.setVisible(true);
            wrongCounterField.setVisible(true);
            remarksField.setVisible(true);
        }
        if(e.getSource() == mulButton){
            operator = "x";
            questionLabel.setText(setQuestion(operator));
            answerField.setEditable(true);

        }
        if(e.getSource() == answerField){
            int userAnswer = Integer.parseInt(answerField.getText());
            if(userAnswer == correctAnswer){
                System.out.println("Corect");
                incrementCorrectResponse();
                answerField.setText("");
                rightCounterField.setText(rightCounter + "");
                questionLabel.setText(setQuestion(operator));
            }
            else{
                incrementWrongResponse();
                answerField.setText("");
                wrongCounterField.setText(wrongCounter + "");
                questionLabel.setText(setQuestion(operator));
            }
        }
    }

    public void incrementCorrectResponse(){
        correctAnswer += 1;
    }

    public void incrementWrongResponse(){
        wrongCounter += 1;
    }

    public String setQuestion (String operator){
        digit1 = random.nextInt(10);
        digit2 = random.nextInt(10);

        correctAnswer = digit1 * digit2;

        return digit1 + operator + digit2;
    }
    public static void main(String[] args) {
        new MathQuizGame();
    }
}
