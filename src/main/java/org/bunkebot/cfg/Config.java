package org.bunkebot.cfg;

import lombok.Data;
import org.dreambot.api.script.Category;

import java.util.HashMap;
@Data
public class Config {

    public static final Config INSTANCE = new Config();
    private HashMap<String, Category> activityType = new HashMap<>();
    private Category category;
    private String tree;
    private String npc;
    private String potion;
    private int potionAmount;
    private String food;
    private int foodAmount;
    private String combatStyle;
    private String skillingActivity;

    private Config(){

    }
}
