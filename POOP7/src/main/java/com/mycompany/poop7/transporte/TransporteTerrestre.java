/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop7.transporte;

/**
 *
 * @author emilio
 */
public class TransporteTerrestre extends MediosTransporte{
    private String terreno;
    private boolean tieneTraccion;
    private int numeorPasajeros;

    public TransporteTerrestre() {
    }

    public TransporteTerrestre(String terreno, boolean tieneTraccion, int numeorPasajeros, String nombre, String fabricante, String velocidadMaxima) {
        super(nombre, fabricante, velocidadMaxima);
        this.terreno = terreno;
        this.tieneTraccion = tieneTraccion;
        this.numeorPasajeros = numeorPasajeros;
    }

    public String getTerreno() {
        return terreno;
    }

    public boolean isTieneTraccion() {
        return tieneTraccion;
    }

    public int getNumeorPasajeros() {
        return numeorPasajeros;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public void setTieneTraccion(boolean tieneTraccion) {
        this.tieneTraccion = tieneTraccion;
    }

    public void setNumeorPasajeros(int numeorPasajeros) {
        this.numeorPasajeros = numeorPasajeros;
    }
    
    /**
     * * Metdod que indica que el transporte terresrte esta frenando
     */
    private void frenar(){
        System.out.println("Estoy frenando con mis llantas");
    }
    /**
     * * Metdod que indica que el transporte terrestre esta girando
     */
    private void girar(){
        System.out.println("Estoy girando con mis llantas");
    }
    /**
     * Metodo que indica el tipo de combustible del transporte terrestre
     */
    private void verificarCombustible(){
        System.out.println("Tengo gasolina de tipo Diesel Pemex");
    }
    @Override
    public String toString() {
        return "TransporteTerrestre{" + "terreno=" + terreno + ", tieneTraccion=" + tieneTraccion + ", numeorPasajeros=" + numeorPasajeros + super.toString() + '}';
    }
}
