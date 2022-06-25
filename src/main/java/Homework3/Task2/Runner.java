package Homework3.Task2;

import com.sun.jdi.Value;

import java.io.*;
import java.util.Random;

public class Runner {

    public static void main(String[] args) throws IOException {

        StringBuilder result = new StringBuilder();
        Random random = new Random();
        int resultIncomes = 0;
        int resultOutcomes = 0;

        FileWriter fileWriter = new FileWriter("src/main/resources/report.txt", false);
        for(int i=0; i<10; i++) {
           int random1 = random.nextInt(10000 + 1);
           int random2 = random.nextInt(10000 + 1);
           FinancialRecord record = new FinancialRecord(random1, random2);
           fileWriter.write(record.getIncomes() + " " + record.getOutcomes() + "\n");
        }
        fileWriter.close();


        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/report.txt"));
        while (bufferedReader.ready()) {
            String row = bufferedReader.readLine();
            String[] split = row.split(" ");
            resultIncomes += Integer.parseInt(split[0]);
            resultOutcomes += Integer.parseInt(split[1]);
            System.out.println(row);
        }
        System.out.println("общие доходы - " + resultIncomes + ", общие расходы - " + resultOutcomes);
    }



}
