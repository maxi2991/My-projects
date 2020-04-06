package com.company;

import java.awt.desktop.ScreenSleepEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Cuenta_Corriente {
    private UUID Id;
    private float Balance;
    private Cliente Usuario;
    private static final float MAXDEUDA=-2000;
    private String[] Eventos= new String[10];
    private LocalTime Hora;
    private LocalDate Fecha;
    private int IndexEvents=0;
    private int  Operacion; // 0 Deposito / 1 Extraccion



    //Metodos

    public void setId() {
        Id = UUID.randomUUID();
    }
    public UUID getId() {
        return Id;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    public Cliente getUsuario() {
        return Usuario;
    }

    public void setUsuario(Cliente usuario) {
        Usuario = usuario;
    }

    public  void Depositar(float Valor){

        this.Balance+=Valor;
        this.SetRegistro(Valor,0);

    }

    public void Extraer(float Valor){

        if(this.Balance-Valor>=MAXDEUDA) {

            this.Balance -= Valor;
            this.SetRegistro(Valor,1);

        }

    }

    public void Imprimir(){

    System.out.print("Cuenta ID: "+this.Id+" Balance: "+this.Balance+" ");
    this.Usuario.Imprimir();
    System.out.println(" ");
    System.out.println("------------------------------");

    }


    public void SetRegistro(float Valor, int Op){

        if(this.IndexEvents<10) {
            this.Hora=LocalTime.now();
            this.Fecha=LocalDate.now();
            switch (Op){
                case 0:
                    this.Eventos[this.IndexEvents]=this.Usuario.getNombre()+"  "+"Deposito"+"  "+Valor+" "+this.Fecha+" "+this.Hora ;
                break;

                case 1:
                    this.Eventos[this.IndexEvents]=this.Usuario.getNombre()+"  "+"Extrajo"+"  "+Valor+ " "+this.Fecha+" "+this.Hora;
                break;
            }

            this.IndexEvents++;
        }
    }


    public void ImprimirRegistro(){

        for(int i=0;i<this.IndexEvents;i++)
            System.out.println(this.Eventos[i]);
    }
}
