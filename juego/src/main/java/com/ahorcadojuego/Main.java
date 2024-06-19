package com.ahorcadojuego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int seleccion = 1;
        Main def = new Main();
        while(seleccion != 0){
            seleccion = 0; 
            def.imprimirMenu();
            seleccion = def.leerOpcion("Digite una Opcion: ");

            switch (seleccion) {
                case 1:
                    System.out.println("Ingresando al juego......");
                    break;
                case 2: 
                    System.out.println("Saliendo del Juego......");
                    return;
            
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
            System.out.println("Desea Jugar Nuevamente?");
            seleccion = def.leerOpcion("si: 1  no: 0: ");
              
            if(seleccion==0){
                break;
            }

        }

       
        System.out.println("Saliendo.......");
        
    }


    private int leerOpcion(String msg){
        int Entero = 0;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print(msg);
            Entero = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error"+ e);
        }
        return Entero;
    
    }


    private void imprimirMenu(){
            System.out.println("------------------------");
            System.out.println("Welcome to the Ahorcado\t");
            System.out.println("------------------------ ");
            System.out.println("1.Iniciar Juego\t");
            System.out.println("2.Salir del Juego\t");
            System.out.println("------------------------ ");
    }

 
    }






