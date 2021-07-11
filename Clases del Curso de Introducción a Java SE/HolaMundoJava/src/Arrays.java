public class Arrays {
    public static void main(String[] args) {
        String[] androidVersion = new String[17];
        String days[] = new String[7];

        /*
        *-------------------------
        *  Counry   | City       |
        * ------------------------
        *  México   | CDMX       |
        *  México   | Guadalajara|
        *  Colombia | Bogota     |
        *  Colombia | Medellín   |
        * */

        String[][] cities = new String[4][2];

        int [][][] numbers = new int[2][2][2];
        int numbers4[][][][] = new int[2][2][2][2];

        androidVersion[0]="Apple Pie";
        androidVersion[1]="Bannana Bread";
        androidVersion[2]="Cupcake";
        androidVersion[3]="Donut";

        /*for (int i = 0; i <=androidVersion.length-1; i++) {
            System.out.println(androidVersion[i]);
        }*/

        for (String androidVersio :androidVersion) {
            System.out.println(androidVersio);
        }

        System.out.println();
        System.out.println(androidVersion[0]);
        System.out.println(androidVersion[1]);
        System.out.println(androidVersion[2]);
        System.out.println(androidVersion[3]);

        System.out.println();
        System.out.println();

        cities[0][0]="Colombia";
        cities[0][1]="Medellín";
        cities[1][0]="Colombia";
        cities[1][1]="Bogotá";
        cities[2][0]="México";
        cities[2][1]="Guadalajara";
        cities[3][0]="México";
        /*for (int i = 0; i < cities.length ; i++) {
            for (int j = 0; j <cities[i].length ; j++) {
                System.out.println(cities[i][j]);
            }
        }*/
        for (String[] pair : cities) {
            for (String name:pair) {
                System.out.println(name);
            }
        }
        System.out.println();
        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);

        String[][][][] animals = new String[2][3][2][2];

        animals[1][0][0][1] = "Monkey";

        byte i=1;
        byte j=1:
        byte k=j+i;

        System.out.println();
        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <=1 ; i++) {
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <=0 ; k++) {
                    for (int l = 0; l < 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
    }
}
