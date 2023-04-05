package com.orange.generic;

import org.apache.commons.collections4.iterators.ObjectArrayIterator;
import org.testng.annotations.DataProvider;

public class DataProviderEx {
	@DataProvider()
public Object[][] loginData() {
	Object [][]data=new Object[1][1];
	data[0][0]="Admin";
	data[0][1]="admin123";
	return data;
}
}
