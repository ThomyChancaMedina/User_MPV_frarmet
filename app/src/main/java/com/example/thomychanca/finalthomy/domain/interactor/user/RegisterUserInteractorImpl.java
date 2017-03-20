package com.example.thomychanca.finalthomy.domain.interactor.user;

import retrofit2.Callback;
import retrofit2.Call;
import retrofit2.Response;
import android.util.Log;
import com.example.thomychanca.finalthomy.domain.service.WebService;
import com.example.thomychanca.finalthomy.domain.service.ServiceManager;
import com.example.thomychanca.finalthomy.model.UserRegister;

/**
 * Created by thomychanca on 11/03/2017.
 */

public class RegisterUserInteractorImpl implements RegisterUserInteractor {

    private WebService webservice;
    public RegisterUserInteractorImpl(){
        webservice=ServiceManager.createWebService();
    }

    @Override
    public void execute(String name, String dni, String company, String phone,String email, String password, String passwordConfirmation, final OnRegisterUserListener listener) {
        Call<UserRegister>call=webservice.registration(name,dni,company,phone,email,password,passwordConfirmation);
        call.enqueue(new Callback<UserRegister>(){
            @Override
            public void onResponse(Call<UserRegister>call, Response<UserRegister>response){
                Log.i("thomy ","te rgistrastre");
                if(response.isSuccessful()){
                    Log.i("thomy","te Registraste");

                }
            }

            @Override
            public void onFailure(Call<UserRegister> call, Throwable t) {
                Log.i("thomy",t.toString());
            }

        });

    }
}
