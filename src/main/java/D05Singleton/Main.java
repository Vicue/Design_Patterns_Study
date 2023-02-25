package D05Singleton;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 单例模式
 * @author zhyao
 * @date 2023/1/16 3:38
 */
public class Main {

    private static ExecutorService threadPool;

    static {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("Singleton-pool-%d").build();
        threadPool = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(10), threadFactory, new ThreadPoolExecutor.AbortPolicy());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(()-> {
                Singleton instance = Singleton.getInstance();
                System.out.println(instance);
            }).start();
        }
        // threadPool.execute(()-> {
        //     Singleton instance = Singleton.getInstance();
        //     System.out.println(instance);
        // });
        // System.out.println("start");
        // threadPool.execute(()-> {
        //     Singleton instance = Singleton.getInstance();
        //     System.out.println(instance);
        // });
        // System.out.println("start");
        // threadPool.execute(()-> {
        //     Singleton instance = Singleton.getInstance();
        //     System.out.println(instance);
        // });
        // System.out.println("start");
        // threadPool.execute(()-> {
        //     Singleton instance = Singleton.getInstance();
        //     System.out.println(instance);
        // });
        // System.out.println("start");
        // threadPool.shutdown();
    }
}
