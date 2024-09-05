package org.bunkebot.branch;

import org.bunkebot.cfg.Config;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.frameworks.treebranch.Branch;

import java.util.Objects;

public class ParentBranch extends Branch {

    public ParentBranch(){
        this(Config.INSTANCE.getCategory());
    }

    private ParentBranch(Category category){
        if (Objects.requireNonNull(category) == Category.COMBAT) {
            addLeaves(
                    new CombatBranch(),
                    new AntiBanBranch(),
                    new WalkBranch()
            );
        }
        else
            addLeaves(
                    new SkillingBranch(),
                    new AntiBanBranch(),
                    new WalkBranch()
            );
    }


    @Override
    public boolean isValid() {
        return false;
    }

}
