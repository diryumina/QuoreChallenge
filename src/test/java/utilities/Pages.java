package utilities;

import pages.login.LoginPage;

public class Pages {
    private LoginPage loginPage;

    public LoginPage loginPage() {
        if(loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
}
