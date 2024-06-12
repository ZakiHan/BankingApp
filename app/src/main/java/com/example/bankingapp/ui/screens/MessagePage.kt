package com.example.bankingapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
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
fun MessagePage(navController: NavController){
    var selectedTabIndex by remember { mutableStateOf(0) }
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
    ) {
        Text(
            text = "Message",
            fontFamily = poppinsBold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 24.dp)
                .padding(top = 32.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth()
        ) {
            TabRow(
                selectedTabIndex = selectedTabIndex,
                backgroundColor = Color.White,
                modifier = Modifier
                    .background(Color.White)
            ) {
                Tab(
                    selected = selectedTabIndex == 0,
                    onClick = { selectedTabIndex = 0 },
                    text = {
                        Text(
                            text = "Notification",
                            fontFamily = poppinsSemiBold,
                            fontSize = 16.sp
                        )
                    },
                    modifier = Modifier
                        .border(
                            width = if (selectedTabIndex == 0) 1.dp else 0.dp,
                            color = if (selectedTabIndex == 0) Color.Gray.copy(alpha = 1f) else Color.Transparent,
                            shape = RoundedCornerShape(
                                topStart = 16.dp,
                                topEnd = 16.dp,
                                bottomStart = 0.dp,
                                bottomEnd = 0.dp,
                            )
                        )
                        .background(
                            color = if (selectedTabIndex == 0)
                                Color(0xFFFFFFFF)
                            else Color(0xFF00BFB2).copy(alpha = 0.4f),
                            shape = RoundedCornerShape(
                                topStart = 16.dp,
                                topEnd = 16.dp,
                                bottomStart = 0.dp,
                                bottomEnd = 0.dp,
                            )
                        )
                        .alpha(if (selectedTabIndex == 1) 0.4f else 1f)
                )
                Tab(
                    selected = selectedTabIndex == 1,
                    onClick = { selectedTabIndex = 1 },
                    text = {
                        Text(
                            text = "Transaction",
                            fontFamily = poppinsSemiBold,
                            fontSize = 16.sp
                        )
                    },
                    modifier = Modifier
                        .border(
                            width = if (selectedTabIndex == 1) 1.dp else 0.dp,
                            color = if (selectedTabIndex == 1) Color.Gray.copy(alpha = 1f) else Color.Transparent,
                            shape = RoundedCornerShape(
                                topStart = 16.dp,
                                topEnd = 16.dp,
                                bottomStart = 0.dp,
                                bottomEnd = 0.dp,
                            )
                        )
                        .background(
                            color = if (selectedTabIndex == 1)
                                Color(0xFFFFFFFF)

                            else Color(0xFF00BFB2).copy(alpha = 0.4f),
                            shape = RoundedCornerShape(
                                topStart = 16.dp,
                                topEnd = 16.dp,
                                bottomStart = 0.dp,
                                bottomEnd = 0.dp,
                            )
                        )
                        .alpha(if (selectedTabIndex == 0) 0.4f else 1f)
                )
            }
            when (selectedTabIndex) {
                0 -> NotificationTabContent()
                1 -> TransactionTabContent()
            }
        }
    }
}
@Composable
fun NotificationTabContent() {
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
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFFFFF)
        ),
        shape = RoundedCornerShape(
            topStart = 0.dp,
            topEnd = 0.dp,
            bottomStart = 16.dp,
            bottomEnd = 16.dp
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(bottom = 12.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(bottom = 24.dp)
        ) {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF006965)
                ),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .padding(top = 12.dp)
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "Gopay Cashback",
                            fontFamily = poppinsSemiBold,
                            fontSize = 14.sp,
                            color = Color.White,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "13 Mar 24",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular,
                            color = Color.White,
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Selamat, kamu mendapatkan Cashback Gopay sebesar Rp 25.000!",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular,
                        color = Color.White,
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(
                    topStart = 16.dp,
                    topEnd = 16.dp,
                    bottomStart = 16.dp,
                    bottomEnd = 16.dp
                ),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(16.dp)),
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "Tokopedia Cashback",
                            fontFamily = poppinsSemiBold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "12 Mar 24",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular,
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Selamat, kamu mendapatkan bonus voucher sebesar Rp 15.0000. Silahkan ikuti point berikut!",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular,
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(
                    topStart = 16.dp,
                    topEnd = 16.dp,
                    bottomStart = 16.dp,
                    bottomEnd = 16.dp
                ),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(16.dp)),
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "QRIS Cashback",
                            fontFamily = poppinsSemiBold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "11 Mar 24",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular,
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Selamat, kamu mendapatkan Cashback QRIS sebesar 5.000!",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular,
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(
                    topStart = 16.dp,
                    topEnd = 16.dp,
                    bottomStart = 16.dp,
                    bottomEnd = 16.dp
                ),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(16.dp)),
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "Top Up Free Admin Fee Voucher",
                            fontFamily = poppinsSemiBold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "10 Mar 24",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular,
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Selamat, kamu mendapatkan voucher bebas biaya admin buat Top Up! Yuk Top Up sekarang!",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular,
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(
                    topStart = 16.dp,
                    topEnd = 16.dp,
                    bottomStart = 16.dp,
                    bottomEnd = 16.dp
                ),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(16.dp)),
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "Transfer Free Admin Fee Voucher",
                            fontFamily = poppinsSemiBold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "9 Mar 24",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular,
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Selamat, kamu mendapatkan voucher bebas biaya admin buat transfer ke mana aja!",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular,
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(
                    topStart = 16.dp,
                    topEnd = 16.dp,
                    bottomStart = 16.dp,
                    bottomEnd = 16.dp
                ),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(16.dp)),
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "Bills Cashback Voucher",
                            fontFamily = poppinsSemiBold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "8 Mar 24",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular,
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Selamat, kamu mendapatkan voucher cashback buat bayar listrik dan air!",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular,
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(
                    topStart = 16.dp,
                    topEnd = 16.dp,
                    bottomStart = 16.dp,
                    bottomEnd = 16.dp
                ),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(16.dp)),
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "Phone Credit Voucher",
                            fontFamily = poppinsSemiBold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "7 Mar 24",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular,
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Selamat, kamu mendapatkan voucher diskon pulsa sebesar Rp 5.000!",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular,
                    )
                }
            }
        }
    }
}

