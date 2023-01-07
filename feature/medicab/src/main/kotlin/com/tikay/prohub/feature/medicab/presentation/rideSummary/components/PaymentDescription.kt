package com.tikay.prohub.feature.medicab.presentation.rideSummary.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import com.tikay.prohub.core.design.theme.spacing

@Composable
fun PaymentDescription(tentativeEstimate: String) {
    Column {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = MaterialTheme.spacing.medium),
            text = tentativeEstimate,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Actual estimate to be provided before pick-up.",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.W400
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = MaterialTheme.spacing.medium),
            text = "See terms.",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Normal,
            textDecoration = TextDecoration.Underline
        )
    }
}
