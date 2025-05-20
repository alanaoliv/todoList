import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alanaoliv.todolist.domain.model.Todo
import com.alanaoliv.todolist.domain.model.todo1
import com.alanaoliv.todolist.domain.model.todo2
import com.alanaoliv.todolist.ui.theme.TODOListTheme

@Composable
fun ListContent(
    todos: List<Todo>
) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.consumeWindowInsets(innerPadding)
        ) {
            items(
                items = todos,
                key = { it.id }
            ) { todo ->
                Text(text = todo.title)
            }
        }
    }
}

@Preview
@Composable
private fun ListContentPreview() {
    TODOListTheme {
        ListContent(
            todos = listOf(
                todo1,
                todo2
            )
        )
    }
}
