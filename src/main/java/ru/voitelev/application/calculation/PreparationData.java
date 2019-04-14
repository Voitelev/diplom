package ru.voitelev.application.calculation;

public class PreparationData {
    private String time;
    private String averageTime;

    public PreparationData(String time, String averageTime){
        this.averageTime = averageTime;
        this.time = time;
    }
    public void prepareData(){
        System.out.println(averageTime + " " + time);
    }
}
