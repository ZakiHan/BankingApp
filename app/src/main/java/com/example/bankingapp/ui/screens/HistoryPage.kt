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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bankingapp.R
import com.example.bankingapp.ui.theme.BankingAppTheme

@Composable
fun HistoryPage(navController: NavController) {
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        Text(
            text = "Transaction History",
            fontFamily = poppinsBold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 24.dp)
                .padding(top = 32.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))
        // Column for Filter & Content
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                ),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                ) {
                    Text(
                        text = "Sort By",
                        fontSize = 16.sp,
                        fontFamily = poppinsSemiBold,
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFED8B00), RoundedCornerShape(8.dp))
                            .padding(vertical = 4.dp)
                            .padding(horizontal = 8.dp)
                            .wrapContentHeight()
                            .weight(1f)
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            Text(
                                text = "Date",
                                fontSize = 14.sp,
                                fontFamily = poppinsMedium,
                                color = Color.White,
                                modifier = Modifier
                                    .weight(1f)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.ic_downarrow),
                                contentDescription = "Drop Icon",
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFED8B00), RoundedCornerShape(8.dp))
                            .padding(vertical = 4.dp)
                            .padding(horizontal = 8.dp)
                            .wrapContentHeight()
                            .weight(1f)
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            Text(
                                text = "Type",
                                fontSize = 14.sp,
                                fontFamily = poppinsMedium,
                                color = Color.White,
                                modifier = Modifier
                                    .weight(1f)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.ic_downarrow),
                                contentDescription = "Drop Icon",
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            // Content Card
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                ),
                modifier = Modifier
                    .wrapContentHeight()
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ){
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                ) {
                    // Date
                    Text(
                        text = "Wednesday, 13 March 2024",
                        fontSize = 14.sp,
                        fontFamily = poppinsSemiBold
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    // Content
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(12.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_transfer),
                                contentDescription = "Transfer Icon",
                                modifier = Modifier
                                    .scale(1f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(
                            modifier = Modifier
                        ) {
                            Text(
                                text = "Transfer from Rizky",
                                fontFamily = poppinsMedium,
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "Note: Lunch Bill",
                                fontSize = 10.sp
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Add a spacer to occupy remaining space
                        Text(
                            text = "+Rp 200,000.00",
                            fontFamily = poppinsMedium,
                            fontSize = 12.sp,
                            color = Color(0xFFED8B00)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF000000)
                        ),
                        modifier = Modifier
                            .height(2.dp)
                            .alpha(0.1f)
                            .fillMaxWidth()
                    ) {
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(12.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_withdraw),
                                contentDescription = "Transfer Icon",
                                modifier = Modifier
                                    .scale(1f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(
                            modifier = Modifier
                        ) {
                            Text(
                                text = "Withdraw - Grand Ind...",
                                fontFamily = poppinsMedium,
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "ID: 093019370173109",
                                fontSize = 10.sp
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Add a spacer to occupy remaining space
                        Text(
                            text = "-Rp 200,000.00",
                            fontFamily = poppinsMedium,
                            fontSize = 12.sp,
                            color = Color(0xFF000000)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            // Content Card
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                ),
                modifier = Modifier
                    .wrapContentHeight()
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ){
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                ) {
                    // Date
                    Text(
                        text = "Tuesday, 12 March 2024",
                        fontSize = 14.sp,
                        fontFamily = poppinsSemiBold,
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    // Content
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(12.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_bills),
                                contentDescription = "Transfer Icon",
                                modifier = Modifier
                                    .scale(1f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(
                            modifier = Modifier
                        ) {
                            Text(
                                text = "PLN - Token",
                                fontFamily = poppinsMedium,
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "ID: 21028908128231",
                                fontSize = 10.sp
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Add a spacer to occupy remaining space
                        Text(
                            text = "-Rp 2,000,000.00",
                            fontFamily = poppinsMedium,
                            fontSize = 12.sp,
                            color = Color(0xFF000000)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF000000)
                        ),
                        modifier = Modifier
                            .height(2.dp)
                            .alpha(0.1f)
                            .fillMaxWidth()
                    ) {
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(12.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_emoney),
                                contentDescription = "Transfer Icon",
                                modifier = Modifier
                                    .scale(1f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(
                            modifier = Modifier
                        ) {
                            Text(
                                text = "e-money Top Up",
                                fontFamily = poppinsMedium,
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "ID: 302813810313102",
                                fontSize = 10.sp
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Add a spacer to occupy remaining space
                        Text(
                            text = "-Rp 200,000.00",
                            fontFamily = poppinsMedium,
                            fontSize = 12.sp,
                            color = Color(0xFF000000)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            // Content Card
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                ),
                modifier = Modifier
                    .wrapContentHeight()
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ){
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                ) {
                    // Date
                    Text(
                        text = "Monday, 11 March 2024",
                        fontSize = 14.sp,
                        fontFamily = poppinsSemiBold,
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    // Content
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(12.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_qris),
                                contentDescription = "Transfer Icon",
                                modifier = Modifier
                                    .scale(1f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(
                            modifier = Modifier
                        ) {
                            Text(
                                text = "QRIS - Bebek Slamet",
                                fontFamily = poppinsMedium,
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "ID: 0823107310273201",
                                fontSize = 10.sp
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Add a spacer to occupy remaining space
                        Text(
                            text = "-Rp 300,000.00",
                            fontFamily = poppinsMedium,
                            fontSize = 12.sp,
                            color = Color(0xFF000000)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF000000)
                        ),
                        modifier = Modifier
                            .height(2.dp)
                            .alpha(0.1f)
                            .fillMaxWidth()
                    ) {
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(12.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_transfer),
                                contentDescription = "Transfer Icon",
                                modifier = Modifier
                                    .scale(1f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(
                            modifier = Modifier
                        ) {
                            Text(
                                text = "Transfer from Putra",
                                fontFamily = poppinsMedium,
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "Note: Dinner Bill",
                                fontSize = 10.sp
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Add a spacer to occupy remaining space
                        Text(
                            text = "+Rp 500,000.00",
                            fontFamily = poppinsMedium,
                            fontSize = 12.sp,
                            color = Color(0xFFED8B00)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF000000)
                        ),
                        modifier = Modifier
                            .height(2.dp)
                            .alpha(0.1f)
                            .fillMaxWidth()
                    ) {
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(12.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_donate),
                                contentDescription = "Transfer Icon",
                                modifier = Modifier
                                    .scale(1f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(
                            modifier = Modifier
                        ) {
                            Text(
                                text = "Donate - PMI",
                                fontFamily = poppinsMedium,
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "ID: 01287312037210837",
                                fontSize = 10.sp
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Add a spacer to occupy remaining space
                        Text(
                            text = "-Rp 200,000.00",
                            fontFamily = poppinsMedium,
                            fontSize = 12.sp,
                            color = Color(0xFF000000)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            // Content Card
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                ),
                modifier = Modifier
                    .wrapContentHeight()
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ){
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                ) {
                    // Date
                    Text(
                        text = "Sunday, 10 March 2024",
                        fontSize = 14.sp,
                        fontFamily = poppinsSemiBold
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    // Content
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(12.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_qris),
                                contentDescription = "Transfer Icon",
                                modifier = Modifier
                                    .scale(1f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(
                            modifier = Modifier
                        ) {
                            Text(
                                text = "QRIS - Bebek Slamet",
                                fontFamily = poppinsMedium,
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "ID: 0823107310273201",
                                fontSize = 10.sp
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Add a spacer to occupy remaining space
                        Text(
                            text = "-Rp 300,000.00",
                            fontFamily = poppinsMedium,
                            fontSize = 12.sp,
                            color = Color(0xFF000000)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF000000)
                        ),
                        modifier = Modifier
                            .height(2.dp)
                            .alpha(0.1f)
                            .fillMaxWidth()
                    ) {
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(12.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_transfer),
                                contentDescription = "Transfer Icon",
                                modifier = Modifier
                                    .scale(1f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(
                            modifier = Modifier
                        ) {
                            Text(
                                text = "Transfer from Putra",
                                fontFamily = poppinsMedium,
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "Note: Dinner Bill",
                                fontSize = 10.sp
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Add a spacer to occupy remaining space
                        Text(
                            text = "+Rp 500,000.00",
                            fontFamily = poppinsMedium,
                            fontSize = 12.sp,
                            color = Color(0xFFED8B00)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Card(
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF000000)
                        ),
                        modifier = Modifier
                            .height(2.dp)
                            .alpha(0.1f)
                            .fillMaxWidth()
                    ) {
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(12.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ic_donate),
                                contentDescription = "Transfer Icon",
                                modifier = Modifier
                                    .scale(1f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(
                            modifier = Modifier
                        ) {
                            Text(
                                text = "Donate - PMI",
                                fontFamily = poppinsMedium,
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "ID: 01287312037210837",
                                fontSize = 10.sp
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f)) // Add a spacer to occupy remaining space
                        Text(
                            text = "-Rp 200,000.00",
                            fontFamily = poppinsMedium,
                            fontSize = 12.sp,
                            color = Color(0xFF000000)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HistoryPreviewPage() {
    BankingAppTheme {

    }
}