package com.bikk.timetable.presentation.classes.adapter.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.bikk.timetable.data.model.Lesson
import com.bikk.timetable.databinding.ItemLessonOverlessonBinding
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class OverClassesItem(
    private val viewBinding: ItemLessonOverlessonBinding,
    private val formatter: DateTimeFormatter,
    private val duration: Long
) : RecyclerView.ViewHolder(viewBinding.root) {
    fun bind(lesson: Lesson) {
        val dateTime = LocalDateTime.parse(lesson.dateStart, formatter)
        viewBinding.titleOfLesson.text = lesson.title
        viewBinding.teacher.text =
            "${dateTime.toLocalTime()} - ${dateTime.toLocalTime().plusMinutes(duration)}"
        viewBinding.image.setImageResource(lesson.image)
        viewBinding.time.text = lesson.dateStart
    }
}