# Todo IT

---

---

# Todo IT – Part 1
*2025-03-26 - 2025-04-04   
Finished: 2025-04-02*

## Topics:
- Object Oriented Programming
- Encapsulation
- Unit testing
- UML diagram

## Overview:
This is the first part of three where you are going to build a Todo application.
This first part consists of building the first models (classes), where we put focus on **encapsulation** and **abstraction**. We will continue with this project in the following week so **when you are done** with this first step **do not add anything further**.

## Requirements:
- Need to be a Maven project.
- **Person.class**, **TodoItem.class** and **TodoItemTask.class** fully implemented according to specific requirements.
- **Person.class**, **TodoItem.class** and **TodoItemTask.class** tested with **Junit4** or **Junit5**.

Good luck!

---

## Person.class
Fields:
- **id** (private) is an int representing each Person object.
- **firstName** (private) represents each person’s first name. **Not allowed to be null**
- **lastName** (private) represents each person’s last name. **Not allowed to be null**
- **email** (private) represents each person’s email. **Not allowed to be null**

Constructor:
- Up to you

Methods:
- Common getters and setters.
- getSummary() should return a **description of the object**. Like {id: 4, name: Nisse Olsson, email: nisse@gmail.com}

| Person                                                                                                                                                                                                                                                       |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| id : int <br /> firstName : String <br /> lastName : String <br /> email : String                                                                                                                                                                            |
| getId() : int <br /> getFirstName() : String <br /> setFirstName(firstName) : void <br /> getLastName() : String <br /> setLastName(lastName) : void <br /> getEmail() : String <br /> setEmail(email) : void <br /> getSummary() : String |

---

## TodoItem.class

Fields:
- **id** (private) is an int representing each TodoItem object.
- **title** representing a title like ‘Change tires.’ Not allowed to be null or empty
- **description** is used to hold further information
- **deadLine** TodoItem is overdue if current date > deadline. Not allowed to be null
- **done** represent if task is finished
- **creator** represent who created this task.

Constructor:
- Up to you

Methods:
- Common getters and setters
- **getSummary()** (see Person)
- **isOverdue()** should return **true** if current date has passed deadLine.

| TodoItem |
|----------|
| id : int <br /> title : String <br /> taskDescription : String <br /> deadLine : LocalDate <br /> done : boolean <br /> creator : Person |
| getId() : int <br /> getTitle() : String <br /> setTitle(title) : void <br /> getTaskDescription() : String <br /> setTaskDescription(description) : void <br /> getDeadLine() : LocalDate <br /> setDeadLine(deadLine) : void <br /> isDone() : boolean <br /> setDone(done) : void <br /> getCreator() : Person <br /> setCreator(person) : void <br /> isOverdue() : boolean <br /> getSummary() : String |

---

## TodoItemTask.class

Fields:
- **id** (private) is an int representing each TodoItem object.
- **title** representing a title like ‘Change tires.’ Not allowed to be null or empty
- **description** is used to hold further information
- **deadLine** TodoItem is overdue if current date > deadline. Not allowed to be null
- **done** represent if task is finished
- **creator** represent who created this task.

Constructor:
- Up to you

Methods:
- Common getters and setters
- **getSummary()** (see Person)
- **isOverdue()** should return true if current date has passed deadLine.

| TodoItemTask                                                                                                                                                                                                                                                                                                                                                                                                 |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| id : int <br /> title : String <br /> taskDescription : String <br /> deadLine : LocaleDate <br /> done : boolean <br /> creator : Person                                                                                                                                                                                                                                                                    |                                                                            |
| getId() : int <br /> getTitle() : String <br /> setTitle(title) : void <br /> getTaskDescription() : String <br /> setTaskDescription(description) : void <br /> getDeadLine() : LocalDate <br /> setDeadLine(deadLine) : void <br /> setDone(done) : void <br /> isDone() : boolean <br /> getCreator() : Person <br /> setCreator(Person) : void <br /> isOverdue() : boolean <br /> getSummary() : String |

Tip: Make sure boolean assigned is **encapsulated**.

---

---

---

# part 2
*2025-03-01 - 2025-04-11  
Finished: 2025-04-09*

## Topics:
- Object Oriented Programming
- Encapsulation
- Polymorphism
- Enum

