package com.company;

public class Libro {
    // Atributos del Libro
    private static final int CANTAUTOR=10;
    private String Titulo;
    private float Precio;
    private int Stock;
    private Autor[] Escritores= new Autor[CANTAUTOR];
    private int IndexAutor=0;

    // Metodos


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }


    public void setAutor(Autor Escritor ){


        if(IndexAutor<CANTAUTOR-1) {
            this.Escritores[IndexAutor] = Escritor;
            this.IndexAutor++;
        }
    }
    
    public Autor getAutor(int NumAutor){

        return this.Escritores[NumAutor];
    }

    public void ImprimirLibro(){

        System.out.println("Nombre Libro: "+ this.getTitulo() +"  Copias: "+this.getStock() + "  Precio($):  "+this.getPrecio());
        System.out.println("Autor/es:");
        for(int i=0; i<IndexAutor ; i++) {
            Escritores[i].ImprimirAutor();
        }
        System.out.println("------------------------------------------------------------");


    }


}
