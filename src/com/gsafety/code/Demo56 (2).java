package com.test.code;

/**
 * created by yb
 * Date:2018/5/8
 */
//����ĸ��̶߳��������߳�ִ�м������������߳�ִ�мӲ�����
class Message{
    private int data=10;
    private boolean flag = true;
    /**
     * �ӷ�����
     */
    public synchronized void add(){
        /**
         * ����������Ͳ���������
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
        System.out.println("�ӷ�����:"+this.data++);
        this.flag = false;  //�Ѿ�������ɣ��޸ı�־λ��
        super.notify(); //�����߳�
    }
    /**
     * ��������
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
        System.out.println("����:"+this.data --);
        this.flag = true;
        super.notify(); //�����߳�
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
 * ����������
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
 * ����������
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
        new Thread(new Addition(msg),"�ӷ�����A").start();
        new Thread(new Addition(msg),"�ӷ�����B").start();
        new Thread(new Subtraction(msg),"�ӷ�����A").start();
        new Thread(new Subtraction(msg),"�ӷ�����B").start();
    }
}

