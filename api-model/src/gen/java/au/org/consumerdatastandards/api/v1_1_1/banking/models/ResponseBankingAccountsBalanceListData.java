package au.org.consumerdatastandards.api.v1_1_1.banking.models;

import java.util.List;
import au.org.consumerdatastandards.support.data.*;

@DataDefinition(
    referenced = false
)
public class ResponseBankingAccountsBalanceListData {

    @Property(
        description = "The list of balances returned",
        required = true
    )
    List<BankingBalance> balances;
}
