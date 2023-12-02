/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedidos.model;

import com.pedidos.model.iceScream.Flavor;
import com.pedidos.model.iceScream.Format;
import com.pedidos.model.iceScream.Size;
import com.pedidos.model.iceScream.Topping;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author morag
 */
public class Order {
    
    private Flavor flavor;
    private Size size;
    private Format format;
    private Topping topping;
    
    private Date dateOfOrder;
    private int state;
    
    private Person person;

    public Order() {
    }

    public Order(Flavor flavor, Size size, Format format, Topping topping, Date dateOfOrder, int state, Person person) {
        this.flavor = flavor;
        this.size = size;
        this.format = format;
        this.topping = topping;
        this.dateOfOrder = dateOfOrder;
        this.state = state;
        this.person = person;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
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

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.flavor);
        hash = 47 * hash + Objects.hashCode(this.size);
        hash = 47 * hash + Objects.hashCode(this.format);
        hash = 47 * hash + Objects.hashCode(this.topping);
        hash = 47 * hash + Objects.hashCode(this.dateOfOrder);
        hash = 47 * hash + this.state;
        hash = 47 * hash + Objects.hashCode(this.person);
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
        final Order other = (Order) obj;
        if (this.state != other.state) {
            return false;
        }
        if (!Objects.equals(this.flavor, other.flavor)) {
            return false;
        }
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        if (!Objects.equals(this.format, other.format)) {
            return false;
        }
        if (!Objects.equals(this.topping, other.topping)) {
            return false;
        }
        if (!Objects.equals(this.dateOfOrder, other.dateOfOrder)) {
            return false;
        }
        return Objects.equals(this.person, other.person);
    }

    @Override
    public String toString() {
        return "Order{" + "flavor=" + flavor + ", size=" + size + ", format=" + format + ", topping=" + topping + ", dateOfOrder=" + dateOfOrder + ", state=" + state + ", person=" + person + '}';
    }
    
    
}
