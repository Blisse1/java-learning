package ejemplos;

public class AnnalynsInfiltration {
    final String asd = "asd";

    public static boolean canFastAttack(boolean knightIsAwake){
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisionerIsAwake){
        return knightIsAwake || archerIsAwake || prisionerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake,  boolean prisonerIsAwake){
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake,  boolean archerIsAwake,
    boolean prisonerIsAwake, boolean petDogIsPresent){
        return petDogIsPresent && !archerIsAwake || prisonerIsAwake && !knightIsAwake && !archerIsAwake;
    }
}
