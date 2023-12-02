package com.formulario.bd;

import com.formulario.model.Persona;
import java.util.ArrayList;

/**
 *
 * @author Laboratorio 2023
 */
public class Data {

    private ArrayList<Persona> listaPersonas;

    public Data() {

        listaPersonas = new ArrayList<Persona>();
    }

    public void crearPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }
    
    
}
