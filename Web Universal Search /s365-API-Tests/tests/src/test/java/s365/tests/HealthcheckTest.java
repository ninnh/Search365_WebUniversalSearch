package s365.tests;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class HealthcheckTest extends TestBase {

  @Test
  @DisplayName("API is up (GET /health or /ping)")
  @Disabled("Enable when endpoint is confirmed")
  void healthIsUp() {
    given()
      .accept(ContentType.JSON)
    .when()
      .get("/health")
    .then()
      .statusCode(anyOf(is(200), is(204)));
  }
}
