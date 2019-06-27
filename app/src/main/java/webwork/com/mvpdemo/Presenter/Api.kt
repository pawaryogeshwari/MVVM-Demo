package webwork.com.mvpdemo.Presenter

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("api/users/login")
    fun userLogin(

        @Field("email")  email:String,
        @Field("password") password:String
    ): Call<LoginResponse>

}