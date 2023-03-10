package com.tikay.prohub.core.design.component.bottomsheet

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.BottomSheetScaffoldDefaults
import androidx.compose.material.BottomSheetScaffoldState
import androidx.compose.material.BottomSheetValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.rememberBottomSheetScaffoldState
import androidx.compose.material.rememberBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import com.tikay.prohub.core.design.theme.colorWhite

/**
 * Common bottom sheet Scaffold composable for the app to integrated bottom sheet with required body and bottomsheet content
 * @param modifier Used to modify the overall look and behavior of the BottomSheetScaffold
 * @param scaffoldState Defines the bottom sheet scaffold State to manage state like we need to make sheet collapsed, expanded etc
 * @param sheetShape Bottom sheet shape
 * @param sheetBackgroundColor Background color of bottom sheet content
 * @param sheetPeekHeight The height of the bottom sheet when it is collapsed. If the peek height
 * equals the sheet's full height, the sheet will only have a collapsed state.
 * @param bottomSheetBodyContentHeightFraction bottom sheet body's content height, by default it cover available height
 * @param sheetContent Composable with box scope that we want to display in bottom sheet content
 * @param bodyContent Composable with box scope that we want to display in bottom sheet body content
 * */
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun UberBottomSheetScaffold(
    modifier: Modifier = Modifier,
    scaffoldState: BottomSheetScaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed)
    ),
    sheetShape: Shape = RectangleShape,
    sheetBackgroundColor: Color = colorWhite,
    sheetPeekHeight: Dp = BottomSheetScaffoldDefaults.SheetPeekHeight,
    bottomSheetBodyContentHeightFraction: Float = 1f,
    sheetContent: @Composable BoxScope.() -> Unit,
    bodyContent: @Composable BoxScope.() -> Unit,
) {
    BottomSheetScaffold(
        modifier = modifier,
        scaffoldState = scaffoldState,
        sheetShape = sheetShape,
        sheetBackgroundColor = sheetBackgroundColor,
        sheetContent = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                sheetContent()
            }
        },
        sheetPeekHeight = sheetPeekHeight,
        backgroundColor = Color.Transparent
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            bodyContent()
        }
    }

}