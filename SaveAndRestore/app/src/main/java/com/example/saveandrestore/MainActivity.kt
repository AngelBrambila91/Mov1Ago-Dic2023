package com.example.saveandrestore

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.saveandrestore.ui.theme.SaveAndRestoreTheme

class MainActivity : ComponentActivity() {
    private val discountButton : Button get() = findViewById(R.id.discount_button)
    private val firstName : EditText get() = findViewById(R.id.first_name)
    private val lastName : EditText get() = findViewById(R.id.last_name)
    private val email : EditText get() = findViewById(R.id.email)
    private val discountCodeConfirmation : TextView get() = findViewById(R.id.discount_code_confirmation)
    private val discountCode : TextView get() = findViewById(R.id.discount_code)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.activity_main)
        }
    }
}
