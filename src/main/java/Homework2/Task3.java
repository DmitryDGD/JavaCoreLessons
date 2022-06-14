package Homework2;

public class Task3 {
    public static void main(String[] args) {
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        boolean somethingIsBroken = hasTransmissionProblem || hasElectricsProblem || hasMotorProblem || hasWheelsProblem || hasMotorProblem;
        int serviceBill = 0;
        int count = 0;

        if ((!hasFuel) && (!somethingIsBroken)) {
            serviceBill += 1000;
        }

        if (hasMotorProblem) {
            serviceBill += 10000;
            count += 1;
        }

        if (hasElectricsProblem) {
            serviceBill += 5000;
            count += 1;
        }

        if (hasTransmissionProblem) {
            serviceBill += 4000;
            count += 1;
        }

        if (hasWheelsProblem) {
            serviceBill += 2000;
            count += 1;
        }

        if (count == 2) {
            serviceBill *= 0.9;
        }

        if ((hasTransmissionProblem) && (hasElectricsProblem || hasMotorProblem)) {
            serviceBill *= 0.8;
        }

        if ((hasFuel) && (!hasElectricsProblem) && (!hasMotorProblem) && (!hasTransmissionProblem) && (!hasWheelsProblem)) {
            System.out.println("Такого быть не может!");
        }

        System.out.println("Счет за услуги: " + serviceBill);
    }
}
