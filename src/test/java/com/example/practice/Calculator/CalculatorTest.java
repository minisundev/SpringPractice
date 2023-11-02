package com.example.practice.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test///테스트 실행환경에서 실행시킬 코드라는 것을 표시
    @DisplayName("더하기 테스트")
    void test1() {//메소드명 중요 x
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "+", 2);
        System.out.println("result = " + result);//보여주기용으로 만든 코드

        Assertions.assertEquals(10, result);//실제 테스트가 되었는지 아는 코드
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "/", 0);
        System.out.println("result = " + result);

        Assertions.assertEquals(null, result);
    }
}