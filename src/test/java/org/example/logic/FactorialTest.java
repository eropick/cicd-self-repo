package org.example.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    @DisplayName("양의 입력")
    public void testInputPositiveNum(){
        Factorial fact = new Factorial(5);
        assertEquals(Optional.of(120),fact.getResult());
    }

    @Test
    @DisplayName("0의 입력")
    public void testInputZero(){
        Factorial fact = new Factorial(0);
        assertEquals(Optional.of(1),fact.getResult());
    }

    @Test
    @DisplayName("음수 입력")
    public void testInputNegativeNum(){
        Factorial fact = new Factorial(3);
        assertTrue(fact.getResult().isEmpty()); //nullable => empty가 반환됨
    }

    @Test
    @DisplayName("산술 예외 발생 여부 판단")
    public void testArithmeticException(){
        assertThrows(ArithmeticException.class,()->{
           int s = 3/0;
        });
    }

}