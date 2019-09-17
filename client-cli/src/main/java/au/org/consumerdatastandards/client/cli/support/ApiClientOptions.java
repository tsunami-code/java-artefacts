/*
 * Consumer Data Standards
 * Sample Data Holder to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 * Do not edit the class manually.
 */
package au.org.consumerdatastandards.client.cli.support;

public class ApiClientOptions {

    private String serverUrl;
    private String proxy;
    private boolean validationEnabled = false;
    private String userAgent;
    private boolean debugEnabled = false;
    private boolean verifyingSsl = true;

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public boolean isValidationEnabled() {
        return validationEnabled;
    }

    public void setValidationEnabled(boolean validationEnabled) {
        this.validationEnabled = validationEnabled;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public boolean isDebugEnabled() {
        return debugEnabled;
    }

    public void setDebugEnabled(boolean debugEnabled) {
        this.debugEnabled = debugEnabled;
    }

    public boolean isVerifyingSsl() {
        return verifyingSsl;
    }

    public void setVerifyingSsl(boolean verifyingSsl) {
        this.verifyingSsl = verifyingSsl;
    }
}
