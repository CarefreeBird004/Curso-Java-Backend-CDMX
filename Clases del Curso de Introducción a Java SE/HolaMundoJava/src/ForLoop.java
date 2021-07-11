public class ForLoop {
    static boolean isTurnOnLight =false;
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            printSOS();
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
