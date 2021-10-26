package vn.thientran.keycloak.resetpasswordspi.handle;

import javax.ws.rs.core.Response;

import org.keycloak.authentication.actiontoken.AbstractActionTokenHander;
import org.keycloak.authentication.actiontoken.ActionTokenContext;
import org.keycloak.events.EventType;

public class ResetPasswordActionTokenHandler extends AbstractActionTokenHander<ResetPasswordActionToken> {

    public ResetPasswordActionTokenHandler(String id, Class<ResetPasswordActionToken> tokenClass, String defaultErrorMessage,
            EventType defaultEventType, String defaultEventError) {
        super(id, tokenClass, defaultErrorMessage, defaultEventType, defaultEventError);
    }

    @Override
    public Response handleToken(ResetPasswordActionToken arg0, ActionTokenContext<ResetPasswordActionToken> arg1) {
        return null;
    }
}