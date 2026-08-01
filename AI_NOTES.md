# AI Usage Notes

## AI Tools Used

ChatGPT was used during development to:

- Generate the initial Spring Boot project structure.
- Create DTO classes.
- Generate Repository, Service, and Controller boilerplate.
- Suggest validation annotations.
- Help debug Maven and Java version issues.
- Provide REST API examples for Postman testing.

---

## Verification Performed

Every generated code snippet was manually reviewed before integration.

The following were verified manually:

- Project compiles successfully.
- All endpoints return expected responses.
- Repository correctly stores data in expenses.json.
- Validation works for required fields.
- Summary calculation is accurate.
- Category filtering works.
- Delete endpoint removes the correct expense.

---

## Modifications Made

Several AI-generated snippets were modified during implementation.

Examples include:

- Fixed constructor injection.
- Corrected package structure.
- Improved JSON storage logic.
- Adjusted repository methods.
- Fixed Service layer implementation.
- Corrected Controller mappings.

---

## AI Suggestions Not Used

Some AI suggestions were intentionally not implemented:

- Database integration using MySQL/PostgreSQL.
- JPA Repository implementation.
- Lombok annotations.
- Swagger/OpenAPI documentation.

The assignment required lightweight JSON file storage, so these suggestions were not applicable.