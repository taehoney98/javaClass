package com.chap06.sub02;

public class TypeCheckMain {

    public static void main(String[] args) {
        Person person = new Person("김철수");
        Student student = new Student("이영희", 123456);


        // Person의 인스턴스인지 확인
        if (person instanceof Person){
            System.out.println("Person는 Person 클래스의 인스턴스임.");
        }
        // Student의 인스턴스읹 확인
        if (student instanceof Person){
            System.out.println("Studnet는 Person 클래스의 인스턴스임.");
        }

        // Student로 변환 할 수 있는지 확인
        if (person instanceof Student){

            Student castedStudent = (Student) person;
            castedStudent.introduce();
        }else{
            System.out.println("PErson는 student로 변환 불가 ");
        }


        // Student 객체로 부터 Person타입으로 업캐스팅
        Person p = student;
        p.introduce();

        // 다운캐스팅 가능 여부 확인 및 변환
        if (p instanceof Student){
            Student s = (Student) p;
            s.introduce();
        }



    }
}
