import model.*;

import java.util.Date;
import static iu.UIMenu.*;
public class Main {
    public static void main(String[] args) {
       // Doctor myDoctor = new Doctor("Andres", "andres@gmail.com");
        /*
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

         */
       // System.out.println(myDoctor);


        /*
        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate()+ " "+aA.getTime());
        }
        */
        /* myDoctor.name = "Alejandro Rodríguez";
        myDoctor.ShowName();
        myDoctor.showId();
        model.Doctor.id++;

        model.Doctor myDoctor2 = new model.Doctor();
        //myDoctor2.name = "Toledo";
        myDoctor2.ShowName();
        myDoctor2.showId();
        int a = model.Doctor.ID;
        model.Doctor.p();
        System.out.println(a);
        model.Doctor.ID=1;
        int b = model.Doctor.ID;
        System.out.println(b);
        double c =PI;
        */
        //showMenu();

        //model.Doctor myDoctor3 = new model.Doctor("Anahí Salgado", "Pediatria");
       /* System.out.println(myDoctor3.name);
        System.out.println(myDoctor3.speciality);

        System.out.println();
        System.out.println();
        model.Patient patient = new model.Patient("Alejandra","alejandra@gmail.com");
        model.Patient patient2 = new model.Patient("Anahi","snshi@gmail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());*/
        //System.out.println(Day.MONDAY);
        //System.out.println();

        /*
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);

         */
        /*
        User user = new Doctor("Anahi", "ana@ana.com");
        user.showDataUser();

        User userPa = new Patient("Anahi", "ana@ana.com");
        userPa.showDataUser();
        System.out.println();
        User user1 = new User("Ana","ana@ana.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento de Geriatría");
            }
        };
        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

         */
        showMenu();
    }


}
