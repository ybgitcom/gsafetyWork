package com.gsafety.code.Vote;

/*=======================================
 * ��Ŀ��
 * 1����������󷽷�����дѧ����Student��
 * ����ѡ�������������š�Ʊ�����浽Student�У���ʵ����Ӧ��get set ����
 * 2����������֮ǰ����ʾ����λ��ѡ�˵Ĵ��ż�����������ʾ;����һ����ѡ�����飩
 * 3��ѭ��ִ�н��ռ�������İ೤��ѡ�˴��ţ�ֱ�����������Ϊ0������ͶƱ�����빤��
 * 4���ڽ���ÿ������ĺ�ѡƱ��Ҫ����֤�ú�ѡƱ�Ƿ���Ч��
 * ����������������0��1��2��3��4��5������֮һ����������һ����ĸ��Ӧ��ʾ��������ʾ��Ϣ��
 * ��ѡƱ��Ч����������ȷ�ĺ�ѡ�˴��ţ�����������
 * 5�������������ʾ���к�ѡ�˵ĵ�Ʊ�����������ʾ
 * 6���������յ�ѡ�ߵ������Ϣ��������ʾ��
 *
 *====================================*/


import java.io.*;
/**
 * ������������һ�����������ͶƱ������ѡ�೤���೤��ѡ�˹�4λ��ÿ�������������ŷֱ�Ϊ���� 1������ 2������?3������?4��
 * �������Ա��ÿ��ѡƱ������Ĵ��ţ�1��2��3����4��ѭ��������ԣ���������0�������룬Ȼ�����к�ѡ�˵ĵ�Ʊ�����ʾ����������ʾ���յ�ѡ�ߵ���Ϣ��
 *
 */
class InputMyData{
    private BufferedReader buf=null;
    //Constructer
    public InputMyData(){
        this.buf=new BufferedReader(new InputStreamReader(System.in));
    }
    public String getString(String info){
        String temp=null;
        System.out.print(info);
        try {
            temp=this.buf.readLine();//������
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }
    public int getInt(String info,String err){//�õ�����
        int temp =0;
        String str = null;
        boolean flag=true;//����ѭ����Ƿ�
        while(flag){
            str=this.getString(info);
            if(str.matches("\\d+")){//����������ʽ���ж�������ַ�ȫ�����ֵĻ�
                temp=Integer.parseInt(str);
                flag=false;//����ѭ����ǣ��˳�
            }else{
                System.out.println(err);
            }
        }
        return temp;
    }

};
class Person implements Comparable<Person>{
    private int stuNo;
    private String name;
    private int vote;
    public Person(int stuNo, String name, int vote){
        this.stuNo=stuNo;
        this.name=name;
        this.vote=vote;
    }
    public int getStuNo() {
        return stuNo;
    }
    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVote() {
        return vote;
    }
    public void setVote(int vote) {
        this.vote = vote;
    }
    //ʵ�ֱȽϷ���
    @Override
    public int compareTo(Person o) {//����--��С����
        if(this.vote<o.vote){
            return 1;//
        }else if(this.vote>o.vote){
            return -1;
        }else{
            return 0;
        }
    }

};

class Operate{
    private Person stu[]={new Person(1,"����",0),
            new Person(2,"����",0),
            new Person(3,"����",0),
            new Person(4,"����",0)};
    private boolean flag=true;
    public Operate(){
        this.printInfo();
        while(flag){
            this.vote();
        }
        this.printInfo();
        this.getResult();
    }

    public void getResult(){
        java.util.Arrays.sort(this.stu);
        System.out.println("ͶƱ�����"+this.stu[0].getName()+"��"+this.stu[0].getVote()+"Ӯ��ͶƱ");
    }

    public void printInfo(){
        for(int i=0;i<stu.length;i++){
            System.out.println(this.stu[i].getStuNo()+": "+
                    this.stu[i].getName()+"��" +this.stu[i].getVote()+ "��'");
        }
    }
    //���ͶƱ
    public void vote(){
        InputMyData input =new InputMyData();

        int num = input.getInt("�������ѡ�˴��ţ�����0��������", "������Ϣ�����������룺");
        switch(num){
            case 0: {
                this.flag=false;
                break;
            }
            case 1:{
                this.stu[0].setVote(this.stu[0].getVote()+1);
                break;
            }
            case 2:{
                this.stu[1].setVote(this.stu[1].getVote()+1);
                break;
            }
            case 3:{
                this.stu[2].setVote(this.stu[2].getVote()+1);
                break;
            }
            case 4:{
                this.stu[3].setVote(this.stu[3].getVote()+1);
                break;
            }
            default:{
                System.out.println("����������Ч�����������룺");
                break;
            }
        }
    }

}

public class Vote {
    public static void main(String args[]){
        new Operate();
    }
}