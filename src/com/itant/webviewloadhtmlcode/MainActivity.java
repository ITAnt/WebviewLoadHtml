package com.itant.webviewloadhtmlcode;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;

public class MainActivity extends Activity {

	private WebView wv_load_html;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		wv_load_html = (WebView) findViewById(R.id.wv_load_html);
		wv_load_html.getSettings().setJavaScriptEnabled(true);
		wv_load_html.getSettings().setSupportZoom(true);
		wv_load_html.getSettings().setBuiltInZoomControls(true);
		wv_load_html.getSettings().setDefaultTextEncodingName("utf-8");
		wv_load_html.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
		wv_load_html.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);

		String testString = "<h2>Hello wold</h2><ul><li>cats</li><li>dogs</li></ul><IMG src=\"http://images01.happyjuzi.com/uploadfile/2015/0417/20150417030032617.jpg!img04jpg\"/><br/><IMG src=\"http://images01.happyjuzi.com/uploadfile/2015/0417/20150417030032617.jpg!img04jpg\"/>";
		wv_load_html.loadDataWithBaseURL(null, testString, "text/html", "UTF-8", null);
	}
}
