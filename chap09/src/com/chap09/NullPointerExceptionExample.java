package com.chap09;

public class NullPointerExceptionExample {


    public static int getStringLength(){
        int length =0;
        try {
            String text = null;
            length = text.length();
        } catch (NullPointerException e){
            System.out.println("NullPointerException 발생: " + e.getMessage());
        }
        return length;
    }


    public static void main(String[] args) {
        getStringLength();
    }
}
