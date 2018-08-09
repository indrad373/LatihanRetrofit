package com.example.user.latihanretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.user.latihanretrofit.api.EmartApiServices;
import com.example.user.latihanretrofit.api.NetworkServices;
import com.example.user.latihanretrofit.api.model.AuthModel;
import com.example.user.latihanretrofit.api.model.Login;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Objects;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EmartApiServices emartApiServices = NetworkServices.getLinkversalApiServices();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TES", "AW");


        //Register Model
  /*      AuthModel authModel = new AuthModel("nkkkk", "Arif", "kkk@gmail.com", "kkk", "rahasia", "penjual");
    emartApiServices.register(authModel).enqueue(new Callback<ResponseBody>() {
        @Override
        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            Log.d("TES", "AW ADA");

            if (response.isSuccessful()) {
                try {
                    JSONObject jsonObject = new JSONObject(Objects.requireNonNull(response.body()).string());
                    boolean isSuccsess = jsonObject.getBoolean("Success");
                    String info = jsonObject.getString("Info");
                    Log.d("TES JO", String.valueOf(isSuccsess));
                    Log.d("TES JO", info);
                } catch (JSONException | IOException e) {
                    e.printStackTrace();
                }

            } else {
                try {
                    Log.d("TES V", String.valueOf(response.errorBody().string()));
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }

        @Override
        public void onFailure(Call<ResponseBody> call, Throwable t) {
            Log.d("TES", t.getMessage());
        }
 }); */

    //Login Model
        Login login = new Login("Irza@gmail.com", "rahasia");
        emartApiServices.user(login).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            Log.d("LOGIN TEST", "Login ADA");

            if (response.isSuccessful()){
               try {
                    JSONObject jsonObject = new JSONObject(Objects.requireNonNull(response.body()).string());
                    boolean isLoginSuccsess = jsonObject.getBoolean("Success");
                    String infologin = jsonObject.getString("Info");
                    Log.d("TES Login", String.valueOf(isLoginSuccsess));
                    Log.d("TES Login", infologin);
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Log.d("TES Login Else", String.valueOf(response.errorBody().string()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d("TES Login", t.getMessage());
            }
        });

    }
}
