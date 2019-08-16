package com.lzx.www.test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {
	
	public static void main(String[] args) {
		List<String> nextHostNames = new ArrayList<String>();
		String url = "http://www.baidu.com";
		try {
			Document doc=Jsoup.connect(url).get();
			System.out.println(doc);
			Elements elements=doc.getElementsByClass("path"); //获取返回的页面jsp中class=path的内容
			for(Element element : elements) {
				nextHostNames.add(element.text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (String str : nextHostNames) {
			System.out.println(str);
		}
		
	}
	
}
