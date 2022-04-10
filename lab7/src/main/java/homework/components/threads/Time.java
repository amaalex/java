package homework.components.threads;

import homework.Main;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Timer;
import java.util.TimerTask;

import static java.lang.System.exit;

/**
 * Class Time used for tracking the game.
 */
public class Time {
    public static int timeLimit;
    private static final Logger logger = LogManager.getLogger(Time.class);

    /**
     * Creates the timer as a daemon
     *
     * @param timeLimitInSeconds deadline in seconds for a specific game.
     */
    public Time(int timeLimitInSeconds) {
        Time.timeLimit = timeLimitInSeconds * 1000;
        TimerTask task = new TimerTask() {
            int timeKeeper = 0;

            @Override
            public void run() {
                if (timeKeeper <= Time.timeLimit) {
                    logger.info("Timp ramas din joc: " + (Time.timeLimit - timeKeeper) / 1000 + " secunde");
                    timeKeeper += 1000;
                } else {
                    logger.info("Nu mai este timp pentru joc");
                    exit(0);
                }
            }
        };
        Timer timer = new Timer(true);
        timer.schedule(task, 1, 1000);
    }
}
