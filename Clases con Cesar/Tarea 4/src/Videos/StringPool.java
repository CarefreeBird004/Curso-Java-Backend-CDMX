package Videos;

public class StringPool {
    public static void main(String[] args) {

        //Ejemplo 1
        String name1 = "Emmet";
        String name2NewReference = new String("Emmet");
        String name3 = "Emmet";

        System.out.println("Ex 1: " + (name1 == name2NewReference));            //fale
        System.out.println("Ex 2: " + name1.equals(name2NewReference));         //true
        System.out.println("Ex 3: " + (name1 == name3));                        //true
        System.out.println("Ex 4: " + (name1 == "Emmet"));                      //true
        System.out.println("Ex 5: " + (name1 == "Emm" + "et"));                 //true
        System.out.println("Concat: " + (name1 == "Emm".concat("et")));         //false, concat devuelve un nuevo string
        System.out.println("Intern: " + (name1 == name2NewReference.intern())); //true

        //Ejemplo 2 Método intern()
        String p1 = new String("A");
        System.out.println("A" == p1);          //False
        String p12 = p1.intern();
        System.out.println("A" == p1);          //False
        System.out.println("A" == p12);         //True

        //Ejemplo 3
        String[] strs = { "E" , "m", "m", "e", "t"};
        String name4 = "";
        String name4a = null;

        for (String str : strs){
            name4 += str;
            name4a += str;
        }

        System.out.println(name1 == name4);                         //False
        System.out.println(name4 + " " + name1.equals(name4));      //True
        System.out.println(name4a + " " + name1.equals(name4a));    //False name4a -> nullEmment

        //Ejemplo 4
        String name5 =  "Emmet";
        System.out.println(name1 == name5);                 //True
        System.out.println(name1.equals(name5));            //True

    }
}
