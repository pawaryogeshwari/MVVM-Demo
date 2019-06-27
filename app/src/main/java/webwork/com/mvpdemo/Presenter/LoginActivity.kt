package webwork.com.mvpdemo.Presenter

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import webwork.com.mvpdemo.R

class LoginActivity : BaseActivity<LoginViewModel>()
{

  lateinit  var viewModel:LoginViewModel

    override var getLayout = R.layout.activity_login

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(getLayout)

        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
         viewModel.Response().observe(this, Observer<LoginResponse> {

             if(it!=null)
             {
                Toast.makeText(this,it.data?.firstName,Toast.LENGTH_SHORT).show()
             }

else
             {
                 showMessage("Error")
             }

         })

        btn_login.setOnClickListener {
            if(viewModel.checkValidation(email_add.text.toString(),passwordText.text.toString()))
            {
                viewModel.login(email_add.text.toString(),passwordText.text.toString())

                showMessage("Login Sucessful")
            }

           else
            {
                showMessage("Login Failed")
            }


        }


    }

}