/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop7;

/**
 *
 * @author emilio
 * Es un animal con nombre, un lugar de origen y color
 */
public class Animal extends Object{ 
    /**
     * nombre: el nombre del animal
     * Lugar de origen: de donde es
     * Color: De que color es
     */
    private String nombre, lugarOrigen, color;
    /**
     * Constructor vacio
     */
    public Animal() {
    }
    /**
     * Constructor con parametros
     * @param nombre
     * @param lugarOrigen
     * @param color 
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * Metodo set
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo set
     * @param lugarOrigen 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
/**
 * Metodo set
 * @param color 
 */
    public void setColor(String color) {
        this.color = color;
    }
/**
 * Metodo get
 * @return el nombre
 */
    public String getNombre() {
        return nombre;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public String getColor() {
        return color;
    }
    /**
     * Metodo para que el animal haga un sonido
     * @param sonido El sonido que hace
     */
    public void gruñir(String sonido){
        System.out.println(sonido);
    }
    /**
     * Metodo para indicar que el animal esta comiendo
     */
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
}
