class Wizard extends Fighter {

    private boolean vulnerable = true;

    @Override
    boolean isVulnerable() {
        return vulnerable;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return isVulnerable() ? 3 : 12;
    }

    void prepareSpell() {
        vulnerable = false;
    }

}