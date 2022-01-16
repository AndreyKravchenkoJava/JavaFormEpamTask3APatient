package com.company;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Patient p1 = new Patient("Виталий", "Евгеньевич", "Шевченко", "Тополь", 0506164774, 12345, "Грип");
        Patient p2 = new Patient("Евгений", "Олегович", "Кравченко", "Слобожанское", 0506644544, 2345, "Отравление");
        Patient p3 = new Patient("Дарья", "Игоревна", "Сидоренко", "Индустриальный", 0503452774, 34567, "Грип");
        Patient p4 = new Patient("Андрей", "Сергеевич", "Колягин", "Тополь", 0534446774, 99999, "Рак");
        Patient p5 = new Patient("Иван", "Валерьевич", "Потапенко", "Центральный", 0506164641, 89899, "Рак");
        Patient p6 = new Patient("Виталий", "Евгеньевич", "Шевченко", "Тополь", 0506164774, 12345, "Отравление");
        Patient p7 = new Patient("Наталья", "Юрьевна", "Правда", "Слобожанское", 0506433572, 56784, "Гипертония");
        Patient p8 = new Patient("Кирилл", "Олександрович", "Зенчинко", "Тополь", 0505564774, 12345, "Гипертония");
        Patient p9 = new Patient("Олег", "Евгеньевич", "Жигалов", "Тополь", 0506144474, 12345, "Рак");
        Patient p10 = new Patient("Владимир", "Андреевич", "Шмалько", "Тополь", 0506636474, 12345, "Рак");

        Hospital newList = new Hospital();
        newList.addPatient(p1);
        newList.addPatient(p2);
        newList.addPatient(p3);
        newList.addPatient(p4);
        newList.addPatient(p5);
        newList.addPatient(p6);
        newList.addPatient(p7);
        newList.addPatient(p8);
        newList.addPatient(p9);
        newList.addPatient(p10);
        newList.diagnosisPrint("Гипертония");
        List<Patient> listMedicalNumberCardsInterval = newList.getMedicalNumberCardsInterval(10000, 40000);
        for (Patient p : listMedicalNumberCardsInterval) {
            System.out.println(p);
        }
        newList.addressPrint("Тополь");
    }
}
