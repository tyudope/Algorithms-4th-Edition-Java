package Chapter1_Fundamentals.C1_2_DataAbstraction.Exercises.C_1_11_SmartDate;

public class SmartDate {
    int year;
    int month;
    int day;
    public SmartDate(int year, int month , int day){
        if (month > 12 || month < 1){
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        int maxDays = daysInMonth(month , year);
        if (day < 1 || day > maxDays){
            throw new IllegalArgumentException("Invalid day for given month/year");
        }
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("Date object is created successfully.");
    }

    private int daysInMonth(int month , int year){
        return switch (month){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> throw new IllegalArgumentException("Invalid month");
        };
    }
    private boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0);
    }

}
