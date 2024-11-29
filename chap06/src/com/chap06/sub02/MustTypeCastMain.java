package com.chap06.sub02;

// 사람을나타내느 기본 클래스



// 실행을 위한 클래스
public class MustTypeCastMain{
    public static void main(String[] args) {
        Person person = new Person("사람"); // com.chap06.sub02.Person 객체 생성
        Student student = new Student("학생", 101); // com.chap06.sub02.Student 객체 생성

        person.introduce(); // "나는 사람입니다." 출력
        student.introduce(); // "나는 학생입니다." 출력
        student.showStudentid(); // "학번: 101" 출력


        // 객체의 다운캐스팅
        // person 객체를 com.chap06.sub02.Student 타입으로 다운캐스팅 해야 학번을 출력할 수 있음
//        Student castedStudent = (Student) person;
//        castedStudent.showStudentid();

        // 객처의 업캐스팅
        // 모든 Student객체는 com.chap06.sub02.Person 타ㅣㅂ으로 자동 변환 할수 있음

        Person p = student;
        p.introduce(); // "나는 학생입니다." 출력
        ((Student)p).showStudentid();

    }

}