package com.example.yapasdsou.modules

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.yapasdsou.ui.theme.customFont


@Composable
fun OnBoardingView() {
Column(modifier = Modifier
    .fillMaxSize()
    .background(color = MaterialTheme.colors.primary)) {
   Column {
       Text("PAS DE SOUS ?", style=TextStyle(fontFamily = customFont))
Text("Pas de sous")
   }
}
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    OnBoardingView()
}