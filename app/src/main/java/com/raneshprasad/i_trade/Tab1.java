package com.raneshprasad.i_trade;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class Tab1 extends TabActivity {
    TabHost host;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);
        host = (TabHost) findViewById(android.R.id.tabhost);

        TabHost.TabSpec sp1 = host.newTabSpec("Tab 1");
        sp1.setIndicator("Stocks");
        sp1.setContent(new Intent(this, SeeStocks.class));
        host.addTab(sp1);

        
    }
}
