package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //valor base del viaje
        Scanner informacioDelViaje = new Scanner(System.in);
        double tarifaBase = 4.000 ;
        double valorKilometro = 900 ; 
        double  valorMinuto = 150 ;

        //informacion  del  viaje
        
        System.out.println(" Ingrese la distancia del viaje en kilómetros: ");
        double distancia = informacioDelViaje.nextDouble();

        System.out.println(" Ingrese el tiempo que espera pasar en tráfico, en minutos: ");

        int tiempoEspera = informacioDelViaje.nextInt();

        //calcular  valor total del viaje 

        double totalDelViaje = distancia *valorKilometro;
        totalDelViaje += (tiempoEspera * valorMinuto);
        totalDelViaje += (tarifaBase + distancia);

        informacioDelViaje.close();

        // valor pagar por el  viaje  
        
        System.out.println("El precia   de   su  viajes sera de:  $" + totalDelViaje + " COP");

    }
}