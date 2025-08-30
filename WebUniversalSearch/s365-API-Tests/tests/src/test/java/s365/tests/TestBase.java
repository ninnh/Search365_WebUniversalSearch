package s365.tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
  protected static String BASE_URL;
  protected static String API_KEY;

  @BeforeAll
  static void setup() {
    BASE_URL = System.getProperty("BASE_URL", System.getenv().getOrDefault("BASE_URL", "http://localhost:59546"));
    API_KEY  = System.getProperty("API_KEY",  System.getenv().getOrDefault("API_KEY", ""));
    RestAssured.baseURI = BASE_URL;
  }
}
