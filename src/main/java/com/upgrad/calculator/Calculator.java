package com.upgrad.calculator;

import com.upgrad.calculator.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    @Qualifier("additionService")
    private MathService additionService;

    @Autowired @Qualifier("subtractionService")
    private MathService subtractionService;

    @Autowired @Qualifier("multiplicationService")
    private MathService multiplicationService;

    @Autowired @Qualifier("divisionService")
    private MathService divisionService;

    @Autowired @Qualifier("modulusService")
    private MathService modulusService;





    public int compute(String op, int x, int y) {
        if (op.equals("add")) {
            return this.additionService.operate(x, y);
        } else if (op.equals("sub")) {
            return this.subtractionService.operate(x, y);
        }
        else if (op.equals("mul")) {
            return this.multiplicationService.operate(x, y);
        }
        else if (op.equals("div")) {
            return this.divisionService.operate(x, y);
        }
        else if (op.equals("mod")) {
            return this.modulusService.operate(x, y);
        }else {
            throw new RuntimeException(op + " not supported.");
        }
    }
}
