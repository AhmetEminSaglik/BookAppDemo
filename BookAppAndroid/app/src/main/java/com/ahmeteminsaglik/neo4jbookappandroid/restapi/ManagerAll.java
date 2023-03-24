package com.ahmeteminsaglik.neo4jbookappandroid.restapi;

import com.ahmeteminsaglik.neo4jbookappandroid.model.User;
import com.ahmeteminsaglik.neo4jbookappandroid.model.response.concrete.LoginResponse;
import com.ahmeteminsaglik.neo4jbookappandroid.model.response.concrete.SignUpResponse;

import java.util.List;

import retrofit2.Call;

public class ManagerAll extends BaseManager {
    private static ManagerAll managerAll = new ManagerAll();

    public static synchronized ManagerAll getInstance() {
        return managerAll;
    }

    public Call<List<User>> getAllUser() {
        Call<List<User>> call = getRestApiClient().getAllUsers();
        return call;
    }

    public Call<LoginResponse> getUserByLoginRequest(User user) {
        return getRestApiClient().loginUser(user);
    }

    public Call<SignUpResponse> signUpUser(User user) {
        return getRestApiClient().signUpUser(user);
    }
}
