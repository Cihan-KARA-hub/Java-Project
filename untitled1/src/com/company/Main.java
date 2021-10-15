package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner k= new Scanner(System.in);
	System.out. println("toplama 1 \n çıkarma 2\n çarpma 3\n bölme 4 \n işlem seçiniz:" );
	int select=k.nextInt();
		System.out. println("  1. sayıyı girin ");
	int a=k.nextInt();
		System.out. println(" 2. sayıyı girin... ");
	int b=k.nextInt();
	  switch (select){
		case 1:
			System.out. println(" sonuç"+a+b);
		break;

		case 2:
			System.out. println(" sonuç "+ (a-b));
		break;

		case 3:
			System.out. println(" sonuç "+a*b);
		break;

		case 4:
			System.out. println(" sonnuç "+a/b);
		break;

		default:
			System.out. println(" yanlış işlem yaptınız ");
		break;

    }


    }
}
