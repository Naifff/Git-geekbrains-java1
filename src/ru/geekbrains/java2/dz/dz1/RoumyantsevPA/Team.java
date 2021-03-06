package ru.geekbrains.java2.dz.dz1.RoumyantsevPA;

import java.util.Random;

public class Team {
    private final static int CAPACITY = 4;
    public static int counter = 0;
    protected int time = 0;
    String title = "";
    Competitor[] members;


    public Team() {
        String[] catNames = {"Багор", "Байкал", "Близзард", "Бали", "Бальтазар", "Бамбуча", "Баттон", "Барди", "Бароян", "Барс", "Баскет", "Бабай", "Багратин", "Бабстер", "Базилиано", "Баксик", "Бамс", "Бальзам", "Барса", "Барбарос", "Басмач", "Байрон", "Базальт", "Бакс", "Балхаш", "Баскервиль", "Бастион", "Бентли", "Бенжамин", "Бернард", "Берлиоз", "Берти", "Бенефис", "Берсерг", "Билан", "Богач", "Босфор Бисквит", "Бомбей", "Брадлей"};
        String[] dogNames = {"Арчи", "Чаки", "Пушок", "Гром", "Майк", "Барон", "Спайки", "Рекс", "Райдер", "Платон", "Галик", "Менни", "Адриан", "Вольт", "Хеппи", "Пайки", "Осман", "Честер", "Такер", "Арон", "Рич", "Грей", "Байк", "Бакс", "Данте", "Перс", "Доби", "Батлер", "Престон", "Зак", "Клиф", "Найс", "Вегас", "Райли", "Тиберий", "Вондер", "Аргус", "Старк", "Оникс", "Ганс", "Эрни", "Дейв", "Вудди", "Пайк", "Коди", "Растли", "Буш", "Стиф", "Бонд", "Форест", "Ник", "Уран", "Шах", "Тит", "Нортис", "Мерфи", "Пулион", "Каспер", "Харди", "Джери", "Пеле", "Зевс", "Султан", "Валли", "Марсель", "Элвин", "Эрик", "Кларк", "Луций", "Арни", "Харрис", "Оливер", "Дункан", "Дастин", "Ринго", "Бек", "Брюс", "Буч", "Чарли", "Джек", "Айс", "Муссий", "Грин", "Акбар", "Арни", "Харрис", "Жучи", "Жорж", "Юстин", "Жак", "Прайм", "Отон", "Люк", "Гор", "Гарольд", "Тайсон", "Цезарь", "Рэй", "Клод", "Озборн", "Морис", "Кай", "Бекхем", "Оскар", "Норд", "Олимп", "Найк", "Уолтер", "Урвин", "Дакота", "Саймон", "Месси", "Джеймс", "Расти", "Бади", "Арго", "Рудольф", "Отис", "Умка", "Чак", "Купер", "Уолт", "Техас", "Тима", "Франк", "Дизель", "Стифлер", "Скуби", "Тато", "Филя", "Тео", "Генри", "Фред", "Уайт", "Хаки", "Чип", "Кураж", "Лари", "Фрай", "Клайд", "Трой", "Тимон"};
        String[] humanNames = {"Александр", "София", "Максим", "Мария", "Артём", "Анна", "Михаил", "Анастасия", "Даниил", "Виктория", "Иван", "Елизавета", "Дмитрий", "Полина", "Кирилл", "Алиса", "Андрей", "Дарья", "Егор", "Александра", "Илья", "Варвара", "Екатерина", "Ксения", "Арина", "Вероника", "Владимир", "Василина", "Роман", "Валерия", "Марк", "Милана", "Ярослав", "Ева", "Федор", "Ульяна", "Сергей", "Кира", "Лев", "Вера", "Степан", "Маргарита", "Константин", "Владислав", "Таисия", "Георгий", "Кристина", "Николай", "Алина", "Глеб", "Ольга", "Тимур", "Диана", "Павел", "Юлия"};

        Random rnd = new Random();
        this.title = "Команда #" + counter;
        this.members = new Competitor[CAPACITY];

//        for (Competitor member:  this.members
//             ) {
//            switch (rnd.nextInt(3)){
//                case 0:
//                    member= new Cat(catNames[rnd.nextInt(catNames.length)], rnd.nextInt(2)+1, (double) (rnd.nextInt(2000)+500)/100);
//                    break;
//                case 1:
//                    member= new Dog(dogNames[rnd.nextInt(dogNames.length)], rnd.nextInt(3)+1, (double) (rnd.nextInt(4000)+500)/100);
//                    break;
//                default:
//                    member=new Human(humanNames[rnd.nextInt(humanNames.length)], rnd.nextInt(18)+18, (double) (rnd.nextInt(1000)+500)/100);
//        }
//
//
//    }

        for (int i = 0; i < this.members.length; i++) {
            switch (rnd.nextInt(3)) {
                case 0:
                    this.members[i] = new Cat(catNames[rnd.nextInt(catNames.length)], rnd.nextInt(5) + 1, (double) (rnd.nextInt(2000) + 500) / 100);
                    break;
                case 1:
                    this.members[i] = new Dog(dogNames[rnd.nextInt(dogNames.length)], rnd.nextInt(7) + 1, (double) (rnd.nextInt(4000) + 500) / 100);
                    break;
                default:
                    this.members[i] = new Human(humanNames[rnd.nextInt(humanNames.length)], rnd.nextInt(18) + 18, (double) (rnd.nextInt(1000) + 500) / 100);
            }

        }
        this.time = 0;
        counter++;
    }

    public void showResults() {
        for (Competitor member : this.members) {
            if (member.isOnDistance()) {
                if (member instanceof Animal) {
                    double newTime = (double) ((int) ((((Animal) member).time * 3 / 60) * 100)) / 100;
                    System.out.println(((Animal) member).type + " " + member.getName() + ": прошел. " + newTime + "мин");
                } else {
                    double newTime = (double) ((int) ((((Human) member).time * 3 / 60) * 100)) / 100;
                    System.out.println(member.getName() + ": прошел. " + newTime + " мин");
                }
            } else {
                if (member instanceof Animal) {
                    System.out.println(((Animal) member).type + " " + member.getName() + ": не прошел.");
                } else {
                    System.out.println(member.getName() + ": не прошел.");
                }

            }

        }

    }

    public void done() {
        for (Competitor member : this.members) {
            if (member.isOnDistance()) {
                System.out.println(member.getName() + ": прошел.");
            }
        }

    }

    public void printTeam() {
        for (Competitor c : members
                ) {
            System.out.println(c.getName());

        }

    }
}
