package com.paperton.ssl;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * A simple implementation of WebViewClient, with full SSL-capabilities, for use in API-level 7 or lower. 
 * Simply pass an object of this type in to the setWebViewClient-method of a {@link android.webkit.WebView WebView}.
 * @author Viktor Warg - viktor.warg@paperton.com
 * @version 1.0
 * 
 */

public class SSLWebViewClient extends WebViewClient {

	
	@Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler,
            SslError error) {
        handler.proceed();
    }
}
