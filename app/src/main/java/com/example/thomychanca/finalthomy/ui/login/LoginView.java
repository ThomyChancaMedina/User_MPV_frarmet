package com.example.thomychanca.finalthomy.ui.login;
import com.example.thomychanca.finalthomy.model.User;
/**
 * Created by thomychanca on 11/03/2017.
 */

public interface LoginView {
    void goToRegistration();
    void showProgressBar();
    void dismissProgressBar();
    void showMessage(String message);
    void goToMainActivity();
    void goToTechnician(User user);
    void disableSignInButton();
    void enableSignInButton();


}
