package dxh.notes.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	public static void main(String[] args) {
		String currentTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(new Date());
		System.out.println(new Date());
	}
}
