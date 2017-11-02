package ru.geekbrains.java1.dz.dz5.DemyanikNadya;

public class Employee {
    private String name;
    private String job;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String job, String email, String phone, int salary, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String yearAdd(int year) {
        String res;
        switch (year%10) {
            case 1: {
                res = "год";
                break;
            }
            case 2: case 3: case 4: {
                res = "года";
                break;
            }
            default: {
                res = "лет";
            }
        }
        return (year+" "+ res);
    }


    public void printInfo() {
        System.out.println("Сотрудник: " + job.toLowerCase() + " " + name + ", " + yearAdd(age) + ", заработная плата "+ salary + ", контакты (тел.: " + phone + ", EMail: " + email + ")");
    }

}
