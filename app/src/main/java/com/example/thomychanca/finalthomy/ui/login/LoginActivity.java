package com.example.thomychanca.finalthomy.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thomychanca.finalthomy.model.User;
import com.example.thomychanca.finalthomy.ui.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.thomychanca.finalthomy.R;

import com.example.thomychanca.finalthomy.ui.registration.RegistrationActivity;
import com.example.thomychanca.finalthomy.ui.technician.adapter.TechnicianActivity;
import com.example.thomychanca.finalthomy.util.MainActivity;

import android.widget.Button;

/**
 * Created by thomychanca on 11/03/2017.
 */

//public class LoginActivity extends BaseActivity implements LoginView{
public class LoginActivity extends AppCompatActivity{
    LoginPresenter presenter;

    @BindView(R.id.tiet_email_login)
    TextInputEditText tietUsernameLogin;

    @BindView(R.id.tiet_password_login)
    TextInputEditText tiet_password_login;

    @BindView(R.id.b_sign_in_login)
    Button bSingInLogin;

    @BindView(R.id.tv_register_login)
    TextView tvRegisterLogoin;

    @BindView(R.id.pb_login)
    ProgressBar pbLogin;

    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

     /*   getSupportActionBar().setTitle(R.string.app_name);
        presenter=new LoginPresenterImpl(this);*/
    }

/*    @Override
    protected int getLayoutResourceId(){
        return R.layout.activity_login;

    }*/

    @OnClick(R.id.b_sign_in_login)
    public void onSignInButtonClicked(){
       Intent intent=new Intent(LoginActivity.this, MainActivity.class);
        LoginActivity.this.startActivity(intent);
    }

    @OnClick(R.id.tv_register_login)
    public void onRegisterClicked(){
        presenter.registerClicked();
    }

  /*  @Override
    public void goToRegistration() {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }

    @Override
    public void showProgressBar(){
        pbLogin.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissProgressBar(){
        pbLogin.setVisibility(View.GONE);

    }
    @Override
    public void showMessage(String message){
        Toast.makeText(this, message,Toast.LENGTH_LONG).show();

    }
    @Override
    public void goToMainActivity(){
        Intent intent=new Intent(this,Test.class);
        startActivity(intent);
    }
    @Override
    public void goToTechnician(User user){
        Intent intent=new Intent(this, TechnicianActivity.class);
        intent.putExtra("id",user.getId());
        startActivity(intent);
    }
    @Override
    public void disableSignInButton(){
        bSingInLogin.setEnabled(false);
    }
    @Override
    public void enableSignInButton(){
        bSingInLogin.setEnabled(true);
    }*/



}
