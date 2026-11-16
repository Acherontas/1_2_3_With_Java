/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xpi_package;
import sum_cdi.Sum_of_Cdis;
import java.math.BigInteger;

/**
 *
 * @author acherontas
 */
public class xpi_Cls {
   public int xip_cdi;
   public BigInteger rst;
   public String s=new String();
   public Sum_of_Cdis scd=new Sum_of_Cdis();
   public int lra,rla,rkml;
   public BigInteger ar_fq_one[]=new BigInteger[10]; 
   public int afqpo=0;
   public BigInteger ar_fq_two[]=new BigInteger[10];
   public int afqpt=0;
   public int tms=0;
   public BigInteger frst;
   public int vals[][]=new int[10][10];
   public int xip(BigInteger frt,BigInteger mynmb){
    xip_cdi=0;
    rst=frt.add(mynmb);
    s=rst.toString();
    scd.get_the_sum_number=0;
    xip_cdi=scd.get_the_sum(s);
    if(xip_cdi>9){
        while(xip_cdi>9){
        String m=new String();
        m=Integer.toString(xip_cdi);
        scd.get_the_sum_number=0;
        xip_cdi=scd.get_the_sum(m);
        if(xip_cdi<=9){break;}
        }
    }
    lra=0; rla=0;rkml=0;
    System.out.println(frt  + " " + mynmb + " ::== " + rst + " with " + xip_cdi +"\n");
   // lkm[frt].ar[rkml]=xip_cdi; 
    vals[frt.intValue()][rkml]=xip_cdi;
    rkml+=1;
    if(xip_cdi==1 || xip_cdi==2 || xip_cdi==4 || xip_cdi==5 || xip_cdi==7 || xip_cdi==8 ){
        ar_fq_one[afqpo]=frt; afqpo+=1;
    }
    if(xip_cdi==3 || xip_cdi==6 || xip_cdi==9){
        ar_fq_two[afqpt]=frt; afqpt+=1;}
    for(int i=0;i<=9;i++){
     frst=rst.add(rst);
     scd.get_the_sum_number=0;
     String m=new String();
     m=frst.toString();
     xip_cdi=scd.get_the_sum(m);
     if(xip_cdi>9){
        while(xip_cdi>9){
        String mm=new String();
        mm=Integer.toString(xip_cdi);
        scd.get_the_sum_number=0;
        xip_cdi=scd.get_the_sum(mm);
        if(xip_cdi<=9){break;}
        }
    }
    
     System.out.print(rst + " + " +  rst + " ::== " +  frst + " or *2 with " + xip_cdi +"\n");
     rst=frst;
     if(rkml<=6){
         //lkm[frt].ar[rkml]=xip_cdi; 
         vals[frt.intValue()][rkml]=xip_cdi;
         rkml+=1;
     }
     if(xip_cdi==4){ rla+=1;
     //System.out.println("\n");
     }
    }
    System.out.println("\n");
   return 0;
}
    
}
