package com.DB;

import java.util.ArrayList;
import java.util.Properties;

import junit.framework.Test;

public class test {

	static DBHelper instance = null;
	
	public static void main(String[] args) {
		String a ;
                a = DBCore.singleSelect("name", "String", "select name from user where password = 1");
	}
}
