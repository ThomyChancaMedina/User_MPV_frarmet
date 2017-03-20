package com.example.thomychanca.finalthomy.ui.registration;

import android.util.Log;

import com.example.thomychanca.finalthomy.domain.interactor.user.RegisterUserInteractor;
import com.example.thomychanca.finalthomy.domain.interactor.user.RegisterUserInteractorImpl;

/**
 * Created by thomychanca on 12/03/2017.
 */

public class RegistrationPresenterImpl implements RegistrationPresenter {

    private RegistrationView view;

    private RegisterUserInteractor registerUserInteractor;

    public RegistrationPresenterImpl(RegistrationView view) {
        this.view = view;
        this.registerUserInteractor = new RegisterUserInteractorImpl();
    }


    @Override
    public void registerUser(String name, String dni, String company, String phone, String email, String password, String passwordConfirmation) {

        if (view != null) {
            view.showProgressBar();
        }

        if (areFilledFields(name, dni, company, phone, email, password, passwordConfirmation)) {

            registerUserInteractor.execute(name, dni, company, phone, email, password,passwordConfirmation,  new RegisterUserInteractor.OnRegisterUserListener() {
                @Override
                public void onRegisterUserSuccess(boolean isSuccesssfulRegistration) {
                    Log.i("Thomy", "se pude registrar colega");

                    if (view != null) {
                        view.showMessage("User has been regsiter");
                        view.finishActivity();
                    }
                }

                @Override
                public void onRegisterUserError(String error) {

                }
            });
        }

    }

    private boolean areFilledFields(String name, String dni, String company, String phone, String email, String password, String passawordConfirmation) {
        if (!name.isEmpty() && !dni.isEmpty() && !company.isEmpty() && !phone.isEmpty() && !email.isEmpty() && !password.isEmpty() && !passawordConfirmation.isEmpty()) {
            return true;
        }
        return false;
    }
}
