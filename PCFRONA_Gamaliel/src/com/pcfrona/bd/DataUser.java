/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pcfrona.bd;

import com.pcfrona.model.Usuario;

/**
 *
 * @author Laboratorio 2023
 */
public class DataUser {
    
    private Usuario credenciales;

    public DataUser() {
        
        credenciales = new Usuario("PCFRONA", "Admin");
        
    }
    
    public boolean validarUsuario(Usuario usuario){
        if(credenciales.getUserName().equals(usuario.getUserName()) && credenciales.getPassword().equals(usuario.getPassword())){
            return true;
        }
        return false;
        //return credenciales.equals(usuario);
    }
    
    
    
    
}
