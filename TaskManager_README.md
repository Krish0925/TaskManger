# TaskManager - Kotlin and Android Assignment

## Part 1: Kotlin Task Manager

This is a simple Kotlin program that manages tasks for a TaskManager app prototype.

### Features:
- **Task class**: Defines a task with an `id`, `title`, and `isCompleted` status. Includes a `toggle()` method to mark a task as complete or incomplete.
- **Task List**: Uses a mutable list to store multiple tasks.
- **Functions and Features**:
  - Create tasks.
  - Add new tasks to the list.
  - Print all tasks with their status.
  - Print only incomplete tasks.
  - Toggle a task’s completion status.

### Code Structure:
- **`Task` class**: A simple `data class` with properties and a `toggle()` method.
- **`main()` function**: Demonstrates task creation, listing, filtering, and toggling.

### How to Run:
1. Open the Kotlin file (`TaskManager.kt`) in IntelliJ IDEA, or any online Kotlin compiler like [play.kotlinlang.org](https://play.kotlinlang.org).
2. Run the `main()` function.
3. You will see:
   - All task titles with their completion status.
   - A list of incomplete tasks.
   - The toggle effect on Task 1.



## Part 2: Android App (TaskManager Frontend)

- Android Studio project named **TaskManager** created.
- Layout includes:
  - **TextView**: Displays "Task Manager".
  - **EditText**: For entering task titles.
  - **Button**: Labeled "Add Task".
  - **ListView**: Placeholder for displaying tasks.
- Design follows **LinearLayout** for simplicity.

### How to Run:
1. Open the **TaskManager** project in Android Studio.
2. Run the app on an emulator or connected device.
3. The app will show a basic UI with header, input, button, and list.

### Screenshots:
- Include:
  - Android Studio project setup screenshot.
  - App layout screenshot from emulator/device.

---

## Notes:
- Clean and simple Kotlin code.
- Follows object-oriented programming principles.
- Easy to modify and extend for future features.