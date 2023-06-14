package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
	features = "D:\\Selenium\\workspace\\CucumberBDD_DW\\src\\main\\java\\features"	
	,glue= {"stepDefinations"}
		)
public class TestRunner {

}
