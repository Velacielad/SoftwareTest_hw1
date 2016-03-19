package com.dengsishun.util;


import java.util.Arrays;

/**
 * Created by Velacielad on 2016/3/18.
 */
public class Calculate {
    public boolean isTriangle(int a, int b, int c){
        int[] edge = {a,b,c};
        Arrays.sort(edge);
        if ( (edge[0]+edge[1]) <= edge[2]){
            return false;
        }
        else
            return true;
    }

    public boolean isEqu(int a, int b, int c) {
        if (a == b && b == c){
            return true;
        }
        else
            return false;
    }

    public boolean isIso(int a, int b,int c){
        if(a == b || b == c || c == a){
            return true;
        }
        else
            return false;
    }

    public String judgment(int a,int b,int c){
        if (isTriangle(a,b,c)){
            if (isEqu(a,b,c)){
                return "equilateral";
            }
            else if (isIso(a,b,c)){
                return "isosceles";
            }
            else
                return "scalene";
        }
        else {
            return "error";
        }
    }
}
