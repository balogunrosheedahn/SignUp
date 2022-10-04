package com.nens.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.textfield.TextInputEditText
import com.nens.signup.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var enterPhone: TextInputEditText
    private lateinit var sendBtn: Button

    private var phoneNum =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enterPhone = findViewById(R.id.enterPhone)

        sendBtn.setOnClickListener{
            phoneNum = enterPhone.text.toString()

            if (phoneNum.isNullOrEmpty()){
                Toast.makeText(this, "Enter A Valid Number", Toast.LENGTH_LONG).show()
            }
        }

    }
    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        return inflater.inflate(R.layout.activity_sign_up, container,false)
    }
}