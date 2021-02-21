package niklas.LEB.statistics;

public class Statistics {

    private int numberOfChoices;

    private int correctChoices;

    private int numberOfWrongChoices;

    public void clearStatistics() {
        numberOfWrongChoices = 0;
        correctChoices = 0;
        numberOfChoices = 0;
    }

    /**
     * Prints statistics and winning probability
     * @param changedBox indicates whether the box was changed or not
     */
    public void printStats(boolean changedBox) {
        System.out.println("Number of choices: " + numberOfChoices);
        System.out.println("Number of wrong choices: " + numberOfWrongChoices);
        if (changedBox) {
            System.out.println("Number of correct choices when changing: " + correctChoices);
        } else {
            System.out.println("Number of correct choices without changing: " + correctChoices);
        }
        double winningRatio = ((double) correctChoices / (double) numberOfChoices);
        System.out.println("\nWinning probability when " +(changedBox ? "changing" : "not changing") + " box: " + winningRatio + "\n");
    }

    public int getNumberOfChoices() {
        return numberOfChoices;
    }

    public void setNumberOfChoices(int numberOfChoices) {
        this.numberOfChoices = numberOfChoices;
    }

    public int getCorrectChoices() {
        return correctChoices;
    }

    public void setCorrectChoices(int correctChoices) {
        this.correctChoices = correctChoices;
    }

    public int getNumberOfWrongChoices() {
        return numberOfWrongChoices;
    }

    public void setNumberOfWrongChoices(int numberOfWrongChoices) {
        this.numberOfWrongChoices = numberOfWrongChoices;
    }

}
