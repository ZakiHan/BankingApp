package com.example.bankingapp.ui.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.bankingapp.R

sealed class BottomNavItem(val route: String, @StringRes val title: Int, @DrawableRes val icon: Int) {
    object Home : BottomNavItem("home", R.string.home, R.drawable.ic_home_white)
    object History : BottomNavItem("history", R.string.history, R.drawable.ic_history_white)
    object Message : BottomNavItem("message", R.string.message, R.drawable.ic_message_white)
    object Account : BottomNavItem("account", R.string.account, R.drawable.ic_account_white)
}