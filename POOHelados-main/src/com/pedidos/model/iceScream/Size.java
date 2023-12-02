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
public class Size {
    
    private int id;
    private String name;
    private int size;

    public Size(int id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public Size() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + this.size;
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
        final Size other = (Size) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Size{" + "id=" + id + ", name=" + name + ", size=" + size + '}';
    }
    
    
    
    
}
