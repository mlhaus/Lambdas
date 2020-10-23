/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt;

/**
 *
 * @author k0519415
 */
public class Main {

    public static void main(String[] args) {
        final int num1 = 10; // Uncomment the num++ line. Add final to the beginning of this line
        NumericFunc add10 = n -> {
            int m = num1 + n;
            return m;
        };
        int num2 = 5;
        System.out.println(add10.func(num2));
    }
}
