package com.tikay.prohub.feature.medicab.presentation.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tikay.prohub.feature.medicab.presentation.dashboard.components.AroundYou
import com.tikay.prohub.feature.medicab.presentation.dashboard.components.BottomTabs
import com.tikay.prohub.feature.medicab.presentation.dashboard.components.DestinationSelection
import com.tikay.prohub.feature.medicab.presentation.dashboard.components.HorizontalPagerWithIndicator
import com.tikay.prohub.feature.medicab.presentation.dashboard.components.PickupSelection
import com.tikay.prohub.feature.medicab.presentation.dashboard.components.QuickOptions
import com.tikay.prohub.feature.medicab.presentation.dashboard.components.SideBar
import com.tikay.prohub.core.design.theme.ProHubTheme
import com.tikay.prohub.core.design.theme.spacing
import com.tikay.prohub.core.design.util.rememberDeviceWidth
import com.tikay.prohub.core.design.util.rememberIsMobileDevice
import com.google.accompanist.pager.ExperimentalPagerApi



@OptIn(ExperimentalPagerApi::class)
@Composable
fun DashboardRoute(
    onGotoWhereScreen: () -> Unit,
    onGotoMap: () -> Unit,
    modifier: Modifier = Modifier,
) {
    DashboardScreen(
        onGotoWhereScreen = onGotoWhereScreen,
        onGotoMap = onGotoMap
    )
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun DashboardScreen(
    onGotoWhereScreen: () -> Unit,
    onGotoMap: () -> Unit
) {
    val isMobile = rememberIsMobileDevice()
    val screenWidth = rememberDeviceWidth().dp
    Row {
        if(isMobile.not()) {
            SideBar()
        }
        Column {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
                    .background(color = MaterialTheme.colorScheme.onPrimary)
            ) {
                Spacer(modifier = Modifier.statusBarsPadding())
                //header
                HorizontalPagerWithIndicator(isMobile, screenWidth)
                //options
                QuickOptions(isMobile)
                //start/end location
                Spacer(modifier = Modifier.height(MaterialTheme.spacing.medium))
                PickupSelection(Modifier.align(Alignment.CenterHorizontally), onGotoWhereScreen)
                DestinationSelection(Modifier.align(Alignment.CenterHorizontally), onGotoWhereScreen)
                Spacer(modifier = Modifier.height(MaterialTheme.spacing.extraLarge))
                //around you
                AroundYou(isMobile, screenWidth, onGotoMap)
            }
            if (isMobile) {
                BottomTabs()
            }
        }
    }
}

@Preview(showSystemUi = true, device = "spec:width=1920dp,height=1080dp")
@Composable
private fun DashboardScreenPreview() {
    ProHubTheme {
        DashboardScreen({}) {}
    }
}