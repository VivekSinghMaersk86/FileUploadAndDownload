package com.vivek.string2020;

public class LargeCommonPrefixStringArray1 {
	public static void main(String[] args) {
		
		LargeCommonPrefixStringArray1 LCPSA=new LargeCommonPrefixStringArray1();
		String[] strArr={"java2blog","javaworld","javabean","javatemp"};
		String[] strArr1={"sqlblog","sql2world","sqlquery","sqlproc"};
		String[] strArr2={"geeksforgeeks", "geeks", "geek", "geezer"};
		String[] strArr3={"apple", "ape", "april"};
		System.out.println("strArr large common prefix:-  "+LCPSA.longestCommonPrefix(strArr));
		System.out.println("strArr1 large common prefix:-  "+LCPSA.longestCommonPrefix(strArr1));
		System.out.println("strArr2 large common prefix:-  "+LCPSA.longestCommonPrefix(strArr2));
		System.out.println("strArr3 large common prefix:-  "+LCPSA.longestCommonPrefix(strArr3));
	}
	
	
	public String longestCommonPrefix(String[] strs) {
	    if(strs==null || strs.length ==0){
	        return "";
	    }
	 
	    if(strs.length == 1){
	        return strs[0];
	    }
	 
	    int i=0;
	    while(true){
	        boolean flag = true;
	        for(int j=1; j<strs.length; j++){
	            if(strs[j].length()<=i || strs[j-1].length() <=i 
	               || strs[j].charAt(i) != strs[j-1].charAt(i)){
	                flag = false;
	                break;
	            }               
	        }
	 
	        if(flag){
	            i++;
	        }else{
	            break;
	        }
	    }
	 
	    return strs[0].substring(0, i);
	}
}
