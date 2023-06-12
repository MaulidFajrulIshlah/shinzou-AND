package com.geminiboy.finalprojectbinar.ui.register

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegisterViewModel: ViewModel() {
    private var _isValidName = MutableLiveData<Boolean>()
    val isValidName: LiveData<Boolean> = _isValidName

    private var _isValidEmail = MutableLiveData<Boolean>()
    val isValidEmail: LiveData<Boolean> = _isValidEmail

    private var _isValidPassword = MutableLiveData<Boolean>()
    val isValidPassword: LiveData<Boolean> = _isValidPassword

    private var _isValidNoTelp = MutableLiveData<Boolean>()
    val isValidNoTelp: LiveData<Boolean> = _isValidNoTelp

    fun validateEmail(email: String){
        val validEmail = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
        _isValidEmail.postValue(validEmail)
    }

    fun validatePassword(password: String) {
        val validPassword = password.isNotEmpty() && password.length >= 8
        _isValidPassword.postValue(validPassword)
    }

    fun validateName(name: String){
        val validName = name.isNotEmpty()
        _isValidName.postValue(validName)
    }

    fun phoneNumber(number: String){
        val validNumber = number.isNotEmpty()
        _isValidNoTelp.postValue(validNumber)
    }
}