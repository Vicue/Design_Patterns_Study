package D05Singleton;

/**
 * 单例模式
 * 用于获取同一个实例
 * @author zhyao
 * @date 2023/1/16 4:07
 */
public class Singleton {

    /**
     * 懒汉模式
     * 指程序开始运行时并不加载, 调用时再加载
     * volatile 防止编译器, CPU对指令优化时发生指令重排序
     */
    private volatile static Singleton lazy;

    /**
     * 饿汉模式
     *
     */
    private volatile static Singleton hungry = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return threadSafe2();
    }

    /**
     * 非线程安全
     * @return
     */
    public static Singleton threadNoSafe() {
        if (lazy == null) {
            // 模拟多线程延迟
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lazy = new Singleton();
        }
        return lazy;
    }

    /**
     * 使用 synchronized 开启多线程安全模式
     * 缺点: 每次访问都要加锁, 效率低
     * 实际上只要第一次初始化才需要加锁
     * @return 单体实例
     */
    public synchronized static Singleton threadSafe() {
        if (lazy == null) {
            // 模拟多线程延迟
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lazy = new Singleton();
        }
        return lazy;
    }

    public static Singleton threadSafe2() {
        if (lazy == null) {
            // 模拟多线程延迟
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 加锁
            synchronized (Singleton.class) {
                if (lazy == null) {
                    lazy = new Singleton();
                }
            }
        }
        return lazy;
    }
}
