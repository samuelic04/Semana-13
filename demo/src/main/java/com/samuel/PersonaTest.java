package com.samuel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    @Test
    void fromString_ShouldReturnPersona_WhenInputIsValid() {
        // AAA (Arrange, Act, Assert)
        // Arrange
        String input = "Samuel,Camacho,21,samuel.ic@usal.com";
        // Act
        Persona persona = Persona.factory(input);
        // Assert
        assertNotNull(persona);
        assertEquals("Samuel", persona.getNombre());
        assertEquals("Camacho", persona.getApellido());
        assertEquals(21, persona.getEdad());
        assertEquals("samuel.ic@usal.com", persona.getEmail());
    }

    @Test
    void fromString_ShouldThrowException_WhenInputIsNull() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> Persona.factory(input));
    }
}
