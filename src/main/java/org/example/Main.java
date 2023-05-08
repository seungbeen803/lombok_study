package org.example;

import lombok.*;

import java.io.Serializable;

//자바 Bean으로 사용될 클래스의 조건
// 1. 모든 필드는 private로 지정하고 게터, 세터 메서드를 제공
// 2. 기본 생성자(=no-args constructor) 추가
// 3. Serializable 마커 인터페이스를 구현하여 해당 객체가 직렬화 될 수 있도록 설정
@Getter @Setter
@NoArgsConstructor // Student() 생성자가 생김, 기본생성자, 파라미터가 없음
@AllArgsConstructor  // 선언 순서대로 정리
@RequiredArgsConstructor // 필수로 받아야하는 것
@ToString // 내용을 출력해줌
class Student {
    @NonNull private String studentId;
    @NonNull private String name;
    private int age;
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("A1234", "John", 20);
        System.out.println(s1);
    }
}