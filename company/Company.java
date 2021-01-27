package com.company;

import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<Worker>allWorkers;
    private ArrayList<Integer>sales;

    public Company(String name){
        this.name = name;

        allWorkers = new ArrayList<Worker>();
        sales = new ArrayList<Integer>();
    }
    public int totalPayments(){
        int sum = 0;
        for(int i=0; i < allWorkers.size(); i++) {
            allWorkers.get(i).Salary();
            sum += allWorkers.get(i).Salary();
        }
        return sum;
    }
    public int totalEarnings(){
        int sum = 0;
        for(int i=0; i < sales.size(); i++){
            sales.get(i);
            sum += sales.get(i);
        }
        return sum;
    }
    public Worker workedMost(){
        Worker M = allWorkers.get(0);
        for(int i = 1; i < allWorkers.size(); i++){
            M = allWorkers.get(i).diligent(M);
        }
        return  M;
    }
    public void addWorker(Worker w){
        allWorkers.add(w);
    }

}
