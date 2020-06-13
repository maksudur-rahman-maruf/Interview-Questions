package com.phone;

public class OSFactory {
	public static OS getInstance(String str)
	{
		if(str.equals("open"))
			return new Android();
		else if(str.equals("close"))
			return new IOS();
		else
			return new Windows();
		
	}

}
