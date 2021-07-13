public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "1";
        switch (colorModeSelected){
            case "Light":
                System.out.println("Slecccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Darck":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opción");
        }
    }
}
