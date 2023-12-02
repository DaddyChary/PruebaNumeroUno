/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedidos.model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author morag
 */
public class Person {
    private String rut;
    private String name;
    private String last_name;
    private Date birthday;

    public Person() {
    }

    public Person(String rut, String name, String last_name, Date birthday) {
        this.rut = rut;
        this.name = name;
        this.last_name = last_name;
        this.birthday = birthday;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.rut);
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.last_name);
        hash = 83 * hash + Objects.hashCode(this.birthday);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.rut, other.rut)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.last_name, other.last_name)) {
            return false;
        }
        return Objects.equals(this.birthday, other.birthday);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" + "rut=" + rut + ", name=" + name + ", last_name=" + last_name + ", birthday=" + birthday + '}';
    }
    
    
    
}
