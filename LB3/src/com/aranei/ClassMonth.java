package com.aranei;

public class ClassMonth {
    private String month;
    private int days;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void PickMonth(int nameMonth, int vis){
        switch (nameMonth) {
            case 0:
                setMonth("JANUARY");
                setDays(31);
                break;
            case 1:
                setMonth("FEBRUARY");
                if (vis == 0) {
                    setDays(28);
                } else setDays(29);
                break;
            case 2:
                setMonth("MARCH");
                setDays(31);
                break;
            case 3:
                setMonth("APRIL");
                setDays(30);
                break;
            case 4:
                setMonth("MAY");
                setDays(31);
                break;
            case 5:
                setMonth("JUNE");
                setDays(30);
                break;
            case 6:
                setMonth("JULY");
                setDays(31);
                break;
            case 7:
                setMonth("AUGUST");
                setDays(31);
                break;
            case 8:
                setMonth("SEPTEMBER");
                setDays(30);
                break;
            case 9:
                setMonth("OCTOBER");
                setDays(31);
                break;
            case 10:
                setMonth("NOVEMBER");
                setDays(30);
                break;
            case 11:
                setMonth("DECEMBER");
                setDays(31);
                break;
        }
    }

}
