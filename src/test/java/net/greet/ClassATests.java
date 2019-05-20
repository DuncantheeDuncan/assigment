package net.greet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassATests {

    @Test
    void TestingFor6years() {
        ClassB classB = new ClassB();
        classB.futureInvestmentValue(28000, 7, 6);
        assertEquals(42562.95, 42562.95);
    }

    @Test
    void TestingFor3years() {
        ClassB classB = new ClassB();
        classB.futureInvestmentValue(28000, 7, 3);
        assertEquals(34521.95, 34521.92);
    }

    @Test
    void TestingFor20years() {
        ClassB classB = new ClassB();
        classB.futureInvestmentValue(28000, 7, 20);
        assertEquals(113084.69, 113084.69);
    }


//        1 30024.12
//        2 32194.57
//        3 34521.92
//        4 37017.51
//        5 39693.51
//        6 42562.95

    
}