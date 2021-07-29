package com.gs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utility {

	private static SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");

	public static long dateDiffrenceInMinute(Date date) {
		Date currentDate = new Date();
		long diff = date.getTime() - currentDate.getTime();
		return diff / 60000;
	}

	public static boolean isDigit(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static int generateRandomNumber(Integer value) {
		int m = (int) Math.pow(10, value - 1);
		return m + new Random().nextInt(9 * m);
	}

	public static Date stringToDate(String date) {
		try {
			Date parseDate = sdfrmt.parse(date);
			return parseDate;
		} catch (ParseException e) {
			return null;
		}
	}

	public static boolean isString(String value) {
		if (value == null || (value != null && value.isEmpty()))
			return false;
		else
			return true;

	}

	public static int generateOTP() {
		int m = (int) Math.pow(10, 4 - 1);
		return m + new Random().nextInt(9 * m);
	}

	/*
	 * public static String getMaskedEmail(String email) { String maskedEmail = "";
	 * if (email != null && email.length() > 0) maskedEmail =
	 * email.replaceAll("(?<=.{3}).(?=[^@]*?.@)", "*"); return maskedEmail; }
	 *
	 * public static String getMaskedMobile(String mobile) { String maskedMobile =
	 * ""; if (mobile != null && mobile.length() > 0) maskedMobile =
	 * mobile.replaceAll(".(?=.{3})", "*"); return maskedMobile; }
	 */


	public static Integer recordIndex(String offset, String limit, boolean isStartRecord) {
		Integer offsetTempValue = 0;
		Integer limitTempValue = 0;
		if (offset != null && !offset.isEmpty())
			offsetTempValue = Integer.parseInt(offset);

		if (limit != null && !limit.isEmpty())
			limitTempValue = Integer.parseInt(limit);

		if (isStartRecord) {
			return offsetTempValue * limitTempValue + 1;
		} else {
			return (offsetTempValue + 1) * limitTempValue;
		}
	}

	public static String[] publicUrls() {
		String urls[] = new String[20];

		// public Authentication API
		urls[0] = "/";
		urls[1] = "/api/authenticate";
		urls[2] = "/api/regenerateToken";
		urls[3] = "/api/revokeToken";
		urls[4] = "/api/refreshToken";
		urls[5] = "/api/checkToken";

		// public other API
		urls[6] = "/v1/public/**";

		// Resources
		urls[7] = "/static/**";
		urls[8] = "/webjars/**";
		urls[9] = "/apiSpecification";
		urls[10] = "/introduction";
		urls[11] = "/contactUs";
		urls[12] = "/docs/**";
		urls[13] = "/masters/public/**";
		urls[14] = "/v2/api-docs";

		// Swagger URLS
		urls[15] = "/configuration/ui";
		urls[16] = "/swagger-resources/**";
		urls[17] = "/configuration/security";
		urls[18] = "/swagger-ui.html";

		urls[19] = "/public/**";
		return urls;
	}
}
