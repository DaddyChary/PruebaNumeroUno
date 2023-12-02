/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pcfrona.bd;

import com.pcfrona.model.Insumo;
import java.util.ArrayList;

/**
 *
 * @author Laboratorio 2023
 */
public class Data {
    
    private ArrayList<Insumo> listaDeInsumos;

    public Data() {
        
        listaDeInsumos = new ArrayList<Insumo>();
        
    }
    
    public void crearInsumo(Insumo insumo){
        
        listaDeInsumos.add(insumo);
    }
    
    public ArrayList<Insumo> getListadeInsumos(){
        return listaDeInsumos;
    }
    
    
    
}