@Composable
fun TransactionTabContent() {
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
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFFFFF)
        ),
        shape = RoundedCornerShape(
            topStart = 0.dp,
            topEnd = 0.dp,
            bottomStart = 16.dp,
            bottomEnd = 16.dp
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
            .wrapContentHeight()
    ){
        Column(
            modifier = Modifier
                .padding(bottom = 12.dp)
        ){
            Text(
                text = "March 2024",
                fontFamily = poppinsSemiBold,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(12.dp)
            )
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(16.dp)),
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "Gopay Top Up Successfull!",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "5 Mar",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Kamu telah Top Up Gopay 08123456789 sebesar Rp 200.000.",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(16.dp)),
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "QRIS Payment Successfull!",
                            fontFamily = poppinsSemiBold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "4 Mar",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Kamu telah bayar QRIS di KFC - Grand Indonesia sebesar Rp 150.000.",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(16.dp)),
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "OVO Top Up Successfull!",
                            fontFamily = poppinsSemiBold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "3 Mar",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Kamu telah Top Up OVO 08123456789 sebesar Rp 200.000.",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(16.dp)),
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "Gopay Cashback Received!",
                            fontFamily = poppinsSemiBold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "3 Mar",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Kamu telah menerima cashback Gopay sebesar Rp 25.000.",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(16.dp)),
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "QRIS Cashback Received!",
                            fontFamily = poppinsSemiBold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "2 Mar",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Kamu telah menerima cashback QRIS sebesar Rp 25.000.",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .border(1.dp, Color.Gray, RoundedCornerShape(16.dp)),
            ){
                Column(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 12.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                    ){
                        Text(
                            text = "Transfer Successfull!",
                            fontFamily = poppinsSemiBold,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .weight(1f)
                        )
                        Text(
                            text = "2 Mar",
                            fontSize = 10.sp,
                            fontFamily = poppinsRegular
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "Kamu telah melakukan transfer ke Putra sebesar Rp 250.000.",
                        fontSize = 12.sp,
                        fontFamily = poppinsRegular
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MessagePreviewPage() {
    BankingAppTheme {
    }
}