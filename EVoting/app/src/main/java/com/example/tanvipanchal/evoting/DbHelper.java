package com.example.tanvipanchal.evoting;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Tanvi Panchal on 10/2/2016.
 */
public class DbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "e_voting.db";
    private static final String TABLE_NAME = "user";
    //private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_USER = "username";
    private static final String COLUMN_ENROLL = "enrollment";
    private static final String COLUMN_AGE = "age";
    private static final String COLUMN_GENDER="gender";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_CONTACT = "contact";
    private static final String COLUMN_PASS = "pass";

    private static final String TABLE_CREATE = "create table contacts (id integer primary key not null," + "name text not null,age integer not null,email text not null,enroll text not null,user text not null,pass text not null)";
    SQLiteDatabase db;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);


    }

    public void insertContact(contact c) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        String query="select * from contacts";
        Cursor cursor=db.rawQuery(query,null);
        int count=cursor.getCount();


        //values.put(COLUMN_ID,count);
        values.put(COLUMN_NAME, c.getName());
        values.put(COLUMN_AGE, c.getAge());
        values.put(COLUMN_ENROLL, c.getEnroll());
        values.put(COLUMN_EMAIL, c.getEmail());
        values.put(COLUMN_USER, c.getUser());
        values.put(COLUMN_PASS, c.getPass());
        db.insert(TABLE_NAME, null, values);
        db.close();

    }

    public String searchPass(String user) {
        db = this.getReadableDatabase();
        String q = "select user,pass from" + TABLE_NAME;
        Cursor cursor = db.rawQuery(q,null);
        String a,b;
        b="not found";
        if(cursor.moveToFirst()) {
            do {
                a = cursor.getString(0);
                if (a.equals(user)) {
                    b = cursor.getString(1);
                    break;
                }

            }

            while (cursor.moveToNext());
        }
        return b;
    }


}