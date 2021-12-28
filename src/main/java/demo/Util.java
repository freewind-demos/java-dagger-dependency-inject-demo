package demo;


import javax.inject.Inject;


public class Util {
  @Inject
  public Util() {
  }

  public String toUpper(String s) {
    return s.toUpperCase();
  }
}
