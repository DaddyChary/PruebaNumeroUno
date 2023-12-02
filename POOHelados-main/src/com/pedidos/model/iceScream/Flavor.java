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
public class Flavor {
    
    private int id;
    private String tag;
    private int price;

    public Flavor() {
    }

    public Flavor(String tag, int price) {
        this.tag = tag;
        this.price = price;
    }

    public Flavor(int id, String tag, int price) {
        this.id = id;
        this.tag = tag;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.tag);
        hash = 29 * hash + this.price;
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
        final Flavor other = (Flavor) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.tag, other.tag);
    }

    @Override
    public String toString() {
        return "Flavor{" + "id=" + id + ", tag=" + tag + ", price=" + price + '}';
    }

   
    
    

    
    
}
