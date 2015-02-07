package com.cwal.whiskyapp.util.database;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.cwal.whiskyapp.util.database.tables.AbstractTable;
import com.cwal.whiskyapp.util.database.tables.WhiskysTable;

public class SQLDatabaseHelper extends SQLiteOpenHelper {
	private final static String DATABASE_NAME = "whiskyapp.db";
	private static final int DATABASE_VERSION = 1;

	private List<AbstractTable> tables = new ArrayList<AbstractTable>();

	public SQLDatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		tables.add(new WhiskysTable());
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		for (AbstractTable t : tables) {
			t.create(db);
		}

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		for (AbstractTable t : tables) {
			t.drop(db);
		}
		onCreate(db);
	}
}
