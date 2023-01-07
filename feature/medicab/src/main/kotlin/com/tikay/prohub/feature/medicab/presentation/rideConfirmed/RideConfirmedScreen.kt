package com.tikay.prohub.feature.medicab.presentation.rideConfirmed

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.Error
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShareLocation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tikay.prohub.core.design.R
import com.tikay.prohub.core.design.component.UberBottomSheetListItem
import com.tikay.prohub.core.design.component.UberDivider
import com.tikay.prohub.feature.medicab.presentation.rideConfirmed.components.BottomActions
import com.tikay.prohub.feature.medicab.presentation.rideConfirmed.components.DescriptionTopBar
import com.tikay.prohub.feature.medicab.presentation.rideConfirmed.components.DriverDescription
import com.tikay.prohub.feature.medicab.presentation.rideConfirmed.components.RidePin
import com.tikay.prohub.core.design.theme.ProHubTheme
import com.tikay.prohub.core.design.theme.spacing
import com.tikay.prohub.core.design.util.DevicePreviews
import com.tikay.prohub.core.design.util.LargeScreenChildMaxWidth
import com.tikay.prohub.core.design.util.rememberIsMobileDevice

@Composable
fun RideConfirmedScreen(
    shouldScroll: Boolean = false,
    goToDashboard: () -> Unit
) {
    BackHandler {
        goToDashboard()
    }

    Column(
        modifier = Modifier
            .then(
                if (rememberIsMobileDevice()) {
                    Modifier.fillMaxWidth()
                } else {
                    Modifier.width(MaterialTheme.spacing.minWidth)
                }
            )
            .wrapContentSize()
            .verticalScroll(rememberScrollState(), enabled = shouldScroll),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                DescriptionTopBar(
                    elevation = 16.dp,
                    title = "Meet at the pickup point for Home",
                    timeLeftInMinutes = 3
                )
                RidePin(
                    title = "PIN for this ride",
                    pin = "4890"
                )
                DriverDescription(
                    driverImageUrl = R.drawable.driver_image,
                    driverRating = 5.0,
                    driverName = "Dhaval",
                    driverTotalTrips = "7,261",
                    carImageUrl = R.drawable.wagon_r_image,
                    carNumber = "GJ01FT3805",
                    carName = "Maruti Suzuki Wagon R"
                )
                UberDivider()
                Image(
                    modifier = Modifier
                        .padding(MaterialTheme.spacing.medium)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(10)),
                    painter = painterResource(id = R.drawable.travel_responsibly),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
                UberDivider()
                Image(
                    modifier = Modifier
                        .padding(vertical = MaterialTheme.spacing.medium)
                        .width(200.dp)
                        .aspectRatio(2f)
                        .clip(RoundedCornerShape(10)),
                    painter = painterResource(id = R.drawable.reserve),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
        }
        Surface(
            modifier = Modifier.padding(top = MaterialTheme.spacing.medium)
        ) {
            Column {
                UberBottomSheetListItem(
                    icon = Icons.Filled.LocationOn,
                    title = "Dev Arc Commercial Complex",
                    subtitle = "14:16 dropoff",
                    actionTitle = "Add or Change"
                )
                UberBottomSheetListItem(
                    icon = Icons.Outlined.Person,
                    title = "$7.58",
                    subtitle = "Personal \u00B7 Payment",
                    actionTitle = "Switch"
                )
                UberBottomSheetListItem(
                    icon = Icons.Outlined.Error,
                    iconTint = MaterialTheme.colorScheme.error,
                    title = null,
                    subtitle = "We can't reach our network, so the trip total might be outdated",
                    actionTitle = null
                )
                UberBottomSheetListItem(
                    icon = Icons.Outlined.ShareLocation,
                    title = "Share trip status",
                    actionTitle = "Share",
                    useFullSizeDivider = true
                )
                BottomActions(goToDashboard = goToDashboard)
            }
        }
    }
}

@DevicePreviews
@Composable
private fun RideConfirmedScreenPreview() {
    ProHubTheme {
        Column(
            modifier = Modifier.then(
                if (rememberIsMobileDevice()) {
                    Modifier.fillMaxWidth()
                } else {
                    Modifier.width(LargeScreenChildMaxWidth)
                }
            )
        ) {
            RideConfirmedScreen {}
        }
    }
}
