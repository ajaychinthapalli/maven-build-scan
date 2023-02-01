package edu.ajay;

import static com.google.common.base.Joiner.*;

public class Application {

  public static String join(String... args) {
    return on(' ').join(args);
  }

}
