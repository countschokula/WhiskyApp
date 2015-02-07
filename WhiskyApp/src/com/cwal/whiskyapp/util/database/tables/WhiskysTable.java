package com.cwal.whiskyapp.util.database.tables;

//TODO create statement, contruktor

public class WhiskysTable extends AbstractTable {

	public static final String TABLE_WHISKY = "whiskys";
	public static final String COL_ID = "_id";
	public static final String COL_DEST = "destillerie";
	public static final String COL_VOL = "vol";
	public static final String COL_AGE = "age";
	public static final String COL_VINTAGE = "vintage";
	public static final String COL_EDITION = "Edition";
	
	private static final String TABLE_WHISKY_CREATE = null; //TODO SQL QUERIE

	public WhiskysTable() {
		super(TABLE_WHISKY, TABLE_WHISKY_CREATE);
	}
}
