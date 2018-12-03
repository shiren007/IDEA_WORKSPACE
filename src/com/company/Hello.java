package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

/**
 * @author shiren007
 * @date 2018/12/1 0001 - 下午 9:19
 */
public class Hello {
    private int id;


    public void main(String[] args){
        //region Description
        System.out.println("hello");

        System.out.println("ao");
        Date ghf = new Date();
        ghf = null;
        //endregion


        System.out.println("hello");

        try {
            FileInputStream fis= new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
        System.out.println("args = [" + args + "]");

        for (int i = 0; i < 4; i++) {

            
        }

        if (ghf == null) {

        }

        if (ghf != null) {

        }
    }
}
