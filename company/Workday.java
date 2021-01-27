package com.company;

public class Workday {

    private Date date;
    private Time start;
    private Time end;


    public Workday(Date date){
        this.date=date;

        start = new Time(9,00);
        end = new Time(17,00);

    }
    public Date getDate(){
        return date;
    }
    public Time getStart(){
        return start;
    }
    public Time getEnd(){
        return end;
    }
    public void setDate(Date d){
        this.date = d;
    }
    public void setStart(Time ts){
        this.start = ts;
    }
    public void setEnd(Time te){
        this.end = te;
    }
    public Double workTime(){
        int sum = 0;
        sum += end.hour - start.hour;
        sum += end.minute - start.minute;

        return workTime();
    }

    public Boolean isExtra(){
        if(workTime() > 8){
            return true;
        } else{
            return false;
        }
    }
}
