package com.example.gestaodeestado.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp


@Composable
fun CaixaDeEntrada(
    label: String,
    placeHolder: String,
    keyboardType: KeyboardType,
    corApp: Color,
    value: String,
    modifier: Modifier,
    atualizarValor: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = { atualizarValor(it) },
        modifier = modifier,
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = corApp,
            unfocusedBorderColor = corApp
        ),
        shape = RoundedCornerShape(12.dp),
        label = { Text(text = label) },
        placeholder = { Text(text = placeHolder) },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
    )

}
