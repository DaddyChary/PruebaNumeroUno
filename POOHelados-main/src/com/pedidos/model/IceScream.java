/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedidos.model;

import com.pedidos.model.iceScream.Flavor;
import com.pedidos.model.iceScream.Format;
import com.pedidos.model.iceScream.Size;
import com.pedidos.model.iceScream.Topping;
import java.util.Objects;

/**
 *
 * @author morag
 */
public class IceScream {
    private Flavor sabor;
    private Size size;
    private Format format;
    private Topping topping;

    public IceScream() {
    }

    public IceScream(Flavor sabor, Size size, Format format, Topping topping) {
        this.sabor = sabor;
        this.size = size;
        this.format = format;
        this.topping = topping;
    }

    public Flavor getSabor() {
        return sabor;
    }

    public void setSabor(Flavor sabor) {
        this.sabor = sabor;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.sabor);
        hash = 67 * hash + Objects.hashCode(this.size);
        hash = 67 * hash + Objects.hashCode(this.format);
        hash = 67 * hash + Objects.hashCode(this.topping);
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
        final IceScream other = (IceScream) obj;
        if (!Objects.equals(this.sabor, other.sabor)) {
            return false;
        }
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        if (!Objects.equals(this.format, other.format)) {
            return false;
        }
        return Objects.equals(this.topping, other.topping);
    }

    @Override
    public String toString() {
        return "IceScream{" + "sabor=" + sabor + ", size=" + size + ", format=" + format + ", topping=" + topping + '}';
    }
    
    
    
}
