package co.edu.sena.oop2902274;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        //actividad #1

        //entradas 
        System.out.println("1.ária de un triángulo");
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
        System.out.println("2.suma ");
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
        System.out.println("3.elevacion al cuadrado");
        System.out.println("ingresa el numero :");

        Scanner power = new Scanner(System.in);
        int value = power.nextInt();

        //proceso
        int resultPower =(value *value);

        //salida
        System.out.println("el resultado de la potencia es: " +resultPower);


        //actividad #4

        //entradas
        System.out.println("4.conversion Euros a dólares");
        System.out.println("ingresa cuantos Euros quieres convertir :");

        Scanner convert = new Scanner(System.in);
        double euros = convert.nextDouble();

        //proceso
        double tipoCambio = 1.08; 
        double dolares = euros * tipoCambio;

        //salida
        System.out.println(euros+ " euros equivalen a " + dolares + " dólares.");


        //actividad #5

        // entradas
        System.out.println("5.area y perimetro de un cuadrado");
        Scanner muestra = new Scanner(System.in);

        System.out.println("Ingrese la longitud del lado del cuadrado:");
        double side = muestra.nextDouble();

        //proceso
        double area = side * side;
        double perimeter = 4 * side;

        //salida
        System.out.println("El área del cuadrado es: " + area + " y El perímetro del cuadrado es:" + perimeter);

        //actividad #6
        
        //entradas
        System.out.println("6.area y volumen de un cilindro");
        Scanner dertermine = new Scanner(System.in);

        System.out.println("Ingrese el radio de la base del cilindro: ");
        double radio = dertermine.nextDouble();
        System.out.println("Ingrese la altura del cilindro: ");
        double altura = dertermine.nextDouble();
       
        //proceso
        double volume = Math.PI * radio * radio * altura;
        double areaCilindro = Math.PI * radio *(radio+altura);

        //salida
        System.out.println("Valor de area: " +areaCilindro+ "Valor de volumen:" +value);

        //actividad #7
        
        //entradas
        System.out.println("7.longuitud y area del circulo");
        Scanner circumference = new Scanner(System.in);

        System.out.print("Digite el radio de la circunferencia: ");
        double circumferenceRadius = circumference.nextDouble();
        
        //proceso 
        double circumferenceMeasurement = 2 * Math.PI * circumferenceRadius;
        double circleArea = Math.PI * Math.pow(circumferenceRadius, 2);
        //salida
        System.out.println("La longitud de la circunferencia es de: " + circumferenceMeasurement);
        System.out.println("El area del círculo inscrito es de: " + circleArea);

        //actividad #8
        System.out.println("8.el promedio de tres numeros");
        Scanner number = new Scanner(System.in);

        //proceso
        System.out.println("Digite 3 numeros para calcular el promedio: ");
        double numberOne = number.nextDouble();
        double numberTwo = number.nextDouble();
        double numberThree = number.nextDouble();
        
        //salida
        double promedionumeros = (numberOne + numberTwo + numberThree) / 3;
        System.out.println("El promedio de los tres numeros es: " + promedionumeros);


   }
}
