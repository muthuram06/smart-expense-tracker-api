# Smart Expense Tracker API

A RESTful Expense Tracking API built using **Spring Boot** that allows users to manage expenses using lightweight JSON file storage instead of a database.

---

## Features

- Add a new expense
- Retrieve all expenses
- Filter expenses by category
- Delete an expense
- View total expense summary
- JSON file-based persistent storage
- Input validation using Jakarta Validation

---

## Tech Stack

- Java 21
- Spring Boot
- Maven
- Jackson
- Jakarta Validation
- JSON File Storage

---

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.diligent.smart_expense_tracker_api
│   │       ├── controller
│   │       ├── dto
│   │       ├── model
│   │       ├── repository
│   │       ├── service
│   │       └── util
│   └── resources
│       ├── application.properties
│       └── expenses.json
```

---

## Getting Started

### Prerequisites

- Java 21 or later
- Maven 3.9+

### Clone the Repository

```bash
git clone https://github.com/muthuram06/smart-expense-tracker-api.git
```

### Navigate to the Project

```bash
cd smart-expense-tracker-api
```

### Build the Project

```bash
./mvnw clean install
```

### Run the Application

```bash
./mvnw spring-boot:run
```

The application starts at:

```
http://localhost:8080
```

---

# API Endpoints

## 1. Add Expense

**POST**

```
/api/expenses
```

### Request Body

```json
{
  "title": "Lunch",
  "amount": 250,
  "category": "Food",
  "date": "2026-08-01"
}
```

---

## 2. Get All Expenses

**GET**

```
/api/expenses
```

---

## 3. Get Expenses by Category

**GET**

```
/api/expenses?category=Food
```

---

## 4. Get Expense Summary

**GET**

```
/api/expenses/summary
```

### Sample Response

```json
{
  "totalExpense": 250.0,
  "categoryTotals": {
    "Food": 250.0
  }
}
```

---

## 5. Delete Expense

**DELETE**

```
/api/expenses/{id}
```

Example:

```
DELETE /api/expenses/1
```

---

## Data Storage

Expense data is stored locally in:

```
src/main/resources/expenses.json
```

No external database is required.

---

## Testing

The API was tested using **Postman**.

Verified endpoints:

- POST /api/expenses
- GET /api/expenses
- GET /api/expenses?category=Food
- GET /api/expenses/summary
- DELETE /api/expenses/{id}

---

## Author

**Muthu Ram V**

GitHub: https://github.com/muthuram06
