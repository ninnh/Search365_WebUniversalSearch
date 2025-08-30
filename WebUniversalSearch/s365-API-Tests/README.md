# S365 API Tests (JUnit 5 + REST Assured)

## Quick start
```bash
cd tests
export BASE_URL=http://localhost:59546   # or dev URL
# export API_KEY=xxxx          
mvn -q -DskipTests=false test
```

- Tests are **@Disabled** until endpoints are confirmed; flip them on after checking Swagger.
- JSON Schemas live in `src/main/resources/schemas`.
- CI workflow included at `.github/workflows/api-tests.yml`.
