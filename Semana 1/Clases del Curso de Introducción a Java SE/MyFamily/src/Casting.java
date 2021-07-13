public class Casting {
    public static void main(String[] args) {
        char c = 'z'; //conviertelo a int
        int cI = c;
        System.out.println(cI);

        int i = 250; //conviertelo a long y luego de long a short
        long iL = i; short iS = (short) iL;
        System.out.println(iL);

        double d = 301.067;// conviertelo a long
        long dS = (long) d;
        System.out.println(dS);

        int i2 = 100; //súmale 5000.66 y conviertelo a float
        float iF =(float) (i2 + 5000.66);
        System.out.println(iF);

        int i3 = 737; //multiplícalo por 100 y conviertelo a byte
        byte iB= (byte) (i3*100);
        System.out.println(iB);

        double d2 = 298.638; //divídelo entre 25 y conviertelo a long
        long dL = (long) (d2/25);
        System.out.println(dL);


    }
}
