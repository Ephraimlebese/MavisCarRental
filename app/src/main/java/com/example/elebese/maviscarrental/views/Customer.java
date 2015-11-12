package com.example.elebese.maviscarrental.views;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;

import com.example.elebese.maviscarrental.R;
import com.example.elebese.maviscarrental.model.Driver;

import java.util.List;

/**
 * Created by elebese on 2015/09/25.
 */
public class Customer  extends ActionBarActivity{
    private EditText firstName;
    private  EditText lastName;
    private Button clear;
    private EditText phoneNumber;
    private List<Driver> drivers;
    private Button submit;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        firstName = (EditText)findViewById(R.id.txtname);
        lastName = (EditText)findViewById(R.id.txtsurname);
        phoneNumber = (EditText)findViewById(R.id.txtPhoneNumber);
        submit= (Button)findViewById(R.id.btnSubmit);
        scrollView = (ScrollView)findViewById(R.id.scrollView);
        clear = (Button)findViewById(R.id.btnSignUpClear);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(firstName.getText().toString().equals(""))
                {
                    scrollView.scrollTo(0, 0);
                    firstName.requestFocus();
                    firstName.setError("Cannot be empty.");
                }else if(lastName.getText().toString().equals("")) {
                    scrollView.scrollTo(0, 0);
                    lastName.requestFocus();
                    lastName.setError("Cannot be empty.");
                }
                else if(lastName.getText().toString().equals("")) {
                    scrollView.scrollTo(0, 0);
                    lastName.requestFocus();
                    lastName.setError("Cannot be empty.");
                }
                else if(phoneNumber.getText().toString().equals("")) {
                    scrollView.scrollTo(0, 0);
                    lastName.requestFocus();
                    lastName.setError("Cannot be empty.");
                }

            }

        });
    }
}
