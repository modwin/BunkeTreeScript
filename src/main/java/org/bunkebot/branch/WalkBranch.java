package org.bunkebot.branch;

import org.bunkebot.leaf.walkleaf.WalkToBankLeaf;
import org.bunkebot.leaf.walkleaf.WalkToTrainingAreaLeaf;
import org.dreambot.api.script.frameworks.treebranch.Branch;

public class WalkBranch extends Branch {

    public WalkBranch(){
        addLeaves(
                new WalkToBankLeaf(),
                new WalkToTrainingAreaLeaf()
        );

    }
    @Override
    public boolean isValid() {
        return false;
    }
}
