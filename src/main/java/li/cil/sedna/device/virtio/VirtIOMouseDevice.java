package li.cil.sedna.device.virtio;

import li.cil.sedna.api.memory.MemoryMap;
import li.cil.sedna.evdev.EvdevABSAxes;
import li.cil.sedna.evdev.EvdevEvents;
import li.cil.sedna.evdev.EvdevKeys;

import java.nio.ByteBuffer;
import java.util.BitSet;

public class VirtIOMouseDevice extends AbstractVirtIOABSDevice {
    private static final String NAME = "virtio_mouse";


    public VirtIOMouseDevice(MemoryMap memoryMap) {
        super(memoryMap);
    }

    public void sendMouseEvent(final int x, final int y, final int button, final boolean isDown) {
        putEvent(EvdevEvents.EV_ABS, EvdevABSAxes.ABS_X, x);
        putEvent(EvdevEvents.EV_ABS, EvdevABSAxes.ABS_Y, y);
        putEvent(EvdevEvents.EV_KEY, button, isDown ? 1 : 0);
        putSyn();
    }

    public void sendMouseScrollEvent(final int scroll) {
        putEvent(EvdevEvents.EV_ABS, EvdevABSAxes.ABS_WHEEL, scroll);
        putSyn();
    }

    public void sendMouseHoverEvent(final int x, final int y) {
        putEvent(EvdevEvents.EV_ABS, EvdevABSAxes.ABS_X, x);
        putEvent(EvdevEvents.EV_ABS, EvdevABSAxes.ABS_Y, y);
        putSyn();
    }


    @Override
    protected int generateConfigUnion(final int select, final int subsel, final ByteBuffer config) {
        switch (select) {
            case VIRTIO_INPUT_CFG_SELECT_ID_NAME -> {
                final char[] chars = NAME.toCharArray();
                for (final char ch : chars) {
                    config.put((byte) ch);
                }
            }
            case VIRTIO_INPUT_CFG_SELECT_EV_BITS -> {
                switch (subsel) {
                    case EvdevEvents.EV_ABS -> {
                        final BitSet bitmap = new BitSet();
                        for (final int axis : EvdevABSAxes.ALL_AXES) {
                            bitmap.set(axis);
                        }
                        final byte[] maskBytes = bitmap.toByteArray();
                        config.put(maskBytes);
                    }
                    case EvdevEvents.EV_KEY -> {
                        final BitSet bitmap = new BitSet();
                        for (final int keycode : EvdevKeys.ALL_KEYS) {
                            bitmap.set(keycode);
                        }
                        final byte[] maskBytes = bitmap.toByteArray();
                        config.put(maskBytes);
                    }
                    case EvdevEvents.EV_REP -> config.put((byte) 0);
                }
            }
            case VIRTIO_INPUT_CFG_SELECT_ABS_INFO -> {
                ABSInfo absInfo = new ABSInfo(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0, 0);
                config.put(absInfo.toByteArray());
            }
        }

        return config.position();
    }
}
