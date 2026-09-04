package net.ramixin.mixson_backport.entries;

import net.ramixin.mixson_backport.MixsonEvent;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public class EventEntry<T> extends AbstractEntry {

    private final MixsonEvent<T> event;

    public EventEntry(int priority, MixsonEvent<T> event) {
        super(priority);
        this.event = event;
    }

    public MixsonEvent<T> event() {
        return event;
    }

}
