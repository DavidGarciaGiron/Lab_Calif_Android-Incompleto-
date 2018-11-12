package com.example.david.matriculaapp;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {

    String API_BASE_URL = "https://matricula-api-sagitaforever.c9users.io";

    @GET("/api/personas/")
    Call<List<Persona>> getProductos();

    @FormUrlEncoded
    @POST("/api/personas/")
    Call< Persona> createPersona(@Field("tipo") String tipo,
                                   @Field("correo") String correo,
                                   @Field("detalle") String detalle);
    @Multipart
    @POST("/api/personas/")
    Call< Persona> createPersonaWithImage(
            @Part("tipo") RequestBody tipo,
            @Part("correo") RequestBody correo,
            @Part("detalle") RequestBody detalle,
            @Part MultipartBody.Part imagen
            
    );
}
