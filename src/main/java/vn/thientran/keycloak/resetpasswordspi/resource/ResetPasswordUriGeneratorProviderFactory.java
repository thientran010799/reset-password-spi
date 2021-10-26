package vn.thientran.keycloak.resetpasswordspi.resource;

import org.keycloak.Config.Scope;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.services.resource.RealmResourceProvider;
import org.keycloak.services.resource.RealmResourceProviderFactory;

public class ResetPasswordUriGeneratorProviderFactory implements RealmResourceProviderFactory{

    private static final String RESET_PASSWORD_URI_PROVIDER_ID = "reset-password-id";

    @Override
    public void close() {
    }

    @Override
    public RealmResourceProvider create(KeycloakSession arg0) {
        return new ResetPasswordUriGeneratorProvider();
    }

    @Override
    public String getId() {
        return RESET_PASSWORD_URI_PROVIDER_ID;
    }

    @Override
    public void init(Scope arg0) {
    }

    @Override
    public void postInit(KeycloakSessionFactory arg0) {
    }

}
