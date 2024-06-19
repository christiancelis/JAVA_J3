package com.second.project;

public class Estudiante {
    //metodos
    /*
     * modificador tipoRetorno nombreDelMetodo ([parametros]){
     * //cuerpo del metódo
     * }
     * 
     * modificadores de acceso: public, private, static
     * 
     */


     //llamada de un metodo
     //tiporetorno resultado = 



    private String nombre;
    private String apellido;
    private int edad;
     
    public Estudiante() {

    }

    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    




    



    

    

}
