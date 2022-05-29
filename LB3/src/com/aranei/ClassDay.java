package com.aranei;

public class ClassDay {
    private String name;

    public ClassDay(){}

    public ClassDay(int nameDay){
        PickDay(nameDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public void PickDay(int nameDay){
        switch (nameDay) {
            case 0:
                setName("Sunday");
                break;
            case 1:
                setName("Monday");
                break;
            case 2:
                setName("Tuesday");
                break;
            case 3:
                setName("Wednesday");
                break;
            case 4:
                setName("Thursday");
                break;
            case 5:
                setName("Friday");
                break;
            case 6:
                setName("Saturday");
                break;
        }
    }
}

