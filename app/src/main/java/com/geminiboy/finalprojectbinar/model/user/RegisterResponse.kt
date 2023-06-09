package com.geminiboy.finalprojectbinar.model.user


import com.google.gson.annotations.SerializedName

data class RegisterResponse(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: String
) {
    data class Data(
        @SerializedName("createdAt")
        val createdAt: String,
        @SerializedName("email")
        val email: String,
        @SerializedName("id")
        val id: String,
        @SerializedName("is_verified")
        val isVerified: Boolean,
        @SerializedName("name")
        val name: String,
        @SerializedName("otp")
        val otp: String,
        @SerializedName("password")
        val password: String,
        @SerializedName("phone_number")
        val phoneNumber: String,
        @SerializedName("role")
        val role: String,
        @SerializedName("token")
        val token: String,
        @SerializedName("updatedAt")
        val updatedAt: String
    )
}