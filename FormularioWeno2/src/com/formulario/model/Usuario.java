/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.formulario.model;

/**
 *
 * @author DaddyChary
 */
public class Usuario {
    
    private String UserName;
    private String Password;

    public Usuario() {
    }

    public Usuario(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "UserName=" + UserName + ", Password=" + Password + '}';
    }
    
    
}
