/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int op;

        do {
            System.out.println("Ingrese el número de acuerdo el préstamo a"
                    + " solicitar:"
                    + "\n1.Prestamo Automovil"
                    + "\n2.Prestamo Educativo"
                    + "\n0.Salir del Programa");
            op = entrada.nextInt();
            entrada.nextLine();

            if (op == 1 || op == 2 || op == 0) {
                System.out.println("\nIngrese el nombre del beneficiario");
                String beneficiario = entrada.nextLine();
                System.out.println("Ingrese el apellido del beneficiario");
                String apellido = entrada.nextLine();
                System.out.println("Ingrese el username del beneficiario");
                String username = entrada.nextLine();
                System.out.println("Ingrese la cantidad de meses a pagar el "
                        + "préstamo");
                int meses = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese su ciudad");
                String ciudad = entrada.nextLine();

                Persona persona = new Persona(beneficiario, apellido, username);
                persona.establecerNombre(beneficiario);
                persona.establecerApellido(apellido);
                persona.establecerUsername(username);

                switch (op) {

                    case 1:

                        System.out.println("Ingrese el tipo de automovil");
                        String tipo = entrada.nextLine();
                        System.out.println("Ingrese la marca del automovil");
                        String marca = entrada.nextLine();
                        System.out.println("Ingrese el nombre del garante");
                        String nomG = entrada.nextLine();
                        System.out.println("Ingrese el apellido del garante");
                        String apeG = entrada.nextLine();
                        System.out.println("Ingrese el username del garante");
                        String userG = entrada.nextLine();
                        System.out.println("Ingrese el valor del automovil");
                        double valorA = entrada.nextDouble();
                        double valorMensual = 0;

                        Persona garante1 = new Persona(nomG, apeG, userG);
                        garante1.establecerNombre(nomG);
                        garante1.establecerApellido(apeG);
                        garante1.establecerUsername(userG);

                        PrestamoAutomovil pa1 = new PrestamoAutomovil(persona, meses,
                                ciudad, tipo, marca, garante1, valorA, valorMensual);
                        pa1.establecerBeneficiario(persona);
                        pa1.establecerTiempoPrestamo(meses);
                        pa1.establecerCiudadPrestamo(ciudad.toLowerCase());
                        pa1.establecerTipo(tipo);
                        pa1.establecerMarca(marca);
                        pa1.establecerGarante(garante1);
                        pa1.establecerValorAuto(valorA);
                        pa1.calcularValorMensual();
                        System.out.printf("%s\n", pa1);
                        break;

                    case 2:

                        System.out.println("Ingrese su nivel de estudio");
                        String nivel = entrada.nextLine();
                        System.out.println("Ingrese el nombre del Centro educativo");
                        String nomC = entrada.nextLine();
                        System.out.println("Ingrese las siglas del Centro Educativo");
                        String siglas = entrada.nextLine();
                        System.out.println("Ingrese el valor de la carrera");
                        double valorC = entrada.nextDouble();
                        double valorM = 0;

                        InstitucionEducativa e1 = new InstitucionEducativa(nomC,
                                siglas);

                        PrestamoEducativo pe1 = new PrestamoEducativo(persona,
                                meses, ciudad, nivel, e1, valorC, valorM);

                        pe1.establecerBeneficiario(persona);
                        pe1.establecerTiempoPrestamo(meses);
                        pe1.establecerCiudadPrestamo(ciudad.toUpperCase());
                        pe1.establecerNivelEstudio(nivel);
                        pe1.establecerCentroEducativo(e1);
                        pe1.establecerValorCarrera(valorC);
                        pe1.calcularValorMensual();
                        System.out.printf("%s\n", pe1);
                        break;
                    case 0:

                        System.out.println("Fin del programa");

                }

            } else {
                System.out.println("Opcion no valida");
            }

        } while (op != 0);

    }
}
