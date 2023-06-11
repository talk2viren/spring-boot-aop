package async;

import java.util.concurrent.CompletableFuture;

public class AsyncEx1 {



    public static void main(String[] args) {
        System.out.println("main method");

        CompletableFuture future1= CompletableFuture.supplyAsync(() -> new ComputeTasks().executeTask(100));
        CompletableFuture future2=CompletableFuture.supplyAsync(() -> new ComputeTasks().executeTask(500));
        CompletableFuture future3=CompletableFuture.supplyAsync(() -> new ComputeTasks().executeTask(1000));

        CompletableFuture allOfFuture=CompletableFuture.allOf(future1,future2,future3);
        allOfFuture.join();
    }
}
