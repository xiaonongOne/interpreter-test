package com.test1;

/**
 * @ProjectName: interpreter-test
 * @Package: com.test1
 * @ClassName: Test
 * @Description:
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class Test {

    public static void main(String args[])
    {
        TicketSouce mt=new TicketSouce();
        //基于火车票创建10个窗口
        new Thread(mt,"a").start();
        new Thread(mt,"b").start();
        new Thread(mt,"c").start();
        new Thread(mt,"d").start();
        new Thread(mt,"e").start();
        new Thread(mt,"f").start();
        new Thread(mt,"g").start();
        new Thread(mt,"h").start();
        new Thread(mt,"i").start();
        new Thread(mt,"j").start();
    }

}
