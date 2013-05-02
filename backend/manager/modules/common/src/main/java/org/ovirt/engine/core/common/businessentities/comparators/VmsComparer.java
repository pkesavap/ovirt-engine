package org.ovirt.engine.core.common.businessentities.comparators;

import java.io.Serializable;

import org.ovirt.engine.core.common.businessentities.VM;

public class VmsComparer implements java.util.Comparator<VM>, Serializable {
    private static final long serialVersionUID = 2773040834879205191L;

    @Override
    public int compare(VM o1, VM o2) {
        return o1.getPriority() - o2.getPriority();
    }

    public VmsComparer() {
    }
}
