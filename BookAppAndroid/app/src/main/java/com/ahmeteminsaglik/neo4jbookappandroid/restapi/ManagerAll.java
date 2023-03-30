package com.ahmeteminsaglik.neo4jbookappandroid.restapi;

import com.ahmeteminsaglik.neo4jbookappandroid.model.Author;
import com.ahmeteminsaglik.neo4jbookappandroid.model.Book;
import com.ahmeteminsaglik.neo4jbookappandroid.model.User;
import com.ahmeteminsaglik.neo4jbookappandroid.model.response.abstracts.RestApiResponse;
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
        return getUserRestApiClient().getAllUsers();
    }

    public Call<LoginResponse> getUserByLoginRequest(User user) {
        return getUserRestApiClient().loginUser(user);
    }

    public Call<SignUpResponse> signUpUser(User user) {
        return getUserRestApiClient().signUpUser(user);
    }

    public Call<RestApiResponse<List<Book>>> getReadBookList(Long id) {
        return getBookRestApiClient().getReadBooks(id);
    }

    public Call<RestApiResponse<List<Book>>> getRecommendedBookListByPoint() {
        return getBookRestApiClient().getRecommendedBookListByPoint();
    }

    public Call<RestApiResponse<List<Book>>> getRecommendedBookListByTotalRead() {
        return getBookRestApiClient().getRecommendedBookListByTotalRead();
    }
    public Call<RestApiResponse<List<Book>>> getRecommendedBookListByByFriendRead(Long userId) {
        return getBookRestApiClient().getRecommendedBookListByByFriendRead(userId);
    }

    public Call<RestApiResponse<List<Author>>> getRecommendAuthorListByPoint() {
        return getAuthorRestApiClient().getRecommendedAuthorListByPoint();
    }
}
