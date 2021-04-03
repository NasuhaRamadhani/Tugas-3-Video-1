package com.appmob.appmob;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hospital extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listRumahSakit = new String[] {"RSUD Arifin Achmad Pekanbaru", "Eka Hospital Pekanbaru",
                "Aulia Hospital Pekanbaru", "RS Awal Bros Panam Pekanbaru", "RSIA Budhi Mulia"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, listRumahSakit));
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
            if (pilihan.equals("RSUD Arifin Achmad Pekanbaru")) {
                a = new Intent(this, RSUD.class);

            } else if (pilihan.equals("Eka Hospital Pekanbaru")) {
                a = new Intent(this, EkaHospital.class);

            } else if (pilihan.equals("Aulia Hospital Pekanbaru")) {
                a = new Intent(this, AuliaHospital.class);

            } else if (pilihan.equals("RS Awal Bros Panam Pekanbaru")) {
                a = new Intent(this, AwalBrosPanam.class);

            } else if (pilihan.equals("RSIA Budhi Mulia")) {
                a = new Intent(this, BudhiMulia.class);

            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
