package br.com.meta.aula11ex2.util;

import java.text.*;
import java.util.Locale;

public class Numeros {

	public static double RoundTo2Decimals(double val) {
		
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
		DecimalFormat df2 = (DecimalFormat)nf;		
		df2.applyPattern("###.##");		
		return Double.valueOf(df2.format(val));
	}
}
