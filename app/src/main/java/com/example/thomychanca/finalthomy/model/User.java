package com.example.thomychanca.finalthomy.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by thomychanca on 11/03/2017.
 */

public class User {
    @SerializedName("email")
    @Expose
    public String email;

    @SerializedName("id")
    @Expose
    public String id;

    @SerializedName("nombre")
    @Expose
    public String nombre;

    @SerializedName("laravel_session")
    @Expose
    public String laravelSession;

    public String getLaravelSession(){
        return laravelSession;

    }

    public void setLaravelSession (String laravelSession){
        this.laravelSession=laravelSession;

    }
    public String getEmail(){
        return email;

    }
    public void setEmail(String email){
        this.email=email;

    }
    public String getId(){
        return id;

    }
    public void setId(String id){
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    @Override
    public String toString(){
        return "Login{"+
                "email=' "+email+'\''+
                ", id='"+id+'\''+
                ", nombre='"+nombre+'\''+
                ", laravelSession='"+laravelSession+'\''+
                '}';
    }


}






















