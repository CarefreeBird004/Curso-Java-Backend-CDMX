public class Casting {
    public static void main(String[] args) {

        double d= 85.45;
        int i=(int) d;

        double montlyDogs = 30.0/12.0;
        System.out.println(montlyDogs);

        //Estimacion
        int estimatedMonthlyDogs = (int) montlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a=30;
        int b=12;
        System.out.println((double) a/b);

        double c=(double) a/b;
        System.out.println("c: "+c);

        char n = '1';
        int nI = n;
        System.out.println(nI);
    }
}
