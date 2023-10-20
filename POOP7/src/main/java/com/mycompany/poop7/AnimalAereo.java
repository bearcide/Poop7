/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop7;

/**
 *
 * @author emilio
 */
public class AnimalAereo extends Animal{
    
    private int numeroAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
    /**
     * * Metdod que indica que el animal aereo esta volando
     */
    public void volar(){
        System.out.println("Estoy volando");
    }
    /**
     * Metodo que indica que el animal aereo esta comiendo
     */
    public void comer(){
        System.out.println("Esto comiendo palomas");
    }

    @Override
    public String toString() {
        return "AnimalAereo{" + "numeroAlas=" + numeroAlas + super.toString() + '}';
    }
    
    
    
}
