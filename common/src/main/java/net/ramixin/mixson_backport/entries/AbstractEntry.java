package net.ramixin.mixson_backport.entries;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public abstract class AbstractEntry {

    private final int priority;

    AbstractEntry(int priority) {
        this.priority = priority;
    }

    public int priority() {
        return priority;
    }

}
