package com.iest.examen_primerparcial

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.iest.examen_primerparcial.ui.theme.Examen_PrimerParcialTheme

@Preview(showBackground = true)
@Composable
fun ChessBoardPreview() {
    Examen_PrimerParcialTheme {
        Surface(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF3F3A3A))) {
            ChessBoard(modifier = Modifier.fillMaxSize(), squareSize = 63.dp)
        }
    }
}


@Composable
fun ChessBoard(modifier: Modifier = Modifier, squareSize: Dp) {
    Column(
        modifier = modifier
            .padding(25.dp)
    ) {
        ChessRows(squareSize = squareSize)
    }
    Text(
        text = "Anatholy Karpov vs Gary Kasparov",
        modifier = Modifier.padding(top = 450.dp, start = 65.dp),
        color = Color.Black,
        fontStyle = FontStyle.Italic
    )
    Text(
        text = "1993",
        modifier = Modifier.padding(top = 490.dp, start = 180.dp),
        color = Color.Black,
        fontStyle = FontStyle.Italic
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 550.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(modifier = Modifier,


            onClick = { /*TODO*/ }) {
            Text(text = "Juegan Blancas")
        }
        Spacer(modifier = Modifier.width(16.dp)) // Espacio entre los botones
        Button(
            onClick = { /*TODO*/ }) {
            Text(text = "Juegan Negras")
        }
    }
}





@Composable
fun ChessRows(squareSize: Dp) {
    repeat(6) { row ->
        Row {
            repeat(5) { column ->
                val color = if ((row + column) % 2 == 0) Color(0xFF4F584F) else Color.White
                ChessSquare(color = color, size = squareSize)
            }
        }
    }
}

@Composable
fun ChessSquare(color: Color, size: Dp) {
    Box(
        modifier = Modifier
            .size(size)
            .background(color)
    )
}
