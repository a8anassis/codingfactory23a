package gr.aueb.cf.ch19.enums;

import gr.aueb.cf.testbed.ch19.WeekDay;

public class Main {

    public static void main(String[] args) {
        WeekDay weekDays;

        for (WeekDay weekDay : WeekDay.values()) {
            System.out.println(weekDay.getDay());
        }
    }
}
