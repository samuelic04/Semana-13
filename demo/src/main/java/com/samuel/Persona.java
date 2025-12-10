package com.samuel;

/**
 * Clase Persona
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    /**
     * Constructor con argumentos
     * 
     * @param nombre   el nombre de la persona
     * @param apellido los apellidos de la persona
     * @param edad     la eda de persona
     * @param email    el email de la persona
     */
    public Persona(String nombre, String apellido, int edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Getter de email
     * 
     * @return el email de la persona
     */
    public String getEmail() {
        return email;
    }

}
