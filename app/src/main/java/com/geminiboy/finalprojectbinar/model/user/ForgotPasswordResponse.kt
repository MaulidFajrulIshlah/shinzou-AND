package com.geminiboy.finalprojectbinar.model.user


import com.google.gson.annotations.SerializedName

data class ForgotPasswordResponse(
    @SerializedName("message")
    val message: String
)