package com.vote.code;

/**
 * created by yb
 * Date:2018//8
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader buf = new BufferedReader(input);
    public int getInt(String msg,String err){
        int num =0;
        boolean flag = true;
        while(flag){
            System.out.println(msg);
            String str = "";
            try {
                str = this.buf.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if(str.matches("^\\d$")){   num = Integer.parseInt(str);
                flag = false;
            }else{
                System.out.println(err);
            }
        }
        return num;
    }
}