package at.campus02.iwi.recursion;

public class WalkingDemoApp {
    public static void main(String[] args) {

        walk(5, 0);
    }
    public static void walk(int countSteps, int currentStep) {

        if (countSteps > currentStep) {
            System.out.println("Step forward: " + (currentStep + 1));
            walk(countSteps, ++currentStep);
        }
        if (currentStep < countSteps) {
            System.out.println("Step backward: " + currentStep);
        }
    }
}