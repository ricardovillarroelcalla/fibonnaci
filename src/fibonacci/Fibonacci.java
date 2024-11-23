/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author HP Victus
 */
public class Fibonacci {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=0;
        int num2=1;
        int suma;
        int num;
        
        System.out.print("Introduzca un numero: ");
        num=sc.nextInt();
        
        for(int i=0; i<num; i++){
            System.out.println(num1+"");
            suma=num1+num2;
            num1=num2;
            num2=suma;
            
        }
        
    }
    
}
