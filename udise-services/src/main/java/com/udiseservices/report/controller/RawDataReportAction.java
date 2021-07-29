package com.udiseservices.report.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udiseservices.beans.RawSchoolEnrolment;
import com.udiseservices.outerServices.ReportOuterService;
import com.udiseservices.reports.models.RowProfileOne;
import com.udiseservices.servicesImpl.BlockLevelReportService;
import com.udiseservices.utility.StaticMasterUtilityMethodes;

@RestController
public class RawDataReportAction {

	private String fileName;
	@Autowired
	BlockLevelReportService blockLevelReportService;
	@Autowired
	ReportOuterService reportOuterService;

	@GetMapping(value = "/downloadspreadsheet")
	public ResponseEntity<InputStreamResource> downloadSpreadsheets() throws ParseException {

		System.out.println("Ali");
		Integer schoolId = 3100199;
		System.out.println("Dowunload Sheet ");

		this.fileName = "BlockWise_Comparison.xlsx";
		// InputStreamResource file= new InputStreamResource(load());
		// RowProfileOne report = blockLevelReportService.getRawProfileData("3100199");

		Optional<RawSchoolEnrolment> rawSchoolEnrolment = reportOuterService.getExcelReportBySchoolId(schoolId);
		// ByteArrayInputStream byteArrayInputStream = generateExcel(report);
		ByteArrayInputStream byteArrayInputStream = generateEnrolmentExcel(rawSchoolEnrolment);
		// InputStreamResource file = new InputStreamResource(byteArrayInputStream);
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=product.xlsx")
				.contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
				.body(new InputStreamResource(byteArrayInputStream));

	}

