package com.example.bankingapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import com.example.bankingapp.R
import com.example.bankingapp.ui.theme.BankingAppTheme

@Composable
fun PreLoginPage(navController: NavController) {
    val logoBSI: Painter = painterResource(id = R.drawable.ic_logo)
    var showPopup by remember { mutableStateOf(false) }
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
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 80.dp)
    ){
        Image(
            painter = logoBSI,
            contentDescription = "BSI Logo",
            modifier = Modifier
                .scale(6f)
        )
        Spacer(modifier = Modifier.height(150.dp))
        Button(
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00827E)),
            onClick = {showPopup = true},
        ) {
            Text(
                text = "Log In",
                fontFamily = poppinsRegular,
                modifier = Modifier
                    .scale(1.5f)
                    .padding(horizontal = 80.dp)
                    .padding(vertical = 12.dp)

            )
        }
        if (showPopup) {
            // Show the popup
            Dialog(onDismissRequest = { showPopup = false }) {
                PopUp(
                    onCancel = { showPopup = false },
                    onConfirm = {
                        showPopup = false
                        navController.navigate("home")
                    }
                )
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
        ) {
            //Withdraw Icon
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .wrapContentHeight()
                    .weight(1f)
            ){
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .background(
                                Color(0xFFED8B00),
                                shape = RoundedCornerShape(100)
                            )
                            .padding(20.dp)
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.ic_withdraw),
                            contentDescription = "Withdraw Icon",
                            modifier = Modifier
                                .scale(1.25f)
                        )
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Withdraw",
                        fontFamily = poppinsMedium,
                        fontSize = 12.sp,
                        modifier = Modifier
                    )
                }
            }
            Spacer(modifier = Modifier.width(24.dp))
            //e-money Icon
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .wrapContentHeight()
                    .weight(1f)
            ){
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .background(
                                Color(0xFFED8B00),
                                shape = RoundedCornerShape(100)
                            )
                            .padding(20.dp)

                    ){
                        Image(
                            painter = painterResource(id = R.drawable.ic_emoney),
                            contentDescription = "e-money Icon",
                            modifier = Modifier
                                .scale(1.25f))
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "e-money",
                        fontFamily = poppinsMedium,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .scale(1f)
                    )
                }
            }
            Spacer(modifier = Modifier.width(24.dp))
            //QRIS Icon
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .wrapContentHeight()
                    .weight(1f)
            ){
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .background(
                                Color(0xFFED8B00),
                                shape = RoundedCornerShape(100)
                            )
                            .padding(20.dp)

                    ){
                        Image(
                            painter = painterResource(id = R.drawable.ic_qris),
                            contentDescription = "QRIS Icon",
                            modifier = Modifier
                                .scale(1.25f))
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "QRIS",
                        fontFamily = poppinsMedium,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .scale(1f)
                    )
                }
            }
            Spacer(modifier = Modifier.width(24.dp))
            //Help Icon
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .wrapContentHeight()
                    .weight(1f)
            ){
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .background(
                                Color(0xFFED8B00),
                                shape = RoundedCornerShape(100)
                            )
                            .padding(20.dp)

                    ){
                        Image(
                            painter = painterResource(id = R.drawable.ic_help),
                            contentDescription = "Help Icon",
                            modifier = Modifier
                                .scale(1.25f))
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Help",
                        fontFamily = poppinsMedium,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .scale(1f)
                    )
                }
            }
        }
    }
}
/*
@Composable
fun BlurEffectBox(
    modifier: Modifier = Modifier,
    blurRadius: Float = 16f,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .graphicsLayer {
                alpha = 0.99f // Needed to trigger the blur effect
            }
            .drawWithContent {
                drawContent()
                drawRect(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.5f)),
                        startY = size.height / 3,
                        endY = size.height
                    )
                )
                drawRect(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.5f)),
                        startX = size.width / 3,
                        endX = size.width
                    )
                )
            }
    ) {
        content()
    }
}
*/
@Preview(showBackground = true)
@Composable
fun PreLoginPreviewPage() {
    BankingAppTheme {
    }
}

