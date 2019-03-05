package com.example.myapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Login_Screen extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private static final String URL_FOR_LOGIN = "https://XXX.XXX.X.XX/android_login_example/login.php";
    //ProgressDialog progressDialog;
    private EditText loginInputEmail, loginInputPassword;
    private Button btnLogin, btnSignUp, btnSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__screen);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        loginInputEmail = findViewById(R.id.login_input_email);
        loginInputPassword = findViewById(R.id.login_input_password);
        btnLogin = findViewById(R.id.btn_login);
        btnSignUp = findViewById(R.id.btn_signup);
        btnSkip = findViewById(R.id.btn_skip);
        //mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        // Progress dialog
        //progressDialog = new ProgressDialog(this);
        //progressDialog.setCancelable(false);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //loginUser(loginInputEmail.getText().toString(),loginInputPassword.getText().toString());
                Toast.makeText(getApplicationContext(), "Login Button Clicked", Toast.LENGTH_SHORT).show();
             finish(); // startActivity(new Intent(Login_Screen.this, homeActivity.class));

            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //loginUser(loginInputEmail.getText().toString(),loginInputPassword.getText().toString());
                Toast.makeText(getApplicationContext(), "Sign Up Clicked", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Login_Screen.this, RegisterActivity.class));
                finish();
            }
        });
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //loginUser(loginInputEmail.getText().toString(),loginInputPassword.getText().toString());
                Toast.makeText(getApplicationContext(), "Skip Button Clicked", Toast.LENGTH_SHORT).show();
                finish();//startActivity(new Intent(Login_Screen.this, homeActivity.class));
               // return;
            }
        });

    }
}

        /*
        btnLinkSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login_Screen.this, RegisterActivity.class);
                startActivity(i);

            }
        });
    }
    private void loginUser( final String email, final String password) {
        // Tag used to cancel the request
        String cancel_req_tag = "login";
        progressDialog.setMessage("Logging you in...");
        showDialog();
        StringRequest strReq = new StringRequest(Request.Method.POST,
                URL_FOR_LOGIN, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Log.d(TAG, "Register Response: " + response.toString());
                hideDialog();
                try {
                    JSONObject jObj = new JSONObject(response);
                    boolean error = jObj.getBoolean("error");

                    if (!error) {
                        String user = jObj.getJSONObject("user").getString("name");
                        // Launch User activity
                        Intent intent = new Intent(
                                Login_Screen.this,homeActivity.class);
                        intent.putExtra("username", user);
                        startActivity(intent);
                        finish();
                    } else {

                        String errorMsg = jObj.getString("error_msg");
                        Toast.makeText(getApplicationContext(),
                                errorMsg, Toast.LENGTH_LONG).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "Login Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_LONG).show();
                hideDialog();
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // Posting params to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("email", email);
                params.put("password", password);
                return params;
            }
        };
        // Adding request to request queue
        //AppSingleton.getInstance(getApplicationContext()).addToRequestQueue(strReq,cancel_req_tag);
    }

    private void showDialog() {
        if (!progressDialog.isShowing())
            progressDialog.show();
    }
    private void hideDialog() {
        if (progressDialog.isShowing())
            progressDialog.dismiss();
    }
}
*/
