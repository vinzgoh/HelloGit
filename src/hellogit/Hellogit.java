/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hellogit;
import java.util.Scanner;

/**
 *
 * @author Vincent
 */
public class Hellogit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tulis Nama : ");
        String name = input.nextLine();
        System.out.println("Hello "+name+" !!!");
    }
}
