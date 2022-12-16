package com.example.yapasdsou.modules

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OnBoardingView() {
Column(modifier = Modifier
    .fillMaxSize()
    .background(color = MaterialTheme.colors.primary)) {
   Column {
       Text(  buildAnnotatedString {
           withStyle(style = ParagraphStyle(lineHeight = 30.sp)) {
               withStyle(style = SpanStyle(color = Color.White, fontSize = 30.sp, fontFamily = int)) {
                   append("PAS DE SOUS ?")
               }}})

   }
}
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    OnBoardingView()
}