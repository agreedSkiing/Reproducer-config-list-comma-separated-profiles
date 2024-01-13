package se.agreedskiing.comma.seperated.profiles.with.list;

import static org.junit.jupiter.api.Assertions.*;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;
import org.junit.jupiter.api.Test;

@QuarkusTest
@TestProfile(Profiles.BlackBox.class)
class AppConfigProfileBlackBoxTest {

  private AppConfig config;

  public AppConfigProfileBlackBoxTest(AppConfig config) {
    this.config = config;
  }

  @Test
  void same_list() {
    assertEquals(
      "AppConfig{foo=[bar{other=other}, bar{other=BOX}]}",
      config.toString()
    );
  }
}
