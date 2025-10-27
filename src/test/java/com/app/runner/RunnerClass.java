package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Madhan\\eclipse-workspace\\selenium\\Bob_Cat\\src\\test\\java\\com\\app\\featurefile",
glue= "com.app.stepdefenition",
publish= true)
public class RunnerClass {

}
