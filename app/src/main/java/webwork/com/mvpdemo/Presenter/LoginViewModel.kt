package webwork.com.mvpdemo.Presenter

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.text.TextUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginViewModel:ViewModel() {

    val apiClient = ApiManager.getClient().create(Api::class.java)
    fun checkValidation(email: String, password: String): Boolean {
        if (TextUtils.isEmpty(email)) {
            return false
        } else if (TextUtils.isEmpty(password)) {
            return false
        }
        return true
    }

    val loginData: MutableLiveData<LoginResponse> = MutableLiveData<LoginResponse>()

    fun Response(): MutableLiveData<LoginResponse> = loginData

    fun login(email: String,password: String){
        apiClient.userLogin(email, password)
            .enqueue(object :Callback<LoginResponse>
            {
                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {

                    loginData.postValue(null)
                }

                override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {

                    loginData.postValue(response.body())
                }


            })
    }
}