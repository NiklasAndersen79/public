package niklas.LEB.model;

import niklas.LEB.randomgenerator.RandomGenerator;
import org.springframework.stereotype.Component;

@Component
public class TVShow {

    private final Box[] boxes = {new Box(), new Box(), new Box()};

    private int chosenBox;
    private int removedBox;

    private final RandomGenerator randomGenerator = new RandomGenerator();

    public void initTvShow() {
        setUpBoxes();
        setupChosenBox();
    }

    private void setUpBoxes() {

        int winner = randomGenerator.getRandomNumber();

        if (winner == 0) {
            boxes[0].setContainsPrize(true);
            boxes[1].setContainsPrize(false);
            boxes[2].setContainsPrize(false);
        } else if (winner == 1) {
            boxes[0].setContainsPrize(false);
            boxes[1].setContainsPrize(true);
            boxes[2].setContainsPrize(false);
        } else if (winner == 2) {
            boxes[0].setContainsPrize(false);
            boxes[1].setContainsPrize(false);
            boxes[2].setContainsPrize(true);
        }
    }

    public boolean choiceIsCorrect() {
        return (getCorrectBox() == chosenBox);
    }

    private int getCorrectBox() {
        for (int i = 0; i < 3; i++) {
            if (boxes[i].isContainsPrize()) {
                return i;
            }
        }
        return -1;
    }

    public void setupChosenBox() {
        chosenBox = randomGenerator.getRandomNumber();
    }

    public void removeBox() {
        if (!boxes[0].isContainsPrize() && chosenBox != 0) {
            removedBox = 0;
        } else if (!boxes[1].isContainsPrize() && chosenBox != 1) {
            removedBox = 1;
        } else if (!boxes[2].isContainsPrize() && chosenBox != 2) {
            removedBox = 2;
        } else {
            System.out.println("UH OH!");
        }
    }

    public void changeBox() {
        if (chosenBox == 0) {
            if (removedBox == 1) {
                chosenBox = 2;
            } else if (removedBox == 2) {
                chosenBox = 1;
            }
        } else if (chosenBox == 1) {
            if (removedBox == 0) {
                chosenBox = 2;
            } else if (removedBox == 2) {
                chosenBox =0;
            }
        } else if (chosenBox == 2) {
            if (removedBox == 0) {
                chosenBox = 1;
            } else if (removedBox == 1) {
                chosenBox = 0;
            }
        }
    }
}
