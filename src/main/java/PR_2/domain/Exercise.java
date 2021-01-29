/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR_2.domain;

import java.util.ArrayList;

/**
 * Main component that realise sistem of convert
 * @author User
 */
public class Exercise {
    /**
     * Program use ArrayList for saving memory
     * @param number return thre resaults
     * @return 
     */
    public ArrayList Calculate(int number) {
        ArrayList<String> arrayList = new ArrayList<>();
        /**
         * function that convert from decimal system to digital system
         */
        arrayList.add(Integer.toBinaryString(number));
        /**
         * function that convert from decimal system to octal system
         */
        arrayList.add(Integer.toOctalString(number));
        /**
         * function that convert from decimal system to hexadecimal system
         */
        arrayList.add(Integer.toHexString(number));
        return arrayList;
    }
}

