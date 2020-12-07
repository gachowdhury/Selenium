package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/fave/features",
glue = "steps",
plugin= {"html:reports"},
snippets=SnippetType.CAMELCASE
			)

public class RunnerFile extends AbstractTestNGCucumberTests{

}
