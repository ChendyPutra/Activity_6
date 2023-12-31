package com.example.activity_6

import android.provider.ContactsContract.Profile
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Profile(
    onSubmitButtonClicked: (MutableList<String>) -> Unit
){
    var nama by remember { mutableStateOf("") }
    var nohp by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var listData: MutableList<String> = mutableListOf(nama,nohp,alamat)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        OutlinedTextField(value = nama, onValueChange ={nama=it}, label = { Text(text = "Nama")} )
        OutlinedTextField(value = nohp, onValueChange ={nohp=it}, label = { Text(text = "No Telepon")} )
        OutlinedTextField(value = alamat, onValueChange ={alamat=it}, label = { Text(text = "Alamat")} )

        Spacer(modifier = Modifier.padding(16.dp))

        Button(onClick = { onSubmitButtonClicked(listData)}) {
            Text(text = stringResource(id = R.string.btn_submit))

        }
    }

}
