package li.cil.sedna.device.virtio;

import li.cil.sedna.api.memory.MemoryMap;
import li.cil.sedna.evdev.EvdevEvents;


public abstract class AbstractVirtIOABSDevice extends AbstractVirtIOInputDevice {

    public void sendAxisEvent(final int axis, final int value) {
        putEvent(EvdevEvents.EV_ABS, axis, value);
        putSyn();
    }

    public void sendMultipleAxesEvent(final int[] axes, final int[] values) {
        if (axes.length != values.length) {
            throw new IllegalArgumentException("Axis and values arrays must be of the same length");
        }

        for (int i = 0; i < axes.length; i++) {
            putEvent(EvdevEvents.EV_ABS, axes[i], values[i]);
        }
        putSyn();
    }


    protected AbstractVirtIOABSDevice(MemoryMap memoryMap) {
        super(memoryMap);
    }
}

