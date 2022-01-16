package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hospital {
    private List<Patient> patientsList = new ArrayList<>();
    public void addPatient(Patient a) {
        patientsList.add(a);
    }
    public void diagnosisPrint(String diagnosis) {
        System.out.println("Список пациентов, имеющих данный диагноз: ");
        for (Patient p : patientsList) {
            if (p.getDiagnosis().equals(diagnosis)) {
                System.out.println(p.toString());
            }
        }
    }
        List<Patient> getMedicalNumberCardsInterval (int medicalNumberCardsStart, int medicalNumberCardsEnd){
        System.out.println("Список пациентов, номер медицинской карты которых находится в заданном интервале: ");
        List<Patient> list = new ArrayList<>();
        for (Patient p : patientsList) {
            if (p.getMedicalNumberCards() >= medicalNumberCardsStart && p.getMedicalNumberCards() <= medicalNumberCardsEnd) {
                list.add(p);
            }
        }
        return list;
    }
    public void addressPrint (String address) {
        System.out.println("Адресс пациентов: ");
        for (Patient p : patientsList) {
            if (p.getAddress().equals(address)) {
                System.out.println(p.toString());
            }
        }
    }
}
