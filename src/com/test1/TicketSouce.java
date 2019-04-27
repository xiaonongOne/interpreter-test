package com.test1;

/**
 * @ProjectName: interpreter-test
 * @Package: com.test1
 * @ClassName: TicketSouce
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class TicketSouce implements Runnable {


    private int ticket=99;

    @Override
    public void run() {
            this.sale1();
    }
    public synchronized void sale1()
    {
            System.out.println(Thread.currentThread().getName()+"号窗口卖出test");
    }

    public synchronized void sale2()
    {
            System.out.println(Thread.currentThread().getName()+"号窗口卖出test");
    }


}
