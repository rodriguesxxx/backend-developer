package backend.study;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import backend.study.services.Calculator;


public class CalculatorTest {

    @Test
    public void sumOperator(){
        Assertions.assertEquals(2.0, Calculator.sum(1.0,1.0));
    }

}
