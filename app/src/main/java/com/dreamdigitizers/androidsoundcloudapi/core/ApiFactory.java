package com.dreamdigitizers.androidsoundcloudapi.core;

public class ApiFactory {
    public static void initialize(final String pClientId) {
        Api.initialize(pClientId);
    }

    public static void initialize(final String pClientId, final String pOauthToken) {
        Api.initialize(pClientId, pOauthToken);
    }

    public static IApi getApiInstance() {
        return Api.getInstance();
    }

    public static String getConnectionString(
            String pClientId,
            String pRedirectUri,
            String pResponseType,
            String pScope,
            String pDisplay,
            String pState) {
        return Api.getConnectionString(
                pClientId,
                pRedirectUri,
                pResponseType,
                pScope,
                pDisplay,
                pState);
    }
}
