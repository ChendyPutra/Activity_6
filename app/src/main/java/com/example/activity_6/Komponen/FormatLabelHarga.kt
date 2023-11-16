package com.example.activity_6.Komponen

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.activity_6.Data.OrderUIState
import com.example.activity_6.R

@Composable
fun FormatLabelHarga(subtotal: OrderUIState, modifier: Modifier = Modifier){
    Text(
        text = stringResource(R.string.subtotal_price, subtotal),
        modifier = modifier,
        style = MaterialTheme.typography.headlineSmall
    )
}