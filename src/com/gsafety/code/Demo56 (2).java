package com.test.code;

/**
 * created by yb
 * Date:2018/5/8
 */
//设计四个线程对象，两个线程执行减操作，两个线程执行加操作。
class Message{
    private int data=10;
    private boolean flag = true;
    /**
     * 加法操作
     */
    public synchronized void add(){
        /**
         * 如果生产过就不能再生产
         */
        if (this.flag == false){
            try {
                super.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("加法操作:"+this.data++);
        this.flag = false;  //已经生产完成，修改标志位置
        super.notify(); //叫醒线程
    }
    /**
     * 减法操作
     */
    public synchronized void subtract(){
        if (this.flag == true){
            try {
                super.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("减法:"+this.data --);
        this.flag = true;
        super.notify(); //叫醒线程
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public boolean getFlag(){
        return flag;
    }
}
/**
 * 定义生产者
 */
class Addition implements Runnable{
    private Message msg = null;
    public Addition(Message msg){
        this.msg = msg;
    }
    @Override
    public void run() {
        for (int x = 0;x<100;x++){
            this.msg.add();
        }
    }
}
/**
 * 定义消费者
 */
class Subtraction implements Runnable{
    private Message msg = null;
    public Subtraction(Message msg){
        this.msg = msg;
    }
    @Override
    public void run(){
        for (int x=0;x<100;x++){
            this.msg.subtract();
        }
    }
}
public class Demo56 {
    public static void main(String[] args) {
        Message msg = new Message();
        new Thread(new Addition(msg),"加法对象A").start();
        new Thread(new Addition(msg),"加法对象B").start();
        new Thread(new Subtraction(msg),"加法对象A").start();
        new Thread(new Subtraction(msg),"加法对象B").start();
    }
}

