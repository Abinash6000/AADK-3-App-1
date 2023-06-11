package com.example.aadk_3app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnLogin)
        val etUserName: TextInputEditText = findViewById(R.id.tietUsername)
        val etPassword: TextInputEditText = findViewById(R.id.tietPassword)

        val usernameLayout: TextInputLayout = findViewById(R.id.etUsername)
        val passwordLayout: TextInputLayout = findViewById(R.id.etPassword)


        etUserName.setOnFocusChangeListener { _, hasFocus ->
            if(hasFocus)
                usernameLayout.isErrorEnabled = false
        }
        etPassword.setOnFocusChangeListener { v, hasFocus ->
            if(hasFocus)
                passwordLayout.isErrorEnabled = false
        }

        // TODO 2: set a click action
        btn.setOnClickListener {
            // TODO 1: get values from ets
            val username = etUserName.text.toString()
            val password = etPassword.text.toString()

            // TODO 3: safety checks on user inputs
            if(username.isBlank()) {
                // Show an error "Please enter a valid username"
                usernameLayout.error = "Please enter a valid username"
            }

            if(password.isEmpty()) {
                //Show error
                passwordLayout.error = "Please enter a password first"
            }

            // TODO 4: Display a Toast on button click
            if(checkFormDetails(username, password))
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
        }
    }

    private fun checkFormDetails(username: String, password: String): Boolean {
        return !(username.isBlank() || password.isEmpty())
    }
}