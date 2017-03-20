package com.example.thomychanca.finalthomy.ui.login;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.thomychanca.finalthomy.domain.interactor.user.CheckLoginInteractor;
import com.example.thomychanca.finalthomy.domain.interactor.user.CheckLoginInteractorImpl;
import com.example.thomychanca.finalthomy.model.User;


/**
 * Created by thomychanca on 11/03/2017.
 */

public class LoginPresenterImpl extends AppCompatActivity implements LoginPresenter {

    private LoginView view;
    private CheckLoginInteractor checkLoginInteractor;

    public  LoginPresenterImpl(LoginView view){
        this.view=view;
        checkLoginInteractor=new CheckLoginInteractorImpl();
    }

    @Override
    public void signInButtonClicked(String email, String password) {
        if(view !=null){
            view.showProgressBar();
            view.disableSignInButton();
        }
        if (areFilledFields(email, password)){
            checkLoginInteractor.execute(email,password,new CheckLoginInteractor.OnGetFarmersListener(){
                @Override
                public void onGetFarmersSuccess(User body){
                    if (view!=null){
                        view.dismissProgressBar();
                        view.enableSignInButton();
                        Log.i("Thomy","lo conseguiste");
                        view.goToMainActivity();
                    }
                }
                @Override
                public void onLoginError(String error){
                    if(view!=null){
                        view.dismissProgressBar();
                        view.enableSignInButton();
                        view.showMessage(error);
                    }
                }
            });

        }else {
            if (view!=null){
                view.dismissProgressBar();
                view.enableSignInButton();
                view.showMessage("Fill empty fields");
            }
        }
    }

    private boolean areFilledFields(String username,String password){
        if(!username.isEmpty()&&!password.isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public void registerClicked() {
        view.goToRegistration();

    }
}
