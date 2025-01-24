package org.ncu.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    @Qualifier("divisionService")
    MathService divisionService;

    @Autowired
    @Qualifier("multiplicationService")
    MathService multiplicationService;

    @Autowired
    @Qualifier("additionService")
    MathService additionService;

    @Autowired
    @Qualifier("subtractionService")
    MathService subtractionService;

    public void compute(String operation, double first , double second){

        switch (operation) {
            case "a" -> additionService.operate(first, second);
            case "s" -> subtractionService.operate(first,second);
            case "m" -> multiplicationService.operate(first,second);
            case "d" -> divisionService.operate(first,second);
        }

    }
}
