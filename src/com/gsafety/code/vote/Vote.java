package com.gsafety.code.Vote;

/*=======================================
 * 题目：
 * 1）用面向对象方法，编写学生类Student，
 * 将候选人如姓名、代号、票数保存到Student中，并实现相应的get set 方法
 * 2）输入数据之前，显示出各位候选人的代号及姓名：（提示;建立一个候选人数组）
 * 3）循环执行接收键盘输入的班长候选人代号，直接输入的数字为0，结束投票的输入工作
 * 4）在接收每次输入的候选票后要求验证该后选票是否有效，
 * 即如果输入的数不是0、1、2、3、4这5个数字之一，或者输入一串字母，应显示出错误提示信息：
 * 此选票无效，请输入正确的候选人代号，并继续输入
 * 5）输入结束后显示所有候选人的得票情况，如下所示
 * 6）输入最终当选者的相关信息，如下所示。
 *
 *====================================*/


import java.io.*;
/**
 * 功能描述：有一个班采用民主投票方法推选班长，班长候选人共4位，每个人姓名及代号分别为张三 1，李四 2，王五?3，刘六?4。
 * 程序操作员将每张选票上所填的代号（1、2、3、或4）循环输入电脑，输入数字0结束输入，然后将所有候选人的得票情况显示出来，并显示最终当选者的信息。
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
            temp=this.buf.readLine();//读数据
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }
    public int getInt(String info,String err){//得到整形
        int temp =0;
        String str = null;
        boolean flag=true;//定义循环标记符
        while(flag){
            str=this.getString(info);
            if(str.matches("\\d+")){//利用正则表达式，判断输入的字符全是数字的话
                temp=Integer.parseInt(str);
                flag=false;//更改循环标记，退出
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
    //实现比较方法
    @Override
    public int compareTo(Person o) {//按大--》小排序
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
    private Person stu[]={new Person(1,"张三",0),
            new Person(2,"李四",0),
            new Person(3,"王五",0),
            new Person(4,"刘六",0)};
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
        System.out.println("投票结果："+this.stu[0].getName()+"以"+this.stu[0].getVote()+"赢得投票");
    }

    public void printInfo(){
        for(int i=0;i<stu.length;i++){
            System.out.println(this.stu[i].getStuNo()+": "+
                    this.stu[i].getName()+"【" +this.stu[i].getVote()+ "】'");
        }
    }
    //完成投票
    public void vote(){
        InputMyData input =new InputMyData();

        int num = input.getInt("请输入候选人代号（数字0结束）：", "输入信息错误！重新输入：");
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
                System.out.println("输入数据无效，请重新输入：");
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