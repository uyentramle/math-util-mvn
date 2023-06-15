/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.utl.mathutil.core.test;

import static com.utl.mathutlil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author uyent
 */
public class MathUtilityTest {

    // Test ngoai le
    @Test //(expected=ten_ngoai_le.class)
    public void testFactorialGivenWrongAfgumentThrowsException() {
        //assertThrows(expectedType, executable);
        // expectedType: ngoai le can bat
        // executable: doan code gay ra ngoai le - dua 1 object chua doan code gay E
//        Executable ex = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            }
//        };
//        Executable exLambda = () -> getFactorial(-5);
//        assertThrows(IllegalArgumentException.class, exLambda);
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }

    @Test
    public void testFactorialGivenRightArguementReturnsWell() {
        //assertEquals(69, 69);

        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));

    }
}
