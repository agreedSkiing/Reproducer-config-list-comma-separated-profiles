package se.agreedskiing.comma.seperated.profiles.with.list;

import io.quarkus.logging.Log;
import io.quarkus.runtime.Startup;
import io.smallrye.config.ConfigMapping;
import java.util.List;

@ConfigMapping(prefix = "app")
public interface AppConfig {
  List<bar> foo();

  String toString();

  interface bar {
    String other();

    String toString();
  }
}

@Startup
class LogAppConfig {

  private AppConfig config;

  public LogAppConfig(AppConfig config) {
    this.config = config;
    Log.info(config);
  }
}
