/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR_2.test;
import PR_2.domain.Exercise;

import java.util.Scanner;

/**
 *Program for convertating numbers into three scale of notation
 * @author Vadym
 */
public class TestResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercise calc = new Exercise();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your six-dijit number");
        int number = in.nextInt();
        System.out.println("your resault = "+calc.Calculate(number));
    }
}
