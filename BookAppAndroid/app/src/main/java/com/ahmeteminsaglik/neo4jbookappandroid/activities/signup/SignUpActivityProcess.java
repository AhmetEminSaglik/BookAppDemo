package com.ahmeteminsaglik.neo4jbookappandroid.activities.signup;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.ahmeteminsaglik.neo4jbookappandroid.model.User;
import com.ahmeteminsaglik.neo4jbookappandroid.model.response.abstracts.RestApiErrorResponse;
import com.ahmeteminsaglik.neo4jbookappandroid.model.response.concrete.SignUpResponse;
import com.ahmeteminsaglik.neo4jbookappandroid.restapi.ManagerAll;
import com.google.gson.Gson;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class SignUpActivityProcess {
    private final Context context;

    public SignUpActivityProcess(Context context) {
        this.context = context;
    }

    public boolean signUp(User user) {
        return sendSignUpRequest(user);
    }

    private boolean sendSignUpRequest(User user) {
        Call<SignUpResponse> call = ManagerAll.getInstance().signUpUser(user);
        try {
            Response<SignUpResponse> response = call.execute();
            if (response.code() == 200) {
                Toast.makeText(context, "Signup successfuly", Toast.LENGTH_LONG).show();
                return true;
            } else {
                Gson gson = new Gson();
                RestApiErrorResponse errorResponse = gson.fromJson(response.errorBody().charStream(), RestApiErrorResponse.class);
                String errMsg = errorResponse.getMessage();
                Log.e("Error :  ", errMsg);
                Toast.makeText(context, errMsg, Toast.LENGTH_LONG).show();
            }
        } catch (IOException e) {
            Log.e("Error occured at sending SingUp Request : ", e.getMessage());
        }
        return false;
    }
}
