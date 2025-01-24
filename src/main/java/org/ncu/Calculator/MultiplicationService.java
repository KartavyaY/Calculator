package org.ncu.Calculator;

import org.springframework.stereotype.Component;

@Component
public class MultiplicationService implements MathService{
    @Override
    public void operate(double x, double y) {
        System.out.println(x*y);
    }
}
