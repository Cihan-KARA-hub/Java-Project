package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("BUGÜN NE YAPSAMMM ... ");
Scanner k = new Scanner(System.in);
 System.out.println(" bir hava sıcaklığı söyleyin ");
 int hava =k.nextInt();
  if (0 < hava && hava< 25){
      if(0 < hava && hava< 5){
          System.out.println(" kayak yapabilirsin");
      }
      else if (5 < hava && hava< 15){
          System.out.println(" Sinemaya gidebilirsin");
      }
      else if(15 < hava && hava< 25){
          System.out.println("piknik yapabilirsin");
      }

  }
  else if(0> hava){
      System.out.println(" kambini aç netflix izle :)");
  }
  else  if  (hava>25) {
      System.out.println("klimanı aç dizi izle veya yüzmeye git ");
        }
    }
}
