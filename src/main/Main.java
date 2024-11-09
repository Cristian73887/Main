/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import herpers.Circulo;
import herpers.Cuadrado;
import herpers.Formas;
import herpers.Linea;
import herpers.Triangulo;

/**
 *
 * @author crist
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Formas formas = new Formas();
        formas.dibujar();
        formas.establecerColor();
        
        Circulo circulo = new Circulo();
        circulo.dibujar();
        circulo.calcularRadio();

        Linea linea = new Linea();
        linea.dibujar();

        Triangulo triangulo = new Triangulo();
        triangulo.dibujar();
        triangulo.calcularArea();

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.dibujar();
        cuadrado.calcularArea();

    }
    
}
// proyecto