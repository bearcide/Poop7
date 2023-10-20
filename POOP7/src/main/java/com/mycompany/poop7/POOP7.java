/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop7;

/**
 *
 * @author emilio
 */
public class POOP7 {

    public static void main(String[] args) {
        Animal animal = new Animal("Perro", "Mi casa", "Cafe");
        Ballena ballena = new Ballena(10,2,"Gran Ballena", "Atlantico", "Azul");
        Pajaro pajaro = new Pajaro("Curvado", 2, "Tucan", "Panama", "Multicolor");
        Perro perro = new Perro("Rojo", 4, "Furilais", "Callejero", "Cafe");
        System.out.println(animal);
        System.out.println(ballena);
        System.out.println(pajaro);
        System.out.println(perro);
    }
}
