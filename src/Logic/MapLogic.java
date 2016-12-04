/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Graphic.BattlefieldUI;
import java.util.Arrays;

/**
 *
 * @author reflectbounder
 */
public class MapLogic {

    public final int VACIO = 0;
    public final int HEROE = 1;
    public final int BOSS = 2;
    public final int TESORO = 3;
    public final int SUBBOSS = 4;
    public final int OBSTACLE = 5;

    private final int[][] map = new int[8][8];

    public MapLogic() {
        for (int[] map1 : map) {
            for (int j = 0; j < map1.length; j++) {
                map1[j] = 0;
            }
        }
        /**
         * Inicializamos los elementos de la primera fila
         */
        map[0][0] = 3;
        map[0][3] = 1;
        map[0][7] = 3;
        /**
         * Inicializamos los elementos de la segunda fila
         */
        map[1][5] = 4;
        /**
         * Inicializamos los elementos de la tercera fila
         */
        map[2][2] = 3;
        map[2][7] = 5;
        /**
         * Inicializamos los elementos de la cuarta fila
         */
        map[3][0] = 4;
        map[3][4] = 4;
        map[3][7] = 5;
        //Inicializamos los elementos de la quinta fila
        /**
         * Inicializamos los elementos de la sexta fila
         */
        map[5][5] = 4;
        /**
         * Inicializamos los elementos de la septima fila
         */
        map[6][0] = 2;
        map[6][1] = 5;
        map[6][2] = 3;
        /**
         * Inicializamos los elementos de la octava fila
         */
        map[7][0] = 3;
        map[7][6] = 3;
        /**
         * Recorremos las filas para llenar los espacios con obstaculos
         */
        for (int i = 4; i < map.length - 1; i++) {
            map[0][i] = 5;
        }

        for (int i = 0; i < map.length - 5; i++) {
            map[1][i] = 5;
        }

        for (int i = 3; i < map[2].length - 2; i++) {
            map[2][i] = 5;
        }

        for (int i = 1; i < map[3].length - 6; i++) {
            map[3][i] = 5;
        }

        for (int i = 2; i < map[4].length; i++) {
            map[4][i] = 5;
        }

        for (int i = 0; i < map[5].length - 7; i++) {
            map[5][i] = 5;
        }

        for (int i = 3; i < map[6].length - 1; i++) {
            map[6][i] = 5;
        }
    }

    public int[] encontrarHeroe() {
        int[] retorno = new int[2];
        for (int i = 0; i < getMap().length; i++) {
            for (int j = 0; j < getMap()[i].length; j++) {
                if (getMap()[i][j] == HEROE) {
                    retorno[0] = i;
                    retorno[1] = j;
                }
            }
        }
        return retorno;
    }

    public boolean moveRight() {
        int[] posHeroe = encontrarHeroe();
        BattlefieldUI battle = new BattlefieldUI();
        try {
            switch (getMap()[posHeroe[0]][posHeroe[1] + 1]) {
                case VACIO:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] + 1] = 1;
                    return true;
                case BOSS:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] + 1] = 1;
                    battle.setVisible(true);
                    return true;
                case TESORO:
                    collectTresure();
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] + 1] = 1;
                    return true;
                case SUBBOSS:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] + 1] = 1;
                    battle.setVisible(true);
                    return true;
                case OBSTACLE:
                    return false;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("You have reach the end");
            return false;
        }
        return false;
    }

    public boolean moveLeft() {
        int[] posHeroe = encontrarHeroe();
        BattlefieldUI battle = new BattlefieldUI();
        try {
            switch (getMap()[posHeroe[0]][posHeroe[1] - 1]) {
                case VACIO:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] - 1] = 1;
                    return true;
                case BOSS:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] - 1] = 1;
                    battle.setVisible(true);
                    return true;
                case TESORO:
                    collectTresure();
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] - 1] = 1;
                    return true;
                case SUBBOSS:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0]][posHeroe[1] - 1] = 1;
                    battle.setVisible(true);
                    return true;
                case OBSTACLE:
                    return false;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("You have reach the end");
            return false;
        }
        return false;
    }

    public boolean moveUp() {
        int[] posHeroe = encontrarHeroe();
        BattlefieldUI battle = new BattlefieldUI();
        try {
            switch (getMap()[posHeroe[0] - 1][posHeroe[1]]) {
                case VACIO:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] - 1][posHeroe[1]] = 1;
                    return true;
                case BOSS:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] - 1][posHeroe[1]] = 1;
                    battle.setVisible(true);
                    return true;
                case TESORO:
                    collectTresure();
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] - 1][posHeroe[1]] = 1;
                    return true;
                case SUBBOSS:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] - 1][posHeroe[1]] = 1;
                    battle.setVisible(true);
                    return true;
                case OBSTACLE:
                    return false;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("You have reach the end");
            return false;
        }
        return false;
    }

    public boolean moveDown() {
        int[] posHeroe = encontrarHeroe();
        BattlefieldUI battle = new BattlefieldUI();
        try {
            switch (getMap()[posHeroe[0] + 1][posHeroe[1]]) {
                case VACIO:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] + 1][posHeroe[1]] = 1;
                    return true;
                case BOSS:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] + 1][posHeroe[1]] = 1;
                    battle.setVisible(true);
                    return true;
                case TESORO:
                    collectTresure();
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] + 1][posHeroe[1]] = 1;
                    return true;
                case SUBBOSS:
                    map[posHeroe[0]][posHeroe[1]] = 0;
                    map[posHeroe[0] + 1][posHeroe[1]] = 1;
                    battle.setVisible(true);
                    return true;
                case OBSTACLE:
                    return false;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("You have reach the end");
            return false;
        }
        return false;
    }

    public void verificar() {
        for (int[] map1 : getMap()) {
            System.out.println(Arrays.toString(map1));
        }
    }

    private void collectTresure() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("No hay tesoros todavía");
    }

    /**
     * @return the map
     */
    public int[][] getMap() {
        return map;
    }

}
