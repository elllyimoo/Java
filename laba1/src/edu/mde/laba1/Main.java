package edu.mde.laba1;

import java.lang.Math;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {
    double a = 2;
    double b = -3;
    double x = 0.1;
    public static double f1(double a, double b, double x){

        return a*Math.pow(Math.cos(x), 3) - Math.abs(b*Math.tan(Math.sqrt(x)));
    }
    public static double f2(double a, double b, double x){

        return (a*x)/Math.pow(Math.log(Math.pow((x-b), 3)),2);
    }
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть а: ");
        this.a = scan.nextDouble();
        System.out.println("Введіть b: ");
        this.b = scan.nextDouble();
        System.out.println("Введіть x: ");
        this.x = scan.nextDouble();
    }
    public void output() {
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
        System.out.println("x = " + this.x);
    }

    public void calc(){
        System.out.println("f1(x) = " + f1(this.a, this.b, this.x));
        System.out.println("f2(x) = " + f2(this.a, this.b, this.x));
    }

    public static void out_date(){
        SimpleDateFormat formatter= new SimpleDateFormat(" HH:mm:ss ");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }

    public void menu() {
        int key;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Для того, щоб виконати вказану дію, введіть число,яке вказане перед дією");
            System.out.println("1. Введення значень вхідних даних");
            System.out.println("2. Виведення значень вхідних даних");
            System.out.println("3. Виведення обчислених значень заданих функцій");
            System.out.println("4. Виведення поточної дати і часу у заданому форматі");
            System.out.println("5. Вихід із меню");
            key = scan.nextInt();
            switch (key) {
                case 1: input(); break;
                case 2: output(); break;
                case 3: calc(); break;
                case 4: out_date(); break;
                case 5: {
                    System.out.println("Have a nice day");
                    return;
                }
                default:
                    System.out.println("error, you wrote smth wrong!");
            }
        }
    }
    public static void main (String[] args) {
        Main m = new Main();
        m.menu();
    }
}