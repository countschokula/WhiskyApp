package com.cwal.whiskyapp.util.database;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.cwal.whiskyapp.model.Whisky;
import com.cwal.whiskyapp.util.database.tables.WhiskysTable;

/**
 * Loading and Storing of Data
 * @author Cedric
 *
 */
public class DataBaseSource {
	private SQLiteDatabase database;
	private SQLDatabaseHelper dbhelper;
	private SimpleDateFormat fm = new SimpleDateFormat("yyy-MM-dd", Locale.GERMAN);
	private static DataBaseSource instance;
	
	private DataBaseSource(){
		
	}
	public static DataBaseSource getInstance(){
		if(instance == null)
			instance = new DataBaseSource();
		return instance;
	}
	//Needs to be called before use of DataBaseSource
	public void init(Context context){
		dbhelper = new SQLDatabaseHelper(context);
	}
	public void open() throws SQLException{
		database = dbhelper.getWritableDatabase();
	}
	public void close(){
		dbhelper.close();
	}
	public void storeWhiskyList(List<Whisky> whiskys){
		for(Whisky w : whiskys){
			storeWhiskys(w);
		}
	}
	private void storeWhiskys(Whisky w) {
		ContentValues values = new ContentValues();
		values.put(WhiskysTable.COL_ID, w.getId());
		values.put(WhiskysTable.COL_DEST, w.getDestillerie());
		values.put(WhiskysTable.COL_VOL, w.getVol());
		values.put(WhiskysTable.COL_VINTAGE, w.getVintage());
		values.put(WhiskysTable.COL_EDITION, w.getEdition());
		values.put(WhiskysTable.COL_AGE, w.getAge());
		
		//TODO ENCODE IMAGE
		
	}

}
