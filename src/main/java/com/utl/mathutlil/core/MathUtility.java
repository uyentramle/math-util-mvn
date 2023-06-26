/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utl.mathutlil.core;

/**
 *
 * @author uyent
 */
public class MathUtility {

    public static final double PI = 3.1415;

    // Ham tinh n! = 1.2.3...n 
    // 0! = 1! = 1
    // Khong co giai thua cho so am
    // 21! la kieu long khong chua noi, 20! = 18 con so 0 vua kip du cho kieu long Java
    // gai rang buoc dau vao cho ham / method 
    
//    public static long getFactorial(int n) {
//        long product = 1; // tích ban đầu = 1
//
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20, please.");
//        }
//
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//
//        return product;
//    }
    // return som de ham khong bao loi
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, please.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
