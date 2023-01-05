package com.bms.clinicmanagementsystem.service;

import com.bms.clinicmanagementsystem.helper.DateHelper;
import com.bms.clinicmanagementsystem.helper.message.BusinessLogMessage;
import com.bms.clinicmanagementsystem.model.PatientCase;
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

    public ByteArrayInputStream generatePdf(final PatientCase patientCase) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document();
        PdfWriter.getInstance(document, out);

        final String title = "Patient Case" + " " + patientCase.getPatient().getFirstName() + " "
                + patientCase.getPatient().getLastName();
        final String fileName = patientCase.getPatient().getFirstName() + "_" + patientCase.getPatient().getLastName()
                + "_" + patientCase.getStartTime() + ".pdf";
        final String content = "Patient Name: " + patientCase.getPatient().getFirstName() + "\n "
                + patientCase.getPatient().getLastName() + "\n"
                + "Patient Case Start Time: " + patientCase.getStartTime() + "\n"
                + "Amount Paid: " + patientCase.getAmountPaid() + "\n"
                + "Total Cost: " + patientCase.getTotalCost();
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

    public ByteArrayInputStream generatePdf(final com.bms.clinicmanagementsystem.model.Document fileDocument) {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document();
        PdfWriter.getInstance(document, out);

        final String title = fileDocument.getDocumentType().getName() + " "
                + fileDocument.getPatient().getFirstName()
                + " " + fileDocument.getPatient().getLastName();
        final String fileName = fileDocument.getPatient().getFirstName() + "_"
                + fileDocument.getPatient().getLastName() + "_"
                + fileDocument.getCreatedTime().toString() + ".pdf";
        final String content = "Patient Name: " + fileDocument.getPatient().getFirstName() + " "
                + fileDocument.getPatient().getLastName() + "\n"
                + "Patient Case Start Time: " + fileDocument.getCreatedTime() + "\n"
                + "Appointment Status: " + fileDocument.getAppointment().getStatus().getName() + "\n"
                + "Department Name: " + fileDocument.getInDepartment().getDepartment().getName() + "\n"
                + "Employee Name: " + fileDocument.getInDepartment().getEmployee().getFirstName() + " "
                + fileDocument.getInDepartment().getEmployee().getLastName();

        final String detailContent = "Detail: " + fileDocument.getDetail();
        final String localTime = DateHelper.getCurrentDateTime().toString();

        Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
        Font contentFont = FontFactory.getFont(FontFactory.HELVETICA, 12);
        Font localTimeFont = FontFactory.getFont(FontFactory.HELVETICA, 8);

        Paragraph titleParagraph = new Paragraph(title, titleFont);
        titleParagraph.setAlignment(Element.ALIGN_CENTER);

        Paragraph contentParagraph = new Paragraph(content, contentFont);

        Paragraph detailParagraph = new Paragraph(detailContent, contentFont);

        Paragraph localTimeParagraph = new Paragraph(localTime, localTimeFont);
        localTimeParagraph.setAlignment(Element.ALIGN_RIGHT);

        document.open();
        document.addTitle(fileName);
        document.addAuthor("BMS");
        document.addCreator("BMS");
        document.add(localTimeParagraph);
        document.add(titleParagraph);
        document.add(contentParagraph);
        document.add(detailParagraph);
        document.setPageSize(PageSize.A4);
        document.close();

        log.info(BusinessLogMessage.Pdf.PDF_GENERATED);
        return new ByteArrayInputStream(out.toByteArray());
    }
}
