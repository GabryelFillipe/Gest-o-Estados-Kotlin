package com.example.gestaodeestado.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType


@Composable
fun CaixaDeEntrada(
    label: String,
    placeHolder: String,
    keyboardType: KeyboardType,
    value: String,
    modifier: Modifier,
    atualizarValor: (String) -> Unit
) {
      OutlinedTextField(
        value = value,
        onValueChange = {atualizarValor(it)},
        modifier = modifier,
        label = { Text(text = label) },
        placeholder = { Text(text = placeHolder) },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
    )

}
