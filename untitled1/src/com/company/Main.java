package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner k = new Scanner(System.in);
System.out.println("yeni profil için  telefon numarası ve şifre giriniz");
int  telNo=k.nextInt();
int şifre = k.nextInt();
        System.out .println(" telefon numaranızı   giriniz... ");
  int  kullanıcı=k.nextInt();
      if (kullanıcı==telNo) ;
      else {
          System.out.println( "yanlış numara  girdiniz \ntel numaranızı değiştirmek için 1 i tuşlayın\n" +
                  "değiştirmek istemiyosanız programı tekrar başlatın");
          int konsol= k.nextInt();
          switch (konsol){
              case 1: {
                  int yeniTelno = k.nextInt();
                  telNo = yeniTelno;
                  System.out.println(" numaranız güncellendi " + telNo);
                  break;
              } default:System.out.println( "yanlış tuşa tuşladınız program sonlanmıştır....");
                  break;
            }}
              System.out.println(" şifrenizi giriniz ");
                  int şifreGiriş=k.nextInt();
                  if (şifre== şifreGiriş) ;
                  else{
                      System.out.println( "yanlış şifre  girdiniz \nşifrenizi  değiştirmek için 1 i tuşlayın\n" +
                              "değiştirmek istemiyosanız programı tekrar başlatın");
                      int konsol1=k.nextInt();
                      switch (konsol1){
                          case 1:{  int yeniş=k.nextInt();
                              if(yeniş==şifre){
                                  System.out.println("önceki şifrenizi girdiniz program sonlanıyor");
                                  break;
                              }
                              else {
                                  şifre =yeniş;
                              System.out.println(" şifren oluşturuldu "+şifre);
                              }
                              break;
                          }
                          default: System.out.println(" yanlış tuşlama yaptınız program sonlandı");
                            break;




                      }

                  }








    }
}
