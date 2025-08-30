package s365.tests;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class SearchSmokeTest extends TestBase {

  @Test
  @DisplayName("Search basic query returns results")
  @Disabled("Enable when /api/search is confirmed + test data seeded")
  void searchBasic() {
    given()
      .contentType(ContentType.JSON)
      .accept(ContentType.JSON)
      .queryParam("q", "test")
      .header("x-api-key", API_KEY)
    .when()
      .get("/api/search")
    .then()
      .statusCode(200)
      .body("results", notNullValue());
  }
}
