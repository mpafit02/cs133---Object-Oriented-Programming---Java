package model;
/**
 * Author: Marios Pafitis 911719 mpafit02
 * 
 * Hybrid Unit is a Military Unit. Can only counter attacked by Hybrid Units 
 * 
 * Return the following symbol: H 
 * 
 * Constructor: HybridUnit(Civilization owner)
 * 
 * Methods: symbol, toString, battle
 * 
 * @author Marios
 *
 */
class HybridUnit extends MilitaryUnit {
    /**
     * @param owner;
     */
    public HybridUnit(Civilization owner) {
        super(50, owner, 10, 10, 14, 5, 0, 30);
    }

    @Override
    public void battle(MapObject o) {
        o.damage(this.getDamage());
        if (!o.isDestroyed() && o instanceof HybridUnit) {
            damage(((MilitaryUnit) o).getDamage());
        }
    }

    @Override
    public char symbol() {
        return 'H';
    }


    @Override
    public String toString() {
        return "Hybrid Unit. " + super.toString();
    }
}
