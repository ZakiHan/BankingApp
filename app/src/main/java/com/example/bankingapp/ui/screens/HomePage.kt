package com.example.bankingapp.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bankingapp.R
import com.example.bankingapp.ui.theme.BankingAppTheme

@Composable
fun HomePage(navController: NavController) {
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
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = "BSI Logo",
            modifier = Modifier
                .scale(2f)
                .padding(top = 32.dp)
        )
        Spacer(modifier = Modifier.height(40.dp))
        Row(modifier = Modifier){
            Text(
                text = "Good Morning, ",
                fontFamily = poppinsRegular,
            )
            Text(
                text = "Hanan!",
                fontFamily = poppinsBold,
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
        ) {
            Box(
                modifier = Modifier.align(Alignment.CenterVertically)
            ) {
                Column(
                    modifier = Modifier
                ) {
                    Text(
                        text = "Balance",
                        fontFamily = poppinsBold,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(bottom = 4.dp)
                    )
                    Text(
                        text = "Rp 5.000.000,00",
                        fontFamily = poppinsRegular,
                        fontSize = 18.sp
                    )
                }
            }
            Spacer(modifier = Modifier.width(64.dp))
            Card(
                modifier = Modifier.size(width = 2.dp, height = 50.dp)
            ) {
                Surface(
                    color = Color.Black.copy(alpha = 0.2f),
                    modifier = Modifier.fillMaxSize()
                ) {

                }
            }
            Spacer(modifier = Modifier.width(4.dp))
            Box(
                modifier = Modifier
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                ) {
                    Text(
                        text = "Kiblat",
                        fontSize = 14.sp,
                        fontFamily = poppinsBold,
                        modifier = Modifier
                            .padding(bottom = 6.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_arrow),
                        contentDescription = "Kiblat Icon",
                        modifier = Modifier
                            .scale(1.4f)
                    )
                }
            }
            Spacer(modifier = Modifier.width(4.dp))
            Card(
                modifier = Modifier.size(width = 2.dp, height = 50.dp)
            ) {
                Surface(
                    color = Color.Black.copy(alpha = 0.2f),
                    modifier = Modifier.fillMaxSize()
                ) {
                    // Card content goes here
                }
            }
            Spacer(modifier = Modifier.width(4.dp))
            Box(
                modifier = Modifier
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                ){
                    Text(
                        text = "Dzuhur",
                        fontSize = 14.sp,
                        fontFamily = poppinsBold,
                        modifier = Modifier
                            .padding(bottom = 4.dp)
                    )
                    Text(
                        text = "12.13",
                        fontSize = 18.sp,
                        fontFamily = poppinsRegular,
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        // Main Menu
        Card(
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier
                .shadow(2.dp)
        ) {
            Surface(
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .padding(bottom = 8.dp)
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp)
                    ) {
                        // Transfer Menu
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .wrapContentHeight()
                                .weight(1f)
                        ){
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .background(
                                            Color(0xFFED8B00),
                                            shape = RoundedCornerShape(100)
                                        )
                                        .padding(16.dp)
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_transfer),
                                        contentDescription = "Transfer Icon",
                                        modifier = Modifier
                                            .scale(1.25f)
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Transfer",
                                    fontFamily = poppinsMedium,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .scale(1f)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        // Bills Menu
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .wrapContentHeight()
                                .weight(1f)
                        ){
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .background(
                                            Color(0xFFED8B00),
                                            shape = RoundedCornerShape(100)
                                        )
                                        .padding(16.dp)
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_bills),
                                        contentDescription = "Bills Icon",
                                        modifier = Modifier
                                            .scale(1.25f)
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Bills",
                                    fontFamily = poppinsMedium,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .scale(1f)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        // Top Up Menu
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .wrapContentHeight()
                                .weight(1f)
                        ){
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .background(
                                            Color(0xFFED8B00),
                                            shape = RoundedCornerShape(100)
                                        )
                                        .padding(16.dp)
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_topup),
                                        contentDescription = "Top Up Icon",
                                        modifier = Modifier
                                            .scale(1.25f)
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Top Up",
                                    fontFamily = poppinsMedium,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .scale(1f)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        // e-money Menu
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .wrapContentHeight()
                                .weight(1f)
                        ){
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .background(
                                            Color(0xFFED8B00),
                                            shape = RoundedCornerShape(100)
                                        )
                                        .padding(16.dp)
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_emoney),
                                        contentDescription = "e-money Icon",
                                        modifier = Modifier
                                            .scale(1.25f)
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "e-money",
                                    fontFamily = poppinsSemiBold,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .scale(1f)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        //QRIS Menu
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .wrapContentHeight()
                                .weight(1f)
                        ){
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .background(
                                            Color(0xFFED8B00),
                                            shape = RoundedCornerShape(100)
                                        )
                                        .padding(16.dp)
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_qris),
                                        contentDescription = "QRIS Icon",
                                        modifier = Modifier
                                            .scale(1.25f)
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "QRIS",
                                    fontFamily = poppinsMedium,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .scale(1f)
                                )
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .padding(bottom = 8.dp)
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp)
                    ) {
                        //Withdraw Menu
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .wrapContentHeight()
                                .weight(1f)
                        ){
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .background(
                                            Color(0xFFED8B00),
                                            shape = RoundedCornerShape(100)
                                        )
                                        .padding(16.dp)
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_withdraw),
                                        contentDescription = "Withdraw Icon",
                                        modifier = Modifier
                                            .scale(1.25f)
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Withdraw",
                                    fontFamily = poppinsMedium,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                        .scale(1f)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        // Invest Menu
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .wrapContentHeight()
                                .weight(1f)
                        ){
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .background(
                                            Color(0xFFED8B00),
                                            shape = RoundedCornerShape(100)
                                        )
                                        .padding(16.dp)
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_invest),
                                        contentDescription = "Invest Icon",
                                        modifier = Modifier
                                            .scale(1.25f)
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Invest",
                                    fontFamily = poppinsMedium,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .wrapContentHeight()
                                .weight(1f)
                        ){
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .background(
                                            Color(0xFFED8B00),
                                            shape = RoundedCornerShape(100)
                                        )
                                        .padding(16.dp)
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_donate),
                                        contentDescription = "Donate Icon",
                                        modifier = Modifier
                                            .scale(1.25f)
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Donate",
                                    fontFamily = poppinsMedium,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .wrapContentHeight()
                                .weight(1f)
                        ){
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .background(
                                            Color(0xFFED8B00),
                                            shape = RoundedCornerShape(100)
                                        )
                                        .padding(16.dp)
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_help),
                                        contentDescription = "Help Icon",
                                        modifier = Modifier
                                            .scale(1.25f)
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Help",
                                    fontFamily = poppinsMedium,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .wrapContentHeight()
                                .weight(1f)
                        ){
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .background(
                                            Color(0xFFED8B00),
                                            shape = RoundedCornerShape(100)
                                        )
                                        .padding(16.dp)
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_others),
                                        contentDescription = "Withdraw Icon",
                                        modifier = Modifier
                                            .scale(1.25f)
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Others",
                                    fontFamily = poppinsMedium,
                                    fontSize = 12.sp,
                                    modifier = Modifier
                                )
                            }
                        }
                    }
                }
            }

        }
        Spacer(modifier = Modifier.height(16.dp))
        // Column for Quick Pay Menu
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
        ) {
            // Quick Pay Text
            Text(
                text = "Quick Pay",
                fontFamily = poppinsBold,
                modifier = Modifier
                    .padding(start = 24.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            // Row for Quick Pay Content
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
                    .padding(end = 24.dp)
            ){
                // Add Quick Pay Card
                Card(
                    border = BorderStroke(1.dp, Color.Gray),
                    modifier = Modifier
                        .height(80.dp)
                        .padding(start = 24.dp)
                ) {
                    Surface(
                        color = Color.White,
                    ){
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(12.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_plus),
                                contentDescription = "Plus Icon",
                                modifier = Modifier
                                    .scale(1.25f)
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text ="Quick Pay",
                                fontFamily = poppinsSemiBold,
                                modifier = Modifier
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.width(12.dp))
                // Quick Pay Content Card
                Card(
                    border = BorderStroke(1.dp, Color.Gray),
                    modifier = Modifier
                        .wrapContentWidth()
                        .height(80.dp)
                ) {
                    Surface(
                        color = Color.White,
                    ){
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(start = 12.dp)
                                .padding(vertical = 4.dp)
                        ){
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .background(
                                        Color(0xFFED8B00),
                                        shape = RoundedCornerShape(100)
                                    )
                                    .padding(16.dp)
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.ic_topup),
                                    contentDescription = "Top Up Icon",
                                    modifier = Modifier
                                        .scale(1.25f)
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .padding(12.dp)
                            ) {
                                Text(
                                    text ="Gopay",
                                    fontFamily = poppinsSemiBold,
                                    modifier = Modifier
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text ="08123456789",
                                    fontSize = 12.sp,
                                    fontFamily = poppinsRegular,
                                    modifier = Modifier
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.width(12.dp))
                // Quick Pay Content Card
                Card(
                    border = BorderStroke(1.dp, Color.Gray),
                    modifier = Modifier
                        .wrapContentWidth()
                        .height(80.dp)
                ) {
                    Surface(
                        color = Color.White,
                    ){
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(start = 12.dp)
                                .padding(vertical = 4.dp)
                        ){
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .background(
                                        Color(0xFFED8B00),
                                        shape = RoundedCornerShape(100)
                                    )
                                    .padding(16.dp)
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.ic_emoney),
                                    contentDescription = "e-money Icon",
                                    modifier = Modifier
                                        .scale(1.25f)
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .padding(12.dp)
                            ) {
                                Text(
                                    text ="e-money",
                                    fontFamily = poppinsSemiBold,
                                    modifier = Modifier
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text ="Rp 250,000.00",
                                    fontSize = 12.sp,
                                    fontFamily = poppinsRegular,
                                    modifier = Modifier
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.width(12.dp))
                // Quick Pay Content Card
                Card(
                    border = BorderStroke(1.dp, Color.Gray),
                    modifier = Modifier
                        .wrapContentWidth()
                        .height(80.dp)
                ) {
                    Surface(
                        color = Color.White,
                    ){
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(start = 12.dp)
                                .padding(vertical = 4.dp)
                        ){
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .background(
                                        Color(0xFFED8B00),
                                        shape = RoundedCornerShape(100)
                                    )
                                    .padding(16.dp)
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.ic_topup),
                                    contentDescription = "Top Up Icon",
                                    modifier = Modifier
                                        .scale(1.25f)
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .padding(12.dp)
                            ) {
                                Text(
                                    text ="OVO",
                                    fontFamily = poppinsSemiBold,
                                    modifier = Modifier
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text ="08123456789",
                                    fontSize = 12.sp,
                                    fontFamily = poppinsRegular,
                                    modifier = Modifier
                                )
                            }
                        }
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Offers",
                fontFamily = poppinsBold,
                modifier = Modifier
                    .padding(start = 24.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ){
                Column(modifier = Modifier
                    .padding(start = 24.dp)
                ){
                    Card(
                        border = BorderStroke(1.dp, Color.Gray),
                        modifier = Modifier
                            .size(width = 200.dp, height = 100.dp)
                    ){
                        Surface(
                            color = Color.White,
                        ) {

                        }
                    }
                    Text(
                        text = "Promo",
                        fontFamily = poppinsMedium,
                        modifier = Modifier
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Column(
                    modifier = Modifier
                    .padding(bottom = 12.dp)
                ){
                    Card(
                        border = BorderStroke(1.dp, Color.Gray),
                        modifier = Modifier
                            .size(width = 200.dp, height = 100.dp)
                    ){
                        Surface(
                            color = Color.White,
                        ) {

                        }
                    }
                    Text(
                        text = "Promo",
                        fontFamily = poppinsMedium,
                        modifier = Modifier
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Column(modifier = Modifier){
                    Card(
                        border = BorderStroke(1.dp, Color.Gray),
                        modifier = Modifier
                            .size(width = 200.dp, height = 100.dp)
                    ){
                        Surface(
                            color = Color.White,
                        ) {

                        }
                    }
                    Text(
                        text = "Promo",
                        fontFamily = poppinsMedium,
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreviewPage() {
    BankingAppTheme {
        HomePage(navController = rememberNavController())
    }
}
