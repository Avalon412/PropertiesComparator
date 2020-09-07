package com.yukon.utils.propertiescomparator;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class PropertiesSorted extends Properties {
    private Set<Object> keySet = new LinkedHashSet<>(100);

    public Enumeration<Object> keys() {
        return Collections.enumeration(keySet);
    }

    public Set<Object> keySet() {
        return keySet;
    }

    public Object put(Object key, Object value) {
        if (!keySet.contains(key)) {
            keySet.add(key);
        }
        return super.put(key, value);
    }
}
