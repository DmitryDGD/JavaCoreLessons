package Homework3.Task2;

public class FinancialRecord {
    int incomes;
    int outcomes;

    public FinancialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }
}
