package com.tikay.prohub

/*  
 * Created by TIKAY on Jan 02, 2023.
 * Copyright (c) 2023. All rights reserved.
 */

internal sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Dashboard : Screen("dashboard")
    object Account : Screen("account")
    object CheckOut : Screen("checkout")
    object MediCab : Screen("medicab")
    object MediCare : Screen("medicare")
    object Search : Screen("search")


//    object PaymentOptions : Screen("paymentOptions")
//    object SchedulePickup : Screen("schedulePickup")
//    object AddPaymentMethod : Screen("addPaymentMethod")
//    object Map : Screen("map")
//    object ConfirmPickUpLocation : Screen("confirmPickUpLocation")
//    object WhereTo : Screen("whereTo")
}