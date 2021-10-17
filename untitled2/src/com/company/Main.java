package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("sıralıycağınız sayıları giriniz");
        int a1 = s.nextInt();
        int a2=s.nextInt();
        int a3 = s.nextInt();
        System.out.println("-------------------------------");
        int [] dizi={a1 ,a2 ,a3};
         if ((a1>a2)&&(a1>a3)){
             if(a2>a3){
                 System.out.println(" "+a1+" "+a2+" "+a3);
             }
             else   System.out.println(" "+a1+" "+a3+" "+a2);

         }
         else if ((a2>a1)&&(a2>a3)){
             if(a1>a3){
                 System.out.println(" "+a2+" "+a1+" "+a3);
             }
             else System.out.println(" "+a2+" "+a3+" "+a1);
         }
         else if ((a3>a1)&&(a3>a2)){
             if(a2>a1) {
                 System.out.println(" "+a3+" "+a2+" "+a1);
             }
             else System.out.println(" "+a3+" "+a1+" "+a2);
         }

        }
    }

