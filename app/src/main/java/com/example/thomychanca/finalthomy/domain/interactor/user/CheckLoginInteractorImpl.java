package com.example.thomychanca.finalthomy.domain.interactor.user;

import android.util.Log;
import com.example.thomychanca.finalthomy.domain.service.WebService;
import com.example.thomychanca.finalthomy.model.User;
import com.example.thomychanca.finalthomy.domain.service.ServiceManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by thomychanca on 11/03/2017.
 */

public class CheckLoginInteractorImpl implements CheckLoginInteractor {
    private WebService webService;
    public CheckLoginInteractorImpl(){
        webService=ServiceManager.createWebService();

    }
    @Override
    public void execute (String email,String password, final OnGetFarmersListener listener){
        Call<User> Call=webService.authenticate(email,password);
        Call.enqueue(new Callback<User>(){


            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){
                    Log.i("thomy","llego la respuesta");
                    listener.onGetFarmersSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<User>call,Throwable t){
                Log.i("thomy",t.toString());
            }

        });
    }
}
