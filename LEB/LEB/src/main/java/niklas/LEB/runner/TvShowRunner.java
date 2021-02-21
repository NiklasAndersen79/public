package niklas.LEB.runner;

import niklas.LEB.statistics.Statistics;
import niklas.LEB.model.TVShow;

public class TvShowRunner {

    private final TVShow tvShow = new TVShow();

    private final Statistics statistics = new Statistics();

    public void runTvShowWithoutChangingBox(int numberOfRuns) {
        statistics.clearStatistics();
        for (int i = 0; i < numberOfRuns; i++) {
            tvShow.initTvShow();
            tvShow.setupChosenBox();
            statistics.setNumberOfChoices(statistics.getNumberOfChoices() +1);
            if (tvShow.choiceIsCorrect()) {
                statistics.setCorrectChoices(statistics.getCorrectChoices() +1);
            } else {
                statistics.setNumberOfWrongChoices(statistics.getNumberOfWrongChoices() +1);
            }
        }
        statistics.printStats(false);
    }

    public void runTvShowWithChangingBox(int numberOfRuns) {
        statistics.clearStatistics();
        for (int i = 0; i < numberOfRuns; i++) {
            tvShow.initTvShow();
            tvShow.setupChosenBox();
            statistics.setNumberOfChoices(statistics.getNumberOfChoices() +1);
            tvShow.removeBox();
            tvShow.changeBox();
            if (tvShow.choiceIsCorrect()) {
                statistics.setCorrectChoices(statistics.getCorrectChoices() +1);
            } else {
                statistics.setNumberOfWrongChoices(statistics.getNumberOfWrongChoices() +1);
            }
        }
        statistics.printStats(true);
    }
}
