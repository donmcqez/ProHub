package com.tikay.prohub.core.design.util

import androidx.compose.ui.tooling.preview.Preview

/**
 * Multipreview annotation that represents various device sizes. Add this annotation to a composable
 * to render various devices.
 */
@Preview(showSystemUi = true, device = "spec:width=411dp,height=891dp", name = "Phone")
@Preview(showSystemUi = true, device = "spec:width=673.5dp,height=841dp,dpi=480", name = "Foldable")
@Preview(showSystemUi = true, device = "spec:width=1280dp,height=800dp,dpi=480", name = "Tablet")
@Preview(showSystemUi = true, device = "spec:width=1920dp,height=1080dp,dpi=480", name = "Desktop")
annotation class DevicePreviews
