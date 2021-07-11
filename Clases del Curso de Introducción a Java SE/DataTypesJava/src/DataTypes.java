public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL= 1234567890000000000L;

        float nF= 1.2534325633e-45F;

        double nD =  123.4e-325;

        var salary = 1000;
        // pension 3%
        var pension = salary*0.03; //double
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Anahi Salagado";
        System.out.println("Employee: " + employeeName +" Salary: "+salary);

    }
}
