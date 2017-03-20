package com.example.thomychanca.finalthomy.domain.interactor.user;

/**
 * Created by thomychanca on 11/03/2017.
 */

import com.example.thomychanca.finalthomy.model.User;

public interface CheckLoginInteractor {
    interface OnGetFarmersListener {
        void onLoginError(String error);

        void onGetFarmersSuccess(User body);

    }

    void execute(String email, String password, OnGetFarmersListener listener);

}
