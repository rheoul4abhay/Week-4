package Annotations.CustomAnnotations.AdvancedLevel.CacheResult;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {}

class ExpensiveService {
    private Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int compute(int input) {
        if (cache.containsKey(input)) {
            return cache.get(input);
        }
        int result = input * input; // Simulate expensive computation
        cache.put(input, result);
        return result;
    }
}

public class CustomCachingSystem {
    public static void main(String[] args) throws Exception {
        ExpensiveService service = new ExpensiveService();
        System.out.println(service.compute(5)); // Computes and caches
        System.out.println(service.compute(5)); // Returns cached result
    }
}
