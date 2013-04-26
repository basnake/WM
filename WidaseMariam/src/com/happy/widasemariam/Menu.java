package com.happy.widasemariam;

import com.happy.widasemariam.R;
import com.happy.widasemariam.R.layout;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity
{

	String classesInAmharic [] = {"የሰኞ", "የማክሰኞ", "የረቡዕ", "የሐሙስ", "የአርብ", "የቅዳሜ", "የእሁድ"};
	
	String classesInEnglish [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
//		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classesInEnglish));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) 
	{
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String clickedClass = classesInEnglish[position];
		
		try
		{
			Class dengelMariam = Class.forName("com.happy.widasemariam." + clickedClass);
			
			Intent dengelIntent = new Intent(Menu.this, dengelMariam);
			
			startActivity(dengelIntent);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}

/*
 * 	switch(view.getId())
		{
		case R.id.ibMonday:
			dengelMariam = Class.forName("com.happy.widasemariam.Monday");
			break;
		case R.id.ibTuesday:
			dengelMariam = Class.forName("com.happy.widasemariam.Tuesday");
			break;
		case R.id.ibWednesday:
			dengelMariam = Class.forName("com.happy.widasemariam.Wedensday");
			break;
		case R.id.ibThursday:
			dengelMariam = Class.forName("com.happy.widasemariam.Thursday");
			break;
		case R.id.ibFriday:
			dengelMariam = Class.forName("com.happy.widasemariam.Friday");
			break;
		case R.id.ibSaturday:
			dengelMariam = Class.forName("com.happy.widasemariam.Saturday");
			break;
		case R.id.ibSunday:
			dengelMariam = Class.forName("com.happy.widasemariam.Sunday");
			break;
		}
		
 */