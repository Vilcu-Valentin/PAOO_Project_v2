package quests;

public enum QuestType {
    COMBAT(new double[]{0.4, 0.1, 0.8, 0.4, 0.2, 0.0, 0.1}),
    MAGIC(new double[]{0.2, 0.9, 0.1, 0.1, 0.7, 0.2, 0.0}),
    SCOUT(new double[]{0.0, 0.1, 0.0, 0.1, 0.5, 0.8, 0.5}),
    SURVIVAL(new double[]{0.6, 0.3, 0.3, 0.2, 0.5, 0.4, 0.3}),
    DIPLOMACY(new double[]{0.0, 0.1, 0.0, 0.0, 0.8, 0.4, 0.2}),
    EXPLORATION(new double[]{0.2, 0.1, 0.2, 0.3, 0.6, 0.3, 0.8}),
    HUNTING(new double[]{0.4, 0.2, 0.5, 0.2, 0.1, 0.3, 0.6}),
    GATHERING(new double[]{0.0, 0.2, 0.1, 0.0, 0.2, 0.5, 0.0}),
    DEFENSE(new double[]{0.4, 0.2, 0.2, 0.9, 0.2, 0.0, 0.1}),
    HEIST(new double[]{0.1, 0.4, 0.1, 0.1, 0.2, 0.8, 0.5});

    private final double[] statWeights;

    QuestType(double[] statWeights) {
        this.statWeights = statWeights;
    }

    public double[] getStatWeights() {
        return statWeights;
    }
}
