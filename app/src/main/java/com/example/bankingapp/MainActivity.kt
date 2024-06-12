package com.example.bankingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.bankingapp.ui.screens.AccountPage
import com.example.bankingapp.ui.screens.BottomNavItem
import com.example.bankingapp.ui.screens.HistoryPage
import com.example.bankingapp.ui.screens.HomePage
import com.example.bankingapp.ui.screens.MessagePage
import com.example.bankingapp.ui.screens.PreLoginPage
import com.example.bankingapp.ui.theme.BankingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BankingAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    val navController = rememberNavController()
                    val navItems = listOf(
                        BottomNavItem.Home,
                        BottomNavItem.History,
                        BottomNavItem.Message,
                        BottomNavItem.Account
                    )
                    Scaffold(
                        bottomBar = { BottomNavBar(navController, navItems) },
                        content = { padding ->
                            Column(
                                modifier = Modifier
                                    .padding(padding)
                            ) {
                                NavHost(navController, startDestination = "preLogin") {
                                    composable("preLogin") { PreLoginPage(navController) }
                                    composable("home") { HomePage(navController) }
                                    composable("account") { AccountPage(navController) }
                                    composable("history") { HistoryPage(navController) }
                                    composable("message") { MessagePage(navController) }
                                }
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun BottomNavBar(navController: NavHostController, items: List<BottomNavItem>) {
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
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    if (currentRoute != "preLogin") {
        BottomNavigation(
            backgroundColor = Color.Black
        ) {
            items.forEach { item ->
                val isSelected = currentRoute == item.route
                BottomNavigationItem(
                    icon = {
                        Icon(
                            painterResource(id = item.icon),
                            contentDescription = null,
                            tint = if (isSelected) Color(0xFF00BFB2) else Color.White,
                            modifier = Modifier
                                .padding(top = 8.dp)
                                .padding(bottom = 4.dp)
                        )
                    },
                    label = {
                        Text(
                            stringResource(id = item.title),
                            color = if (isSelected) Color(0xFF00BFB2) else Color.White,
                            fontFamily = poppinsMedium,
                            modifier = Modifier
                                .padding(top = 4.dp)
                                .padding(bottom = 8.dp)
                        )
                    },
                    selected = currentRoute == item.route,
                    onClick = {
                        navController.navigate(item.route) {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                )
            }
        }
    }
}

@Preview
@Composable
fun BottomNavBarPreview() {
    val navController = rememberNavController()
    val navItems = listOf(
        BottomNavItem.Home,
        BottomNavItem.History,
        BottomNavItem.Message,
        BottomNavItem.Account
    )
    BankingAppTheme {
        Surface(color = Color.Black) {
            BottomNavBar(navController = navController, items = navItems)
        }
    }
}