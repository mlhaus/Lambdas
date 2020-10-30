/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hauschildt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 *
 * @author k0519415
 */
public class Main {

    // STEP 5A: Do a Google search for how to generate a String of random letters.
        // Write that code in a separate method here. Cite your source in a comment.
        // Be sure the String is returned in all capital letters.
    // End the method here
    
    public static void main(String[] args) {
        // STEP 1: instantitate an ArrayList of Widgets here
        
        // STEP 3: Create a Supplier Functional Interface. It will take no arguments and return a Widget.
            // STEP 4: Assign a random int value from -10 to 90 to a variable.
            // STEP 5B: Call the random string method here and assign the returned value to a variable. 
            // STEP 6: Instantiate a new Widget object and return it.
        // End the Supplier here
        
        // STEP 8: Create a Predicate Functional Interface to test if a Widget's value is zero or greater here.
            // This will take a single Widget as input, use the .getValue() method, and return a boolean.
            // This code should be written on a single line.
            
        // STEP 10: Create a UnaryOperator Functional Interface to convert the Widget name to all lowercase letters here.
            // This will take a single Widget as input, use both the .getName() and .setName() methods, and return the updated Widget.
            // This code should be written on a single line.
        
        // STEP 13: Create a Consumer Functional Interface to print each Widget as a string on a new line.
            // This will take a single widget as input, use the .getValue() and .getName() methods, and print each Widget.
            // This code should be written on a single line.
            
        // STEP 2: Create a loop that runs 20 times
            // STEP 7: Use the Supplier .get() method to instantitate a Widget object
            // STEP 9: Write an if statement that uses the Predicate .test() method as the condition.
                // STEP 11: If true, use the UnaryOperator .apply() method. Take the resulting Widget and add it to the ArrayList.
            // End the if statement here
        // End the loop here
                
        // STEP 12: Use a .forEach() method to iterate through each widget in the ArrayList.
            // STEP 14: Use the Consumer .accept() method.
        
    }
}
