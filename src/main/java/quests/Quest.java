package quests;

import chests.Chest;
import player.Player;
import player.Stats;

import java.util.Random;

public class Quest {
    private Player player = Player.getInstance();
    private String name;
    private String description;
    private String assetId;
    private int level;
    private int difficulty;
    private int expReward;
    private Stats minimumStats;
    private QuestType questType;

    public Quest(String name, String description, String assetId, int level, int difficulty, int expReward, QuestType questType) {
        this.name = name;
        this.description = description;
        this.assetId = assetId;
        this.level = level;
        this.difficulty = difficulty;
        this.expReward = expReward;
        this.questType = questType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuestType getQuestType() {
        return questType;
    }

    public void setQuestType(QuestType questType) {
        this.questType = questType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getExpReward() {
        return expReward;
    }

    public void setExpReward(int expReward) {
        this.expReward = expReward;
    }

    public Stats getMinimumStats() {
        return minimumStats;
    }
}
