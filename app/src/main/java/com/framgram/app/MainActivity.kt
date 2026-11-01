package com.framgram.app

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.LinearLayout
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val title = TextView(this)
        title.text = "FRAMGRAM"
        title.textSize = 25f
        title.gravity = Gravity.CENTER
        title.setPadding(10, 20, 10, 20)

        layout.addView(title)

        val web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.webViewClient = WebViewClient()

        layout.addView(
            web,
            LinearLayout.LayoutParams(
                -1, 0, 1f
            )
        )

        setContentView(layout)

        web.loadUrl("https://web.telegram.org/a/")
    }
}