package com.example.pankaj.drawarlayout;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Pankaj on 9/23/2015.
 */
public class DataBaseTest extends SQLiteOpenHelper {
    public DataBaseTest(Context ct) {
        super(ct, "MyDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
              db.execSQL("create table emp ( empid int primary key, name TEXT )");
        } catch (Exception ex) {
            Log.e("Exception ", ex.toString());
        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
