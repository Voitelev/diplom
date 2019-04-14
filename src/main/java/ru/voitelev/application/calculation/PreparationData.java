package ru.voitelev.application.calculation;

public class PreparationData {
    private String time;
    private String averageTime;

    public PreparationData(String time, String averageTime){
        this.averageTime = averageTime;
        this.time = time;
    }
    public void prepareData(){
        double averageTimeD = 0;
        double timeD = 0;
        double max = 100;
        double min = 10;
        System.out.println(averageTime);
        System.out.println(time);
        try {
             averageTimeD = Double.parseDouble(averageTime);
             timeD = Double.parseDouble(time);
        }  catch (NumberFormatException e) {
            System.out.println("Опа ошиба");
        }
        double paramOne = 1 / (1 -  Math.exp(-averageTimeD));
        double paramTwo = timeD - min;
        paramTwo = paramTwo/ (max-min);
        System.out.println(averageTimeD + " " + paramTwo);

    }
}
