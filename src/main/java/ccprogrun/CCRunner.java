package ccprogrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src/main/java/cucumberpro/cucumberfile.feature",glue="createleadcuck", monochrome =true)
public class CCRunner {
}
