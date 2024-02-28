package com.example.dvfumobile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun TodoItem() {
    Card {
        Row {
            Column {
                Text(text = "Title")
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Subtitle of todo list")
            }
            Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "asd",
                    modifier = Modifier.size(48.dp)
            )
        }
    }
}

@Preview(showBackground = true)
