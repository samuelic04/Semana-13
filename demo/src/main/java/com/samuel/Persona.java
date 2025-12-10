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

    public static Persona factory(String cadena) {
        if (cadena == null) {
            throw new IllegalArgumentException("No son válidos los argumentos");
        }

        String partes[] = cadena.split(",");

        if (partes.length != 4) {
            throw new IllegalArgumentException("No son válidos los argumentos");
        }

        try {
            int edad = Integer.parseInt(partes[2]);
            return new Persona(partes[0], partes[1], edad, partes[3]);
        } catch (Exception e) {
            throw new IllegalArgumentException("No es válida la edad");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
