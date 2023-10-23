package com.example.ch4.ui.login

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ch4.data.repository.UserRepository
import com.example.ch4.utils.ResultWrapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RegisterViewModel (private val repository: UserRepository) : ViewModel(){
    private val _registerResult = MutableLiveData<ResultWrapper<Boolean>>()
    val registerResult : LiveData<ResultWrapper<Boolean>>
        get() = _registerResult

    fun doRegister(fullname: String, email: String, password: String){
        viewModelScope.launch ( Dispatchers.IO){
            repository.doRegister(fullname, email, password).collect{
                _registerResult.postValue(it)
            }
        }
    }
}