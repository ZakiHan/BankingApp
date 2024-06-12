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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun AccountPage(navController: NavController){
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
            text = "Account",
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
                .fillMaxWidth()
        ) {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f) // Ensure this Row takes up all available space
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_account),
                                contentDescription = "Account Icon",
                                modifier = Modifier
                                    .scale(1.25f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "My Account",
                            fontSize = 16.sp,
                            fontFamily = poppinsSemiBold
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ic_rightarrow),
                        contentDescription = "Drop Icon",
                        modifier = Modifier
                            .size(24.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f) // Ensure this Row takes up all available space
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_debitcard),
                                contentDescription = "Debit Card Icon",
                                modifier = Modifier
                                    .scale(1.25f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Debit Card",
                            fontSize = 16.sp,
                            fontFamily = poppinsSemiBold
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ic_rightarrow),
                        contentDescription = "Right Icon",
                        modifier = Modifier
                            .size(24.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f) // Ensure this Row takes up all available space
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_creditcard),
                                contentDescription = "Credit Card Icon",
                                modifier = Modifier
                                    .scale(1.25f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Credit Card",
                            fontSize = 16.sp,
                            fontFamily = poppinsSemiBold
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ic_rightarrow),
                        contentDescription = "Right Icon",
                        modifier = Modifier
                            .size(24.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f) // Ensure this Row takes up all available space
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_help),
                                contentDescription = "Help Icon",
                                modifier = Modifier
                                    .scale(1.25f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Help Center",
                            fontSize = 16.sp,
                            fontFamily = poppinsSemiBold
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ic_rightarrow),
                        contentDescription = "Right Icon",
                        modifier = Modifier
                            .size(24.dp)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Feature & Security",
            fontFamily = poppinsBold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(start = 24.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFFFFF)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 4.dp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f) // Ensure this Row takes up all available space
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .background(
                                    Color(0xFFED8B00),
                                    shape = RoundedCornerShape(100)
                                )
                                .padding(16.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_quickaccess),
                                contentDescription = "Quick Access Icon",
                                modifier = Modifier
                                    .scale(1.25f)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Quick Access",
                            fontSize = 16.sp,
                            fontFamily = poppinsSemiBold
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ic_rightarrow),
                        contentDescription = "Drop Icon",
                        modifier = Modifier
                            .size(24.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFFFFF)
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 4.dp
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.weight(1f) // Ensure this Row takes up all available space
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .background(
                                        Color(0xFFED8B00),
                                        shape = RoundedCornerShape(100)
                                    )
                                    .padding(16.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_pin),
                                    contentDescription = "PIN Icon",
                                    modifier = Modifier
                                        .scale(1.25f)
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(
                                text = "PIN",
                                fontSize = 16.sp,
                                fontFamily = poppinsSemiBold
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.ic_rightarrow),
                            contentDescription = "Drop Icon",
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFFFFF)
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 4.dp
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.weight(1f) // Ensure this Row takes up all available space
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .background(
                                        Color(0xFFED8B00),
                                        shape = RoundedCornerShape(100)
                                    )
                                    .padding(16.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_password),
                                    contentDescription = "Password Icon",
                                    modifier = Modifier
                                        .scale(1.25f)
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(
                                text = "Password",
                                fontSize = 16.sp,
                                fontFamily = poppinsSemiBold
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.ic_rightarrow),
                            contentDescription = "Drop Icon",
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFFFFF)
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 4.dp
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 24.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.weight(1f) // Ensure this Row takes up all available space
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .background(
                                        Color(0xFFED8B00),
                                        shape = RoundedCornerShape(100)
                                    )
                                    .padding(16.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_fingerprint),
                                    contentDescription = "Fingerprint Icon",
                                    modifier = Modifier
                                        .scale(1.25f)
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(
                                text = "Fingerprint",
                                fontSize = 16.sp,
                                fontFamily = poppinsSemiBold
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.ic_rightarrow),
                            contentDescription = "Drop Icon",
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AccountPreviewPage() {
    BankingAppTheme {

    }
}