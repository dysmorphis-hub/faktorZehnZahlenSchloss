package lock;

import java.util.ArrayList;
import java.util.Collections;

public class Lock {

    private int minMovement;
    private Integer[] positions;

    public Lock(Integer pos1, Integer pos2, Integer pos3, Integer pos4){

        this.positions = new Integer[]{pos1,pos2,pos3,pos4};
    }

    public int getMinMovement(){
        return this.minMovement;
    }

    public Integer[] getPositions() {
        return this.positions;
    }

    public void setMinMovement(int minMovement) {
        this.minMovement = minMovement;
    }

    public String showResultAndCombinations(){

        return this.getMinimumMovementDigits(this.getPositions()).toString() + " with " + this.getMinMovement() + " movements per digit";
    }

    public ArrayList<Integer> getMinimumMovementDigits(Integer... positions){

        ArrayList<Integer> allMovementsList = MovementCalculation.calcMovementsPerPosition(positions);
        this.setMinMovement(Collections.min(allMovementsList));

        ArrayList<Integer> resultCombinations = new ArrayList<>();

        for (int i = 0; i < allMovementsList.size(); i++){

            if (allMovementsList.get(i) == this.getMinMovement()){

                resultCombinations.add(i);
            }
        }

        return resultCombinations;
    }
}
