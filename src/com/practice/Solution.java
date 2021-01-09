package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.lang.Character;

public class Solution {
	
public int solution(String S)
{
	List<Character> ltrLowerCaseList = new ArrayList<Character>();
	List<Character> ltrUpperCaseList = new ArrayList<Character>();
	Map<Character, Integer> strMap = new HashMap<Character, Integer>();
	for(int i = 0; i<S.length(); i++) {
		char ch = S.charAt(i);
		if(Character.isAlphabetic(ch) && Character.isUpperCase(ch)) {
			ltrUpperCaseList.add(ch);
		}
		else if(Character.isAlphabetic(ch) && Character.isLowerCase(ch)) {
			ltrLowerCaseList.add(ch);
		}
	}
		
	 int count=0;
	java.util.Iterator<Character> iterator = ltrUpperCaseList.iterator(); 
	while (iterator.hasNext()) {				
		  count=  (int) ltrLowerCaseList.stream().filter(c->Character.toUpperCase(c) == iterator.next()).count();//anyMatch(c->Character.toUpperCase(c) == x);		
	}
return count;
	
  }
}
