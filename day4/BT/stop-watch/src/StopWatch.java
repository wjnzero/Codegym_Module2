import java.util.concurrent.TimeUnit;

public class StopWatch {
    private long startTime, endTime;

    public void StartTime() {
        this.startTime = System.currentTimeMillis();
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        long end = TimeUnit.MILLISECONDS.toSeconds(endTime);
        long start = TimeUnit.MILLISECONDS.toSeconds(startTime);
        return end - start;
    }
}
