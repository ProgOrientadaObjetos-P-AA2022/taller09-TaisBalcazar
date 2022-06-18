/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    protected String tipo;
    protected String marca;
    protected Persona garante1;
    protected double valorA;
    protected double valorMensual;

    public PrestamoAutomovil(Persona b, int tp, String c, String t, String m, 
            Persona g, double vA, double vM) {
        super(b, tp, c);
        tipo = t;
        marca = m;
        garante1 = g;
        valorA = vA;
        valorMensual = vM;

    }

    public void establecerTipo(String t) {
        tipo = t;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerGarante(Persona g) {
        garante1 = g;
    }

    public void establecerValorAuto(double v) {
        valorA = v;
    }

    public void calcularValorMensual() {
        valorMensual = valorA / tiempoPrestamo;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante() {
        return garante1;
    }

    public double obtenerValorAuto() {
        return valorA;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        
        String cadenaFinal = "\nPRESTAMO AUTOMOVIL\n";
        cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s\n"
                + "Tipo de automóvil: %s\n"
                + "Marca de automóvil: %s\n"
                + "Garante: %s\n"
                + "Valor de automóvil: %.2f\n"
                + "Valor mensual de pago: %.2f\n",
                cadenaFinal,
                obtenerTipo(),
                obtenerMarca(),
                obtenerGarante(),
                obtenerValorAuto(),
                obtenerValorMensual());


        return cadenaFinal;
    }
}
