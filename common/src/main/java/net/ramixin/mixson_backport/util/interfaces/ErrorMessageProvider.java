package net.ramixin.mixson_backport.util.interfaces;

import net.minecraft.resources.ResourceLocation;
import net.ramixin.mixson_backport.enums.ErrorPolicy;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public interface ErrorMessageProvider {

    String getRuntimeErrorMessage(ResourceLocation resourceId);

    ErrorPolicy getErrorPolicy();

    String getRegistrationMessage(int priority);
}
