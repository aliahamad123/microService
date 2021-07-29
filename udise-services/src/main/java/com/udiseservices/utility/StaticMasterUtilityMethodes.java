package com.udiseservices.utility;

import java.util.HashMap;
import java.util.Map;

public class StaticMasterUtilityMethodes {

	public static String fetchSchoolCategoryDetails(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "1 - Primary";
			break;
		case "2":
			retValu = "2 - Primary with Upper Primary";
			break;
		case "3":
			retValu = "3 - Pr. with Up.Pr. sec. and H.Sec.";
			break;
		case "4":
			retValu = "4 - Upper Primary only";
			break;
		case "5":
			retValu = "5 - Up. Pr. Secondary and Higher Sec";
			break;
		case "6":
			retValu = "6 - Pr. Up Pr. and Secondary Only";
			break;
		case "7":
			retValu = "7 - Upper Pr. and Secondary";
			break;
		case "8":
			retValu = "8 - Secondary Only";
			break;
		case "10":
			retValu = "10 - Secondary with Higher Secondary";
			break;
		case "11":
			retValu = "11 - Higher Secondary only/Jr. College";
			break;
		default:
			retValu = "WRONG CODE";
			break;
		}
		return retValu;
	}

	public static String fetchTMinSchType(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "1-Muslim";
			break;
		case "2":
			retValu = "2-Sikh";
			break;
		case "3":
			retValu = "3-Jain";
			break;
		case "4":
			retValu = "4-Christian";
			break;
		case "5":
			retValu = "5-Parsi";
			break;
		case "6":
			retValu = "6-Budhist";
			break;
		case "7":
			retValu = "7-Others";
			break;
		case "8":
			retValu = "8-Linguistic Minority";
			break;
		default:
			break;
		}
		return retValu;
	}
	
	public static String fetchEnrolByCwsn(String id) {
		String retValue = "";
		switch (id) {
		case "1":
			retValue = "Blindness";
			break;
		case "2":
			retValue = "Low Vision";
			break;
		case "3":
			retValue = "Hearing impairment";
			break;
		case "4":
			retValue = "Speech and Language";
			break;
		case "5":
			retValue = "Locomotor Disability";
			break;
		case "6":
			retValue = "Mental illness";
			break;
		case "7":
			retValue = "Specific Learning Disabilities";
			break;
		case "8":
			retValue = "Cerabral palsy";
			break;
		case "9":
			retValue = "Autism Spectrum Disorder";
			break;
		case "10":
			retValue = "Multiple Disability including\r\n"
					+ "deaf, blindness";
			break;
		case "11":
			retValue = "Leprosy Cured students";
			break;
		case "12":
			retValue = "Dwarfism";
			break;
		case "13":
			retValue = "Intellectual Disability";
			break;
		case "14":
			retValue = "Muscular Dystrophy";
			break;
		case "15":
			retValue = "Chronic Neurological cond";
			break;
		case "16":
			retValue = "Multiple Sclerosis";
			break;
		case "17":
			retValue = "Thalassemia";
			break;
		case "18":
			retValue = "Hemophilia";
			break;
		case "19":
			retValue = "Sickle Cell disease";
			break;
		case "20":
			retValue = "Acid Attack victim";
			break;
		case "21":
			retValue = "Parkinson's disease";
			break;
		}
		return retValue;
			
	}
	
	
	
	public static String fetchEnrolReptrByAcademicStream (String id) {
		String retValue = "";
		switch (id) {
		case "1":
			retValue = "General";
			break;
		case "2":
			retValue = "SC";
			break;
		case "3":
			retValue = "ST";
			break;
		case "4":
			retValue = "OBC";
			break;
		case "5":
			retValue = "Muslim";
			break;
		case "6":
			retValue = "Christian";
			break;
		case "7":
			retValue = "Sikh";
			break;
		case "8":
			retValue = "Buddhist";
			break;
		case "9":
			retValue = "Parsi";
			break;
		case "10":
			retValue = "Jain";
			break;
		case "11":
			retValue = "Other";
			break;
		case "111":
			retValue = "Arts";
			break;
		case "112":
			retValue = "Science";
			break;
		case "113":
			retValue = "Commerce";
			break;
		case "114":
			retValue = "Vocational";
			break;
		case "115":
			retValue = "Other streams";
			break;
		}
		return retValue;
	}
	
	public static String fetchTMinSchTypeWthtCode(String id) {
		String retValu = "";
		switch (id) {
		case "5":
			retValu = "Muslim";
			break;
		case "6":
			retValu = "Sikh";
			break;
		case "7":
			retValu = "Jain";
			break;
		case "8":
			retValu = "Christian";
			break;
		case "9":
			retValu = "Parsi";
			break;
		case "10":
			retValu = "Budhist";
			break;
		case "11":
			retValu = "Others";
			break;
		case "12":
			retValu = "Linguistic Minority";
			break;
		default:
			break;
		}
		return retValu;
	}
	

	public static String fetchClassTaughtData(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "1-Primary only";
			break;
		case "2":
			retValu = "2-Upper primary pnly";
			break;
		case "3":
			retValu = "3-Primary and Upper primary";
			break;
		case "5":
			retValu = "4-Secondary only";
			break;
		case "6":
			retValu = "6-Higher Secondary only";
			break;
		case "7":
			retValu = "7-Upper primary and Secondary";
			break;
		case "8":
			retValu = "8-Secondary and Higher secondary";
			break;
		default:
			break;
		}
		return retValu;
	}

	public static String fetchDisableData(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "Not Applicable";
			break;
		case "2":
			retValu = "Loco motor";
			break;
		case "3":
			retValu = "Visual";
			break;
		case "4":
			retValu = "Others";
			break;
		case "5":
			retValu = "Hearing Impaired";
			break;

		default:
			break;
		}
		return id + "-" + retValu;
	}

	public static String fetchProfQualiData(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "Diploma or certificate in basic teacher training of a duration not less than two years";
			break;
		case "2":
			retValu = "Bachelor of Elementary Education(B.El.Ed.)";
			break;
		case "3":
			retValu = "B.Ed. or equivalent";
			break;
		case "4":
			retValu = "M.Ed. or equivalent";
			break;
		case "5":
			retValu = "Others";
			break;
		case "6":
			retValu = "None";
			break;
		case "7":
			retValu = "Diploma/degree in speical education";
			break;
		case "8":
			retValu = "Pursuing any relevant professional course";
			break;
		case "51":
			retValu = "Pursuing any relevant professional course";
			break;
		case "52":
			retValu = "Pursuing any relevant professional course";
			break;
		case "53":
			retValu = "Pursuing any relevant professional course";
			break;
		default:
			break;
		}
		return id + "-" + retValu;
	}

	public static String fetchAcadmicQualiData(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "1-Below secondary";
			break;
		case "2":
			retValu = "2-Secondary";
			break;
		case "3":
			retValu = "3-Higher Secondary";
			break;
		case "4":
			retValu = "4-Graduate";
			break;
		case "5":
			retValu = "5-Post graduate";
			break;
		case "6":
			retValu = "6-M.Phil.";
			break;
		case "7":
			retValu = "7-Ph.D.";
			break;
		case "8":
			retValu = "8-Post Doctoral";
			break;
		default:
			break;
		}
		return retValu;
	}

	public static String fetchSocailCategoryData(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "1-General";
			break;
		case "2":
			retValu = "2-SC";
			break;
		case "3":
			retValu = "3-ST";
			break;
		case "4":
			retValu = "4-OBC";
			break;
		case "5":
			retValu = "5-ORC";
			break;
		case "6":
			retValu = "6-Others";
			break;
		default:
			break;
		}
		return retValu;
	}
	
	public static String fetchSocailCategoryDataWthtCode(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "General";
			break;
		case "2":
			retValu = "SC";
			break;
		case "3":
			retValu = "ST";
			break;
		case "4":
			retValu = "OBC";
			break;
		case "5":
			retValu = "ORC";
			break;
		case "6":
			retValu = "Others";
			break;
		default:
			break;
		}
		return retValu;
	}

	public static String fetchGenderData(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "Male";
			break;
		case "2":
			retValu = "Female";
			break;

		default:
			break;
		}
		return id + "-" + retValu;
	}

	public static String fetchNatureAppointData(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "Regular";
			break;
		case "2":
			retValu = "Contract";
			break;
		case "3":
			retValu = " Guest Faculty /Part-Time";
			break;
		case "11":
			retValu = "Through VTP";
			break;
		default:
			break;
		}
		return id + "-" + retValu;
	}

	public static String fetchMediumAvailability(String id) {
		Map<String, String> mediumMap = new HashMap<String, String>();
		mediumMap.put("1", "01-Assamese");
		mediumMap.put("2", "02-Bengali");
		mediumMap.put("3", "03-Gujarati");
		mediumMap.put("4", "04-Hindi");
		mediumMap.put("5", "05-Kannada");
		mediumMap.put("6", "06-Kashmiri");
		mediumMap.put("7", "07-Konkani");
		mediumMap.put("8", "8-Malayalam");
		mediumMap.put("9", "9-Manipuri");
		mediumMap.put("10", "10-Marathi");
		mediumMap.put("11", "11-Nepali");
		mediumMap.put("12", "12-Odia");
		mediumMap.put("13", "13-Punjabi");
		mediumMap.put("14", "14-Sanskrit");
		mediumMap.put("15", "15-Sindhi");
		mediumMap.put("16", "16-Tamil");
		mediumMap.put("17", "17-Telugu");
		mediumMap.put("18", "18-Urdu");
		mediumMap.put("19", "19-English");
		mediumMap.put("20", "20-Bodo");
		mediumMap.put("22", "22-Dogri");
		mediumMap.put("23", "23-Khasi");
		mediumMap.put("24", "24-Garo");
		mediumMap.put("25", "25-Mizo");
		mediumMap.put("26", "26-Bhutia");
		mediumMap.put("27", "27-Lepcha");
		mediumMap.put("28", "28-Limboo");
		mediumMap.put("29", "29-French");
		mediumMap.put("39", "39-Santhali");
		mediumMap.put("51", "51-Maithali");
		mediumMap.put("99", "99-Other languages");
		mediumMap.put("98", "99-Other languages");
		mediumMap.put("0", "");
		if (id != null) {
			return mediumMap.get(id);
		}

		return "";
	}

	public static String fetchMediumAvailabilityWthtCode(String id) {
		Map<String, String> mediumMap = new HashMap<String, String>();
		mediumMap.put("1", "Assamese");
		mediumMap.put("2", "Bengali");
		mediumMap.put("3", "Gujarati");
		mediumMap.put("4", "Hindi");
		mediumMap.put("5", "Kannada");
		mediumMap.put("6", "Kashmiri");
		mediumMap.put("7", "Konkani");
		mediumMap.put("8", "Malayalam");
		mediumMap.put("9", "Manipuri");
		mediumMap.put("10", "Marathi");
		mediumMap.put("11", "Nepali");
		mediumMap.put("12", "Odia");
		mediumMap.put("13", "Punjabi");
		mediumMap.put("14", "Sanskrit");
		mediumMap.put("15", "Sindhi");
		mediumMap.put("16", "Tamil");
		mediumMap.put("17", "Telugu");
		mediumMap.put("18", "Urdu");
		mediumMap.put("19", "English");
		mediumMap.put("20", "Bodo");
		mediumMap.put("22", "Dogri");
		mediumMap.put("23", "Khasi");
		mediumMap.put("24", "Garo");
		mediumMap.put("25", "Mizo");
		mediumMap.put("26", "Bhutia");
		mediumMap.put("27", "Lepcha");
		mediumMap.put("28", "Limboo");
		mediumMap.put("29", "French");
		mediumMap.put("39", "Santhali");
		mediumMap.put("51", "Maithali");
		mediumMap.put("99", "Other languages");
		mediumMap.put("98", "Other languages");
		mediumMap.put("0", "");
		if (id != null) {
			return mediumMap.get(id);
		}

		return "";
	}

	public static String fetchLanuageAvailability(String id) {

		Map<String, String> mediumMap = new HashMap<String, String>();
		mediumMap.put("1", "01-Assamese");
		mediumMap.put("2", "02-Bengali");
		mediumMap.put("3", "03-Gujarati");
		mediumMap.put("4", "04-Hindi");
		mediumMap.put("5", "05-Kannada");
		mediumMap.put("6", "06-Kashmiri");
		mediumMap.put("7", "07-Konkani");
		mediumMap.put("8", "8-Malayalam");
		mediumMap.put("9", "9-Manipuri");
		mediumMap.put("10", "10-Marathi");
		mediumMap.put("11", "11-Nepali");
		mediumMap.put("12", "12-Odia");
		mediumMap.put("13", "13-Punjabi");
		mediumMap.put("14", "14-Sanskrit");
		mediumMap.put("15", "15-Sindhi");
		mediumMap.put("16", "16-Tamil");
		mediumMap.put("17", "17-Telugu");
		mediumMap.put("18", "18-Urdu");
		mediumMap.put("19", "19-English");
		mediumMap.put("20", "20-Bodo");
		mediumMap.put("22", "22-Dogri");
		mediumMap.put("23", "23-Khasi");
		mediumMap.put("24", "24-Garo");
		mediumMap.put("25", "25-Mizo");
		mediumMap.put("26", "26-Bhutia");
		mediumMap.put("27", "27-Lepcha");
		mediumMap.put("28", "28-Limboo");
		mediumMap.put("29", "29-French");
		mediumMap.put("30", "99-Others");
		mediumMap.put("41", "41-Angami");
		mediumMap.put("42", "42-Ao");
		mediumMap.put("43", "43-Arabic");
		mediumMap.put("44", "44-Bhoti");
		mediumMap.put("45", "45-Bodhi");
		mediumMap.put("46", "46-German");
		mediumMap.put("47", "47-Kakbarak");
		mediumMap.put("48", "48-Konyak");
		mediumMap.put("49", "49-Laddakhi");
		mediumMap.put("50", "50-Lotha");
		mediumMap.put("51", "51-Maithili");

		mediumMap.put("52", "52-Nicobaree");
		mediumMap.put("53", "53-Odia(lower)");
		mediumMap.put("54", "54-Persian");
		mediumMap.put("55", "55-Portuguese");
		mediumMap.put("56", "56-Rajasthani");
		mediumMap.put("57", "57-Russian");

		mediumMap.put("58", "58-Sema");
		mediumMap.put("59", "59-Spanish");
		mediumMap.put("60", "60-Tibetan");
		mediumMap.put("61", "61-Zeliang");
		mediumMap.put("98", "99-Others");
		mediumMap.put("99", "99-Others");
		mediumMap.put("0", "");
		if (id != null) {
			return mediumMap.get(id);

		}
		return "";
	}

	public static String fetchSchoolLocation(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "1-Rural";
			break;
		case "2":
			retValu = "2-Urban";
			break;
		default:
			retValu = "Not Defined";
			break;
		}
		return retValu;
	}

	public static String checkResComLabPlayGCWSNYesNo(Integer id) {
		String retValu = "";
		if (id != null) {
			if (id == 1) {
				retValu = "1-Yes";
			} else if (id == 2) {
				retValu = "2-No";
			} else {
				retValu = "NA";
			}
		}

		return retValu;
	}

	public static String checkIctModelImp(String id) {
		String retValu = "";
		if (id != null) {
			if (id.equals("1")) {
				retValu = "1-BOOT Model";
			} else if (id.equals("2")) {
				retValu = "2-BOO Model";
			} else if (id.equals("3")) {
				retValu = "3-Other";
			} else {
				retValu = "NA";
			}
		}

		return retValu;
	}

	public static String checkIctInstraction(String id) {
		String retValu = "";
		if (id != null) {
			if (id.equals("1")) {
				retValu = "1-Full Time";
			} else if (id.equals("2")) {
				retValu = "2-Part Time";
			} else if (id.equals("3")) {
				retValu = "3-Not Available";
			} else {
				retValu = "NA";
			}
		}

		return retValu;
	}

	public static String checkResComLabPlayGCWSNYesNo(String id) {
		String retValu = "";
		if (id != null) {
			if (id.equals("1")) {
				retValu = "1-Yes";
			} else if (id.equals("2")) {
				retValu = "2-No";
			} else {
				retValu = "NA";
			}
		}

		return retValu;
	}

	public static String checkStringNullToZero(String value) {
		if (value == null || value.equals("NULL") || value.equals("null")) {
			return "0";
		} else {
			return value;
		}
	}

	public static String fetchSchType(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "1-Boys";
			break;
		case "2":
			retValu = "2-Girls";
			break;
		case "3":
			retValu = "3-Co-educational";
			break;
		default:
			retValu = "";
			break;
		}
		return retValu;
	}

	public static String fetchSchlBuilStatus(String id) {
		String retValu = "";
		switch (id) {
		case "1":
			retValu = "1-Private";
			break;
		case "2":
			retValu = "2-Rented";
			break;
		case "3":
			retValu = "3-Government";
			break;
		case "4":
			retValu = "4-Govt. school in rent free building";
			break;
		case "5":
			retValu = "5-No building";
			break;
		case "6":
			retValu = "6-Dilapidated";
			break;
		case "7":
			retValu = "7-Under-Construction";
			break;
		case "10":
			retValu = "10-School running in other Department Building";
			break;
		}
		return retValu;
	}

	public static String fetchBundryWall(String Id) {

		String retValue = "";
		switch (Id) {
		case "1":
			retValue = "1-Pucca";
			break;
		case "2":
			retValue = "2-Pucca but broken";
			break;
		case "3":
			retValue = "3-Barbed wire fencing";
			break;
		case "4":
			retValue = "4-Hedges";
			break;
		case "5":
			retValue = "5-No boundary walls";
			break;
		case "6":
			retValue = "6-Others";
			break;
		case "7":
			retValue = "7-Partial";
			break;
		case "8":
			retValue = "8-Under Construction";
			break;
		default:
			retValue = "";
			break;
		}

		return retValue;
	}
	
	public static String nullCheckString(String value) {
		if (value != null && value != "NULL") {
			return value;
		}
		return "";
	}

}
