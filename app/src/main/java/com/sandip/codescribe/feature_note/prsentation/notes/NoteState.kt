package com.sandip.codescribe.feature_note.prsentation.notes

import com.sandip.codescribe.feature_note.domain.model.Note
import com.sandip.codescribe.feature_note.domain.util.NoteOrder
import com.sandip.codescribe.feature_note.domain.util.OrderType

data class NoteState(
    val notes : List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
