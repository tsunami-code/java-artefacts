/*
 * Consumer Data Standards
 * Sample CLI tool to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.cli;

import au.org.consumerdatastandards.conformance.ConformanceError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

public class ApiCliBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiCliBase.class);

    protected void throwConformanceErrors(List<ConformanceError> conformanceErrors) throws Exception {

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.println("Received " + conformanceErrors.size() + " errors");
        for (ConformanceError conformanceError : conformanceErrors) {
            pw.println("Conformance Error: " + conformanceError.getDescription());
        }
        pw.println("Found a total of " + conformanceErrors.size() + " conformance errors");
        throw new Exception(pw.toString());
    }
}
