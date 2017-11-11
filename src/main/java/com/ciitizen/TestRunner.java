/**
 * Copyright 2017 Ciitizen, Inc.
 */

package com.ciitizen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class TestRunner.
 */
public class TestRunner {

  /** The logger. */
  private final Logger logger = LoggerFactory.getLogger(TestRunner.class);

  /**
   * Application entry point.
   *
   * @param args the command line arguments
   */
  public static void main(final String[] args) {
    try {
      if (args.length != 1) {
        throw new Exception("Unexpected number of arguments: " + args.length);
      }
      final TestRunner runner = new TestRunner();
      runner.run(args[0]);
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(-1);
    }
  }

  /**
   * Instantiates an empty {@link TestRunner}.
   *
   * @param param1 the param 1
   */
  protected TestRunner() {
    // n/a
  }

  /**
   * Run.
   *
   * @param param1 the param 1
   * @throws Exception the exception
   */
  public void run(String param1) throws Exception {
    logger.info("TEST LOGGING MESSAGE - " + param1);
  }
}
