package com.example.blackmambalibrary;

import android.widget.Toast;

public class Mymath {

    public static double plus (int a,int b)
    {
      return a+b;
    }

    public static double minus (int a,int b)
    {
        return a-b;
    }

    public static double multiply (int a,int b)
    {
        return a*b;
    }

    public static double devide(int a, int b)
    {
        if(b==0)
            throw  new IllegalArgumentException("YOU CAN'T DELIVE BY ZERO");
        else
        return a/b;
    }

}
