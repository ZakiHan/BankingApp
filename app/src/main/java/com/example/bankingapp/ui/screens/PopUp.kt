package com.example.bankingapp.ui.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingapp.R

@Composable
fun PopUp(onCancel: () -> Unit, onConfirm: () -> Unit) {
    val poppinsRegular = FontFamily(
        Font(R.font.poppins, weight = FontWeight.Normal),
    )
    val poppinsMedium = FontFamily(
        Font(R.font.poppins_medium, weight = FontWeight.Medium),
    )
    val poppinsSemiBold = FontFamily(
        Font(R.font.poppins_semibold, weight = FontWeight.SemiBold),
    )
    val poppinsBold = FontFamily(
        Font(R.font.poppins_bold, weight = FontWeight.Bold),
    )
    AlertDialog(
        onDismissRequest = onCancel,
        title = {
            Text(
                text = "Password",
                fontFamily = poppinsSemiBold,
                fontSize = 14.sp,
            )
        },
        text = {
            Column(
                modifier = Modifier
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFEFEFEF)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                ) {

                }
            }
        },
        buttons = {
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp), // Adjusted spacing here
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
                    .padding(bottom = 24.dp)
            ) {
                Button(
                    onClick = onCancel,
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFFFFF)),
                    shape = RoundedCornerShape(24.dp),
                    modifier = Modifier
                        .weight(1f)
                        .border(
                            width = 1.dp,
                            color = Color(0xFF00BFB2),
                            shape = RoundedCornerShape(24.dp)
                        )
                ) {
                    Text(
                        text = "Cancel",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular,
                        color = Color(0xFF00BFB2)
                    )
                }
                Button(
                    onClick = onConfirm,
                    shape = RoundedCornerShape(24.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00BFB2)),
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Text(
                        text = "Log In",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular,
                    )
                }
            }
        },
        modifier = Modifier
            .padding(horizontal = 24.dp),
        shape = RoundedCornerShape(24.dp),
        backgroundColor = Color(0xFFFFFFFF)
    )
}



@Preview
@Composable
fun PopUpPreview() {
    val onCancel: () -> Unit = {}
    val onConfirm: () -> Unit = {}
    PopUp(onCancel, onConfirm)
}