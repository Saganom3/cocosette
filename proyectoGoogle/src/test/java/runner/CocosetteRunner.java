package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.CocosettePage;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefs",
        tags = "@smoke",
        snippets = SnippetType.CAMELCASE
)

public class CocosetteRunner {
    @AfterClass
    public static void close() {
        CocosettePage cocosettepage = new CocosettePage();
        cocosettepage.cerrar();
    }
}
