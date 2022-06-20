
package at.campus02.iwi.battleships;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

public class BattleShipTest {

    @Test
    public void testTotalBattleShipStrengthPlayerA(){
        BattleShipMap map = new BattleShipMap();

        assertEquals(41,map.totalBattleShipStrength('A') );
    }
    @Test
    public void testTotalBattleShipStrengthPlayerB(){
        BattleShipMap map = new BattleShipMap();
        assertEquals(21,map.totalBattleShipStrength('B') );
    }
    @Test
    public void testTotalCountBattleShips(){
        BattleShipMap map = new BattleShipMap();
        assertEquals(30,map.totalCountBattleShips() );
    }
    @Test
    public void testAverageShipStrengthNationA(){
        BattleShipMap map = new BattleShipMap();
        assertEquals(227,(int) (map.averageShipStrengthPlayerA() *100 ));
    }
    @Test
    public void testCountOfShipsPerLine(){
        BattleShipMap map = new BattleShipMap();
        int[] expected = {3, 4, 6, 1, 5, 5, 3, 3};
        assertTrue(Arrays.equals(expected, map.countOfShipsPerLine()) );
    }
}
