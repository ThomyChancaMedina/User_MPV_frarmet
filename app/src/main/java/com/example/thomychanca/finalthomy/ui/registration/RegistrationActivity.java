package com.example.thomychanca.finalthomy.ui.registration;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.thomychanca.finalthomy.ui.base.BaseActivity;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.OnClick;
import com.example.thomychanca.finalthomy.R;

import java.util.List;

/**
 * Created by thomychanca on 11/03/2017.
 */

public class RegistrationActivity extends BaseActivity implements RegistrationView {
    @BindView(R.id.tiet_name_registration)
    TextInputEditText tietNameRegistration;

    @BindView(R.id.tiet_dni_registration)
    TextInputEditText tietDniRegistration;

    @BindView(R.id.tiet_company_registration)
    TextInputEditText tietCompanyRegistration;

    @BindView(R.id.tiet_phone_registration)
    TextInputEditText tietPhoneRegistration;

    @BindView(R.id.tiet_email_registration)
    TextInputEditText tietEmailRegistration;

    @BindView(R.id.tiet_password_registration)
    TextInputEditText tietPasswordRegistration;

    @BindView(R.id.tiet_passwordchek_registration)
    TextInputEditText tietPasswordchekRegistration;

    RegistrationPresenter presenter;
    List skillsSelected;

    @BindView(R.id.pb_registration)
    ProgressBar pdRegistration;

    @Override
    protected void onCreate(@NonNull Bundle savedInstaceState){
        super.onCreate(savedInstaceState);
        getSupportActionBar().setTitle(R.string.registration_name);

        presenter=new RegistrationPresenterImpl(this);
    }



    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_registration;

    }
    @OnClick(R.id.b_sign_in_registration)
    public void onRegisterButtonClicked(){
        presenter.registerUser(tietNameRegistration.getText().toString(),tietDniRegistration.getText().toString(),tietCompanyRegistration.getText().toString(),
                tietEmailRegistration.getText().toString(),tietPhoneRegistration.getText().toString(),tietPasswordRegistration.getText().toString(),tietPasswordchekRegistration.getText().toString());


    }

    @Override
    public void showMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();

    }

    @Override
    public void finishActivity(){
        finish();
    }

    @Override
    public void showProgressBar(){
        pdRegistration.setVisibility(View.VISIBLE);
    }
    @Override
    public void hideProgressBar(){
        pdRegistration.setVisibility(View.GONE);
    }

}
