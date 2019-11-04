/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.util.Objects;

public class CommonPhysicalAddressWithPurpose extends CommonPhysicalAddress {

    public enum Purpose {
        MAIL,
        OTHER,
        PHYSICAL,
        REGISTERED,
        WORK
    }

    private Purpose purpose;

    /**
     * Get purpose
     * @return purpose
     */
    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonPhysicalAddressWithPurpose commonPhysicalAddressWithPurpose = (CommonPhysicalAddressWithPurpose) o;
        return Objects.equals(this.purpose, commonPhysicalAddressWithPurpose.purpose) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            purpose,
            super.hashCode());
    }

    @Override
    public String toString() {
        return "class CommonPhysicalAddressWithPurpose {\n" +
            "   addressUType: " + toIndentedString(getAddressUType()) + "\n" + 
            "   paf: " + toIndentedString(getPaf()) + "\n" + 
            "   simple: " + toIndentedString(getSimple()) + "\n" + 
            "   purpose: " + toIndentedString(purpose) + "\n" + 
            "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
