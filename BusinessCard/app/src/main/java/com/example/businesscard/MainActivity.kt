package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.foundation.layout.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FullSection()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        FullSection()
    }
}


@Composable
fun FullSection() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.weight(1f))
        FirstSection()
        Spacer(modifier = Modifier.weight(1f))
        SecondSection()
    }
}

@Composable
fun FirstSection() {
    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(100.dp)
                .width(100.dp)
                .background(color = Color.DarkGray)

        )
        Text(
            text = "Jair Cachay",
            fontSize = 40.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Estudiante de UNMSM",
            fontSize = 18.sp,
            color = Color.White
        )
    }
}


@Composable
fun SecondSection() {
    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Icon(
                imageVector = Icons.Filled.Phone,
                contentDescription = "Phone",
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = " +51 915 252 ---",
                fontSize = 22.sp
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(10.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Email,
                contentDescription = "Email",
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = "jair.cachay@unmsm.edu.pe",
                fontSize = 22.sp
            )
        }
    }
}