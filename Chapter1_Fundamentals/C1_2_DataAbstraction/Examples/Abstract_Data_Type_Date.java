package Chapter1_Fundamentals.C1_2_DataAbstraction.Examples;

public class Abstract_Data_Type_Date {
    private final int month;
    private final int day;
    private final int year;
    // Constructor
    public Abstract_Data_Type_Date(int m , int d , int y){
        this.month = m;
        this.day = d;
        this.year = y;
    }
    @Override
    // Overriding toString method which came from the 'Object' class
    // because all the classes in java are subclasses of 'Object' class.
    public String toString() {
        return String.format("Year : %d , Month : %d , Day : %d",year , month , day);
    }
    @Override
    // Overriding equals() method
    // After the overriding we are able to use == operator %100 correct.
    public boolean equals(Object obj) {
        if (this == obj) return true; // this refers this class, obj refers another class.
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false; // if the two classes are different
        Abstract_Data_Type_Date that = (Abstract_Data_Type_Date) obj;
        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;
    }
}
