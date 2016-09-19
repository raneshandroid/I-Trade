package com.raneshprasad.i_trade;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;

public class SeeStocks extends Activity {
    TabHost host;
    ListView lv;
    String[] names = {"New York Stock Exchange", "NASDAQ", "London Stock Exchange Group",
            "Japan Exchange Group - Tokyo", "Shanghai Stock Exchange", "Hong Kong Stock Exchange",
            "Euronext", "Shenzhen Stock Exchange", "TMX Group", "Deutsche Borse", "Bombay Stock Exchange",
            "National Stock Exchange of India", "SIX Swiss Exchange", "Australian Securities Exchange", "Korea Exchange",
            "OMX Nordic Exchange", "JSE Limited", "BME Spanish Exchanges", "Taiwan Stock Exchange", "BM&F Bovespa"};
    int[] images = {R.drawable.flag_of_the_united_states, R.drawable.flag_of_the_united_states, R.drawable.flag_of_the_united_kingdom,
                    R.drawable.flag_of_japan, R.drawable.flag_of_the_people_s_republic_of_china, R.drawable.flag_of_hong_kong,
                    R.drawable.flag_of_europe, R.drawable.flag_of_the_people_s_republic_of_china, R.drawable.flag_of_canada,
                    R.drawable.flag_of_germany, R.drawable.flag_of_india, R.drawable.flag_of_india, R.drawable.flag_of_switzerland,
                    R.drawable.flag_of_australia, R.drawable.flag_of_south_korea, R.drawable.flag_of_sweden, R.drawable.flag_of_south_africa,
                    R.drawable.flag_of_spain, R.drawable.flag_of_the_republic_of_china, R.drawable.flag_of_brazil};
    String[] count_desc = {"United States", "United States", "United Kingdom", "Japan", "China", "Hong Kong", "Europe", "China", "Canada", "Germany",
                            "India", "India", "Switzerland", "Australia", "South Korea", "Sweden", "South Africa", "Spain", "Taiwan", "Brazil"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_stocks);


        lv = (ListView) findViewById(R.id.listView);
        Adapter adapter = new Adapter(this, names, images, count_desc);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), names[position], Toast.LENGTH_SHORT).show();
            }
        });


    }
}

