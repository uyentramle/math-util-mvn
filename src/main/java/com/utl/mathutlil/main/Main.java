/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utl.mathutlil.main;

import com.utl.mathutlil.core.MathUtility;

/**
 *
 * @author uyent
 */
public class Main {

    public static void main(String[] args) {
        // Test case #1: n = 0
        System.out.println("Check getF(0) 0! | expected: 1 | actual: "
                + MathUtility.getFactorial(0));

        // Test case #2: n = 1
        System.out.println("Check getF(1) 1! | expected: 1 | actual: "
                + MathUtility.getFactorial(1));

        // Test case #3: n = 2
        System.out.println("Check getF(2) 2! | expected: 2 | actual: "
                + MathUtility.getFactorial(2));
        // Test case #4: n = 3
        System.out.println("Check getF(3) 3! | expected: 6 | actual: "
                + MathUtility.getFactorial(3));

        // Test case #5: n = 5
        System.out.println("Check getF(5) 5! | expected: 120 | actual: "
                + MathUtility.getFactorial(5));

        // Âm giai thừa thì sao??
        // Test case #6: n = -1
        System.out.println("Check getF(-1) -1! | expected: Expected | actual: ");
        MathUtility.getFactorial(-1);
    }
}
