package com.developer.aashish.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Aashish on 7/1/2017.
 */

public class signup extends AppCompatActivity {

    CheckBox ch;
    Button btn;
EditText user,email,pass,repass;
    RadioButton r1,r2;
    String u,e,p,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        Spinner my=(Spinner)findViewById(R.id.spn);
        ArrayAdapter<String> mya=new ArrayAdapter<String>(signup.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.country));
        mya.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        my.setAdapter(mya);
        btn=(Button)findViewById(R.id.button2);
        ch=(CheckBox)findViewById(R.id.checkBox);
        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch.isChecked())
                {
                 btn.setEnabled(true)  ;
                }
                else
                {
                    btn.setEnabled(false);
                }
            }
        });

user=(EditText)findViewById(R.id.username);
        u=user.getText().toString();
        email=(EditText)findViewById(R.id.email);
        e=email.getText().toString();
        pass=(EditText)findViewById(R.id.password);
        p=pass.getText().toString();
        repass=(EditText)findViewById(R.id.repassword);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.equals("")||email.equals("")||pass.equals("")||repass.equals(""))
                {
                    Toast.makeText(signup.this,"Fill all block",Toast.LENGTH_LONG).show();

                }
                else if(!pass.equals(repass))
                {
                    Toast.makeText(signup.this,"Repassword not matched",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent i=new Intent(signup.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}


