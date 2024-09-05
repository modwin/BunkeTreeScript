package org.bunkebot.branch;

import org.dreambot.api.script.frameworks.treebranch.Branch;

public class AntiBanBranch extends Branch {
    @Override
    public boolean isValid() {
        return false;
    }
}
