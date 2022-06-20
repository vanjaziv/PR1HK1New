package at.campus02.iwi.battleships;


import java.util.Arrays;

public class BattleShipDemoApp {
    public static void main(String[] args) {
        BattleShipMap map = new BattleShipMap();

        map.print();

        int powerPlayerA = map.totalBattleShipStrength('A');
        System.out.println("Power of Player 'A': " + powerPlayerA);

        int powerPlayerB = map.totalBattleShipStrength('B');
        System.out.println("Power of Player 'B': " + powerPlayerB);

        System.out.println("map.totalCountBattleShips() = " + map.totalCountBattleShips());

        System.out.println("map.averageShipStrengthNationA() = " + map.averageShipStrengthPlayerA());

        System.out.println("map.countOfShipsPerLine() = " + Arrays.toString(map.countOfShipsPerLine()));
    }
}
