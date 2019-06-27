package webwork.com.mvpdemo.Presenter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

  abstract class BaseActivity<T:LoginViewModel>:AppCompatActivity(){

    abstract val getLayout: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout)

    }


    fun showMessage(message : String?){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }


}
