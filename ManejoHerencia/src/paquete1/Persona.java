/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author USUARIO
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected String username;

    public Persona(String n, String a, String u) {
        nombre = n;
        apellido = a;
        username = u;
    }

    public Persona(String g) {
        nombre = g;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerUsername(String u) {
        username = u;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n",
                nombre,
                apellido,
                username);

        return cadena;
    }
}
