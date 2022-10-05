package br.com.projNoBug.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/resources/features",
            tags = " ",
            glue = "br.com.projNoBug.steps",
            plugin = {"json:target/reports/cucumberReports.json", "pretty"},
            snippets = CucumberOptions.SnippetType.CAMELCASE
    )

    public class RunnerTest {
}
