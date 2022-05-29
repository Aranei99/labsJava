package com.aranei;

public class ClassYear {
    private int year;
    private int vis;
    private ClassMonth monthY;
    private ClassDay dayY;

    public void setMonth(int month) {
        monthY.PickMonth(month, this.vis);
    }

    public void setDay(int day) {
        dayY.PickDay(day);
    }

    public int CheckYear(int y){
        if ((y%400 == 0) | ((y%100 != 0) & (y%4 == 0))) return 1;
        else return 0;
    }

    public int CheckDay(int y, int m, int d)	/* 1 <= m <= 12,  y > 1752 */
    {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if ( m < 3 )
        {
            y -= 1;
        }
        return (y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVis() {
        return vis;
    }

    public void setVis() {
        this.vis = CheckYear(this.year);
    }

    public void DiffDays(int y1, int m1, int d1, int y0, int m0, int d0)
    {
        int[] t1 = {31, 28 + CheckYear(y1), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] t0 = {31, 28 + CheckYear(y0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int tY = y1-y0;
        int tM;
        int totalD = 0;
        if (tY > 0) {
            for (int i = m0; i < 12; i++) {
                totalD += t0[i];
            }
            for (int i = 0; i < m1-1; i++) {
                totalD += t1[i];
            }
            if (tY > 1) for (int i = y0+1; i < y1; i++) {
                totalD += 365;
                totalD += CheckYear(i);
            }
        } else {
            for (int i = m0; i < m1-1; i++) {
                totalD += t0[i];
            }
        }
        totalD += (t0[m0]-d0);
        totalD += d1;
    }


}
