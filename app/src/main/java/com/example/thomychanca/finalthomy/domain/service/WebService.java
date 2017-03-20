package com.example.thomychanca.finalthomy.domain.service;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import com.example.thomychanca.finalthomy.model.User;
import com.example.thomychanca.finalthomy.model.UserRegister;

/**
 * Created by thomychanca on 11/03/2017.
 */

public interface WebService {
    @GET("AJAX/Login?email=cobretti124@gmail.com&password=password")
    Call<User>authenticate(@Query("email")String email,@Query("password")String password);

    @POST("AJAX/register")
    Call<UserRegister>registration(@Query("name") String name,@Query("dni")String dni,@Query("empresa")String company,@Query("telefono")String phone, @Query("email")String email,@Query("password")String password,@Query("password_confimation")String passwordConfirmation);

}
