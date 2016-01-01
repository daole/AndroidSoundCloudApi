package com.dreamdigitizers.androidsoundcloudapi.support;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.dreamdigitizers.androidsoundcloudapi.Constants;

import java.net.URI;

public class SoundCloudWebViewClient extends WebViewClient {
    private Activity mActivity;
    private String mProtocolScheme;
    private IOnLoginActionsListener mListener;

    public SoundCloudWebViewClient(
            Activity pActivity,
            String pProtocolScheme,
            IOnLoginActionsListener pListener) {
        this.mActivity = pActivity;
        this.mProtocolScheme = pProtocolScheme;
        this.mListener = pListener;
    }

    @Override
    public void onPageStarted(WebView pWebView, String pUrl, Bitmap pFavicon) {
        if (this.mListener != null) {
            this.mListener.onPageStarted(pWebView, pUrl, pFavicon);
        }
    }

    @Override
    public void onPageFinished(WebView pWebView, String pUrl) {
        if (this.mListener != null) {
            this.mListener.onPageFinished(pWebView, pUrl);
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView pWebView, String pUrl) {
        if (!TextUtils.isEmpty(pUrl) && pUrl.startsWith(this.mProtocolScheme)) {
            String accessToken = this.retrieveAccessToken(pUrl);
            if(this.mListener != null) {
                this.mListener.onLoginComplete(accessToken);
            }
            return true;
        }
        return false;
    }

    private String retrieveAccessToken(String pUrl) {
        String accessToken = null;

        URI uri = URI.create(pUrl);
        String fragment = uri.getFragment();
        int accessTokenKeyIndex = fragment.indexOf(Constants.SOUNDCLOUD__ACCESS_TOKEN_KEY);
        if (accessTokenKeyIndex >= 0) {
            accessToken = fragment.substring(accessTokenKeyIndex + Constants.SOUNDCLOUD__ACCESS_TOKEN_KEY.length());
            int ampersandIndex = accessToken.indexOf(Constants.AMPERSAND);
            if (ampersandIndex >= 0) {
                accessToken = accessToken.substring(0, ampersandIndex);
            }
        }

        return accessToken;
    }

    public interface IOnLoginActionsListener {
        void onPageStarted(WebView pWebView, String pUrl, Bitmap pFavicon);
        void onPageFinished(WebView pWebView, String pUrl);
        void onLoginComplete(String pAccessToken);
    }
}
