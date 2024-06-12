package com.example.bankingapp.navigation

sealed class NavRoutes(val route: String) {
    object Account : NavRoutes("account")
    object History : NavRoutes("history")
    object Home : NavRoutes("home")
    object Message : NavRoutes("message")
    object PreLogin : NavRoutes("preLogin")
}
