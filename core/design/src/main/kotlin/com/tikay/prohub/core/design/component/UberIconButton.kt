package com.tikay.prohub.core.design.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.tikay.prohub.core.design.R
import com.tikay.prohub.core.design.theme.colorUberGrayBg
import com.tikay.prohub.core.design.util.UberIconSize.MediumIcon
import com.tikay.prohub.core.design.util.clickableWithRipple

/**
 * An Uber-styled icon button that helps its users initiate actions.
 * @param modifier the [Modifier] to be applied to this button
 * @param iconId paint resource id of icon
 * @param backgroundColor icon button background color
 * @param contentDescription icon content Description
 * @param onClick called when this button is clicked
 * */
@Composable
fun UberIconButton(
    modifier: Modifier = Modifier,
    @DrawableRes iconId: Int,
    backgroundColor: Color = colorUberGrayBg,
    contentDescription: String = "",
    onClick: () -> Unit
) {
    Box(modifier = modifier
        .background(backgroundColor)
        .clickableWithRipple {
            onClick()
        }) {
        Icon(
            painterResource(id = iconId),
            modifier = modifier
                .size(MediumIcon)
                .clip(RectangleShape),
            contentDescription = contentDescription
        )
    }

}

@Composable
@Preview
fun UberIconButtonPreview() {
    UberIconButton(iconId = R.drawable.schedule_button_icon) {}
}

