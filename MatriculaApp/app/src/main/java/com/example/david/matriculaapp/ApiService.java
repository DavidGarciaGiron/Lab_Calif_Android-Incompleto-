package com.example.david.matriculaapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    String API_BASE_URL = "https://matricula-api-sagitaforever.c9users.io";

    @GET("/api/personas/")
    Call<List<Persona>> getProductos();

}
