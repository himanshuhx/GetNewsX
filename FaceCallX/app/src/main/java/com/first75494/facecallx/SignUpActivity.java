package com.first75494.facecallx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthProvider;
import com.hbb20.CountryCodePicker;

public class SignUpActivity extends AppCompatActivity {

    private CountryCodePicker ccp;
    private EditText phoneText, codeText;
    private Button continueBtn;
    private String checker = "",phoneNo = "";
    private RelativeLayout relativeLayout;

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks callbacks;
    private FirebaseAuth fAuth;
    private String mVerificationId;
    private PhoneAuthProvider.ForceResendingToken mResendToken;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        phoneText = findViewById(R.id.phonetext);
        codeText = findViewById(R.id.codeText);
        continueBtn = findViewById(R.id.SignUpBtn);
        relativeLayout = findViewById(R.id.phoneAuth);
        ccp = findViewById(R.id.ccp);
        ccp.registerCarrierNumberEditText(phoneText);

        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(continueBtn.getText().equals("Submit") || checker.equals("Code_sent")){

                }else{
                    phoneNo = ccp.getFullNumberWithPlus();

                    if(!phoneNo.equals("")){

                    }else{
                        Toast.makeText(SignUpActivity.this,"Please Enter a Valid Format",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
