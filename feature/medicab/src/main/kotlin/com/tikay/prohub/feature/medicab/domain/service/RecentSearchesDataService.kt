package com.tikay.prohub.feature.medicab.domain.service

import com.tikay.prohub.feature.medicab.domain.RecentSearch

object RecentSearchesDataService {
  val recentSearchesList = arrayListOf(
      com.tikay.prohub.feature.medicab.domain.RecentSearch(
          location = "Hira Sweets",
          locationDesc = "E-60, Vikas Marg, Veer Savarkar Block, Block G, New Delhi"
      ),
      com.tikay.prohub.feature.medicab.domain.RecentSearch(
          location = "Shri Kshetr Shri Ram Mandir",
          locationDesc = "D-Block, Unnati Marg, Vivek Vihar Phase I, Vivek Vihar"
      ),
      com.tikay.prohub.feature.medicab.domain.RecentSearch(
          location = "Shoe Market",
          locationDesc = "Block D, Milap Nagar, Uttam Nagar, Delhi"
      ),
      com.tikay.prohub.feature.medicab.domain.RecentSearch(
          location = "LIMITLESS COOKHOUSE",
          locationDesc = "Ansal Plaza C Block, Khel Gaon Marg, Hudco Place"
      ),
      com.tikay.prohub.feature.medicab.domain.RecentSearch(
          location = "Kewal Park",
          locationDesc = "Azadpur, Delhi"
      ),
      com.tikay.prohub.feature.medicab.domain.RecentSearch(
          location = "Block C Road",
          locationDesc = "Block C Rd, Block H, Karampura West, Karam Pura"
      ),
      com.tikay.prohub.feature.medicab.domain.RecentSearch(
          location = "Janki Devi Memorial College",
          locationDesc = "Sir Ganga Ram Hospital Marg, Old Rajinder Nagar"
      ),
  )
}