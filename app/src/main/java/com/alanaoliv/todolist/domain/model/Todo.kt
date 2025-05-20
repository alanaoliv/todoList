package com.alanaoliv.todolist.domain.model
import java.util.Date

data class Todo(
    val id: Long,
    val title: String,
    val description: String?,
    val isCompleted: Boolean = false,
    val createdAt: Date = Date(),
    val updatedAt: Date = Date()
)

// Testes

val todo1 = Todo(
    id = 1,
    title = "To-do 1",
    description = "Descrição do to-do 1",
    isCompleted = false
)

val todo2 = Todo(
    id = 2,
    title = "To-do 2",
    description = "Descrição do to-do 2",
    isCompleted = false
)
