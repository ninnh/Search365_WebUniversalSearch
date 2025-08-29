package s365.tests;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class ProfilesConfigTest extends TestBase {

  @Test
  @Disabled("Enable when /api/profiles endpoints are confirmed")
  void availableProfilesList() {
    given()
      .accept(ContentType.JSON)
    .when()
      .get("/api/profiles")
    .then()
      .statusCode(200)
      .body("profiles", is(not(empty())));
  }
}
