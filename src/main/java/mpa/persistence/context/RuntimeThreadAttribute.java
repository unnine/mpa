package mpa.persistence.context;

import mpa.persistence.exception.InvalidAttributeStateException;
import mpa.util.Log;

public class RuntimeThreadAttribute {

    private static final ThreadLocal<RuntimeAttribute> attributes = new ThreadLocal<>();


    public void set(RuntimeAttribute runtimeAttribute) {
        attributes.set(runtimeAttribute);
    }

    public RuntimeAttribute get() {
        if (exists()) {
            return attributes.get();
        }
        throw new InvalidAttributeStateException(Log.format("runtime attribute is null"));
    }

    public boolean exists() {
        return attributes.get() != null;
    }

    public void clear() {
        attributes.remove();
    }

}
