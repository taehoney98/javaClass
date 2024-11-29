package com.chap08;// 제너릭 클래스 정의
// T는 타입 파라미터로, GenericClass를 사용할때 구체적인 타입으로 대체됩니다.

public class GenericClass<T> {
    private T data; // T 타입의 데이터를 저장하는 변수

    // T 타입의 데이터를 설정하는 메서드 
    public T getData() {
        return data;
    }

    // T 타입의 데이터를 반환하는 메서드ㄴ
    public void setData(T data) {
        this.data = data;
    }
}
