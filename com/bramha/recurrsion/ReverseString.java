package com.bramha.recurrsion;

import java.util.Vector;

public class ReverseString {

    public static void main(String[] args) {

        Vector<Character> s = new Vector<>();
        s.add('b');
        s.add('r');
        s.add('a');
        s.add('m');
        s.add('h');
        s.add('a');

       Vector<Character> revered = reverse(s);
        System.out.println(revered);
    }

    public static Vector<Character> reverse(Vector<Character> s){
         int left = 0;
         int right = s.size()-1;
         reversedVector(s,left,right);
         return s;
    }

    public static void reversedVector(Vector<Character> s,int left,int right){
        if(left>=right) return;

        char temp = s.get(left);
        s.set(left,s.get(right));
        s.set(right,temp);

        reversedVector(s,left+1,right-1);
    }

}
