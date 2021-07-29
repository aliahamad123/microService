package com.udiseservices.utility;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UtilityMethodes {

	public static boolean isValidLengthOnly(String str, int maxLength) {
		if (str == null || str.trim().length() < 1 || str.length() > maxLength) {
			// //System.out.print("** Invalid Length OR Null**");
			return false;
		}
		return true;
	}

	public static boolean isValidAlphabateText(String str, int maxLength) {
		if (str == null || str.trim().length() < 1 || str.length() > maxLength) {
			// //System.out.print("** Invalid Length OR Null**");
			return false;
		}

		for (char c : str.trim().toCharArray()) {
			if (!Character.isLetter(c) && !!!Character.isWhitespace(c)) {
				// //System.out.print("** Invalid Letter or Space**");
				return false;
			}
		}
		return true;
	}

	public static Map<String, String> getMap(List<Object[]> li) {
		Map<String, String> regionList = new HashMap<String, String>();
		for (Object[] ob : li)
			regionList.put(ob[0].toString(), ob[1].toString() + " (" + ob[2].toString() + ")");

		return regionList;
	}

	public static Map<String, String> getMapDst(List<Object[]> li) {
		Map<String, String> regionList = new HashMap<String, String>();
		for (Object[] ob : li)
			regionList.put(ob[0].toString(), ob[1].toString());

		return regionList;
	}

	public static boolean isValidAlphaNumericText(String str, int maxLength) {
		if (str == null || str.trim().length() < 1 || str.length() > maxLength) {
			// //System.out.print("** Invalid Length OR Null**");
			return false;
		}
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c) && !Character.isLetter(c) && !!!Character.isWhitespace(c) && !str.contains(".")) {
				// //System.out.print("** Invalid Letter or Space or Digit**");
				return false;
			}
		}
		return true;
	}

	public static boolean isValidAlphaNumericTextBranchName(String str, int maxLength) {
		if (str == null || str.trim().length() < 1 || str.length() > maxLength) {
			// //System.out.print("** Invalid Length OR Null**");
			return false;
		}
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c) && !Character.isLetter(c) && !Character.isWhitespace(c) && !str.contains(".")
					&& !str.contains("-")) {
				// //System.out.print("** Invalid Letter or Space or Digit**");
				return false;
			}
		}
		return true;
	}

	public static boolean isValidAlphaNumericTextTeacher(String str, int maxLength) {
		if (str == null || str.trim().length() < 3 || str.length() > maxLength) {
			// //System.out.print("** Invalid Length OR Null**");
			return false;
		}
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c) && !Character.isLetter(c) && !!!Character.isWhitespace(c) && !str.contains(".")) {
				// //System.out.print("** Invalid Letter or Space or Digit**");
				return false;
			}
		}
		return true;
	}

	public static boolean isValidYearText(String str, int minYear, int maxYear) {
		/*
		 * if (str.trim().length()!=4) { //System.out.println("Test - Invalid Length");
		 * return false; }
		 */
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) {

				return false;
			}
		}
		if (Integer.parseInt(str) > maxYear || Integer.parseInt(str) < minYear) {

			return false;
		}
		return true;
	}

	public static boolean isValidNumericText(String str, int maxLength) {
		if (str == null || str.trim().length() < 1 || str.length() > maxLength) {
			return false;
		}
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c))
				return false;
		}
		return true;
	}

	public static String formatDate(Date date, SimpleDateFormat format) {
		String str = "";
		if (date != null && format != null) {
			str = format.format(date);
		}
		return str;
	}

	public static String fixTime12AM(SimpleDateFormat format) {
		Date date = new Date();
		date.setHours(3);
		date.setMinutes(0);
		date.setSeconds(0);
		String str = "";
		if (date != null && format != null) {
			str = format.format(date);
		}
		return str;
	}

	public static String getSchedulerTime() {
		SimpleDateFormat AmPmFormat = new SimpleDateFormat("a");
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd MMMM yyyy hh:mm:ss a");
		String schdulerTime = "";
		Date currentTime = new Date();
		String amPm = AmPmFormat.format(currentTime);
		Integer currentHour = currentTime.getHours();
		if (amPm.equalsIgnoreCase("am") && (currentHour >= 1 && currentHour <= 2)) {
			schdulerTime = fixedGivenTime(currentTime, dateFormatter, 3, 1);
		} else {
			schdulerTime = fixedGivenTime(currentTime, dateFormatter, 3, 0);
		}
		return schdulerTime;
	}

	public static String fixedGivenTime(Date date, SimpleDateFormat format, Integer hours, Integer minusDay) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, -minusDay);
		date = cal.getTime();
		date.setHours(hours);
		date.setMinutes(0);
		date.setSeconds(0);
		String str = "";
		if (date != null && format != null) {
			str = format.format(date);
		}
		return str;
	}

	public static boolean isNumeric(String str) {
		if (str == null || str.length() < 1 || str.length() > 9) {
			return false;
		}
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c))
				return false;
		}
		return true;
	}

	public static boolean isValidMobile(String str) {
		// ////System.out.print("Mobile--"+str);
		if (str == null || str.length() != 10) {
			return false;
		}
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c))
				return false;
		}
		return true;
	}

	public static int generateRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(2147483647);
		// System.out.println("random Number"+ randomNumber);

		if (randomNumber < 99999) {
			randomNumber += 11111;
		}

		return randomNumber;
	}

	public static String dateFormatconverter(Date date) {
		try {
			if (date != null) {
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				return df.format(date);
			} else {
				return "";
			}
		} catch (Exception e) {
			return "";
		}

	}

	public static boolean isValidTeacherId(String str) {
		if (str == null || str.length() < 1 || str.length() > 9) {
			// ////System.out.print("**INVALID TEACHER ID - UTILITY - ISVALIDTEACHERID **");
			return false;
		}
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) {
				// ////System.out.print("**INVALID TEACHER ID - UTILITY - ISVALIDTEACHERID **");
				return false;
			}

		}
		return true;
	}

	public static boolean isValidStateId(String stateId) {
		if (stateId == null || stateId.length() != 2) {
			// ////System.out.print("** INVALID STATE ID **");
			return false;
		}
		for (char c : stateId.toCharArray()) {
			if (!Character.isDigit(c)) {
				// ////System.out.print("** INVALID STATE ID **");
				return false;
			}

		}
		return true;
	}

	public static int generateRandomNumber4digit() {
		Random random = new Random();
		int randomNumber = random.nextInt(884711);
		return randomNumber;
	}

	public static String checkNullOrBlank(String param) {
		String value1 = "";
		try {

			if (param.equalsIgnoreCase("null")) {
				value1 = "";
			} else {
				value1 = param;
			}

		} catch (Exception e) {

		}
		return value1;
	}

	public static String checkNullOrBlankOrZero(String param) {
		String value1 = "";
		try {

			if (param == null || param.equalsIgnoreCase("null") || param.equalsIgnoreCase("0")) {
				value1 = "";
			} else {
				value1 = param;
			}

		} catch (Exception e) {

		}
		return value1;
	}

	public static Integer checkNullInteger(Integer param) {
		try {
			if (param == null) {
				param = 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
			param = 0;
		}
		return param;
	}

	public static Integer checkObjectToInteger(Object param) {
		try {
			if (param == null) {
				return 0;
			} else {
				return (Integer) param;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static String checkInteger(Integer param) {
		try {
			if (param == null) {
				return "0";
			} else {
				return param.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
	}

	public static Integer checkIntegerToInt(String param) {
		try {
			if (param == null) {
				return 0;
			} else {
				return Integer.parseInt(param);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static Integer checkNullIntegerByInteger(String param) {
		Integer value1 = null;
		try {
			if (param == null || param.equalsIgnoreCase("null")) {
				value1 = 0;
			} else {
				value1 = Integer.parseInt(param);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value1;
	}

	public static Integer convertNullValueToInteger(String param) {
		Integer value1 = null;
		try {
			if (param == null || param.equalsIgnoreCase("null") || param.trim().equalsIgnoreCase("")
					|| param.isEmpty()) {
				value1 = 0;
			} else {
				value1 = Integer.parseInt(param);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value1;
	}

	public static Integer convertNullIntegerValueToInteger(Integer param) {
		Integer value1 = null;
		try {
			if (param == null) {
				value1 = 0;
			} else {
				value1 = param;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value1;
	}

	public static Integer getCurrentYear() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}

	public static boolean isNumericSchoolId(String str) {
		if (str == null || str.length() < 1 || str.length() > 11) {
			return false;
		}
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c))
				return false;
		}
		return true;
	}

	public static boolean isValidEmailAddress(String email) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		Pattern p = java.util.regex.Pattern.compile(ePattern);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public static boolean isURL(String url) {
		// Assigning the url format regular expression
		// String urlPattern =
		// "^http(s{0,1})://[a-zA-Z0-9_/\\-\\.]+\\.([A-Za-z/]{2,5})[a-zA-Z0-9_/\\&\\?\\=\\-\\.\\~\\%]*";
		String urlPattern = "^(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/|https:\\/\\/)?[a-zA-Z0-9]+([\\-\\.]{1}[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,5}(:[0-9]{1,5})?(\\/.*)?$";
		return url.matches(urlPattern);
	}

	public static boolean isInvalid(Integer str, int start, int end) {
		if (str == null)
			return true;
		else {
			//// ////System.out.print("Converted Integer-"+Integer.parseInt(str));
			if (str < start || str > end) {
				return true;
			} else
				return false;
		}
	}

	public static boolean isAlphaSpace(String name) {
		char[] chars = name.toCharArray();

		for (char c : chars) {
			if (!Character.isLetter(c)) {
				if (!Character.isWhitespace(c)) {
					return false;
				}
			}
		}
		return true;
	}

	public static double twoPricisionFloat(double doubleValue) {
		return Math.round(doubleValue * 100.0) / 100.0;
	}

	public static Integer sumFourDigits(Integer one, Integer two, Integer three, Integer four) {
		Integer sumValue = 0;
		if (one != null)
			sumValue += one;
		if (two != null)
			sumValue += two;
		if (three != null)
			sumValue += three;
		if (four != null)
			sumValue += four;
		return sumValue;
	}

	public static Integer sumFiveDigits(Integer one, Integer two, Integer three, Integer four, Integer five) {
		Integer sumValue = 0;
		if (one != null)
			sumValue += one;
		if (two != null)
			sumValue += two;
		if (three != null)
			sumValue += three;
		if (four != null)
			sumValue += four;
		if (five != null)
			sumValue += five;
		return sumValue;
	}

	public static Integer sumTenDigits(Integer one, Integer two, Integer three, Integer four, Integer five, Integer six,
			Integer seven, Integer eight, Integer nine, Integer ten) {
		Integer sumValue = 0;
		if (one != null)
			sumValue += one;
		if (two != null)
			sumValue += two;
		if (three != null)
			sumValue += three;
		if (four != null)
			sumValue += four;
		if (five != null)
			sumValue += five;
		if (six != null)
			sumValue += six;
		if (seven != null)
			sumValue += seven;
		if (eight != null)
			sumValue += eight;
		if (nine != null)
			sumValue += nine;
		if (ten != null)
			sumValue += ten;
		return sumValue;
	}

	public static Integer sumTenDigitsString(String one, String two, String three, String four, String five, String six,
			String seven, String eight, String nine, String ten) {
		Integer sumValue = 0;
		if (one != null)
			sumValue += Integer.parseInt(one);
		if (two != null)
			sumValue += Integer.parseInt(two);
		if (three != null)
			sumValue += Integer.parseInt(three);
		if (four != null)
			sumValue += Integer.parseInt(four);
		if (five != null)
			sumValue += Integer.parseInt(five);
		if (six != null)
			sumValue += Integer.parseInt(six);
		if (seven != null)
			sumValue += Integer.parseInt(seven);
		if (eight != null)
			sumValue += Integer.parseInt(eight);
		if (nine != null)
			sumValue += Integer.parseInt(nine);
		if (ten != null)
			sumValue += Integer.parseInt(ten);
		return sumValue;
	}

	public static Integer sumThreeDigitsString(String one, String two, String three) {
		Integer sumValue = 0;
		if (one != null)
			sumValue += Integer.parseInt(one);
		if (two != null)
			sumValue += Integer.parseInt(two);
		if (three != null)
			sumValue += Integer.parseInt(three);

		return sumValue;
	}

	public static Integer sumEleDigits(Integer one, Integer two, Integer three, Integer four, Integer five, Integer six,
			Integer seven, Integer eight, Integer nine, Integer ten, Integer eleven, Integer twelve) {
		Integer sumValue = 0;
		if (one != null)
			sumValue += one;
		if (two != null)
			sumValue += two;
		if (three != null)
			sumValue += three;
		if (four != null)
			sumValue += four;
		if (five != null)
			sumValue += five;
		if (six != null)
			sumValue += six;
		if (seven != null)
			sumValue += seven;
		if (eight != null)
			sumValue += eight;
		if (nine != null)
			sumValue += nine;
		if (ten != null)
			sumValue += ten;
		if (eleven != null)
			sumValue += eleven;
		if (twelve != null)
			sumValue += twelve;
		return sumValue;
	}

	public static Integer sumThreeDigits(Integer one, Integer two, Integer three) {
		Integer sumValue = 0;
		if (one != null)
			sumValue += one;
		if (two != null)
			sumValue += two;
		if (three != null)
			sumValue += three;
		return sumValue;
	}

	public static Integer sumTwoDigits(Integer one, Integer two) {
		Integer sumValue = 0;
		if (one != null)
			sumValue += one;
		if (two != null)
			sumValue += two;
		return sumValue;
	}

	public static Integer sumOfInteger(Integer... values) {
		Integer sumOfValue = 0;
		for (Integer value : values) {
			if (value != null)
				sumOfValue += value;
		}
		return sumOfValue;
	}

	public static String sumOfIntegerToString(Integer... values) {
		Integer sumOfValue = 0;
		for (Integer value : values) {
			if (value != null)
				sumOfValue += value;
		}
		return sumOfValue.toString();
	}

	public static Boolean isValidDate(String date) {
		String[] str = date.split("/");
		List<String> month1 = new ArrayList<>();
		month1.add("04");
		month1.add("06");
		month1.add("09");
		month1.add("11");
		Boolean isleapYear = isLeapYear(Integer.parseInt(str[2]));
		if (month1.contains(str[1]) && Integer.parseInt(str[0]) > 30) {
			return false;
		} else if (str[1].equals("02")
				&& ((isleapYear && Integer.parseInt(str[0]) > 29) || (!isleapYear && Integer.parseInt(str[0]) > 28))) {
			return false;
		}
		return true;
	}

	public static Boolean isLeapYear(Integer year) {
		if (year % 400 == 0 || year % 100 == 0 || year % 4 == 0) {
			return true;
		}
		return false;
	}

	public static Boolean isDateInRange(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Boolean flag = false;
		try {
			Date date1 = sdf.parse("31/03/2021");
			Date date2 = sdf.parse(date);
			if (date1.compareTo(date2) >= 0) {
				// System.out.println("Date1 is after Date2");
				flag = true;
			} else {
				flag = false;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return flag;
	}

	public static boolean isTime3to5() {
		DateFormat dateFormat = new SimpleDateFormat("HH");
		Calendar cal = Calendar.getInstance();
		Integer hour = Integer.parseInt(dateFormat.format(cal.getTime()));
		// System.out.println(hour);
		if (hour >= 03 && hour <= 05) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean is_pdf(byte[] data) {
		// String s = new String(data);
		// String d = s.substring(data.length - 7, data.length - 1);
		if (data != null && data.length > 4 && data[0] == 0x25 && // %
				data[1] == 0x50 && // P
				data[2] == 0x44 && // D
				data[3] == 0x46 && // F
				data[4] == 0x2D) { // -

			// version 1.3 file terminator
			/*
			 * if (data[5] == 0x31 && data[6] == 0x2E && data[7] == 0x33 && data[data.length
			 * - 7] == 0x25 && // % data[data.length - 6] == 0x25 && // % data[data.length -
			 * 5] == 0x45 && // E data[data.length - 4] == 0x4F && // O data[data.length -
			 * 3] == 0x46 && // F data[data.length - 2] == 0x20 && // SPACE data[data.length
			 * - 1] == 0x0A) { // EOL return true; }
			 */

			// version 1.4 file terminator
			/*
			 * if (data[5] == 0x31 && data[6] == 0x2E && data[7] == 0x34 && data[data.length
			 * - 6] == 0x25 && // % data[data.length - 5] == 0x25 && // % data[data.length -
			 * 4] == 0x45 && // E data[data.length - 3] == 0x4F && // O data[data.length -
			 * 2] == 0x46 && // F data[data.length - 1] == 0x0A) { // EOL return true; }
			 */
			// if(d.contains("%%EOF")){
			return true;
			// }
			// return true;
		}
		return false;
	}

	public static boolean isHTMLTag(String rawData) {
		String tags[] = new String[] { "<script>", "</script>" };
		boolean status = false;
		try {
			rawData = rawData.toLowerCase();
			for (String tag : tags) {
				status = rawData.toLowerCase().contains(tag);
				if (status)
					break;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return status;
	}

	public static boolean dupMobileNumber(List<String> mobileNoList, List<String> InvalidMobileNo) {
		boolean status = false;
		Set<String> mobileNoSet = null;
		if (mobileNoList != null) {
			mobileNoSet = new HashSet<String>(mobileNoList);
		}
		// Check Duplicate Mobile No.
		if (mobileNoSet.size() == mobileNoList.size()) {
			status = false;
		} else {
			status = true;
		}

		// Check Invalid Mobile No.
		for (String str : mobileNoList) {
			if (InvalidMobileNo.contains(str)) {
				status = true;
			}
		}
		return status;

	}

	public static boolean dupMobileNumberPvtSchool(List<String> mobileNoList, List<String> InvalidMobileNo) {
		boolean status = false;
		Set<String> mobileNoSet = null;
		// Remove of 9999999999
		/*
		 * if (mobileNoList != null) { for (String str : mobileNoList) { if
		 * (str.contains("9999999999")) { mobileNoList.remove("9999999999"); } } }
		 */
		// Get an iterator.
		Iterator<String> ite = mobileNoList.iterator();

		/*
		 * Remove the second value of the list, while iterating over its elements, using
		 * the iterator's remove method.
		 */
		while (ite.hasNext()) {
			String value = ite.next();
			if (value.equals("9999999999"))
				ite.remove();
			else
				System.out.println();
		}

		if (mobileNoList != null) {
			mobileNoSet = new HashSet<String>(mobileNoList);
		}
		// Check Duplicate Mobile No.
		if (mobileNoSet.size() == mobileNoList.size()) {
			status = false;
		} else {
			status = true;
		}

		// Check Invalid Mobile No.
		for (String str : mobileNoList) {
			if (InvalidMobileNo.contains(str)) {
				status = true;
			}
		}
		return status;

	}

	public static LinkedHashMap<String, String> parseClassAndSchoolType(String value) {
		LinkedHashMap<String, String> hashmap = new LinkedHashMap<String, String>();
		LinkedHashMap<String, String> schoolType = new LinkedHashMap<String, String>();
		schoolType.put("B", "Boys");
		schoolType.put("G", "Girls");

		if (value.length() == 2) {
			hashmap.put("CLASS", value.substring(0, 1));
			hashmap.put("SCHOOL_TYPE", schoolType.get(value.substring(1, 2)));
			return hashmap;
		} else if (value.length() == 3) {
			hashmap.put("CLASS", value.substring(0, 2));
			hashmap.put("SCHOOL_TYPE", schoolType.get(value.substring(2, 3)));
			return hashmap;
		}
		return hashmap;
	}
}
