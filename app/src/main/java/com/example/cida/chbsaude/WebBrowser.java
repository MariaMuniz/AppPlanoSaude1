package com.example.cida.chbsaude;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Cida on 12/09/2017.
 */
/** myWebView.setWebViewClient(new WebBrowser());

public class WebBrowser extends WebViewClient {


        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (url.startsWith("tel:")) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(url));
                startActivity(intent);
                return true;
            }


        }


}
*/
