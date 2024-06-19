package com.second.project;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        //crear instancia de la clase

        Estudiante myStudent = new Estudiante();
        myStudent.setNombre("Juanito");
        myStudent.setApellido("Perez");
        myStudent.setEdad(13);

        System.out.println(myStudent.getNombre());


        //arraylist -> estructura dinamica mutable que admite varios tipos de dato.

        /*
         * Arraylist <T> nombreArraylist = new Arraylist<T>();
         */

         /*
          * add
            get ->acceder un elemento en un indice
            set -> reemplaza en una posicion especifica
            remove
            clear -> elimina todos los elementos del array
            size()-> tamaño 
            isEmpty()
            indexOf()

            convertir arreglo en arraylist toArray()
          */


          //add
        
          //arreglo de datos primitivos
          ArrayList <String> list = new ArrayList <String>();

          list.add("Backend Java");
          list.add(list.size(),"Fundamentos");
        //   list.set(0, "Hola"); System.out.println(list);
        //   System.out.println(list.get(0));
        //   System.out.println(list.get(1));
  
        //   String eliminado = list.remove(1);
        //   System.out.println(eliminado);
        //   System.out.println(list);
        //   list.clear();
        //   System.out.println(list);
        //   boolean vacio = list.isEmpty();
        //   System.out.println(vacio);

        //foreach de java
        for(String item : list){
            System.out.println(item);
        }

          //arreglo de objetos
    Estudiante student;
    ArrayList <Estudiante> list2 = new ArrayList <Estudiante>();


    try (Scanner sc = new Scanner(System.in)){
        while(JOptionPane.showConfirmDialog(null, "Quieres agregar un estudiante", "holis",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE)==0){
        student = new Estudiante();
        System.out.println("Ingrese nombre del estudiante");
        student.setNombre(sc.nextLine());
        System.out.println("Ingrese apellido");
        student.setApellido(sc.nextLine());
        System.out.println("Ingrese edad");
        student.setEdad(sc.nextInt());
        sc.nextLine();
        list2.add(student);
        }
        sc.close(); 

    
        for (Estudiante listest : list2) {
            System.out.println(listest.getNombre());
            System.out.println(listest.getApellido());
            System.out.println(listest.getEdad());
        }

    }

    
  


    
   


        // String name = JOptionPane.showInputDialog("Digite el nombre");

        // System.out.println(name);









    }


  
    //metodos estaticos utilizamos para acceder sin necesidad de la instancia

    //no es recomendable usarlo

    //paradigmas de POO

    /*
     * abstraccion
     * encapsulamiento
     * herencia
     * polimorfismo
     * modularidad
     */


}