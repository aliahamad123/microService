package com.ms.utitlity;

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

}
