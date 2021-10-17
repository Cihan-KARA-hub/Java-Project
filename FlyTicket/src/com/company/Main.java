package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
	System.out.println(" isim , yaş,mesafe  ve uçuş tipiniz : ");
	String isim= s.nextLine();
	int yaş=s.nextInt();
	System.out.println("GERİ DÖNÜŞ YAĞACAKSANIZ TRUE , YAPMIYCAKSANIZ FALSE YAZIN VEYA NULL BIRAKIN");
	boolean  tip=s.nextBoolean();
	int mesafe = s.nextInt();
	double  ücret =mesafe*(0.10);
	if (yaş<12){
	    ücret*=0.5;
	    if(tip==true){
	    	ücret*=0.2;
			System.out.println(isim+"  yaş -->  "+yaş +"  ücret-->"+ücret+" usdt ");
		}
		System.out.println(isim+"  yaş -->  "+yaş +"  ücret-->"+ücret+" usdt ");
    }
	else if((12<yaş)&&(yaş<24)){
		ücret*=0.1;

		if(tip==true){
			ücret*=0.2;
			System.out.println(isim+"  yaş -->  "+yaş +"  ücret-->"+ücret+" usdt ");
		}
		System.out.println(isim+"  yaş -->  "+yaş +"  ücret-->"+ücret+" usdt ");
	}
	else if(65<yaş){
		ücret*=0.3;
		if(tip==true){
			ücret*=0.2;
			System.out.println(isim+"  yaş -->  "+yaş +"  ücret-->"+ücret+" usdt ");
		}
		System.out.println(isim+"  yaş -->  "+yaş +"  ücret-->"+ücret+" usdt ");
	}


    }
}
