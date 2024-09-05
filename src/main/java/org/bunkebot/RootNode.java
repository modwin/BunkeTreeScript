package org.bunkebot;

import org.bunkebot.gui.ScriptGUI;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.script.frameworks.treebranch.Root;
import org.dreambot.api.script.frameworks.treebranch.TreeScript;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

@ScriptManifest(name ="bunkebot Master Skiller", description = "Master Skiller Script", version = 1.0, author = "bunke", category = Category.WOODCUTTING, image = "")

public class RootNode extends TreeScript {

    @Override
    public void onStart(){
        try {
            SwingUtilities.invokeAndWait(ScriptGUI::initialize);
            Root root = getRoot();
        }catch (InterruptedException | InvocationTargetException e){
            log(e.getStackTrace());
            throw new RuntimeException(e);
        }
    }
}
