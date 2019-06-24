package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @params: meter parametro
   * @return: Meter return
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
