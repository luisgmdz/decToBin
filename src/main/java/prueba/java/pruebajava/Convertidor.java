/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.java.pruebajava;

/**
 *
 * @author luis
 */
public class Convertidor {

    public String toBinary(int[] nums) {
        String numsBin = "";
        for (int num : nums) {
            numsBin = numsBin + numToBinary(num);
        }
        return numsBin;
    }

    private String numToBinary(int num) {
        String bin = "";
        System.out.println("Num: " + num);
        while (num != 0) {
            bin = bin + String.valueOf(num % 2);
            num = num / 2;
        }
        StringBuilder sb = new StringBuilder(bin);
        bin = sb.reverse().toString();
        System.out.println("bin: " + bin);
        return bin + "\n";
    }

}
