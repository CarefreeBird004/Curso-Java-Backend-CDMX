package model;

public enum Day {
    MONDAY("Lunes");
   /* TUESDAY("Jueves");
    FRIDAY("Viernes");
    SATURDAY("Sábado");
    SUNDAY("Domingo");*/

    private String spanish;

    private Day(String s) {
        spanish = s;
    }

    String getSpanish() {
        return spanish;
    }

    /*
    model.Day day;
switch (day) {
        case MONDAY:
            System.out.println("Mondays are good.”);
            break;
        case FRIDAY:
            System.out.println("Fridays are nice”);
            break;
        case SATURDAY: case: SUNDAY:
        System.out.println("Weekends are the best”);
            break;
        default:
            System.out.println("Midweek are so-so”);
            break;

    }
    */

}
