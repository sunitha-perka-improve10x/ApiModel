package com.example.apimodel;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.example.apimodel.model.ModelApi;
import com.example.apimodel.model.ModelApiService;
import com.google.gson.Gson;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

public class ApiTest {
    @Test
    public void getShop() throws IOException {
        ModelApiService modelApiService = new ModelApi().createModelApiService();
        Call<List<Shop>> call = modelApiService.getItems();
        List<Shop> shops = call.execute().body();
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        System.out.println(new Gson().toJson(shops));
    }
}
