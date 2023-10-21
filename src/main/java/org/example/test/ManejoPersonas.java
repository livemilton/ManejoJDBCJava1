package org.example.test;

import org.example.datos.PersonaJDBC;
import org.example.domain.Persona;

import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {
        //Crear el objeto personaJDBC Para Testear metodo SELECT
        PersonaJDBC personaJDBC = new PersonaJDBC();

        //Agregarlos en la variable personas

        List<Persona> personas= personaJDBC.select();

        //Recorrer los objetos con el ciclo for

        for(Persona persona: personas){
            System.out.println("persona: "+ persona);
        }

        //Crear el objeto Persona para testear metodo INSERT
        /*
        Persona persona = new Persona();
        persona.setNombre("Jhon");
        persona.setApellido("Muñoz");
        persona.setEmail("jhon@hotmail.com");
        persona.setTelefono("3142924415");

        //usar metodo INSERT con personaJDBC
        personaJDBC.insert(persona);
        */

        //Crear el objeto Persona para testear metodo UPDATE
        /*
        Persona persona = new Persona();
        persona.setId_persona(3);
        persona.setNombre("Fabian");
        persona.setApellido("Rianos");
        persona.setEmail("milton.munozr@outlook.com");
        persona.setTelefono("3003778752");

        personaJDBC.update(persona);
        */

        //Usar Metodo Eliminar Persona
        Persona persona = new Persona();
        persona.setId_persona(4);

        personaJDBC.delete(persona);
    }
}
