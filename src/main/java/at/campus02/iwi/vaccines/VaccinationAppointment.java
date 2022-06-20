package at.campus02.iwi.vaccines;

public class VaccinationAppointment {

    public int age;
    public boolean majorIllness;
    public boolean contactOfPregnantPerson;
    public boolean workingInHealthSector;
    public boolean workingInEducationSector;
    public boolean baseRiskFactor;

    public int calculateRiskClass(int age, boolean majorIllness, boolean contactOfPregnantPerson, boolean workingInHealthSector, boolean workingInEducationSector, boolean baseRiskFactor) {

        int riskFactor = 0;
        riskFactor = riskFactor + age / 10;

        if (majorIllness == true) {
            riskFactor += 3;
        }
        if (contactOfPregnantPerson == true) {
            riskFactor += 2;
        }
        if (workingInEducationSector == true) {
            riskFactor += 1;
        }
        if (workingInHealthSector == true) {
            riskFactor += 2;
        }
        if (baseRiskFactor == true) {
            riskFactor += 1;
        }
        return riskFactor;
    }

    public String[] calculateMonthAndVaccine(int age, int riskClass) {
        String vaccMonth = "";
        String vaccine = "";
        String[] vaccMonthArray = {"January", "February", "March", "April", "Mai", "June", "July"};

        if (riskClass >= 10) {
            vaccMonth = vaccMonthArray[0];
        } else if (riskClass == 9) {
            vaccMonth = vaccMonthArray[1];
        } else if (riskClass >= 7 && riskClass <= 8) {
            vaccMonth = vaccMonthArray[2];
        } else if (riskClass == 6) {
            vaccMonth = vaccMonthArray[3];
        } else if (riskClass >= 4 && riskClass <= 5) {
            vaccMonth = vaccMonthArray[4];
        } else if (riskClass >= 2 && riskClass <= 3) {
            vaccMonth = vaccMonthArray[5];
        } else {
            vaccMonth = vaccMonthArray[6];
        }

        if (age >= 65) {
            vaccine = "Pfizer";
        } else if (age >= 50 && age < 65) {
            vaccine = "Moderna";
        } else if (age >= 18 && age < 50) {
            vaccine = "AstraZeneca";
        } else if (age < 18) {
            vaccine = "Pfizer";
        }
        String[] result = {vaccMonth, vaccine};
        return result;
    }
}
