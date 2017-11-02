package ru.geekbrains.java1.dz.dz5.DemyanikNadya;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ривер Сонг", "Инженер", "rsong@company.com", "892310011", 20000, 30);
        persArray[1] = new Employee("Рори Уильямс", "Уборщик", "wiliamsr@company.com", "892310091", 15000, 51);
        persArray[2] = new Employee("Эми Понд", "Директор", "ponda@company.com", "892310001", 50000, 45);
        persArray[3] = new Employee("Иванов Иван", "Курьер", "ivivan@company.com", "892310092", 10000, 20);
        persArray[4] = new Employee("Сьюзен Форман", "Бухгалтер", "formans@company.com", "892310002", 30000, 42);

        for(int i=0;i<persArray.length;i++) {
            if(persArray[i].getAge() >= 40) {
                persArray[i].printInfo();
            }
        }
    }
}
