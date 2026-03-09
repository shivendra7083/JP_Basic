package com.example.jetpackcompose

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)

@Composable
fun CardUI() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize() /*.background(color = Color.White)*/,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                //verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Hello Android!!",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(15.dp)
                )

                Image(
                    painter = painterResource(R.drawable.featured_channel),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(
                            RoundedCornerShape(15.dp)
                        )
                )

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Button(onClick = {
                        Toast.makeText(
                            context, "Subscribed!", Toast.LENGTH_SHORT
                        ).show()
                    }, modifier = Modifier.weight(1f)) {
                        Text("Subscribe")
                    }

                    Button(onClick = {
                        Toast.makeText(context, "Shared!!", Toast.LENGTH_SHORT).show()
                    }, modifier = Modifier.weight(1f)) {
                        Text("Share")
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))

            }
        }
    }
}


