package com.example.myappdemo.zing;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;

import com.example.myappdemo.zing.Utils.GenerateXML;
import com.example.myappdemo.zing.Utils.MyUtils;

public class MainActivity extends Activity {
	private List<String>  titleList = new ArrayList<String>();
	private List<View> viewList = new ArrayList<View>();
	private ViewPager viewPager;//ViewPager 
	private LinearLayout ll1_1, ll1_2, ll2_1, ll2_2, ll3, ll4_1, ll4_2;
	private PagerAdapter pagerAdapter;//Adapter for viewpager 
	private SimpleAdapter simpleAdapter1_1, simpleAdapter1_2, simpleAdapter2_1, simpleAdapter2_2, simpleAdapter3, simpleAdapter4_1, simpleAdapter4_2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		/*
		 * initialize the page titles
		 * */
		String xmlTitle1 = "首页";
		String xmlTitle2 = "实验";
		String xmlTitle3 = "数据统计";
		String xmlTitle4 = "更多";
		titleList.add(xmlTitle1);
		titleList.add(xmlTitle2);
		titleList.add(xmlTitle3);
		titleList.add(xmlTitle4);
		
		/*
		 *  initialize the page view
		 * */
		LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
		View page1 = layoutInflater.inflate(R.layout.page_1, null);
		View page2 = layoutInflater.inflate(R.layout.page_2, null);
		View page3 = layoutInflater.inflate(R.layout.page_3, null);
		View page4 = layoutInflater.inflate(R.layout.page_4, null);
		viewList.add(page1);
		viewList.add(page2);
		viewList.add(page3);
		viewList.add(page4);
			
		/*
		 *  initialize the views
		 * */
		viewPager = (ViewPager) findViewById(R.id.viewpager);
		ll1_1 = (LinearLayout) page1.findViewById(R.id.linearLayout1);
		ll1_2 = (LinearLayout) page1.findViewById(R.id.linearLayout2);
		ll2_1 = (LinearLayout) page2.findViewById(R.id.linearLayout1);
		ll2_2 = (LinearLayout) page2.findViewById(R.id.linearLayout2);
		ll3 = (LinearLayout) page3.findViewById(R.id.linearLayout1);
		ll4_1 = (LinearLayout) page4.findViewById(R.id.linearLayout1);
		ll4_2 = (LinearLayout) page4.findViewById(R.id.linearLayout2);
		
				
		/*
		 * initialize adapters
		 * */
		pagerAdapter = new PagerAdapter() {
			
			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				return arg0 == arg1;
			}
			
			@Override
			public int getCount() {
				return viewList.size();
			}
			
			@Override
			public void destroyItem(ViewGroup container, int position,
					Object object) {
				container.removeView(viewList.get(position));
//				super.destroyItem(container, position, object);
			}
			
			@Override
			public CharSequence getPageTitle(int position) {
				return titleList.get(position);
			}
			
			@Override
			public Object instantiateItem(ViewGroup container, int position) {
				container.addView(viewList.get(position));
				return viewList.get(position);
			}
			
			@Override
			public int getItemPosition(Object object) {
				return super.getItemPosition(object);
			}
		};
		simpleAdapter1_1 = new SimpleAdapter(MainActivity.this, MyUtils.getData1_1(), R.layout.page_1_item_for_linearlayout, new String[] {"txt", "imgEnd"}, new int[] {R.id.textView1, R.id.imageView2});
		simpleAdapter1_2 = new SimpleAdapter(MainActivity.this, MyUtils.getData1_2(), R.layout.page_1_item_for_linearlayout, new String[] {"txt", "imgEnd"}, new int[] {R.id.textView1, R.id.imageView2});
		simpleAdapter2_1 = new SimpleAdapter(MainActivity.this, MyUtils.getData2_1(), R.layout.page_2_item_for_linearlayout, new String[] {"txt1", "imgEnd"}, new int[] {R.id.textView1, R.id.imageView2});
		simpleAdapter2_2 = new SimpleAdapter(MainActivity.this, MyUtils.getData2_2(), R.layout.page_2_item_for_linearlayout, new String[] {"txt1", "imgEnd"}, new int[] {R.id.textView1, R.id.imageView2});
		simpleAdapter3 = new SimpleAdapter(MainActivity.this, MyUtils.getData3(), R.layout.page_3_item_for_linearlayout, new String[] {"txt", "imgEnd"}, new int[] {R.id.textView1, R.id.imageView2});
		simpleAdapter4_1 = new SimpleAdapter(MainActivity.this, MyUtils.getData4_1(), R.layout.page_4_item_for_linearlayout, new String[] {"txt", "imgEnd"}, new int[] {R.id.textView1, R.id.imageView2});
		simpleAdapter4_2 = new SimpleAdapter(MainActivity.this, MyUtils.getData4_2(), R.layout.page_4_item_for_linearlayout, new String[] {"txt", "imgEnd"}, new int[] {R.id.textView1, R.id.imageView2});
		
		/*
		 * adapter -> view -> insert in linearlayout
		 * in the meantime  genItems for LinearLayout
		 * */
		GenerateXML.genLinearLayoutItems(ll1_1, simpleAdapter1_1, MainActivity.this);
		GenerateXML.genLinearLayoutItems(ll1_2, simpleAdapter1_2, MainActivity.this);
		GenerateXML.genLinearLayoutItems(ll2_1, simpleAdapter2_1, MainActivity.this);
		GenerateXML.genLinearLayoutItems(ll2_2, simpleAdapter2_2, MainActivity.this);
		GenerateXML.genLinearLayoutItems(ll3, simpleAdapter3, MainActivity.this);
		GenerateXML.genLinearLayoutItems(ll4_1, simpleAdapter4_1, MainActivity.this);
		GenerateXML.genLinearLayoutItems(ll4_2, simpleAdapter4_2, MainActivity.this);
	
		/*
		 *  set adapter
		 * */
		viewPager.setAdapter(pagerAdapter);

		/*
		 *  set list view height
		 * */
//		MyUtils.setListViewHeightBasedOnChildren(listView, MainActivity.this);
//		MyUtils.setListViewHeightBasedOnChildren(listView2, MainActivity.this);
//		MyUtils.setListViewHeightBasedOnChildren(listView3, MainActivity.this);
//		MyUtils.setListViewHeightBasedOnChildren(listView4, MainActivity.this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	

}
