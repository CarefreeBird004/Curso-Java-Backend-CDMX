import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;

public class MathematicOperaction {
    public static void main(String[] args) {
        double xD = 2.1;
        double yD = 3;

        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(xD));

        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(xD));

        //Devuelve un numero elevado a otro
        System.out.println(Math.pow(xD, yD));

        //Devuelve un numero mayo
        System.out.println(Math.max(xD, yD));

        //Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(yD));

        //Area de un ciruclo=pi*r^2
        System.out.println(Math.PI * Math.pow(yD, 2));

        //Area de una esfera
        System.out.println(4 * Math.PI * Math.pow(yD, 2));

        // Volumen de una esfera ( (4/3) * PI * r^3):
        System.out.println((4 / 3) * Math.PI * Math.pow(yD, 3));
    }
}
