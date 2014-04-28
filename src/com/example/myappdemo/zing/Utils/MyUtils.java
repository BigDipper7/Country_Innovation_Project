package com.example.myappdemo.zing.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.myappdemo.zing.R;

public class MyUtils {
	/*
	 * get the data while deal with page1_view_for_listviw.xml
	 */
	public static List<Map<String, Object>> getData1_1() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("txt", "XX月XX日--实验1");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "XX月XX日--实验2");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "XX月XX日--实验3");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "XX月XX日--实验4");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData1_2() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("txt", "最近实验1");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "最近实验2");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "最近实验3");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "最近实验4");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "");
//		item1.put("txt2", "     >  ");
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "关于我们");
//		item1.put("txt2", "     >  ");
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "免责声明");
//		item1.put("txt2", "     >  ");
//		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData2_1() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("txt1", "链接设定");
//		item1.put("txt2", "不限");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "初始参数设定");
//		item1.put("txt2", "不限");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("txt1", "获取实验信息");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "特色");
////		item1.put("txt2", "不限");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "环线");
////		item1.put("txt2", "不限");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "地铁");
////		item1.put("txt2", "不限");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "装修状况");
////		item1.put("txt2", "不限");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);

		return data;
	}

	public static List<Map<String, Object>> getData2_2() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("txt1", "摄像头设定");
//		item1.put("txt2", "不限");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "打开摄像头");
//		item1.put("txt2", "不限");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "价格");
////		item1.put("txt2", "不限");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "特色");
////		item1.put("txt2", "不限");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "环线");
////		item1.put("txt2", "不限");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "地铁");
////		item1.put("txt2", "不限");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "装修状况");
////		item1.put("txt2", "不限");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData3() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "实验名字1-XX月XX日XX时");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "实验名字2-XX月XX日XX时");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "实验名字3-XX月XX日XX时");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "实验名字4-XX月XX日XX时");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "实验名字5-XX月XX日XX时");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData4_1() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "工作站控制");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "小型振动台控制");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "3D打印机控制");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "摄像机控制");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "使用帮助");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "关于我们");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "免责声明");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData4_2() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "关于我们");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "检查更新");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "软件说明");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "用户反馈");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "使用帮助");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "关于我们");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "免责声明");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);

		return data;
	}

	/**
	 * 设置listview真实高度 解决了scroll view中间listview只显示一行的问题 
	 * @param listView
	 * @param context
	 */
	public static void setListViewHeightBasedOnChildren(ListView listView, Context context) {   
        // 获取ListView对应的Adapter   
        ListAdapter listAdapter = listView.getAdapter();   
        if (listAdapter == null) {   
            return;   
        }   
   
        int totalHeight = 0;   
        for (int i = 0, len = listAdapter.getCount(); i < len; i++) {   
            // listAdapter.getCount()返回数据项的数目   
            View listItem = listAdapter.getView(i, null, listView);   
            // 计算子项View 的宽高   
            listItem.measure(0, 0);    
            // 统计所有子项的总高度   
            totalHeight += listItem.getMeasuredHeight();    
        }   
   
        ViewGroup.LayoutParams params = listView.getLayoutParams();   
        //TODO  不知道为什么bug了  不能写成14  少1p的divider的高度
        params.height = totalHeight+ (listView.getDividerHeight() * (listAdapter.getCount() - 1)) + DensityUtil.dip2px(context, 14);   
        // listView.getDividerHeight()获取子项间分隔符占用的高度   
        //DensityUtil.dip2px(context, 14) 是因为最外层的背景边框的pedding值是7dp &7dp 共14dp将其转化成px  然后再进行赋值
        // params.height最后得到整个ListView完整显示需要的高度   
        listView.setLayoutParams(params);   
    }
}
