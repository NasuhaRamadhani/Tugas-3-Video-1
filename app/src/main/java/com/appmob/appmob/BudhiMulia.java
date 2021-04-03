package com.appmob.appmob;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BudhiMulia extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listAction = new String[] {"Website", "Lokasi",
                "Call Center", "SMS Center","Tentang Rumah Sakit", "Keluar"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAction));
    }

    protected void onListItemClick (ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkan(pilihan);
    }

    private void tampilkan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Website")) {
                String website = "https://www.guesehat.com/rumah-sakit-ibu-dan-anak-budhi-mulia";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Lokasi")) {
                String lokasi = "google.navigation:q=0.47686,101.41888";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasi));


            } else if (pilihan.equals("Call Center")) {
                String call = "tel:0761-8417200";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(call));

            } else if (pilihan.equals("SMS Center")) {
                String SMSText = "Costumer Service";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:081212097711"));

            } else if (pilihan.equals("Tentang Rumah Sakit")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"RSIA Budhi Mulia");
            }

            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
        {
        }
    }
}