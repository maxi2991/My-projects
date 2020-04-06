package com.company;

public class Autor {
    //Atributos del Autor
    private String Nombre;
    private String Apellido;
    private String Mail;
    private char Genero;

    // Metodos

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char genero) {
        Genero = genero;
    }

    public void ImprimirAutor(){
        System.out.println(this.getNombre()+" "+ this.getApellido()+"  "+this.getMail()+"  "+this.getGenero());
    }
}