## Overview:  
This is the second part of three where you are going to continue working on you Todo application. The second part consists of building a new model (class) called AppUser and an enum called AppRole.
All your Class models should also override equals, hashCode and toString from java.lang.Object.

## Requirements:
- AppUser.class and AppRole enum fully implemented according to requirements.
- Person.class, TodoItem.class, TodoItemTask.class has all needed changes according to
specific requirements.  

## Optional:  
- Make sure new features are tested with Junit4 or Junit5.

Good luck!

---

## AppUser.class and AppRole

### AppUser:

#### Fields:
- **username** (private) is a String that acts
as the **id** of AppUser. Not allowed to be
null. **Not allowed to be null or empty.**
- **password** (private) is a String that
contains a password. Not allowed to be
null or empty.
- **role** (private) contains an **enumerated**
type marking the **AppUser** object as
being a **ROLE_APP_USER** or
- **ROLE_APP_ADMIN**. **Not allowed to be
null.**

#### Constructor:
- Up to you

#### Methods:
- Common getters and setters.
- **toString()** method overridden from
Object. Don’t include password.
- **hashCode()** method overridden from
Object. Don’t include password.
- **equals()** method overridden from
Object. Don’t include password

#### AppRole:  
Have two possible values
- **ROLE_APP_USER**
- **ROLE_APP_ADMIN**

| AppUser |
|---------|
|username : String <br/>password : String <br/>role : AppRole|
|getUsername() : String <br/> setUsername(username) : void <br/> getPassword() : String <br/> setPassword(password) : void <br/> getRole() : AppRole <br/> setRole(role) : void <br/> boolean equals(obj) : boolean <br/> hashCode(obj) : int <br/> toString() : String|

| \<\<enumeration\>\><br/>AppRole  |
|----------------------------------|
| ROLE_APP_USER<br/>ROLE_APP_ADMIN |

## Person.class

- Add a reference to **AppUser** called **credentials**. also create getter and setter for that field.
- Replace **getSummary()** with **toString()** method that **don’t** print out **credentials**.
- Override **equals** and **hashcode** from Object. **Exclude credentials** from both.

## TodoItem.class and TodoItemTask.class

Remove **getSummary()** methods  
Override:
- **toString()** all fields **except Person object(s)**
- **equals()** & **hashCode()** all fields **except Person objects**

---

---

---

# Part 3
*2025-04-08 - 2025-04-18   
Finished: 2025-04-XX*

## Topics:

- **Collections**
- **Interfaces**
- **DAO pattern**
- **Sequencers**
- Stream API - optional
- Singleton pattern – optional
- Generics – optional
- Serialization to JSON - optional

## Overview:

In this project you need to implement **central storage** of your model objects. (**AppUser**, **Person**,
**TodoItem** and **TodoItemTask**) You are going to do this by applying the **DAO pattern** with help of
**Collections**. You are also going to make **sequencers** in order to be able to pass unique id’s to each
new object.

## Requirements:
- Sequencers created according to specific requirements
- Interfaces **AppUserDAO.class**, **PersonDAO.class**, **TodoItemDAO.class** and
**TodoItemTaskDAO.class** implemented according to each specific requirement

## If you have time:
- Unit testing

## Optional:
- Use singleton pattern for DAO implementing classes and sequencers
- Use Generics to simplify DAO interfaces
- Use the Stream API in implementing DAO classes
- Read / Write all objects from / to JSON file(s) when starting / ending application.
- Read / Write all sequencervalues from / to a properties file when starting / ending application.

Good Luck!

---

## Sequencers:
Your sequencers know which id is the next available id for each new object you create. Here we are
making the sequencers static. If you don’t want your sequencers to be static it would be best to
follow the [singleton pattern](https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples). (Opens up many possibilities like using inheritance and polymorphism)  
**Put your sequencers in a new package.**
Create the following three classes. All fields and methods are static.

| PersonIdSequencer                                                | TodoItemIdSequencer                                                  | TodoItemTaskIdSequencer      |
|------------------------------------------------------------------|----------------------------------------------------------------------|------------------------------|
| currentId : int                                                  | currentId : int                                                      | currentId : int              |
| nextId() : int<br/>getCurrentId() : int<br/>setCurrentId(int) : void | nextId() : int<br/>getCurrentId() : int<br/>setCurrentId(int) : void | nextId() : int<br/>getCurrentId() : int<br/>setCurrentId(int) : void |


