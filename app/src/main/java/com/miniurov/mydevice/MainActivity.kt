package com.miniurov.mydevice
//noinspection DataBindingWithoutKapt dataBinding = true
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.miniurov.mydevice.databinding.ActivityMainBinding


data class User(
    var data0: String = "Нет данных",
    var data1: String = "Нет данных",
    var data2: String = "Нет данных"
)
val user = User()


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.user = _user_
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user=user
        binding.button.setOnClickListener {
            chengeValue()
        }

    }

    private fun chengeValue(){
        binding.user?.data0 = "Данные изменены"
        val massaging=user.data0
        println("Данные изменились {$massaging}")
        binding.executePendingBindings()
    }

}

