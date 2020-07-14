package lock;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

public class LockTest {

    private Lock lock = new Lock(7,3,8,0);

    @Test
    public void testCalcMovementsPerPosition(){

        ArrayList<Integer> testResultMovements = new ArrayList<>(Arrays.asList(8,10,12,12,12,12,10,8,8,8));
        assertEquals(testResultMovements, MovementCalculation.calcMovementsPerPosition(this.lock.getPositions()));
    }

    @Test
    public void testGetMinimumMovementDigits(){

        ArrayList<Integer> minimumMovementdigits = new ArrayList<>(Arrays.asList(0,7,8,9));
        assertEquals(minimumMovementdigits.toString(), this.lock.getMinimumMovementDigits(this.lock.getPositions()).toString());

    }

    @Test
    public void testShowResultAndCombinations() {

        assertEquals("[0, 7, 8, 9] with 8 movements per digit", this.lock.showResultAndCombinations());
    }

    @Test
    public void testGetMinMovement(){

        assertEquals(0, this.lock.getMinMovement());
    }

    @Test
    public void testSetMinMovement(){

        this.lock.setMinMovement(8);
        assertEquals(8, this.lock.getMinMovement());

    }

    @Test
    public void testGetPositions(){

        Integer positions[] = new Integer[]{7, 3, 8, 0};
        assertArrayEquals(positions,this.lock.getPositions());

    }
}