package com.manejodearchivod;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

// import javax.swing.JFileChooser;

public class Main {
    public static void main(String[] args) {
        //Manejo de Archivos;

        // JFileChooser j = new javax.swing.JFileChooser();

        try {
            // j.showOpenDialog(j);
            // String path = j.getSelectedFile().getAbsolutePath();
            // System.out.println(path);
            File variableArchivo = new File("data.txt");
            FileWriter writer = new FileWriter(variableArchivo,true);
            PrintWriter pw = new PrintWriter(writer);
            pw.println("Esta es una linea de texto");
            pw.append("hellouuuuuuuuuuuuuu");
            writer.close();



            // if(variableArchivo.exists()){
            //     System.out.println("Existe");
            // }

        } catch (Exception e) {
            System.out.println("No existe");
        }

        
    }
}