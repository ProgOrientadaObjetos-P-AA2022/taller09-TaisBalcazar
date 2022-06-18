/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete1.InstitucionEducativa;
import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    protected String nivelE;
    protected InstitucionEducativa centroE;
    protected double valorC;
    protected double valorMensual;

    public PrestamoEducativo(Persona b, int t, String cp, String n,
            InstitucionEducativa c, double vC, double vM) {
        super(b, t, cp);
        nivelE = n;
        centroE = c;
        valorC = vC;
        valorMensual = vM;

    }

    public void establecerNivelEstudio(String n) {
        nivelE = n;
    }

    public void establecerCentroEducativo(InstitucionEducativa c) {
        centroE = c;
    }

    public void establecerValorCarrera(double v) {
        valorC = v;
    }

    public void calcularValorMensual() {
        valorMensual = (valorC / tiempoPrestamo);
        valorMensual = valorMensual - (valorMensual * 0.1);
    }

    public String obtenerNivelEstudio() {
        return nivelE;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroE;
    }

    public double obtenerValorCarrera() {
        return valorC;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        
        String cadenaFinal = "\nPRESTAMO EDUCATIVO\n";
        cadenaFinal = String.format("%s%s",cadenaFinal, super.toString());
        cadenaFinal = String.format("%s\n"
                + "Nivel de estudio: %s\n"
                + "Centro Educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual de pago: %.2f\n",
                cadenaFinal,
                obtenerNivelEstudio(),
                obtenerCentroEducativo(),
                obtenerValorCarrera(),
                obtenerValorMensual());

        return cadenaFinal;
    }
}
