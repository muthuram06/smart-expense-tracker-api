# AI Usage Notes

## AI Assistance

AI tools (ChatGPT) were used as a development assistant for selected tasks during implementation, including:

- Clarifying Spring Boot concepts and project structure.
- Assisting with DTO and service layer implementation.
- Suggesting improvements for repository and controller methods.
- Helping troubleshoot Maven build issues and Java version configuration.
- Providing example API requests for Postman testing.
- Reviewing code and suggesting refactoring where appropriate.

---

## Verification and Implementation

All code was reviewed, integrated, and tested manually.

The following were completed and verified during development:

- Implemented the application architecture.
- Fixed compilation and dependency issues.
- Verified all REST API endpoints using Postman.
- Confirmed JSON data is stored and retrieved correctly.
- Verified expense summary calculations.
- Tested category filtering functionality.
- Verified delete functionality.
- Successfully built the project using Maven (`mvn clean install`).

---

## Manual Changes

During development, several AI suggestions were modified or adapted to fit the project requirements, including:

- Adjusted repository implementation for JSON file storage.
- Refined service layer business logic.
- Corrected controller request mappings.
- Fixed constructor injection and project structure.
- Improved error handling and validation.
- Adapted generated examples to match the assignment requirements.

---

## AI Suggestions Not Used

The following suggestions were intentionally not implemented because they were outside the scope of the assignment:

- Database integration (MySQL/PostgreSQL)
- Spring Data JPA Repository
- Lombok annotations
- Swagger/OpenAPI documentation

The assignment specifically required a lightweight JSON file-based storage approach, so these features were not included.
