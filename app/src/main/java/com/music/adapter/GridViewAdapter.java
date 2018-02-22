package com.music.adapter;

import com.music.demo.MenuItemData;
import com.music.demo.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter{
	
	Context mContext;
	
	LayoutInflater mLayoutInflater;
	
	MenuItemData 	mMenuItemData;
	
	public GridViewAdapter(Context context, MenuItemData menuItemData){

		mContext = context;
		
		mLayoutInflater = LayoutInflater.from(context);
		
		mMenuItemData = menuItemData;
	}
	

	@Override
	public int getCount() {
		return mMenuItemData.getCount();
	}

	@Override
	public Object getItem(int position) {
		 		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (convertView == null){
			convertView = mLayoutInflater.inflate(R.layout.menu_item, null);
		}
		
		ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview);	
		imageView.setBackgroundDrawable(mMenuItemData.getDrawable(position));

		
		TextView  textView = (TextView) convertView.findViewById(R.id.textview);
		textView.setText(mMenuItemData.getTitle(position));
		
		
		return convertView;
		
	}

}
