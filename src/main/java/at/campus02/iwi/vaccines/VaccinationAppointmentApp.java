package at.campus02.iwi.vaccines;

import java.util.Arrays;

public class VaccinationAppointmentApp {
    public static void main(String[] args) {

        VaccinationAppointment appointment = new VaccinationAppointment();

        System.out.println(appointment.calculateRiskClass(30, true, false, false, false, false));

        System.out.println(Arrays.toString(appointment.calculateMonthAndVaccine(65, 7)));

    }
}
