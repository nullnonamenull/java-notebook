package com.poleszak.appconsumer.service;

import com.poleszak.appconsumer.model.MessageDTO;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;

@Service
public class ExcelFileService {

    public byte[] createExcelFile(List<MessageDTO> messageDTOs) throws Exception {
        try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            Sheet sheet = workbook.createSheet("Messages");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("ID");
            headerRow.createCell(1).setCellValue("Message");

            int rowIdx = 1;
            for (MessageDTO message : messageDTOs) {
                Row row = sheet.createRow(rowIdx++);
                row.createCell(0).setCellValue(message.id());
                row.createCell(1).setCellValue(message.message());
            }

            workbook.write(out);
            return out.toByteArray();
        }
    }
}
