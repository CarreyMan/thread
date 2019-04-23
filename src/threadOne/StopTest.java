package threadOne;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/11/10.
 */
public class StopTest {
//    private static boolean stopRequested;

    //    private static synchronized void requestStop(){
//        stopRequested = true;
//    }
//    private static synchronized boolean stopRequested(){
//        return stopRequested;
//    }
    public static void main(String[] args) throws InterruptedException {
//        Thread backgroundThread = new Thread(new Runnable() {
//            public void run() {
//                int i = 0;
//                System.out.println(stopRequested);
//                while (!stopRequested) {
//                    i++;
//                    System.out.println(i);
//                }
//            }
//        });
//        backgroundThread.start();
//        TimeUnit.SECONDS.sleep(1);
//        stopRequested = true;
////        requestStop();

        BigDecimal b = new BigDecimal("2");
        b = new BigDecimal("3");
        System.out.println(b);
    }
}
