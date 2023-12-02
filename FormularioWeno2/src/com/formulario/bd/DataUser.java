/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.formulario.bd;

import com.formulario.model.Usuario;

/**
 *
 * @author DaddyChary
 */
public class DataUser {
    
    private Usuario credenciales;

    public DataUser() {
        credenciales = new Usuario("admin", "admin");
    }
    
    public boolean validarUsuario(Usuario usuario){
        if(credenciales.getUserName().equals(usuario.getUserName()) && credenciales.getPassword().equals(usuario.getPassword())){
            return true;
        }
        return false;
        //return credenciales.equals(usuario);
    }
    
    
}
