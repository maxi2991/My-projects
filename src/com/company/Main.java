package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ejercicio 1
       /* Autor Persona= new Autor();
        Autor Persona2= new Autor();
        Persona.setNombre("Carlos");
        Persona.setApellido("Ramirez");
        Persona.setGenero('M');
        Persona.setMail("CarlosR@gmail.com");
        Persona2.setNombre("Maria");
        Persona2.setApellido("Fernandez");
        Persona2.setGenero('F');
        Persona2.setMail("MariaF@gmail.com");
        Libro Nuevo= new Libro();
        Nuevo.setAutor(Persona);
        Nuevo.setAutor(Persona2);
        Nuevo.setPrecio(450);
        Nuevo.setStock(150);
        Nuevo.setTitulo("Effective Java");
        Nuevo.ImprimirLibro();
        System.out.println(Nuevo.getAutor(0).getNombre());
        System.out.println(Nuevo.getAutor(1).getNombre());*/
       //ejercicio 3
        Cliente User=new Cliente();
        User.setNombre("Alberto");
        User.setId();
        User.setGenero('M');
        //User.Imprimir();
        Cuenta_Corriente Nuevacuenta= new Cuenta_Corriente();
        Nuevacuenta.setId();
        Nuevacuenta.setBalance(10000);
        Nuevacuenta.setUsuario(User);
        Nuevacuenta.Depositar(5000);
        Nuevacuenta.Depositar(3000);
        Nuevacuenta.Extraer(2000);
        //Nuevacuenta.Extraer(20000);
        //Nuevacuenta.Imprimir();
        Nuevacuenta.ImprimirRegistro();





    }
}
