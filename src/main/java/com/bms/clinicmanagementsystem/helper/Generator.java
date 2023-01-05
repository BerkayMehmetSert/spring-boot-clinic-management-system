package com.bms.clinicmanagementsystem.helper;

import com.bms.clinicmanagementsystem.helper.message.BusinessMessage;

import java.util.Random;

public class Generator {
    private Generator() {
        throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
    }

    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final Random RANDOM = new Random();
    private static final StringBuilder CODE = new StringBuilder();
    private static final String URL = "http://localhost:8080/api/v1/documents/";

    public static String generateDocumentInternalId() {

        for (int i = 0; i < 2; i++) {
            CODE.append(UPPER_CASE.charAt(RANDOM.nextInt(UPPER_CASE.length())));
        }

        CODE.append("-");

        for (int i = 0; i < 4; i++) {
            CODE.append(NUMBERS.charAt(RANDOM.nextInt(NUMBERS.length())));
        }

        CODE.append("-");

        for (int i = 0; i < 2; i++) {
            CODE.append(LOWER_CASE.charAt(RANDOM.nextInt(LOWER_CASE.length())));
        }

        return CODE.toString();
    }

    public static String generateUrl(final String id) {
        return URL + id.toLowerCase().replace(" ", "-") + "/pdf";
    }
}
