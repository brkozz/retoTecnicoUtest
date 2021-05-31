package co.com.bancolombia.certifacion.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/utest_registro.feature",
        glue = {"co.com.bancolombia.certifacion.utest.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {

}
