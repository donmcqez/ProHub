package com.tikay.prohub.feature.medicab.presentation.rideSummary

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.tikay.prohub.core.design.component.UberButton
import com.tikay.prohub.core.design.component.UberDivider
import com.tikay.prohub.feature.medicab.presentation.rideSummary.components.LocationDescription
import com.tikay.prohub.feature.medicab.presentation.rideSummary.components.PaymentDescription
import com.tikay.prohub.core.design.theme.ProHubTheme
import com.tikay.prohub.core.design.theme.spacing
import com.tikay.prohub.core.design.util.DevicePreviews
import com.tikay.prohub.core.design.util.LargeScreenChildMaxWidth
import com.tikay.prohub.core.design.util.limitWidth
import com.tikay.prohub.core.design.util.rememberIsMobileDevice

@Composable
fun RideSummaryScreen(onButtonClick: () -> Unit = {}) {
    Column(
        modifier = Modifier
            .then(
                if (rememberIsMobileDevice()) {
                    Modifier.fillMaxWidth()
                } else {
                    Modifier.width(LargeScreenChildMaxWidth)
                }
            )
            .wrapContentSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(MaterialTheme.spacing.medium)
            ) {
                LocationDescription("Upcoming Ride","Dev Arc Commercial Complex", "Fri, 30 Sep 14:16 IST")
                UberDivider()
                PaymentDescription(tentativeEstimate = "₹404-486")
                UberButton(
                    modifier = Modifier
                        .padding(vertical = MaterialTheme.spacing.large)
                        .limitWidth(),
                    text = "Done",
                    onClick = onButtonClick
                )
            }
        }
    }
}

@DevicePreviews
@Composable
private fun RideSummaryScreenPreview() {
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
            RideSummaryScreen()
        }
    }
}