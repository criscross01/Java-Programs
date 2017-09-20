/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pal_your.clid;
import java.util.Scanner;

/**
 *
 * @author cta9207
 */
public class Pal_yourClid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Input number of hours worked");
        Scanner scanner = new Scanner(System.in);
        int variable = scanner.nextInt();
        double money;
        if (variable != 0)
        {
            if (variable <= 40)
            {
                money = variable * 7.15;
            }
            else
            {
                int over = variable - 40;
                money = (40 * 7.15) + (over *(7.15*1.5));
                
            }
            System.out.println(money);
        }
        else
        {
            System.out.println("Please input a number greater than zero.");
        }
        }
    }
} 

