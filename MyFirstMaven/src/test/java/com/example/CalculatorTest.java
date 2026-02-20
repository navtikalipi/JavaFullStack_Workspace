package com.example;
import com.example.Calculator;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

    public class CalculatorTest {
        @Test
        public void findBig(){
            Calculator obj=new Calculator();
            assertEquals(20,obj.findBig(10,20));

        }

        @Test
        public void findSmall(){
            Calculator obj=new Calculator();
            assertEquals(20,obj.findBig(10,20));
        }
    }

