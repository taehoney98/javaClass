package com.chap06.sub02;


// 학생을 나타내느 클래스, Person클래스를 상속받음

public class Student extends Person{
    int studentid; // 학생의 학번


    // 생성자
    Student (String name , int studentid){
        super(name); // 부모 클래스의 생성자를 호출
        this.studentid =studentid;

    }

    // 학번을 출력하는 메서드
    void  showStudentid(){
        System.out.println("학번:" + studentid);
    }
}