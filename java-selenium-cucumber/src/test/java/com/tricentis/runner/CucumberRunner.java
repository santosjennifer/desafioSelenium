package com.tricentis.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(  
		plugin = {"pretty"},	
		glue =  "com.tricentis.steps",
		features = "classpath:features"
		)				
public class CucumberRunner {

}
