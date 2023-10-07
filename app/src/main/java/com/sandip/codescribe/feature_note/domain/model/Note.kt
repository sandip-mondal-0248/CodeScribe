package com.sandip.codescribe.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sandip.codescribe.ui.theme.BabyBlue
import com.sandip.codescribe.ui.theme.LightGreen
import com.sandip.codescribe.ui.theme.RedOrange
import com.sandip.codescribe.ui.theme.RedPink
import com.sandip.codescribe.ui.theme.Violet

@Entity
data class Note(
    val title : String,
    val content : String,
    val timestamp : Long,
    val color : Int,
    @PrimaryKey val id : Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
