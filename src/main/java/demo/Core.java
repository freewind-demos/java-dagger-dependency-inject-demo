package demo;

import javax.inject.Inject;

public class Core {
  @Inject
  Util util;

  public void hello(String name) {
    System.out.println("Hello, " + this.util.toUpper(name) + "!");
  }
}
