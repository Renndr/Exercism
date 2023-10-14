abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
    }

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();

        //wizard.prepareSpell();

        System.out.println(wizard.damagePoints(warrior));

        //System.out.println(warrior.damagePoints(wizard));
    }
}