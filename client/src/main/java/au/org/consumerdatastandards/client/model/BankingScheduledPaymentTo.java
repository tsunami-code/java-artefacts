/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.util.Objects;
/**
 * Object containing details of the destination of the payment. Used to specify a variety of payment destination types
 */
public class BankingScheduledPaymentTo {

    public enum ToUType {
        ACCOUNTID,
        BILLER,
        DOMESTIC,
        INTERNATIONAL,
        PAYEEID
    }

    private String accountId;

    private BankingBillerPayee biller;

    private BankingDomesticPayee domestic;

    private BankingInternationalPayee international;

    private String payeeId;

    private ToUType toUType;

    /**
     * Present if toUType is set to accountId. Indicates that the payment is to another account that is accessible under the current consent
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Get biller
     * @return biller
     */
    public BankingBillerPayee getBiller() {
        return biller;
    }

    public void setBiller(BankingBillerPayee biller) {
        this.biller = biller;
    }

    /**
     * Get domestic
     * @return domestic
     */
    public BankingDomesticPayee getDomestic() {
        return domestic;
    }

    public void setDomestic(BankingDomesticPayee domestic) {
        this.domestic = domestic;
    }

    /**
     * Get international
     * @return international
     */
    public BankingInternationalPayee getInternational() {
        return international;
    }

    public void setInternational(BankingInternationalPayee international) {
        this.international = international;
    }

    /**
     * Present if toUType is set to payeeId. Indicates that the payment is to registered payee that can be accessed using the payee end point. If the Bank Payees scope has not been consented to then a payeeId should not be provided and the full payee details should be provided instead
     * @return payeeId
     */
    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    /**
     * Get toUType
     * @return toUType
     */
    public ToUType getToUType() {
        return toUType;
    }

    public void setToUType(ToUType toUType) {
        this.toUType = toUType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingScheduledPaymentTo bankingScheduledPaymentTo = (BankingScheduledPaymentTo) o;
        return Objects.equals(this.accountId, bankingScheduledPaymentTo.accountId) &&
            Objects.equals(this.biller, bankingScheduledPaymentTo.biller) &&
            Objects.equals(this.domestic, bankingScheduledPaymentTo.domestic) &&
            Objects.equals(this.international, bankingScheduledPaymentTo.international) &&
            Objects.equals(this.payeeId, bankingScheduledPaymentTo.payeeId) &&
            Objects.equals(this.toUType, bankingScheduledPaymentTo.toUType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            biller,
            domestic,
            international,
            payeeId,
            toUType);
    }

    @Override
    public String toString() {
        return "class BankingScheduledPaymentTo {\n" +
            "   accountId: " + toIndentedString(accountId) + "\n" + 
            "   biller: " + toIndentedString(biller) + "\n" + 
            "   domestic: " + toIndentedString(domestic) + "\n" + 
            "   international: " + toIndentedString(international) + "\n" + 
            "   payeeId: " + toIndentedString(payeeId) + "\n" + 
            "   toUType: " + toIndentedString(toUType) + "\n" + 
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
