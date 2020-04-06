package com.company;

import java.util.UUID;

public class Cliente {
    private UUID Id;
    private String Nombre;
    private char Genero;


    //Metodos
    public UUID getId() {
        return Id;
    }

    public void setId() {
        Id = UUID.randomUUID();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char genero) {
        Genero = genero;
    }

    public void Imprimir(){

        System.out.print("Nombre: "+this.Nombre+" Genero: "+this.Genero+ " ID: "+this.Id);

    }

}
