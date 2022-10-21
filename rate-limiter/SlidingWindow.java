import java.util.Queue;

public class SlidingWindow implements RateLimiter {
    // Using a queue for a request which will having time
    Queue<Integer> slidingWindow;
    // Bucket Capicity or may be we can say the buffer-size
    int bucketCap;
    // will put the time into the queue
    int time;

    public SlidingWindow(int time, int cap) {
        this.time = time;
        this.bucketCap = cap;
    }

    @Override
    public boolean grantAccess() {
        // update the queue

        long currentTime = System.currentTimeMillis();
        updateQueue(currentTime);

        // check if queue is overflowed

        if (slidingWindow.size() < bucketCap) {
            slidingWindow.offer((int) currentTime);
            return true;
        }
        return false;
    }

    private void updateQueue(long currentTime) {
        if (slidingWindow.isEmpty())
            return;
        long time = (currentTime - slidingWindow.peek()) / 1000; // because time is in ms dividing by 1000

        while (time >= this.time) {
            slidingWindow.poll();
            if (slidingWindow.isEmpty())
                break;
            time = (currentTime - slidingWindow.peek()) / 1000;
        }
    }
}