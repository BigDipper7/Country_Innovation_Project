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
		item1.put("txt", "XX��XX��--ʵ��1");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "XX��XX��--ʵ��2");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "XX��XX��--ʵ��3");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "XX��XX��--ʵ��4");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData1_2() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("txt", "���ʵ��1");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "���ʵ��2");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "���ʵ��3");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt", "���ʵ��4");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "");
//		item1.put("txt2", "     >  ");
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "��������");
//		item1.put("txt2", "     >  ");
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt", "��������");
//		item1.put("txt2", "     >  ");
//		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData2_1() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("txt1", "�����趨");
//		item1.put("txt2", "����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "��ʼ�����趨");
//		item1.put("txt2", "����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);
		
		item1 = new HashMap<String, Object>();
		item1.put("txt1", "��ȡʵ����Ϣ");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "��ɫ");
////		item1.put("txt2", "����");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "����");
////		item1.put("txt2", "����");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "����");
////		item1.put("txt2", "����");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "װ��״��");
////		item1.put("txt2", "����");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);

		return data;
	}

	public static List<Map<String, Object>> getData2_2() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
		item1.put("txt1", "����ͷ�趨");
//		item1.put("txt2", "����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
		item1.put("txt1", "������ͷ");
//		item1.put("txt2", "����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "�۸�");
////		item1.put("txt2", "����");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "��ɫ");
////		item1.put("txt2", "����");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "����");
////		item1.put("txt2", "����");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "����");
////		item1.put("txt2", "����");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
//		item1.put("txt1", "װ��״��");
////		item1.put("txt2", "����");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData3() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "ʵ������1-XX��XX��XXʱ");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "ʵ������2-XX��XX��XXʱ");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "ʵ������3-XX��XX��XXʱ");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "ʵ������4-XX��XX��XXʱ");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "ʵ������5-XX��XX��XXʱ");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData4_1() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "����վ����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "С����̨����");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "3D��ӡ������");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "���������");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "ʹ�ð���");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "��������");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "��������");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);

		return data;
	}
	
	public static List<Map<String, Object>> getData4_2() {
		List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();

		Map<String, Object> item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "��������");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "������");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

		item1 = new HashMap<String, Object>();
//		item1.put("img", R.drawable.profile_icon);
		item1.put("txt", "���˵��");
		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
		data.add(item1);

//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "�û�����");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "ʹ�ð���");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "��������");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);
//
//		item1 = new HashMap<String, Object>();
////		item1.put("img", R.drawable.profile_icon);
//		item1.put("txt", "��������");
//		item1.put("imgEnd", R.drawable.aio_tips_arrow_gray);
//		data.add(item1);

		return data;
	}

	/**
	 * ����listview��ʵ�߶� �����scroll view�м�listviewֻ��ʾһ�е����� 
	 * @param listView
	 * @param context
	 */
	public static void setListViewHeightBasedOnChildren(ListView listView, Context context) {   
        // ��ȡListView��Ӧ��Adapter   
        ListAdapter listAdapter = listView.getAdapter();   
        if (listAdapter == null) {   
            return;   
        }   
   
        int totalHeight = 0;   
        for (int i = 0, len = listAdapter.getCount(); i < len; i++) {   
            // listAdapter.getCount()�������������Ŀ   
            View listItem = listAdapter.getView(i, null, listView);   
            // ��������View �Ŀ��   
            listItem.measure(0, 0);    
            // ͳ������������ܸ߶�   
            totalHeight += listItem.getMeasuredHeight();    
        }   
   
        ViewGroup.LayoutParams params = listView.getLayoutParams();   
        //TODO  ��֪��Ϊʲôbug��  ����д��14  ��1p��divider�ĸ߶�
        params.height = totalHeight+ (listView.getDividerHeight() * (listAdapter.getCount() - 1)) + DensityUtil.dip2px(context, 14);   
        // listView.getDividerHeight()��ȡ�����ָ���ռ�õĸ߶�   
        //DensityUtil.dip2px(context, 14) ����Ϊ�����ı����߿��peddingֵ��7dp &7dp ��14dp����ת����px  Ȼ���ٽ��и�ֵ
        // params.height���õ�����ListView������ʾ��Ҫ�ĸ߶�   
        listView.setLayoutParams(params);   
    }
}
