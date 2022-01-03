package com.bochkarev.mikhail.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bochkarev.mikhail.noteapp.ui.theme.Blue
import com.bochkarev.mikhail.noteapp.ui.theme.Green
import com.bochkarev.mikhail.noteapp.ui.theme.Red
import com.bochkarev.mikhail.noteapp.ui.theme.Yellow

@Entity
data class Note(
	val title: String,
	val content: String,
	val timestamp: Long,
	val color: Int,
	@PrimaryKey val id: Int? = null
) {
	companion object {
		val noteColors = listOf(Red, Yellow, Blue, Green)
	}
}

class InvalidNoteException(message: String) : Exception(message)