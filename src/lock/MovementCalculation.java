package lock;

import java.util.ArrayList;
import java.util.Arrays;

public class MovementCalculation {

    public static ArrayList<Integer> calcMovementsPerPosition(Integer... positions) {

        int nMovementsPerIndex = 0;
        int sumOfNMovementsPerIndex = 0;
        ArrayList<Integer> nMovementOverall = new ArrayList<>();
        ArrayList<Integer> baseCombination = new ArrayList<>(Arrays.asList(positions));

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 4; j++) {

                if (i - baseCombination.get(j) < -5) {

                    nMovementsPerIndex = (i - baseCombination.get(j)) + 10;

                } else if ((i - baseCombination.get(j) == -5) | (i - baseCombination.get(j) == 5)) {

                    nMovementsPerIndex = 5;

                } else if ((i - baseCombination.get(j) >= 0) & (i - baseCombination.get(j) < 5)) {

                    nMovementsPerIndex = i - baseCombination.get(j);

                } else if ((i - baseCombination.get(j) > -5) & (i - baseCombination.get(j) < 0)) {

                    nMovementsPerIndex = (i - baseCombination.get(j)) * (-1);

                } else if ((i - baseCombination.get(j) > 5) & (i - baseCombination.get(j) < 10)) {

                    nMovementsPerIndex = (i - baseCombination.get(j)) - 10;
                    nMovementsPerIndex *= (-1);

                }

                sumOfNMovementsPerIndex += nMovementsPerIndex;
            }

            nMovementOverall.add(sumOfNMovementsPerIndex);
            sumOfNMovementsPerIndex = 0;
        }

        return nMovementOverall;
    }
}
