package se.agreedskiing.comma.seperated.profiles.with.list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestProfile(Profiles.Prod.class)
class AppConfigProfileProdTest {

  private AppConfig config;

  public AppConfigProfileProdTest(AppConfig config) {
    this.config = config;
  }

  @Test
  void same_list() {
    assertEquals("AppConfig{foo=[bar{other=other}]}", config.toString());
  }
}
