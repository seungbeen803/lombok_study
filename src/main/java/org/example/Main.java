package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//자바 Bean으로 사용될 클래스의 조건
// 1. 모든 필드는 private로 지정하고 게터, 세터 메서드를 제공
// 2. 기본 생성자(=no-args constructor) 추가
// 3. Serializable 마커 인터페이스를 구현하여 해당 객체가 직렬화 될 수 있도록 설정
class Student {
    @Getter @Setter private String studentId;
    @Getter @Setter private String name;
    @Getter @Setter private int age;
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}