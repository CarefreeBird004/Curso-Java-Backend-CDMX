import java.util.Map;

public class Funciones {
    public static void main(String[] args) {
        double yD = 3;
        //Area de un ciruclo=pi*r^2
        System.out.println(areaCirculo(yD));
        System.out.println(sphereArea(yD));

        System.out.println("Pesos a Dolares : " + converToDolar(200, "MXN"));

    }
    public static double areaCirculo(double y){
        return Math.PI*Math.pow(y,2);
    }
    public static double sphereArea(double r){
        return 4*Math.PI*Math.pow(r,3);
    }
    /** *
     * Descripción: Esta función que especificando su modena convierte una cantidad de dinera a dolares
     *
     * @param quantity Cantidad de dinero a convertir
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     */
    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity=quantity*0.052;
                break;
            case "COP":
                quantity=quantity*0.00031;
                break;
        }
        return quantity;
    }

}
