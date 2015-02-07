package com.cwal.whiskyapp.model;

import android.widget.ImageView;



//TODO IMAGE in db
public class Whisky implements Comparable{
	private int id;
	private String destillerie;
	private int age;
	private float vol;
	private String edition;
	private ImageView cover;
	
	private int vintage;

	public Whisky(int id, Float vol, String destillerie, int age, String edition, int vintage, ImageView cover){
		this.id = id;
		this.vol = vol;
		this.destillerie = destillerie;
		this.age = age;
		this.edition = edition;
		this.vintage = vintage;
		this.cover = cover;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestillerie() {
		return destillerie;
	}

	public void setDestillerie(String destillerie) {
		this.destillerie = destillerie;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getVol() {
		return vol;
	}

	public void setVol(float vol) {
		this.vol = vol;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public int getVintage() {
		return vintage;
	}

	public void setVintage(int vintage) {
		this.vintage = vintage;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return super.equals(o);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public ImageView getCover() {
		return cover;
	}

	public void setCover(ImageView cover) {
		this.cover = cover;
	}
}
