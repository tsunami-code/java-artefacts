/*
 * Consumer Data Standards
 * Sample CLI tool to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.cli;

import au.org.consumerdatastandards.client.api.*;
import au.org.consumerdatastandards.client.cli.support.*;
import au.org.consumerdatastandards.client.model.*;
import au.org.consumerdatastandards.conformance.*;
import au.org.consumerdatastandards.support.ResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import java.util.List;

@ShellComponent
@ShellCommandGroup("CommonCustomer")
public class CommonCustomer extends ApiCliBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonCustomer.class);

    @Autowired
    ApiClientOptions apiClientOptions;

    private PayloadValidator payloadValidator = new PayloadValidator();
    private final CommonCustomerAPI api = new CommonCustomerAPI();

    @ShellMethod("Get customer")
    public String getCustomer(@ShellOption(defaultValue = ShellOption.NULL) Boolean check) throws Exception {

        LOGGER.info("Get customer CLI initiated");

        if (apiClientOptions.getUserAgent() != null) {
            LOGGER.info("User agent specified as {}", apiClientOptions.getUserAgent());
        }
        api.setApiClient(ApiUtil.createApiClient(apiClientOptions));

        ResponseCommonCustomer response = api.getCustomer();
        if (apiClientOptions.isValidationEnabled() || (check != null && check)) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getCustomerCall(null);
            List<ConformanceError> conformanceErrors = payloadValidator
                .validateResponse(call.request().url().toString(), response, "getCustomer", ResponseCode.OK);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("Get customer detail")
    public String getCustomerDetail(@ShellOption(defaultValue = ShellOption.NULL) Boolean check) throws Exception {

        LOGGER.info("Get customer detail CLI initiated");

        if (apiClientOptions.getUserAgent() != null) {
            LOGGER.info("User agent specified as {}", apiClientOptions.getUserAgent());
        }
        api.setApiClient(ApiUtil.createApiClient(apiClientOptions));

        ResponseCommonCustomerDetail response = api.getCustomerDetail();
        if (apiClientOptions.isValidationEnabled() || (check != null && check)) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getCustomerDetailCall(null);
            List<ConformanceError> conformanceErrors = payloadValidator
                .validateResponse(call.request().url().toString(), response, "getCustomerDetail", ResponseCode.OK);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }
}