	private ByteArrayInputStream generateEnrolmentExcel(Optional<RawSchoolEnrolment> report) {

		this.fileName = "BlockWise_Comparison.xlsx";
		SXSSFWorkbook workbook = new SXSSFWorkbook();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Integer rowNumber = 0;
			Font font = workbook.createFont();
			font.setColor(HSSFColor.BLACK.index);
			font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			Sheet sheet = workbook.createSheet("Sheet 1");
			CellStyle cellStyle = cellStyle2(workbook, font);
			CellStyle cellStyle3 = cellStyle3(workbook, font);
			CellStyle leftText = leftText(workbook);
			CellStyle centerText = centerText(workbook);
			String dateAsOn = "";

			/*
			 * if (report != null && report.size() >= 1) {
			 * 
			 * Date date = new Date(); dateAsOn = ", Report As on " +
			 * UtilityMethodes.formatDate(date, dateFormatter); }
			 */

			Row hssfRow = sheet.createRow(rowNumber);
			Cell hssfCell = hssfRow.createCell(0);
			hssfCell.setCellValue("Block Wise Comparison" + dateAsOn);
			hssfCell.setCellStyle(cellStyle3);


			String header[] = { "udiseSchCode", "AcYear", "stateCode", "districtCode", "blockCode","schType", "stateId",
					"districtId", "blockId", "schoolId", "schoolName", "schCategoryId", "schMgmtId", "totBoysC0",
					"totGirlsC0", "totBoysC1", "totGirlsC1", "totBoysC2", "totGirlsC2", "totBoysC3", "totGirlsC3",
					"totBoysC4", "totGirlsC4", "totBoysC5", "totGirlsC5", "totBoysC6", "totGirlsC6", "totBoysC7",
					"totGirlsC7", "totBoysC8", "totGirlsC8", "totBoysC9", "totGirlsC9", "totBoysC10", "totGirlsC10",
					"totBoysC11", "totGirlsC11", "totBoysC12", "totGirlsC12" };

			hssfRow = sheet.createRow(++rowNumber);
			for (int i = 0; i < header.length; i++) {
				hssfCell = hssfRow.createCell(i);
				hssfCell.setCellValue(header[i]);
				hssfCell.setCellStyle(cellStyle);
			}
			for (int i = 2; i <= header.length; i++) {
				sheet.autoSizeColumn((short) i);
			}
			if (report != null) {

				Integer cellNumber = 0;
				hssfRow = sheet.createRow(++rowNumber);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().udiseSchCode);
				hssfCell.setCellStyle(centerText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().Acyear);
				hssfCell.setCellStyle(centerText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().stateCd);
				hssfCell.setCellStyle(centerText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().districtCd);
				hssfCell.setCellStyle(centerText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().blockCd);
				hssfCell.setCellStyle(centerText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().schType);
				hssfCell.setCellStyle(centerText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().stateId);
				hssfCell.setCellStyle(centerText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().districtId);
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().blockId);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().schoolId);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().schoolName);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().schCategoryId);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().schMgmtId);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC0);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC0);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC1);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC1);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC2);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC2);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC3);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC3);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC4);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC4);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC5);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC5);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC6);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC6);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC7);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC7);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC8);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC8);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC9);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC9);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC10);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC10);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC11);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC11);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totBoysC12);
				hssfCell.setCellStyle(leftText);
				
				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.get().totGirlsC12);
				hssfCell.setCellStyle(leftText);
				
			}

			sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, header.length - 1));
			sheet.autoSizeColumn((short) 0);
			sheet.autoSizeColumn((short) 1);
			workbook.write(byteArrayOutputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

	}

	private ByteArrayInputStream generateExcel(RowProfileOne report) {

		this.fileName = "BlockWise_Comparison.xlsx";
		SXSSFWorkbook workbook = new SXSSFWorkbook();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Integer rowNumber = 0;
			Font font = workbook.createFont();
			font.setColor(HSSFColor.BLACK.index);
			font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			Sheet sheet = workbook.createSheet("Sheet 1");
			CellStyle cellStyle = cellStyle2(workbook, font);
			CellStyle cellStyle3 = cellStyle3(workbook, font);
			CellStyle leftText = leftText(workbook);
			CellStyle centerText = centerText(workbook);
			String dateAsOn = "";

			/*
			 * if (report != null && report.size() >= 1) {
			 * 
			 * Date date = new Date(); dateAsOn = ", Report As on " +
			 * UtilityMethodes.formatDate(date, dateFormatter); }
			 */

			Row hssfRow = sheet.createRow(rowNumber);
			Cell hssfCell = hssfRow.createCell(0);
			hssfCell.setCellValue("Block Wise Comparison" + dateAsOn);
			hssfCell.setCellStyle(cellStyle3);

			String header[] = { "stateId", "districtId", "blockId", "clusterId", "schoolId", "stateCode",
					"districtCode", "blockCode", "blockName", "villageCode", "villageName", "clusterCode",
					"clusterName", "schoolName", "udiseSchCode", "schCategoryId", "schMgmtId", "schLocation", "schType",
					"classFrm", "classTo", "latitude", "longitude", "habCode", "habName", "panCode", "panName",
					"eduBlockCode", "eduBlockName", "assemblyCode", "assemblyName", "parlCode", "parl_name",
					"munici_cd", "munici_name", "cityCode", "cityName", "address", "respName", "mobile", "parl_name" };

			hssfRow = sheet.createRow(++rowNumber);
			for (int i = 0; i < header.length; i++) {
				hssfCell = hssfRow.createCell(i);
				hssfCell.setCellValue(header[i]);
				hssfCell.setCellStyle(cellStyle);
			}
			for (int i = 2; i <= header.length; i++) {
				sheet.autoSizeColumn((short) i);
			}
			if (report != null) {

				Integer cellNumber = 0;
				hssfRow = sheet.createRow(++rowNumber);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.stateId));
				hssfCell.setCellStyle(centerText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(report.districtId);
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.blockId));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.clusterId));
				hssfCell.setCellStyle(centerText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.schoolId));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.stateCd));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.districtCd));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.blockCd));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.blockName));
				hssfCell.setCellStyle(centerText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.villageCd));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.villageName));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.clusterCd));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.clusterName));
				hssfCell.setCellStyle(centerText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.schoolName));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.udiseSchCode));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.schCategoryId));
				hssfCell.setCellStyle(centerText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.schMgmtId));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.schLocation));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.schType));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.classFrm));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.classTo));
				hssfCell.setCellStyle(centerText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.latitude));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.longitude));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.habCd));
				hssfCell.setCellStyle(centerText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.habName));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.panCd));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.panName));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.eduBlockCd));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.eduBlockName));
				hssfCell.setCellStyle(centerText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.assemblyCd));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.assemblyName));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.parlCd));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.parlName));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.municiCd));
				hssfCell.setCellStyle(centerText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.municiName));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.cityCd));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.cityName));
				hssfCell.setCellStyle(centerText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.address));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.respName));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.mobile));
				hssfCell.setCellStyle(leftText);

				hssfCell = hssfRow.createCell(cellNumber++);
				hssfCell.setCellValue(StaticMasterUtilityMethodes.nullCheckString(report.parlName));
				hssfCell.setCellStyle(leftText);

			}

			sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, header.length - 1));
			sheet.autoSizeColumn((short) 0);
			sheet.autoSizeColumn((short) 1);
			workbook.write(byteArrayOutputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

	}

	public static CellStyle cellStyle(SXSSFWorkbook workbook) {
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setAlignment(CellStyle.ALIGN_RIGHT);
		cellStyle.setBorderBottom(CellStyle.BORDER_THIN);
		cellStyle.setBottomBorderColor(HSSFColor.BLACK.index);
		cellStyle.setBorderLeft(CellStyle.BORDER_THIN);
		cellStyle.setLeftBorderColor(HSSFColor.BLACK.index);
		cellStyle.setBorderRight(CellStyle.BORDER_THIN);
		cellStyle.setRightBorderColor(HSSFColor.BLACK.index);
		cellStyle.setBorderTop(CellStyle.BORDER_THIN);
		cellStyle.setTopBorderColor(HSSFColor.BLACK.index);
		return cellStyle;
	}

	public static CellStyle cellStyle2(SXSSFWorkbook workbook, Font font) {
		CellStyle cellStyle2 = workbook.createCellStyle();
		cellStyle2.setAlignment(CellStyle.ALIGN_CENTER);
		cellStyle2.setFillForegroundColor(HSSFColor.AQUA.index);
		cellStyle2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		cellStyle2.setBorderBottom(CellStyle.BORDER_THIN);
		cellStyle2.setBottomBorderColor(HSSFColor.BLACK.index);
		cellStyle2.setBorderLeft(CellStyle.BORDER_THIN);
		cellStyle2.setLeftBorderColor(HSSFColor.BLACK.index);
		cellStyle2.setBorderRight(CellStyle.BORDER_THIN);
		cellStyle2.setRightBorderColor(HSSFColor.BLACK.index);
		cellStyle2.setBorderTop(CellStyle.BORDER_THIN);
		cellStyle2.setTopBorderColor(HSSFColor.BLACK.index);
		cellStyle2.setFont(font);
		return cellStyle2;
	}

	public static CellStyle cellStyle3(SXSSFWorkbook workbook, Font font) {
		CellStyle cellStyle3 = workbook.createCellStyle();
		cellStyle3.setAlignment(CellStyle.ALIGN_LEFT);
		cellStyle3.setFillForegroundColor(HSSFColor.AQUA.index);
		cellStyle3.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		cellStyle3.setBorderBottom(CellStyle.BORDER_THIN);
		cellStyle3.setBottomBorderColor(HSSFColor.BLACK.index);
		cellStyle3.setBorderLeft(CellStyle.BORDER_THIN);
		cellStyle3.setLeftBorderColor(HSSFColor.BLACK.index);
		cellStyle3.setBorderRight(CellStyle.BORDER_THIN);
		cellStyle3.setRightBorderColor(HSSFColor.BLACK.index);
		cellStyle3.setBorderTop(CellStyle.BORDER_THIN);
		cellStyle3.setTopBorderColor(HSSFColor.BLACK.index);
		cellStyle3.setFont(font);
		return cellStyle3;
	}

	public static CellStyle leftText(SXSSFWorkbook workbook) {
		CellStyle leftText = workbook.createCellStyle();
		leftText.setAlignment(CellStyle.ALIGN_LEFT);
		leftText.setBorderBottom(CellStyle.BORDER_THIN);
		leftText.setBottomBorderColor(HSSFColor.BLACK.index);
		leftText.setBorderLeft(CellStyle.BORDER_THIN);
		leftText.setLeftBorderColor(HSSFColor.BLACK.index);
		leftText.setBorderRight(CellStyle.BORDER_THIN);
		leftText.setRightBorderColor(HSSFColor.BLACK.index);
		leftText.setBorderTop(CellStyle.BORDER_THIN);
		leftText.setTopBorderColor(HSSFColor.BLACK.index);
		return leftText;
	}

	public static CellStyle leftTextDate(SXSSFWorkbook workbook) {
		CellStyle leftText = workbook.createCellStyle();
		CreationHelper creationHelper = workbook.getCreationHelper();
		leftText.setDataFormat(creationHelper.createDataFormat().getFormat("dd-mm-yyyy"));
		leftText.setAlignment(CellStyle.ALIGN_LEFT);
		leftText.setBorderBottom(CellStyle.BORDER_THIN);
		leftText.setBottomBorderColor(HSSFColor.BLACK.index);
		leftText.setBorderLeft(CellStyle.BORDER_THIN);
		leftText.setLeftBorderColor(HSSFColor.BLACK.index);
		leftText.setBorderRight(CellStyle.BORDER_THIN);
		leftText.setRightBorderColor(HSSFColor.BLACK.index);
		leftText.setBorderTop(CellStyle.BORDER_THIN);
		leftText.setTopBorderColor(HSSFColor.BLACK.index);
		return leftText;
	}

	public static CellStyle centerText(SXSSFWorkbook workbook) {
		CellStyle centerText = workbook.createCellStyle();
		centerText.setAlignment(CellStyle.ALIGN_CENTER);
		centerText.setFillForegroundColor(HSSFColor.AQUA.index);
		centerText.setBorderBottom(CellStyle.BORDER_THIN);
		centerText.setBottomBorderColor(HSSFColor.BLACK.index);
		centerText.setBorderLeft(CellStyle.BORDER_THIN);
		centerText.setLeftBorderColor(HSSFColor.BLACK.index);
		centerText.setBorderRight(CellStyle.BORDER_THIN);
		centerText.setRightBorderColor(HSSFColor.BLACK.index);
		centerText.setBorderTop(CellStyle.BORDER_THIN);
		centerText.setTopBorderColor(HSSFColor.BLACK.index);
		return centerText;
	}

}
