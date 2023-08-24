package com.example.assesment4.api

interface Apiinterface {
        @POST("/users/register")
        suspend fun registerUser(@Body registerRequest: RegisterRequest):Response<RegisterResponse>

        @POST("users/login")
        suspend fun loginUser(@Body loginRequest: LoginRequest):Response<LoginResponse>

}