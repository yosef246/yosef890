package com.company;

import java.util.ArrayList;


public class Worker {

    private String name;
    private ArrayList<Workday> workdays;
    private int pay;
    private boolean isActiv;


    public Worker(String name, int pay) {
        this.name = name;
        this.pay = pay;

        workdays = new ArrayList<Workday>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Workday> getWorkdays() {
        return workdays;
    }
    public boolean isActiv() {
        return isActiv;
    }

    public int getPay() {
        return pay;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setWorkdays(ArrayList<Workday> workdays) {
        this.workdays = workdays;
    }

    public void setPay(int p) {
        this.pay = p;
    }
    public void setActiv(boolean activ) {
        isActiv = activ;
    }

    public int WorkingDays() {
        return workdays.size();
    }

    public int Salary() {
        int sum1 = 0, sum2 = 0;
        double from8 = 0, under8 = 0;

        for (int i = 0; i < workdays.size(); i++) {
            if (workdays.get(i).workTime() > 8) {
                from8 = workdays.get(i).workTime() - 8;
                under8 = 8;
            } else {
                from8 = 0;
                under8 = workdays.get(i).workTime();
            }
            sum1 += from8 * getPay() * 1.25;
            sum2 += under8 * getPay();
        }
        return sum1 + sum2;
    }

    public Worker diligent(Worker other) {
        double employee1 = 0, employee2 = 0;

        for (int i = 0; i < this.workdays.size(); i++) {
            employee1 += this.workdays.get(i).workTime();
        }
        for (int i = 0; i < other.workdays.size(); i++) {
            employee2 += other.workdays.get(i).workTime();
        }
        if (employee1 > employee2) {
            return this;
        } else {
            return other;
        }
    }

}
