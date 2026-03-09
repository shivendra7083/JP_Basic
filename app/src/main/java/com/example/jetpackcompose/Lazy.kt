package com.example.jetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.collections.listOf


data class Contact(
    val name: String,
    val phoneNumber: String
)


@Composable
fun lazy(modifier: Modifier = Modifier) {

    val contact = remember {
        listOf(
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
            Contact(
                name = "John Doe",
                phoneNumber = "21546871867"
            ),
        )

    }

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(contact) { contact ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 6.dp)
                    .clip(RoundedCornerShape(39.dp))
            ) {
                Column(modifier = Modifier.padding(30.dp, 20.dp)) {
                    Text(
                        text = contact.name,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 5.dp)
                    )
                    Text(
                        text = contact.phoneNumber,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showPreview(modifier: Modifier = Modifier) {
    lazy()
}