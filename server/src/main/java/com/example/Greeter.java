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
   * Be kind, say hello.
   * @param someone who to greet
   * @return a greeting
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
