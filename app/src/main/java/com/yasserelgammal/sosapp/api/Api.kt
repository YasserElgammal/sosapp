package com.yasserelgammal.sosapp.api

import com.yasserelgammal.sosapp.models.DefaultResponse
import com.yasserelgammal.sosapp.models.LoginResponse
import retrofit2.Call
import retrofit2.http.*

interface Api {

    @FormUrlEncoded
    @POST("createuser")
    fun createUser(
        @Field("email") email:String,
        @Field("name") name:String,
        @Field("password") password:String,
        @Field("phone") phone:String,
        @Field("sosName") sosName:String,
        @Field("sosPhone") sosPhone:String
    ):Call<DefaultResponse>

    @FormUrlEncoded
    @POST("userlogin")
    fun userLogin(
        @Field("email") email:String,
        @Field("password") password: String
    ):Call<LoginResponse>
}