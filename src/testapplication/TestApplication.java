/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testapplication;
import java.util.Scanner;
/**
 *
 * @author ryanv
 */
public class TestApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 34;
        Scanner je = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String userInput = je.nextLine();
        System.out.println("You entered: " + (userInput + x));
        je.close();
        
    }
    
}
