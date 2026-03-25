package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.FEATURES_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@ConfigurationParameter(key = FEATURES_PROPERTY_NAME, value = "src/test/resources/feature/testingswag.feature")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdefination")
@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value = "pretty,net.serenitybdd.cucumber.core.plugin.SerenityReporterParallel")
@ConfigurationParameter(
        key = "cucumber.object-factory",
        value = "net.serenitybdd.cucumber.runtime.SerenityObjectFactory")
public class SwagLabTestRunner {
}
