package com.laborator.proiect.services;

import com.laborator.proiect.model.Receipt;

import java.util.ArrayList;
import java.util.List;

public class ConsultationService implements Service {
    private static ConsultationService ourInstance = new ConsultationService();

    private static List<Receipt> receipts;

    private static ConsultationService getInstance() {
        return ourInstance;
    }

    private ConsultationService() {

        receipts = new ArrayList<Receipt>();
    }


    @Override
    public void saveReceipt(Receipt receipt) {
        receipts.add(receipt);
    }
}
