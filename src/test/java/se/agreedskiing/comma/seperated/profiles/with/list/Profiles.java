package se.agreedskiing.comma.seperated.profiles.with.list;

import io.quarkus.test.junit.QuarkusTestProfile;
import java.util.Map;

public class Profiles {

  public static class BlackBox implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
      return "black-box";
    }
  }

  public static class Dev implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
      return "dev";
    }
  }

  public static class Prod implements QuarkusTestProfile {

    @Override
    public String getConfigProfile() {
      return "prod";
    }
  }
}
