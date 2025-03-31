# Todo IT

# Todo IT – Part 1
2025-03-26 - 2025-04-04

## Topics:
- Object Oriented Programming
- Encapsulation
- Unit testing
- UML diagram

## Overview:
This is the first part of three where you are going to build a Todo application.
This first part consists of building the first models (classes), where we put focus on encapsulation and abstraction. We will continue with this project in the following week so when you are done with this first step do not add anything further.

## Requirements:
- Need to be a Maven project.
- `Person.class`, `TodoItem.class` and `TodoItemTask.class` fully implemented according to specific requirements.
- `Person.class`, `TodoItem.class` and `TodoItemTask.class` tested with Junit4 or Junit5.

Good luck!

---

## Person.class
Fields:
- id (private) is an int representing each Person object.
- firstName (private) represents each person’s first name. Not allowed to be null
- lastName (private) represents each person’s last name. Not allowed to be null
- email (private) represents each person’s email. Not allowed to be null

Constructor:
- Up to you

Methods:
- Common getters and setters.
- getSummary() should return a description of the object. Like {id: 4, name: Nisse Olsson, email: nisse@gmail.com}

| Person                                                                                                                                                                                                                                                       |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| id : int <br /> firstName : String <br /> lastName : String <br /> email : String                                                                                                                                                                            |
| getId() : int <br /> getFirstName() : String <br /> setFirstName(firstName) : void <br /> getLastName() : String <br /> setLastName(lastName) : void <br /> getEmail() : String <br /> setEmail(email) : void <br /> getSummary() : String |

---

## TodoItem.class

Fields:
- id (private) is an int representing each TodoItem object.
- title representing a title like
‘Change tires.’ Not allowed to be null or empty
- description is used to hold further information
- deadLine TodoItem is overdue if
current date > deadline. Not allowed to be null
- done represent if task is finished
- creator represent who created this task.

Constructor:
- Up to you

Methods:
- Common getters and setters
- getSummary() (see Person)
- isOverdue() should return true if current date has passed deadLine.

| TodoItem |
|----------|
| id : int <br /> title : String <br /> taskDescription : String <br /> deadLine : LocalDate <br /> done : boolean <br /> creator : Person |
| getId() : int <br /> getTitle() : String <br /> setTitle(title) : void <br /> getTaskDescription() : String <br /> setTaskDescription(description) : void <br /> getDeadLine() : LocalDate <br /> setDeadLine(deadLine) : void <br /> isDone() : boolean <br /> setDone(done) : void <br /> getCreator() : Person <br /> setCreator(person) : void <br /> isOverdue() : boolean <br /> getSummary() : String |

---

## TodoItemTask.class

Fields:
- id (private) is an int representing each TodoItem object.
- title representing a title like ‘Change tires.’ Not allowed to be null or empty
- description is used to hold further information
- deadLine TodoItem is overdue if current date > deadline. Not allowed to be null
- done represent if task is finished
- creator represent who created this task.

Constructor:
- Up to you

Methods:
- Common getters and setters
- getSummary() (see Person)
- isOverdue() should return true if current date has passed deadLine.

| TodoItemTask                                                                                                                                                                                                                                                                                                                                                                                                 |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| id : int <br /> title : String <br /> taskDescription : String <br /> deadLine : LocaleDate <br /> done : boolean <br /> creator : Person                                                                                                                                                                                                                                                                    |                                                                            |
| getId() : int <br /> getTitle() : String <br /> setTitle(title) : void <br /> getTaskDescription() : String <br /> setTaskDescription(description) : void <br /> getDeadLine() : LocalDate <br /> setDeadLine(deadLine) : void <br /> setDone(done) : void <br /> isDone() : boolean <br /> getCreator() : Person <br /> setCreator(Person) : void <br /> isOverdue() : boolean <br /> getSummary() : String |

Tip: Make sure boolean `assigned` is encapsulated.
