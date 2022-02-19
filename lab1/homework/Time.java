// Alexandru Amarghioalei
package lab1.homework;

public class Time {
    private long startTime = 0;
    private long endTime = 0;

    public void startTime(){
        this.startTime = System.nanoTime();
    }

    public void endTime(){
        this.endTime = System.nanoTime();
    }

    public void showTime(){
        System.out.println((endTime - startTime)/1000000 + "ms");
    }
}
