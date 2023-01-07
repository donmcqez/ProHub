package com.tikay.prohub.feature.medicab.presentation.whereTo.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.Icons.Sharp
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.sharp.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.tikay.prohub.feature.medicab.domain.service.RecentSearchesDataService

@Composable fun RecentSearchesList() {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(RecentSearchesDataService.recentSearchesList) { searchItem ->
            ListTile(
                icon = Sharp.LocationOn,
                contentDesc = "",
                title = searchItem.location,
                subtitle = searchItem.locationDesc
            ) {}
        }
    }
}

@Composable fun SetLocationOnMapTile() {
    ListTile(
        icon = Icons.Default.LocationOn,
        contentDesc = null,
        title = "Set location on map",
        subtitle = null
    ) {}
}
