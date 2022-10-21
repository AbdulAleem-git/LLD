// An Interface to provide mulitple rate limiter
// like, leaky bucket and sliding windoe
// currently we are just providing the sliding window
public interface RateLimiter {
    public boolean grantAccess();
}
