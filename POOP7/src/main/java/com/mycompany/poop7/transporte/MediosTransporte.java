/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop7.transporte;

/**
 *
 * @author emilio
 */
public class MediosTransporte {
    private String nombre, fabricante, velocidadMaxima;

    public MediosTransporte() {
    }

    public MediosTransporte(String nombre, String fabricante, String velocidadMaxima) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setVelocidadMaxima(String velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public void arrancar(){
        System.out.println("El transporte ya se prendio");
    }
    
    public void detener(){
        System.out.println("El transporte se detuvo");
    }
    
    public void acelerar(){
        System.out.println("El transporte esta acelerando");
    }

    @Override
    public String toString() {
        return "MediosTransporte{" + "nombre=" + nombre + ", fabricante=" + fabricante + ", velocidadMaxima=" + velocidadMaxima + '}';
    }
}
