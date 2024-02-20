package co.edu.sena.oop2902274;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        //actividad #1

        //entradas 
        System.out.println("1.calcular el ária de un triángulo");
        System.out.println("ingrese la base del triángulo:");

        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();

        System.out.println("ingrese la altura del triángulo: ");
        double heigtht = src.nextDouble();

        //proceso
        double result =(base *heigtht)/2;

        //salida
        System.out.println("la area del triángulo es:" + result);

        
        //actividad #2

        //entradas 
        System.out.println("2.ingresar dos numeros y sumarlos: ");
        System.out.println("ingrese el primer numero");

        Scanner sum = new Scanner(System.in);
        int valueOne = sum.nextInt();

        System.out.println("ingrese el segundo numero: ");
        int valueTwo = sum.nextInt();

        //proceso 
        int resultSum =(valueOne + valueTwo);

        //salida
        System.out.println("el resultado de la suma es :" +resultSum);


        //activida #3

        //entradas
        System.out.println("3.ingresar un numero y mostrar el numero elvado al cuadrado");
        System.out.println("ingresa el numero :");

        Scanner power = new Scanner(System.in);
        int value = power.nextInt();

        //proceso
        int resultPower =(value *value);

        //salida
        System.out.println("el resultado de la potencia es: " +resultPower);


        //actividad #4

        //entradas
        System.out.println("4.convertir  Euros a dólares");
        System.out.println("ingresa cuantos Euros quieres convertir :");

        Scanner convert = new Scanner(System.in);
        int amount = convert.nextInt();
    }
}
