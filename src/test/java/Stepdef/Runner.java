package Stepdef;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles",glue={"Stepdef"},
plugin = {"pretty","html:target/HtmlReports1/report.html",
"json:target/JSONReports/report.json",
"junit:target/JUnitReports/report.xml"}
)

public class Runner {

}
