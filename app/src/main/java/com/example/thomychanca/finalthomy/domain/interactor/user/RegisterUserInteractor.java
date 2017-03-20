package com.example.thomychanca.finalthomy.domain.interactor.user;

/**
 * Created by thomychanca on 11/03/2017.
 */

public interface RegisterUserInteractor {

    interface OnRegisterUserListener{
        void onRegisterUserSuccess(boolean isSuccesssfulRegistration);
        void onRegisterUserError(String error);

    }
    void execute(String name,String dni,String company,String phone,String email,String password,String passwordConfirmation, OnRegisterUserListener listener);
}
