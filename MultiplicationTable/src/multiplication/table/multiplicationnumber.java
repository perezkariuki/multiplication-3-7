/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplication.table;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class multiplicationnumber {
    
public void multi3(){
     System.out.println("This is the multiple of three");
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the multiplication table type");
       int a =input.nextInt();
       if(a==3|| a==7){
       System.out.println("Enter the starting value");
       int t = input.nextInt();
       System.out.println("Enter the stopping point");
       int j = input.nextInt();
       int m=0;
       System.out.println("This is the result");
        for(int i=t;i<j;i++){
            m=i*a;
            System.out.println(""+m);
        }
    }
       else{
           System.out.println("wrong no");
       }
}
}

