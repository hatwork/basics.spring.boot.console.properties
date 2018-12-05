package com.hatim.basics.springboot.component;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.stereotype.Component;

@Component("vsplit")
public class ValueSplitter {
	
	public List<String> valueToList(String value) {
		
		StringTokenizer st = new StringTokenizer(value);
		List<String> vals = new ArrayList<>();
		while( st.hasMoreTokens() ) {
			vals.add(st.nextToken());
		}
		
		return vals;
	}
	
	
}
