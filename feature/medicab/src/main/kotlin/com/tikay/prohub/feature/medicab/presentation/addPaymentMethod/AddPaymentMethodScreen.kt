package com.tikay.prohub.feature.medicab.presentation.addPaymentMethod

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tikay.prohub.feature.medicab.presentation.paymentOptions.PaymentOption
import com.tikay.prohub.feature.medicab.presentation.paymentOptions.components.PaymentOptionsCategory
import com.tikay.prohub.core.design.component.UberTopBar
import com.tikay.prohub.core.design.theme.ProHubTheme
import com.tikay.prohub.core.design.theme.spacing
import com.tikay.prohub.core.design.R as designResource

@Composable
fun AddPaymentMethodScreen(
    paymentOptions: List<PaymentOption> = listOf(
        PaymentOption(
            icon = designResource.drawable.ic_google_pay_logo,
            name = "Google Pay"
        ),
        PaymentOption(
            icon = designResource.drawable.ic_amazon_pay_logo,
            name = "Amazon Pay"
        ),
        PaymentOption(
            icon = designResource.drawable.ic_upi_logo,
            name = "UPI"
        ),
        PaymentOption(
            icon = designResource.drawable.ic_generic_card,
            name = "Credit or Debit Card"
        ),
        PaymentOption(
            icon = designResource.drawable.ic_uber_gift_card,
            name = "Gift Card"
        )
    ),
    onNavigationIconClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.systemBarsPadding())
        UberTopBar(
            title = "Add Payment",
            icon = Icons.Default.ArrowBack,
            iconOnClick = onNavigationIconClick
        )
        PaymentOptionsCategory(
            modifier = Modifier.padding(top = MaterialTheme.spacing.medium),
            paymentOptions = paymentOptions,
            desktopHorizontalItemSpacing = MaterialTheme.spacing.small,
            desktopVerticalItemSpacing = MaterialTheme.spacing.small
        )
    }
}

@Preview(showSystemUi = true, device = "spec:width=411dp,height=891dp")
@Preview(showSystemUi = true, device = "spec:width=673.5dp,height=841dp,dpi=480")
@Preview(showSystemUi = true, device = "spec:width=1280dp,height=800dp,dpi=480")
@Preview(showSystemUi = true, device = "spec:width=1920dp,height=1080dp,dpi=480")
@Composable
private fun AddPaymentMethodScreenPreview() {
    ProHubTheme {
        AddPaymentMethodScreen() {}
    }
}
