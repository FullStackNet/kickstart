package application.account.helper;

import application.account.resource.accounts;
import platform.helper.BaseHelper;

public class AccountsHelper extends BaseHelper {

    private static AccountsHelper instance;

    public static AccountsHelper getInstance() {
        if (instance == null)
            instance = new AccountsHelper();
        return instance;
    }

    public AccountsHelper() {
        super(new accounts());
        // TODO Auto-generated constructor stub
    }
}
