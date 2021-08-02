public class PrintTab {
    public static void main(String[] args) {
        int resul = 0;
        for (int i = 1 ; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                resul = j*i;
                System.out.print(resul +"\t");
            }
            System.out.println();
        }
    }
}
