/*Write the missing code, and override the equals method in MyDate class, so that it can compare that when two MyDate objects have the same year, month and day, the result is true, otherwise false. The expected output is:
        m1!=m2
        m1 is equal to m2
        m3 is not equal to m1 or m2

 */

public class TestMyDate {

    public static void main(String[] args) {
        MyDate m1 = new MyDate(2,8,2019);
        MyDate m2 = new MyDate(2,8,2019);
        MyDate m3 = null;

        if(m1==m2) {
            System.out.println("m1==m2");
        }else {
            System.out.println("m1!=m2");
        }

        if(m1.equals(m2)) {
            System.out.println("m1 is equal to m2");
        }else {
            System.out.println("m1 is not equal to m2");
        }

// Compare if m3 is equals to m1 or m2

        try{
            if(m3.equals(m1)||m3.equals(m2)) {
                System.out.println("m3 is equal to m1 or m2");
            }else {
                System.out.println("m3 is not equal to m1 or m2");
            }
        }catch (NullPointerException e){
            System.out.println("m3 is not equal to m1 or m2");
        }
    }
}

class MyDate{
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj instanceof MyDate) {
            return true;
        }else {
            return false;
        }

    }
}
