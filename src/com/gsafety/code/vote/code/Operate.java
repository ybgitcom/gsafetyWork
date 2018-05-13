package com.vote.code;

/**
 * created by yb
 * Date:2018//8
 */
public class Operate {
    private com.vote.code.Person per[] = new com.vote.code.Person[]{new com.vote.code.Person(1,"赵一",0),
            new com.vote.code.Person(2,"钱二",0),new com.vote.code.Person(3,"孙三",0),new com.vote.code.Person(4,"李四",0),
            new com.vote.code.Person(5,"周五",0),new com.vote.code.Person(6,"五六",0)};
    private com.vote.code.InputData input = new com.vote.code.InputData();
    private boolean flag = true;
    public Operate(){
        System.out.println("【1】、赵一同学。【2】、钱二同学。\n【3】、孙三同学。"+
                "【4】、李四同学。\n【5】、周五同学。【6】、五六同学。");
        while(this.flag){
            this.vote();
        }
        this.show();
        this.result();
    }
    public void show(){
        for(int i=0;i<per.length;i++){
            System.out.println(this.per[i].getId()+":"+
                    this.per[i].getName()+":【"+this.per[i].getCount()+"】票");
        }
    }
    public void result(){
        java.util.Arrays.sort(per);
        if(per[0].getCount()>per[1].getCount()){
            System.out.println(per[0].getId()+"号："+per[0].getName()+
                    "同学最终以："+per[0].getCount()+"票当选班长，大家祝贺！！！");
        }else if(per[0].getCount()==per[1].getCount()&&per[1].getCount()!=per[2].getCount()){
            System.out.println("【"+per[0].getName()+"】同学和【"+per[1].getName()
                    +"】同学票数相等同为最高票，麻烦大家重选一次！");
        }else{
            System.out.println("超过两个以上候选人的得票数相等，请大家重新再选！");
        }
    }
    public void vote(){
        int ch = input.getInt("\n请输入候选人代号(数字0结束)：","此选票无效，请重新输入！\n");
        switch(ch){
            case 0:{
                flag = false;
                break;
            }case 1:{
                this.per[0].setCount(this.per[0].getCount()+1);
                break; }case 2:{
                this.per[1].setCount(this.per[1].getCount()+1);
                break;
            }case 3:{
                this.per[2].setCount(this.per[2].getCount()+1);
                break;
            }case 4:{
                this.per[3].setCount(this.per[3].getCount()+1);
                break;
            }case 5:{
                this.per[4].setCount(this.per[4].getCount()+1);
                break;
            }case 6:{
                this.per[5].setCount(this.per[5].getCount()+1);
                break;
            }default:{
                System.out.println("此选票无效，请重新输入！！！");
            }
        }
    }
}