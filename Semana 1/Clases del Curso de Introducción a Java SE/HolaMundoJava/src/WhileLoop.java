public class WhileLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        turnOnOffLight();
        int i= 1;
        while (i<=10 && isTurnOnLight){
            printSOS();
            i++;
        }
    }
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true; //Operador ternario
        return isTurnOnLight;
        /* if (isTurnOnLight) {
            isTurnOnLight = false;
        } else {
            isTurnOnLight = true;
        }
        return isTurnOnLight;
        */
    }

}

