class Warrior extends Fighter {
    
    int damagePoints(Fighter wizard) {
        return (wizard.isVulnerable()) ? 10 : 6;
    }
}