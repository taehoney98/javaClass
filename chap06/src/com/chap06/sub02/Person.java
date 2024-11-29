package com.chap06.sub02;

public class Person {
    String name; // 사람의 이름


    // 생성자
    Person(String name){
        this.name = name;
    }

    // 자신이 누구인지를 출력하는 메서드
    void  introduce(){
        System.out.println( "나는 " +name +"입니다.");
    }
}


