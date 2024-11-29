package com.chap08;


public class GenericMain {
    public static void main(String[] args) {
        // String 타입을 위한 com.chap08.GenericClass 인스턴스 생성
        GenericClass<String> stringInstance = new GenericClass<>();
        stringInstance.setData("안녕, 제네릭!");// String 데이터 설정
        String data = stringInstance.getData(); // 데이터 가져오기
        System.out.println(data); // 출력: 안녕, 제너릭!

        // Integer 타입을 위한 com.chap08.GenericClass 인스턴스 생성
        GenericClass<Integer> intInstace = new GenericClass<>();
        intInstace.setData(12); // Integer 데이터 설정
        Integer intData = intInstace.getData(); // 데이터 가져오기
        System.out.println(intData); // 출력: 123

    }
}
