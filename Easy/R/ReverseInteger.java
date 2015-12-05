package Easy.R;

import java.math.BigInteger;


/**
@Discribute:Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321


@Update (2015-12-04):
@author:ge1mina023
**/
public class ReverseInteger {
    
    public int reverse(Integer x) {

        String s="";
        if(x>=0){	
		String str = String.valueOf(x);//转换成字符串
		int lengh = str.length();//转换成长度
		char[] a = new char[lengh];
	    a = str.toCharArray();//转换成char数组
	    for(int i = lengh-1 ; i>=0 ; i--){
	    	 s +=a[i];
	    }
	    return Integer.parseInt(s);
	}
	else{
	    String str = String.valueOf(x);//转换成字符串
		int lengh = str.length();//转换成长度
		char[] a = new char[lengh];
	    a = str.toCharArray();//转换成char数组
	    s = s + "-";
	    for(int i = lengh-1 ; i>0 ; i--){
	    	 s +=a[i];
	    }
	    return Integer.parseInt(s);
	}
	
    }
}

