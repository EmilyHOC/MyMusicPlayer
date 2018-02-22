package com.music.musicplay;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class MusicData implements Parcelable{

	public final static String KEY_MUSIC_DATA = "MusicData";
	
	private final static String KEY_MUSIC_NAME = "MusicName";
	private final static String KEY_MUSIC_TIME = "MusicTime";
	private final static String KEY_MUSIC_PATH = "MusicPath";
	private final static String KEY_MUSIC_ARITST = "MusicAritst";
	
	public String mMusicName;	
	public int  mMusicTime;	
	public String mMusicPath;
	public String mMusicAritst;

	
	public MusicData(){
		mMusicName = "";
		mMusicTime = 0;
		mMusicPath = "";
		mMusicAritst = "";
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		
		Bundle mBundle=new Bundle(); 
		
		mBundle.putString(KEY_MUSIC_NAME, mMusicName);
		mBundle.putInt(KEY_MUSIC_TIME, mMusicTime);
		mBundle.putString(KEY_MUSIC_PATH, mMusicPath);
		mBundle.putString(KEY_MUSIC_ARITST, mMusicAritst);
		dest.writeBundle(mBundle);
	}
	
	 public static final Parcelable.Creator<MusicData> CREATOR = new Parcelable.Creator<MusicData>(){
		@Override
		public MusicData createFromParcel(Parcel source) {
			MusicData Data = new MusicData();
			Bundle mBundle=new Bundle(); 
			mBundle = source.readBundle();
			Data.mMusicName = mBundle.getString(KEY_MUSIC_NAME);
			Data.mMusicTime = mBundle.getInt(KEY_MUSIC_TIME);
			Data.mMusicPath = mBundle.getString(KEY_MUSIC_PATH);
			Data.mMusicAritst = mBundle.getString(KEY_MUSIC_ARITST);
			return Data;
		}

		@Override
		public MusicData[] newArray(int size) {
			return new MusicData[size];
		}
		 
	 };
}
