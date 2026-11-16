/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fqr;
import java.math.BigInteger;
import java.util.Scanner;
import sum_cdi.Sum_of_Cdis;
import xpi_package.xpi_Cls;
/**
 *
 * @author acherontas
 */
public class Fqr {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        Sum_of_Cdis smcd=new Sum_of_Cdis();
        BigInteger main_number;
        Scanner console = new Scanner(System.in);
        String mn_number=new String();
        System.out.println("Enter number\n");
        main_number=console.nextBigInteger();
        mn_number=main_number.toString();
        System.out.println("ur main_number is " + main_number + "\n");
        int Sum_of_digits=smcd.get_the_sum(mn_number);
        if(Sum_of_digits>9){
            while(Sum_of_digits>9){
            String k=Integer.toString(Sum_of_digits);
            smcd.get_the_sum_number=0;
            Sum_of_digits=smcd.get_the_sum(k);
            if(Sum_of_digits<=9){break;}
            }
        }
        System.out.println("Ur main_number has sum of digit of " + Sum_of_digits+ "\n");
        BigInteger tms;
        //System.out.println("enter times \n");
        //tms=console.nextBigInteger();
        int ts=9;
        tms=BigInteger.valueOf(ts);
        System.out.println("Times  " + tms.intValue() + "\n");
        xpi_Cls xpcls=new xpi_Cls();
        for(int i=0;i<=tms.intValue();i++){
        xpcls.xip(BigInteger.valueOf(i), main_number);}
        
        
    for(int i=0;i<=9;i++){
       for(int j=0;j<=7;j++){        
                System.out.print(xpcls.vals[i][j] + " ");
      }  
       System.out.println("\n");
    }
    
    
    //Experimental
   // BigInteger a=smcd.cd(main_number);
   // System.out.println(a);
   // BigInteger aa=smcd.cdis(main_number, 0);
   // System.out.println(aa);
}
}
