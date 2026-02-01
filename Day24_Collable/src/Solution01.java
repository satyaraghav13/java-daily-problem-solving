import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 100;
    }
}

public class Solution01 {
    public static void main(String[] args)
            throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(new MyCallable());

        System.out.println("Result: " + future.get());

        executor.shutdown();
    }
}