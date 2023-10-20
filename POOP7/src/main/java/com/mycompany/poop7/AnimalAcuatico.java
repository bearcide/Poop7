/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop7;

/**
 *
 * @author emilio
 */
public class AnimalAcuatico extends Animal{
    private int numeroAletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }

    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    /**
     * * Metdod que indica que el animal acuatico esta nadando
     */
    public void nadar(){
        System.out.println("Estoy nadando");
    }
    /**
     * * Metdod que indica que el animal terrestre esta comiendo
     */
    public void comer(){
        System.out.println("Estoy comiendo peces");
    }

    @Override
    public String toString() {
        return "AnimalAcuatico{" + "numeroAletas=" + numeroAletas + super.toString()+'}';
    }

    
    
    
    
}
