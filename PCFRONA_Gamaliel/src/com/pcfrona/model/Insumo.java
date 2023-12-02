/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pcfrona.model;

/**
 *
 * @author Laboratorio 2023
 */
public class Insumo {

    private String tarjetaGrafica;
    private String procesador;
    private String ram;
    private String discoDuro;

    public Insumo() {
    }

    public Insumo(String tarjetaGrafica, String procesador, String ram, String discoDuro) {
        this.tarjetaGrafica = tarjetaGrafica;
        this.procesador = procesador;
        this.ram = ram;
        this.discoDuro = discoDuro;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    @Override
    public String toString() {
        return "Insumo{" + "tarjetaGrafica=" + tarjetaGrafica + ", procesador=" + procesador + ", ram=" + ram + ", discoDuro=" + discoDuro + '}';
    }

    

}
