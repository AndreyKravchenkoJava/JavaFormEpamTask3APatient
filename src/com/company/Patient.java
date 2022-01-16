package com.company;

public class Patient {
    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int id = idGenerator;
    private String name;
    private String name2;
    private String name3;
    private String address;
    private int phoneNumbers;
    private int medicalNumberCards;
    private String diagnosis;

    Patient (String name, String name2, String name3, String address, int phoneNumbers, int medicalNumberCards, String diagnosis) {
        this.name = name;
        this.name2 = name2;
        this.name3 = name3;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
        this.medicalNumberCards = medicalNumberCards;
        this.diagnosis = diagnosis;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getname2() {
        return name2;
    }
    public void setName2(String name2) {
        this.name2 = name2;
    }
    public String getName3() {
        return name3;
    }
    public void setName3(String name3) {
        this.name3 = name3;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhoneNumbers() {
        return phoneNumbers;
    }
    public void setPhoneNumbers(int phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    public int getMedicalNumberCards() {
        return medicalNumberCards;
    }
    public void setMedicalNumberCards(int medicalNumberCards) {
        this.medicalNumberCards = medicalNumberCards;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public String toString() {
        return "Patient {" + " id " + id + ", name " + name + '\'' + ", name2 " + name2 + '\'' + ", name3 " + name3 + '\'' + ", address " + address + '\''
                + ", phoneNumbers " + phoneNumbers + '\'' + ", medicalNumbersCard " + medicalNumberCards + '\'' + ", diagnose " + diagnosis + "}";
    }
    public String fullName() {
        return name + " " + name2 + " " + name3;
    }
}