- **currentId**: is an integer that acts as a counter.
- **nextId()** : increment currentId and then return currentId.
- **getCurrentId()** : returns currentId.
- **setCurrentId()** : sets currentId.

---

## Data Access Objects (DAOs):

### AppUserDAO implementation:

**State**: Any collection of type AppUser  

**Constructor(s)**: Up to you  

**Methods**:
- **persist**: add new **AppUser.class** object to collection
- **findByUsername**: returns single **AppUser.class** object
- **findAll**: returns all **AppUser.class** objects
- **remove**: remove one **AppUser.class** object
from collection

| \<\<interface\>\> <br />AppUserDAO                                                                                                        | 
|-------------------------------------------------------------------------------------------------------------------------------------------|
| persist(appUser) : AppUser <br/> findByUsername(username) : AppUser <br/> findAll() : Collection\<AppUser\> <br/> remove(username) : void |
↑   
AppUserDAOCollection implements AppUserDao   
↑  
`AppUserDAOCollection`

---

### PersonDAO implementation:

**State**: Any collection of type Person

**Constructor(s)**: Up to you

**Methods**:
- **persist**: add new **Person.class** object to collection
- **findById**: returns single **Person.class** object
- **findByEmail**: returns single **Person.class** object
- **findAll**: returns all **Person.class** objects
- **remove**: remove one **Person.class** object from collection

| \<\<interface\>\> <br />PersonDAO                                                                                                                     |
|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| persist(person) : Person <br/> findById(id) : Person <br/> findByEmail(email) : Person <br/> findAll() : Collection\<Person\> <br/> remove(id) : void |
↑   
PersonDAOCollection implements PersonDao   
↑  
`PersonDAOCollection`

---

### TodoItemDAO implementation:

**State**: Any collection of type TodoItem

**Constructor(s)**: Up to you

**Methods**:
- **persist**: add new **TodoItem.class** object to collection
- **findById**: returns single **TodoItem.class** object
- **findAll**: returns all **TodoItem.class** objects
- **findAllByDoneStatus**: returns many **TodoItem.class** objects where status match
- **findByTitleContains**: returns many **TodoItem.class** objects where title match.
- **findByPersonId**: returns many **TodoItem.class** objects where personId match todoItem.creator.id
- **findByDeadlineBefore**: returns many **TodoItem.class** objects where date is before deadline
- **findByDeadlineAfter**: returns many **TodoItem.class** objects where date is after deadline
- **remove**: remove one **TodoItem.class** object from collection

| \<\<interface\>\> <br />TodoItemDAO                                                                                                                                                                                                                                                                                                                                                                                          |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| persist(todoItem) : TodoItem <br/> findById(id) : TodoItem <br/> findAll() : Collection\<TodoItem\> <br/> findAllByDoneStatus(done) : Collection\<TodoItem\> <br/> findAllByTitleContains(title) : Collection\<TodoItem\> <br/> findByPersonId(personId) : Collection\<TodoItem\> <br/> findByDeadlineBefore(date) : Collection\<TodoItem\> <br/> findByDeadlineAfter(date) : Collection\<TodoItem\> <br/> remove(id) : void |
↑   

`TodoItemDAOCollection`

---

### TodoItemTaskDAO implementation:

**State**: Any collection of type TodoItemTask

**Constructor(s)**: Up to you

**Methods**:
- **persist**: add new **TodoItemTask.class** object to collection
- **findById**: returns single **TodoItemTask.class** object
- **findAll**: return all **TodoItemTask.class** objects
- **findByAssignedStatus**: return all **TodoItemTask.class** objects where assigned matches status
- **findByPersonId**: return all
**TodoItemTask.class** objects where todoItemTask.assignee.id matches personId
- **remove**: removes one **TodoItemTask.class** object from collection

| \<\<interface\>\> <br />TodoItemTaskDAO                                                                                                                                                                                                                                                                                                                                                                                |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| persist(todoItemTask) : TodoItemTask <br/> findById(id) : TodoItemTask <br/> findAll() : Collection\<TodoItemTask\> <br/> findByAssignedStatus(status) : Collection\<TodoItem\> <br/> findByPersonId(personId) : Collection\<TodoItem\> <br/> remove(id) : Collection<TodoItem> |
↑

`TodoItemTaskDAOCollection`
