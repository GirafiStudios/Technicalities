package com.technicalitiesmc.pneumatics.tube.module;

import com.technicalitiesmc.pneumatics.tube.modules.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public enum ModuleManager {
    INSTANCE;

    private final Map<String, TubeModule.Type<?, ?>> types = new HashMap<>();

    ModuleManager() {
        register(GlassLensModule.TYPE);
        register(ColorFilterModule.TYPE);
        register(OneWayValveModule.TYPE);
        register(SlimyMembraneModule.TYPE);
        register(InserterModule.TYPE);
    }

    private void register(TubeModule.Type<?, ?> type) {
        types.put(type.getName(), type);
    }

    public Collection<TubeModule.Type<?, ?>> getTypes() {
        return types.values();
    }

    public TubeModule.Type<?, ?> get(String name) {
        return types.get(name);
    }

}
