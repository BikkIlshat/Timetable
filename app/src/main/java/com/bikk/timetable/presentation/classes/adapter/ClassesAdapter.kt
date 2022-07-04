package com.bikk.timetable.presentation.classes.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bikk.timetable.data.model.Classes
import com.bikk.timetable.databinding.ItemLessonBinding
import com.bikk.timetable.databinding.ItemLessonOverlessonBinding
import com.bikk.timetable.presentation.classes.adapter.viewholders.ClassesItemUsual
import com.bikk.timetable.presentation.classes.adapter.viewholders.OverClassesItem
import com.bikk.timetable.presentation.classes.adapter.viewholders.ViewHoldersTypes
import java.time.format.DateTimeFormatter

class ClassesAdapter(
    private val data: Classes,
    private val duration: Long,
    private val formatter: DateTimeFormatter
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    init {
        data.lessons = data.lessons.sortedBy { it.dateStart }
        Log.e("data", data.lessons.toString())
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ViewHoldersTypes.USUAL_LESSON_VIEW.ordinal -> {
                ClassesItemUsual(
                    ItemLessonBinding.inflate(LayoutInflater.from(parent.context), parent, false),
                    formatter,
                    duration
                )
            }
            ViewHoldersTypes.USUAL_LESSON_VIEW.ordinal -> {
                OverClassesItem(
                    ItemLessonOverlessonBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    ),
                    formatter,
                    duration
                )
            }
            else -> {
                OverClassesItem(
                    ItemLessonOverlessonBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    ),
                    formatter,
                    duration
                )
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ClassesItemUsual -> holder.bind(lesson = data.lessons[position])
            is OverClassesItem -> holder.bind(lesson = data.lessons[position])
        }
    }

    override fun getItemCount(): Int = data.lessons.size

    override fun getItemViewType(position: Int): Int {
        return when (data.lessons[position].overLesson) {
            false -> ViewHoldersTypes.USUAL_LESSON_VIEW.ordinal
            true -> ViewHoldersTypes.OVER_LESSON_VIEW.ordinal
            else -> ViewHoldersTypes.USUAL_LESSON_VIEW.ordinal
        }
    }
}