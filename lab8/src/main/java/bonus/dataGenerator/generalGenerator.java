package bonus.dataGenerator;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * this class uses both cityGenerator and graphGenerator to generate data
 * this approach uses ThreadPoolExecutor
 */
public class generalGenerator {

    static {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 10; i++) {
            cityGenerator cityGenerator = new cityGenerator();
            executor.execute(cityGenerator);
        }
        executor.shutdown();

        sisterhoodGenerator sisterhoodsMaker = new sisterhoodGenerator();
        for (int iteration = 0; iteration < 50; iteration++)
            sisterhoodsMaker.generate();
    }
}
