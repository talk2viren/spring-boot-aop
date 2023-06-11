package org.example;

public class ThreadEx1 {
    public static void main(String[] args) {

        System.out.println("Main Thread started ");

        Thread thread1=new Thread(() -> {
            System.out.println("MyThread-1 --> Start");
           for (int i=0;i<50;i++){
               try {
                   Thread.sleep(100);

                   System.out.println(Thread.currentThread().getName()+" :: "
                           +Thread.currentThread().getState()
                           +" :: "+i);

               }catch (InterruptedException e){
                   e.printStackTrace();
               }
           }
            System.out.println("MyThread-1 --> Ended");
        },"MyThread-1");

        Thread thread2=new Thread(() -> {
            System.out.println("MyThread-2 --> Start");
            thread1.start();
            try {
                thread1.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            for (int i=0;i<100;i++){
                try {
                    Thread.sleep(100);

                    System.out.println(Thread.currentThread().getName()+" :: "
                            +Thread.currentThread().getState()
                            +" :: "+i);


                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("MyThread-2 --> Ended");
        },"MyThread-2");

        System.out.println("Inside main Thread.");

        thread2.start();

        try {
            thread2.join();
//            Thread.currentThread().join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        for (int i=0;i<10;i++){

            System.out.println(Thread.currentThread().getName()+" :: "
                    +Thread.currentThread().getState()
                    +" :: "+i);

            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }



        System.out.println("Thread-1 State :: "+thread1.getState());
        System.out.println("Thread-1 State :: "+thread2.getState());
        System.out.println("Main Thread State :: "+Thread.currentThread().getState());

        System.out.println("Main Thread Ended ");

    }

}
