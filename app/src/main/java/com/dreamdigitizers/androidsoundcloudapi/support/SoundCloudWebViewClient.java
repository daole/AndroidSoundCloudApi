package com.dreamdigitizers.androidsoundcloudapi.support;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.dreamdigitizers.androidsoundcloudapi.Constants;

import java.lang.ref.WeakReference;
import java.net.URI;

public class SoundCloudWebViewClient extends WebViewClient {
    private String mProtocolScheme;
    private WeakReference<IOnLoginActionsListener> mListener;

    public SoundCloudWebViewClient(
            String pProtocolScheme,
            IOnLoginActionsListener pListener) {
        this.mProtocolScheme = pProtocolScheme;
        this.mListener = new WeakReference<>(pListener);
    }

    @Override
    public void onPageStarted(WebView pWebView, String pUrl, Bitmap pFavicon) {
        IOnLoginActionsListener listener = this.mListener.get();
        if (listener != null) {
            listener.onPageStarted(pWebView, pUrl, pFavicon);
        }
    }

    @Override
    public void onPageFinished(WebView pWebView, String pUrl) {
        IOnLoginActionsListener listener = this.mListener.get();
        if (listener != null) {
            listener.onPageFinished(pWebView, pUrl);
        }
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView pWebView, String pUrl) {
        if (!TextUtils.isEmpty(pUrl) && pUrl.startsWith(this.mProtocolScheme)) {
            String accessToken = this.retrieveAccessToken(pUrl);
            IOnLoginActionsListener listener = this.mListener.get();
            if(listener != null) {
                listener.onLoginComplete(accessToken);
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
