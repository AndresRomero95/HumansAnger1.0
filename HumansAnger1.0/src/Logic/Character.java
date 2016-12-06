/**
 *
 */
package Logic;

/**
 * esta calse contendra todos los parametros necesarios para la creacion de los personajes
 * involucrados en la historia del juego y asi mismo crear y/o modificar personajes
 * @author Andres
 */
public class Character {

    private final String name;
    private int agility;
    private int hp;
    private int currentHp;
    private int dmg;
    private boolean isHero;
    private int def;
/**
 * este metodo dara a conocer el nivel de defensa de cada personaje
 * @return el nivel de defensa del personaje
 */
    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
    
/**
 * 
 * @return el nombre de los personajes
 */
    public String getName() {
        return name;
    }
/**
 * Este meotodo sera utilizado para el metodo de batalla
 * @return int de agilidad
 */
    public int getAgility() {
        return agility;
    }

/**
 * 
 * @return int vida del personaje o del array heroes y/o enemigos
 */
    public int getHp() {
        return hp;
    }
/**
 * Con este metodo se conocera el nivel de vida de los personajes
 * @param hp hp del personaje
 */
    public void setHp(int hp) {
        this.hp = hp;
    }
/**
 * se obtendra el nivel de vida del personaje o array para saber si se 
 * continua o no la batalla y saber asi mismo quien es el ganador
 * @return devuelve el valor
 */
    public int getCurrentHp() {
        return hp;
    }
/**
 * Se utilizara este metodo en la batalla para la curacion de aliados 
 * y/o recoger tesoros en el mapa, los cuales aumentaran el nivel de vida del 
 * personaje principal
 * 
 * @param currentHp hp actual del personaje
 */
    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }
/**
 * se obtendra el nivel de daño del los personajes y/o arrays
 * @return el valor
 */
    public int getDmg() {
        return dmg;
    }
    
    
    
    

/**
 * Se podra conocer el tipo de personaje para asi mismo ser organizados en los arrays
 * @return boolean true o false dependiendo del personaje
 */
    public boolean isIsHero() {
        return isHero;
    }


/**
 * Con este constructor se podran crear nuevas instancias de los personajes
 * @param name nombre del personaje
 * @param dmgRate rtae para el daño
 * @param hpRate rate para la salud del personaje 
 * @param dffRate rate para la defensa del personaje
 * @param evaRate rate de la agilidad
 */
    public Character(String name, double dmgRate,double hpRate, double dffRate, double evaRate) {
        this.name = name;
        this.hp = (int) (hp * (1 + Math.random() * hpRate));
        this.currentHp = hp;
        this.def = (int) (def * (1 + Math.random() * (dffRate)));
        this.agility = (int) (agility * (1 + Math.random() * (evaRate)));
        
    }

}
