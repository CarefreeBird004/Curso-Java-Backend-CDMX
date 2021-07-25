package Tarea1.Videos;

public class OperadorLogico {
    public static void main(String[] args) {
        int y=3;
        boolean x =true || (y<4);
        System.out.println("Resultado de int y=3;\n" +
                "        boolean x =true||(y<4): " +x);

        Integer x2 = new Integer(1);
        if (x2 != null && x2.intValue()<5){
            //Do something
            System.out.println("Resultado de Integer x2 = new Integer(1);\n" +
                    "        if (x2 != null && x2.intValue()<5){\n" +
                    "            //Do something\n" +
                    "        } es: true " );
        }

        if (x2 != null & x2.intValue() < 5) {//Throws an exception if x is nill
            // Do something
            System.out.println("El resultado de if (x2 != null & x2.intValue() < 5) {//Throws an exception if x is nill\n" +
                    "            // Do something\n" +
                    "        } es: true");
        }

        int x3=6;
        boolean yy=(x3>=6)||(++x3<=7);
        System.out.println("Resultado de  int xx=6;\n" +
                "        boolean yy=(xx>=6)||(++xx<=7) es : "+yy);

    }
}
