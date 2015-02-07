package com.cwal.whiskyapp.util.database.tables;


import android.database.sqlite.SQLiteDatabase;

public abstract class AbstractTable {
	
	private final String db_name, createStatement;
	
	public AbstractTable(String db_name, String createStatement){
	this.db_name = db_name;
	this.createStatement = createStatement;
	}
	public void create(SQLiteDatabase database){
		database.execSQL(createStatement);
	}
	public void drop(SQLiteDatabase database){
		database.execSQL("DROP IF TABLE EXISTS" + db_name);
	}
}