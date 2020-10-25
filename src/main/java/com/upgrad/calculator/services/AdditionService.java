package com.upgrad.Calculator.services;
import org.springframework.stereotype.Component;

@Component
public class AdditionService implements MathService{

    public int operate(int x, int y) {
        return (x+y);
    }
}
