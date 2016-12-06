/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 * Esta clase se usa para emplear una batalla comun
 *
 * @author tania
 * @version 0.2 *
 */
public class BattleField {

    private int turno = 0;
    Character heroes[] = new Character[3];
    private Character[] enemigos;

    /**
     * *
     *
     * @param heroe0 heroe que se muestra en pantalla
     * @param heroe1 heroe de apoyo
     * @param heroe2 heroe healer
     */
    public void Batalla(Character heroe0, Character heroe1, Character heroe2) {

        heroe0 = heroes[0];
        heroe1 = heroes[1];
        heroe2 = heroes[2];

        Bestiary boss = new Bestiary();
        enemigos = new Character[(int) (Math.random() * 4) + 1];
        for (int i = 0; i < enemigos.length; i++) {
            enemigos[i] = boss.generateEnemy();

        }
        //3876532 Pedro libros

        while (saludTotal(heroes) > 0 || saludTotal(enemigos) > 0) {
            while (turno > 1) {
                atacar(enemigos[0], heroe0);
                atacar(enemigos[1], heroe1);
                atacar(enemigos[2], heroe2);
                turno = 0;
                //Mientras el turno sea = 1 atacan los enemigos, pero si el turno es 0 atacan heroes
            }
        }
    }

    /**
     * @param personajes personajes a denfender
     *
     */
    public void defend(Character[] personajes) {
        for (Character personaje : personajes) {
            personaje.setDef(personaje.getDef() + 1 / 3);
        }

    }

    /**
     * @param x gurpo de personajes al cual se le va a determinar la agilidad
     * total
     * @return x
     */
    public int agilidadGrupal(Character[] x) {
        int total = 0;
        for (Character x1 : x) {
            total += x1.getAgility();
        }

        return total;

    }

    /**
     * @param personajes grupo de personajes al que se le calculara la salud
     * total
     * @return personajes
     */
    public int saludTotal(Character[] personajes) {
        int total = 0;
        for (Character personaje : personajes) {
            total += personaje.getCurrentHp();
        }
        return total;

    }

    /**
     *
     * @param personajes a incrementar salud
     */
    public void sanarGrupal(Character[] personajes) {
        for (Character personaje : personajes) {
            personaje.setCurrentHp(50 + (int) (Math.random() * 60));
        }

    }

    /**
     * @param personajes selecciona el grupo a atacar
     */
    public void AtaqueEspecial(Character[] personajes) {
        for (Character personaje : personajes) {
            personaje.setCurrentHp(personaje.getCurrentHp() + 1 / 20);
        }

    }

    /**
     *
     * @param heroe personaje del usuario que va atacar
     * @param enemigo personaje que va a ser atacado
     */
    public void atacar(Character heroe, Character enemigo) {
        enemigo.setCurrentHp(enemigo.getCurrentHp() - (Math.abs(enemigo.getDef() - heroe.getDmg())));

        turno++;

    }

    public void saludIndividual(Character personaje) {
        personaje.getCurrentHp();
    }

}
