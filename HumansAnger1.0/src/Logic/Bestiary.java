/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 * Esta clase se usa para crear los posibles enemigos, y heroes
 *
 * @author tania
 * @version 0.2 *
 */
public class Bestiary {

    private final Character enemigos[] = new Character[15];
    private final Character heroes[] = new Character[2];

    public Bestiary() {

        enemigos[0] = new Character("Anuibis", 34, 34, 45, 55);
        enemigos[1] = new Character("Arcangel", 34, 34, 45, 55);
        enemigos[2] = new Character("Baphomet", 34, 34, 45, 55);
        enemigos[3] = new Character("Beleth", 34, 34, 45, 55);
        enemigos[4] = new Character("Bifrons", 34, 34, 45, 55);
        enemigos[5] = new Character("Set", 34, 34, 45, 55);
        enemigos[6] = new Character("Cerberus", 34, 34, 45, 55);
        enemigos[7] = new Character("Emmao", 34, 34, 45, 55);
        enemigos[8] = new Character("Ganesha", 34, 34, 45, 55);
        enemigos[9] = new Character("Hades", 34, 34, 45, 55);
        enemigos[10] = new Character("Jesus", 34, 34, 45, 55);
        enemigos[11] = new Character("Vishnu", 32, 56, 78, 77);
        enemigos[12] = new Character("Ucrunius", 34, 32, 16, 76);
        enemigos[13] = new Character("Vassago", 56, 33, 23, 97);
        enemigos[14] = new Character("Lilith", 23, 23, 57, 3);
        enemigos[15] = new Character("Ra", 45, 54, 5, 5);
        heroes[0] = new Character("Robot 0", 46, 33, 32, 54);
        heroes[1] = new Character("Robot 1", 67, 43, 12, 3);
        heroes[2] = new Character("Robot 2", 3, 4, 2, 1);

    }

    /**
     *
     * @return devuelve los enemigos generados
     */
    public Character generateEnemy() {
        return (Character) enemigos[(int) (Math.random() * 15)];
    }

}
