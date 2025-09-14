# Student Management System

A simple Java console application to manage student records. This system allows users to add, view, update, and delete student information using an interactive menu.

## Features

- **Add Student**: Input and save a student's ID, name, age, and grade.
- **View Students**: Display a list of all students currently stored in the system.
- **Update Student**: Modify the details of an existing student by ID.
- **Delete Student**: Remove a student from the system using their ID.
- **Exit**: Quit the application safely.

## Getting Started

### Prerequisites

- Java 8 or higher installed on your machine.

### Running the Application

1. Clone this repository or download the `StudentManagementSystem.java` file.
2. Open a terminal or command prompt.
3. Navigate to the directory containing `StudentManagementSystem.java`.
4. Compile the program:
    ```bash
    javac StudentManagementSystem.java
    ```
5. Run the compiled program:
    ```bash
    java StudentManagementSystem
    ```

## How to Use

On running the program, you will see a menu:

```
===== Student=====
1. Add Student
2. View Student
3. Update Student
4. Delete Student
5. Exit
Enter choice
```

- Enter the number corresponding to your action.
- Follow the prompts to input student details or select an operation.
- The program will confirm actions or notify if an operation couldn't be completed (e.g., student not found).

## Code Overview

- **Student class**: Represents a student with ID, name, age, and grade. Includes getters, setters, and a `toString` method for display.
- **StudentManagementSystem class**: Handles the list of students and all menu operations.

## Example

```
===== Student=====
1. Add Student
2. View Student
3. Update Student
4. Delete Student
5. Exit
Enter choice
1
Enter Student ID:
101
Enter Name:
Alice
Enter Age:
20
Enter Grade:
A
Student Added Successfully
```

## License

This project is open source and available under the [MIT License](LICENSE).

## Author

- [keerthanavelayutham](https://github.com/keerthanavelayutham)
