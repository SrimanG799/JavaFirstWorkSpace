package com.oops;

import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
            	System.out.println("enert String");
            	
                String s1=sc.nextLine();
                System.out.println("enter int");
                int x=sc.nextInt();
                //Complete this line
                int C=0;
                int r=0;
                int temp=x;
                
               
                while(temp>0)
                {
                   r=x%10;
                  C=C++;
                   x=x/10; 
                }
                if(C<3)
                {
                System.out.println(s1+" "+"0"+x);
                }
                else{
                    System.out.println(s1+" "+x);
                }
            }
            System.out.println("================================");

    }
}






