package com.tricentis.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtils {

	public static String obterDataFutura(int dias) {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
		Calendar data = Calendar.getInstance();
		data.add(Calendar.DATE, dias);
		return (dateFormat.format(data.getTime()));
	}

}
