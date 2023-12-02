/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedidos.model.iceScream;

import java.util.Objects;

/**
 *
 * @author morag
 */
public class Topping {
    
    private int id;
    private String tag;

    public Topping() {
    }
    
    public Topping(int id, String tag) {
        this.id = id;
        this.tag = tag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Toppings{" + "id=" + id + ", tag=" + tag + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.id;
        hash = 13 * hash + Objects.hashCode(this.tag);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Topping other = (Topping) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.tag, other.tag);
    }

    
}
