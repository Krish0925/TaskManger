// TaskManager.kt

// Define the Task class with a simple toggle method
data class Task(val id: Int, val title: String, var isCompleted: Boolean = false) {
    fun toggle() { isCompleted = !isCompleted }
}

// Main function demonstrating the task manager
fun main() {
    val tasks = mutableListOf(
        Task(1, "Buy groceries"),
        Task(2, "Study Kotlin", true),
        Task(3, "Clean room")
    )

    // Add a new task
    tasks.add(Task(4, "Exercise"))

    // Print all task titles
    println("All Tasks:")
    tasks.forEach { println("${it.id}. ${it.title} - ${if (it.isCompleted) "Done" else "Pending"}") }

    // Print incomplete tasks
    println("\nIncomplete Tasks:")
    tasks.filter { !it.isCompleted }.forEach { println("${it.id}. ${it.title}") }

    // Toggle a task's completion status
    println("\nToggling Task 1...")
    tasks.find { it.id == 1 }?.toggle()
    println("Task 1 is now ${if (tasks[0].isCompleted) "Done" else "Pending"}")
}
