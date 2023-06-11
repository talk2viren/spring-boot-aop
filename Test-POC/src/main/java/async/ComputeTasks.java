package async;

import java.util.concurrent.CompletableFuture;

public class ComputeTasks {

    
    public String executeTask(int taskCount){

        CompletableFuture<String> future = new CompletableFuture<>();

//        CompletableFuture.runAsync()
        CompletableFuture.supplyAsync(() -> "task completed");

        for(int i=0;i<taskCount;i++){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return "Completed Task :"+taskCount;
    }


}
