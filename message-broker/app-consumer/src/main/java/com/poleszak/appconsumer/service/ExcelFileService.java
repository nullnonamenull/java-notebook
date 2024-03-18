package com.poleszak.appconsumer.service;

import com.poleszak.appconsumer.model.MessageDTO;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;

@Service
public class ExcelFileService {

    private static final String[] MESSAGE_COLUMN_HEADERS = {"ID", "Message"};

    public byte[] createExcelFile(List<MessageDTO> messageDTOs) {
        try (XSSFWorkbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            Sheet sheet = workbook.createSheet("Messages");
            createMessageHeaderRow(sheet);
            fillMessageDataRows(sheet, messageDTOs);
            autoSizeMessageColumns(sheet);
            workbook.write(out);
            return out.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create the Excel file", e);
        }
    }

    private void createMessageHeaderRow(Sheet sheet) {
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < MESSAGE_COLUMN_HEADERS.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(MESSAGE_COLUMN_HEADERS[i]);
        }
    }

    private void fillMessageDataRows(Sheet sheet, List<MessageDTO> messageDTOs) {
        int rowIdx = 1;
        for (MessageDTO message : messageDTOs) {
            Row row = sheet.createRow(rowIdx++);
            populateMessageDataRow(row, message);
        }
    }

    private void populateMessageDataRow(Row row, MessageDTO message) {
        row.createCell(0).setCellValue(message.id());
        row.createCell(1).setCellValue(message.message());
    }

    private void autoSizeMessageColumns(Sheet sheet) {
        for (int i = 0; i < MESSAGE_COLUMN_HEADERS.length; i++) {
            sheet.autoSizeColumn(i);
        }
    }

}
