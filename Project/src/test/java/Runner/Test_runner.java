package Runner;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( features = {"src//test//resources//Features//Common.feature"},
	glue={"stepDefinition"},
	dryRun=false,//To check weather you have missed an steps in the scenario
	monochrome=true,//to make the console output in a better format
	strict = true,//it will check if any step is not defined in step definition
	plugin = {"html:testoutput","junit:junit_xml/cucumber_xml","json:json_output/cucumber.json"}

	)
public class Test_runner {

}
