package com.bms.clinicmanagementsystem.service;

import com.bms.clinicmanagementsystem.helper.DateHelper;
import com.bms.clinicmanagementsystem.helper.message.BusinessLogMessage;
import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.PdfWriter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

@Service
@Slf4j
public class PdfService {

    public ByteArrayInputStream generatePdf(final String firstName,
                                            final String lastName,
                                            final String startTime,
                                            final String totalCost) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document();
        PdfWriter.getInstance(document, out);

        final String title = "Patient Case" + " " + firstName + " " + lastName;
        final String fileName = firstName + "_" + lastName + "_" + startTime + ".pdf";
        final String content = "Patient Name: " + firstName + "\n "
                + lastName + "\n"
                + "Patient Case Start Time: " + startTime + "\n"
                + "Total Cost: " + totalCost;
        final String localTime = DateHelper.getCurrentDateTime().toString();

        Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
        Font contentFont = FontFactory.getFont(FontFactory.HELVETICA, 12);
        Font localTimeFont = FontFactory.getFont(FontFactory.HELVETICA, 8);

        Paragraph titleParagraph = new Paragraph(title, titleFont);
        titleParagraph.setAlignment(Element.ALIGN_CENTER);

        Paragraph contentParagraph = new Paragraph(content, contentFont);

        Paragraph localTimeParagraph = new Paragraph(localTime, localTimeFont);
        localTimeParagraph.setAlignment(Element.ALIGN_RIGHT);

        document.open();
        document.addTitle(fileName);
        document.addAuthor("BMS");
        document.addCreator("BMS");
        document.add(localTimeParagraph);
        document.add(titleParagraph);
        document.add(contentParagraph);
        document.setPageSize(PageSize.A4);
        document.close();

        log.info(BusinessLogMessage.Pdf.PDF_GENERATED);
        return new ByteArrayInputStream(out.toByteArray());
    }
}
