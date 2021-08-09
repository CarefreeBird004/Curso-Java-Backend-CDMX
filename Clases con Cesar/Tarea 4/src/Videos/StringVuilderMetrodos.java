package Videos;

public class StringVuilderMetrodos {
    public static void main(String[] args) {
        //Ejemplo 1 - Métodos compartidos con la clase String
        System.out.println("1--------------------------------");
        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"),sb.indexOf("al"));

        int len = sb.length();                  //7
        char ch = sb.charAt(6);                 //s
        System.out.println(sub + " " + len + " " + ch);//ani 7 s

        StringBuilder sb1 = new StringBuilder("Hola");
        //String sub1 = sb.substring(0,4).append(" mundo");       //No compila, el método substring regresa un string, no un StringBuilder

        //Ejemplo 2 - append()
        System.out.println("2-------------------------------");
        StringBuilder sba = new StringBuilder("Hola").append(" mundo").append(1).append(true).append(new Object());
        System.out.println(sba);            // "Hola mundo1truejava.Object@15db9724" -> la última parte varia en cada ejecucioón

        //Ejemplo 3 - insert()
        System.out.println("3-------------------------------");
        StringBuilder sbb = new StringBuilder("animals");
        sbb.insert(2,".");
        sbb.insert(0,".");
        sbb.insert(4,".");
        System.out.println(sbb);

        //Ejemplo 4 - delete() / deleteChartAt()
        System.out.println("4--------------------------------");
        StringBuilder sbc = new StringBuilder("abcdef");
        sbc.delete(1,3);                                //sb = adef
        //sbc.deleteCharAt(5);                           //StringIndexOutOfBoundException
        //sbc.delete(5,1);                                //Lanza  SrtringIndexOutOfBoundException
        sbc.delete(1,1);                                //No elimina nada
        System.out.println(sbc);                        //sb = adef
        sbc.delete(0,5);                                //Elimina todo, no lanza StringIndexOutOfBoundException
        System.out.println(sbc);                        //"" String vacío

        //Ejemplo 5 - reverse()
        System.out.println("5-------------------------------");
        StringBuilder sbd = new StringBuilder("ABCDEF");
        sbd.reverse();
        System.out.println(sbd);                    //FEDCBA

        //Eejmplo 6 - toString()
        System.out.println("6--------------------------------");
        StringBuilder sbe = new StringBuilder("ABCD");
        String str = sbe.toString();
        System.out.println(str);

        //StringBuilder sbf = "";                     //No compila, no se puede asignar un String directamente

    }
}
