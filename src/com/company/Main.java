package com.company;

public class Main {

    public static void main(String[] args) {
	int a, b, c, d;
    a = 2;
    b = 3;
    System.out.println("a равно 2 , b равно 3");
    if (a < b) System.out.println("а меньше b");
    if (a > b) System.out.println("этот текст вы никогда не увидите");
    System.out.println("");
    c = a - b; // c будет равно -1
    System.out.println("c равно -1");
    if (c>= 0) System.out.println("c имеет положительное значение");
    if (c < 0) System.out.println("c имеет отрицательное значение");
    System.out.println("");
    d = b - a; // d равно 1
    System.out.println("d равно 1");
    if (d >= 0) System.out.println("d имеет положительное значение");
    if (d < 0 ) System.out.println("d имеет отрицательное щначиние");
    System.out.println("");
    }
}
