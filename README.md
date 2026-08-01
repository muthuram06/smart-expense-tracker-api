# Smart Expense Tracker API

A RESTful Expense Tracking API built using Spring Boot.

## Features

- Add Expense
- Get All Expenses
- Filter by Category
- Delete Expense
- Expense Summary
- JSON File Storage

## Tech Stack

- Java 21
- Spring Boot
- Maven
- Jackson
- JSON File Storage

## Project Structure

```
src
 ├── controller
 ├── dto
 ├── model
 ├── repository
 ├── service
 ├── util
 └── resources
```

## Run the Project

Clone the repository

```bash
git clone https://github.com/muthuram06/smart-expense-tracker-api.git
```

Go inside the project

```bash
cd smart-expense-tracker-api
```

Run

```bash
./mvnw spring-boot:run
```

Application starts at

```
http://localhost:8080
```

---

## API Endpoints

### Add Expense

POST

```
/api/expenses
```

Example

```json
{
  "title":"Lunch",
  "amount":250,
  "category":"Food",
  "date":"2026-08-01"
}
```

---

### Get All Expenses

GET

```
/api/expenses
```

---

### Filter by Category

GET

```
/api/expenses?category=Food
```

---

### Summary

GET

```
/api/expenses/summary
```

---

### Delete Expense

DELETE

```
/api/expenses/{id}
```

---

## Storage

Expenses are stored inside

```
src/main/resources/expenses.json
```
