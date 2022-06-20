package at.campus02.iwi.vaccines;

import static org.junit.Assert.*;
import org.junit.Test;

public class VaccinationAppointmentTest  {
    @Test
    public void testcalculateRiskClass9() {
        VaccinationAppointment vaccinationAppointment = new VaccinationAppointment();

        assertEquals(9, vaccinationAppointment.calculateRiskClass(
                67, true, false,
                false,false,false));
        assertEquals(11, vaccinationAppointment.calculateRiskClass(
                67, true, true,
                false,false,false));
        assertEquals(9, vaccinationAppointment.calculateRiskClass(
                22, true, true,
                true,false,false));
        assertEquals(7, vaccinationAppointment.calculateRiskClass(
                31, true, false,
                false,true,false));
        assertEquals(5, vaccinationAppointment.calculateRiskClass(
                45, false, false,
                false,false,true));
    }
    @Test
    public void testCalculateMonthAndVaccinePfizer() {
        VaccinationAppointment vaccinationAppointment = new VaccinationAppointment();

        int riskClass = vaccinationAppointment.calculateRiskClass(
                67, true, false,
                false,false,false);

        String[] appointment = vaccinationAppointment.calculateMonthAndVaccine(
                67, riskClass);

        assertEquals("February", appointment[0]);
        assertEquals("Pfizer", appointment[1]);
    }
    @Test
    public void testCalculateMonthAndVaccineModerna() {
        VaccinationAppointment vaccinationAppointment = new VaccinationAppointment();

        int riskClass = vaccinationAppointment.calculateRiskClass(
               64, false, true,
                false,false,false);

        String[] appointment = vaccinationAppointment.calculateMonthAndVaccine(
                64, riskClass);

        assertEquals("March", appointment[0]);
      assertEquals("Moderna", appointment[1]);
    }
}
