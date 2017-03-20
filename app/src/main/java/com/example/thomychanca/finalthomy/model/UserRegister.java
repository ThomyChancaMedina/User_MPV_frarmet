package com.example.thomychanca.finalthomy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by thomychanca on 11/03/2017.
 */

public class UserRegister {
    @SerializedName("nombre")
    @Expose
    public String nombre;

    @SerializedName("email")
    @Expose
    public String email;

    @SerializedName("password")
    @Expose
    public String password;

    @SerializedName("password_confirmation")
    @Expose
    public String passwordConfirmation;

    @SerializedName("empresa")
    @Expose
    public String empresa;

    @SerializedName("dni")
    @Expose
    public String dni;

    @SerializedName("telefono")
    @Expose
    public String telefono;

    public String getTelefono(){
        return telefono;

    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }

    public String getEmpresa(){
        return empresa;

    }
    public void setEmpresa(String empresa){
        this.empresa=empresa;
    }

    public String getDni(){
        return dni;

    }
    public void setDni(String dni){
        this.dni=dni;
    }

    public String getPasswordConfirmation(){
        return passwordConfirmation;

    }
    public void setPasswordConfirmation(String passwordConfirmation){
        this.passwordConfirmation=passwordConfirmation;

    }
    public String getEmail(){
        return email;

    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public String getNombre(){
        return nombre;

    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    @Override
    public String toString(){
        return "UserRegister{"+
                ", email='"+nombre+'\''+
                ", password='"+email+'\''+
                ", passwordConfirmation='"+passwordConfirmation+'\''+
                ", empresa='"+empresa+'\''+
                ", dni='"+dni+'\''+
                ", telefono='"+telefono+'\''+
                '}';
    }




















}
