package com.vote.code;

/**
 * created by yb
 * Date:2018//8
 */
public class Operate {
    private com.vote.code.Person per[] = new com.vote.code.Person[]{new com.vote.code.Person(1,"��һ",0),
            new com.vote.code.Person(2,"Ǯ��",0),new com.vote.code.Person(3,"����",0),new com.vote.code.Person(4,"����",0),
            new com.vote.code.Person(5,"����",0),new com.vote.code.Person(6,"����",0)};
    private com.vote.code.InputData input = new com.vote.code.InputData();
    private boolean flag = true;
    public Operate(){
        System.out.println("��1������һͬѧ����2����Ǯ��ͬѧ��\n��3��������ͬѧ��"+
                "��4��������ͬѧ��\n��5��������ͬѧ����6��������ͬѧ��");
        while(this.flag){
            this.vote();
        }
        this.show();
        this.result();
    }
    public void show(){
        for(int i=0;i<per.length;i++){
            System.out.println(this.per[i].getId()+":"+
                    this.per[i].getName()+":��"+this.per[i].getCount()+"��Ʊ");
        }
    }
    public void result(){
        java.util.Arrays.sort(per);
        if(per[0].getCount()>per[1].getCount()){
            System.out.println(per[0].getId()+"�ţ�"+per[0].getName()+
                    "ͬѧ�����ԣ�"+per[0].getCount()+"Ʊ��ѡ�೤�����ף�أ�����");
        }else if(per[0].getCount()==per[1].getCount()&&per[1].getCount()!=per[2].getCount()){
            System.out.println("��"+per[0].getName()+"��ͬѧ�͡�"+per[1].getName()
                    +"��ͬѧƱ�����ͬΪ���Ʊ���鷳�����ѡһ�Σ�");
        }else{
            System.out.println("�����������Ϻ�ѡ�˵ĵ�Ʊ����ȣ�����������ѡ��");
        }
    }
    public void vote(){
        int ch = input.getInt("\n�������ѡ�˴���(����0����)��","��ѡƱ��Ч�����������룡\n");
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
                System.out.println("��ѡƱ��Ч�����������룡����");
            }
        }
    }
}