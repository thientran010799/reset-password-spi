package vn.thientran.keycloak.resetpasswordspi.handle;

import org.keycloak.authentication.actiontoken.DefaultActionToken;

public class ResetPasswordActionToken extends DefaultActionToken {
    
    public static final String RESET_PASSWORD_TOKEN = "reset-password";

    private ResetPasswordActionToken() {
    }
}
