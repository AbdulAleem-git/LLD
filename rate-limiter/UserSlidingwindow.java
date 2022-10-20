import java.util.HashMap;
import java.util.Map;

public class UserSlidingwindow {
    Map<Integer, SlidingWindow> bucket;

    public UserSlidingwindow(int id) {
        bucket = new HashMap<>();
        bucket.put(id, new SlidingWindow(1, 10));
    }

    void accessApplication(int id) {
        if (bucket.get(id).grantAccess()) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied: Too many requests");
        }
    }

}

//denial of services
//
// why
// what
// how

