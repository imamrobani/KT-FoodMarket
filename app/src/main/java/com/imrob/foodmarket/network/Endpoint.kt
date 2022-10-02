package com.imrob.foodmarket.network

import com.imrob.foodmarket.model.response.Wrapper
import com.imrob.foodmarket.model.response.login.LoginResponse
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Endpoint {

    @FormUrlEncoded
    @POST
    fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): Observable<Wrapper<LoginResponse>>
}