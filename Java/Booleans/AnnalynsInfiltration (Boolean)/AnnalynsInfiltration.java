package Ejercicios;

public class AnnalynsInfiltration {
    
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }  

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean dogIsPresent) {
        return (!knightIsAwake && !archerIsAwake && prisonerIsAwake) || (knightIsAwake && !archerIsAwake && prisonerIsAwake && dogIsPresent) || (!knightIsAwake && !archerIsAwake && !prisonerIsAwake && dogIsPresent)
                || (knightIsAwake && !archerIsAwake && !prisonerIsAwake && dogIsPresent);
    }
}
