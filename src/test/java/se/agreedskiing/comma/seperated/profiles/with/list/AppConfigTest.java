package se.agreedskiing.comma.seperated.profiles.with.list;

import static org.junit.jupiter.api.Assertions.*;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
class AppConfigTest {

  private AppConfig config;

  public AppConfigTest(AppConfig config) {
    this.config = config;
  }

  @Test
  void same_list() {
    assertEquals(
      "AppConfig{foo=[bar{other=other}, bar{other=MANGO}]}",
      config.toString()
    );
  }
}
