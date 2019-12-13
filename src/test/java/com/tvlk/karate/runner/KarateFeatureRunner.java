package com.tvlk.karate.runner;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import cucumber.api.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Running all feature files in the folder and sub folders
 */
@Slf4j
@CucumberOptions(features = "classpath:features", glue = {"stepDefinitions"}, plugin = {"pretty"}, monochrome = true)
public class KarateFeatureRunner {

  @Test
  public void testPtsParallel() {
    Results results = Runner.parallel(getClass(), 5, "build/surefire-reports");
    Assert.assertEquals(results.getErrorMessages(), 0, results.getFailCount());
  }
}
