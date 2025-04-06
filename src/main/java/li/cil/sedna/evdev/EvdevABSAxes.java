package li.cil.sedna.evdev;

/**
 * Linux evdev <a href="https://www.kernel.org/doc/html/latest/input/event-codes.html">absolute axes types</a>.
 * <p>
 * Numeric values from Linux kernel: include/uapi/linux/input-event-codes.h
 */

public final class EvdevABSAxes {
    /*
    * Absolute X axis.
     */
    public static final int ABS_X = 0x00;

    /*
    * Absolute Y axis.
     */
    public static final int ABS_Y = 0x01;

    /*
    * Absolute Z axis.
     */
    public static final int ABS_Z = 0x02;

    /*
    * Absolute RX axis.
     */
    public static final int ABS_RX = 0x03;
    /*
    * Absolute RY axis.
     */
    public static final int ABS_RY = 0x04;

    /*
    * Absolute RZ axis.
     */
    public static final int ABS_RZ = 0x05;

    /*
    * Absolute throttle axis.
     */
    public static final int ABS_THROTTLE = 0x06;

    /*
    * Absolute rudder axis.
     */
    public static final int ABS_RUDDER = 0x07;

    /*
    * Absolute wheel axis.
     */
    public static final int ABS_WHEEL = 0x08;

    /*
    * Absolute gas pedal axis.
     */
    public static final int ABS_GAS = 0x09;

    /*
    * Absolute brake pedal axis.
     */
    public static final int ABS_BRAKE = 0x0A;

    /*
    * Absolute hat switch 0 X axis.
     */
    public static final int ABS_HAT0X = 0x10;

    /*
    * Absolute hat switch 0 Y axis.
     */
    public static final int ABS_HAT0Y = 0x11;

    /*
    * Absolute hat switch 1 X axis.
     */
    public static final int ABS_HAT1X = 0x12;

    /*
    * Absolute hat switch 1 Y axis.
     */
    public static final int ABS_HAT1Y = 0x13;

    /*
    * Absolute hat switch 2 X axis.
     */
    public static final int ABS_HAT2X = 0x14;

    /*
    * Absolute hat switch 2 Y axis.
     */
    public static final int ABS_HAT2Y = 0x15;

    /*
    * Absolute hat switch 3 X axis.
     */
    public static final int ABS_HAT3X = 0x16;

    /*
    * Absolute hat switch 3 Y axis.
     */
    public static final int ABS_HAT3Y = 0x17;

    /*
    * Absolute pressure.
     */
    public static final int ABS_PRESSURE =	 0x18;
    /*
    * Absolute distance.
     */
    public static final int ABS_DISTANCE =	 0x19;
    /*
    * Absolute tilt X axis.
     */
    public static final int ABS_TILT_X =	 0x1a;
    /*
    * Absolute tilt Y axis.
     */
    public static final int ABS_TILT_Y =	 0x1b;
    /*
    * Absolute tool width.
     */
    public static final int ABS_TOOL_WIDTH =	 0x1c;

    /*
    * Absolute volume.
     */
    public static final int ABS_VOLUME =	 0x20;

    /*
        * Absolute profile.
     */
    public static final int ABS_PROFILE =	 0x21;

    /*
        * Absolute generic.
     */
    public static final int ABS_MISC =	 0x28;

    public static final int ABS_MT_SLOT =	 0x2f;	/* MT slot being modified */
    public static final int ABS_MT_TOUCH_MAJOR = 0x30;	/* Major axis of touching ellipse */
    public static final int ABS_MT_TOUCH_MINOR = 0x31;	/* Minor axis (omit if circular) */
    public static final int ABS_MT_WIDTH_MAJOR = 0x32;	/* Major axis of approaching ellipse */
    public static final int ABS_MT_WIDTH_MINOR = 0x33;	/* Minor axis (omit if circular) */
    public static final int ABS_MT_ORIENTATION = 0x34;	/* Ellipse orientation */
    public static final int ABS_MT_POSITION_X = 0x35;	/* Center X touch position */
    public static final int ABS_MT_POSITION_Y = 0x36;	/* Center Y touch position */
    public static final int ABS_MT_TOOL_TYPE = 0x37;	/* Type of touching device */
    public static final int ABS_MT_BLOB_ID =	 0x38;	/* Group a set of packets as a blob */
    public static final int ABS_MT_TRACKING_ID = 0x39;	/* Unique ID of initiated contact */
    public static final int ABS_MT_PRESSURE =	 0x3a;	/* Pressure on contact area */
    public static final int ABS_MT_DISTANCE =	 0x3b;	/* Contact hover distance */
    public static final int ABS_MT_TOOL_X =	 0x3c;	/* Center X tool position */
    public static final int ABS_MT_TOOL_Y =	 0x3d;	/* Center Y tool position */

    public static final int[] ALL_AXES = {
    ABS_X,
    ABS_Y,
    ABS_Z,
    ABS_RX,
    ABS_RY,
    ABS_RZ,
    ABS_THROTTLE,
    ABS_RUDDER,
    ABS_WHEEL,
    ABS_GAS,
    ABS_BRAKE,
    ABS_HAT0X,
    ABS_HAT0Y,
    ABS_HAT1X,
    ABS_HAT1Y,
    ABS_HAT2X,
    ABS_HAT2Y,
    ABS_HAT3X,
    ABS_HAT3Y,
    ABS_PRESSURE,
    ABS_DISTANCE,
    ABS_TILT_X,
    ABS_TILT_Y,
    ABS_TOOL_WIDTH,
    ABS_VOLUME,
    ABS_PROFILE,
    ABS_MISC,
    ABS_MT_SLOT,
    ABS_MT_TOUCH_MAJOR,
    ABS_MT_TOUCH_MINOR,
    ABS_MT_WIDTH_MAJOR,
    ABS_MT_WIDTH_MINOR,
    ABS_MT_ORIENTATION,
    ABS_MT_POSITION_X,
    ABS_MT_POSITION_Y,
    ABS_MT_TOOL_TYPE,
    ABS_MT_BLOB_ID,
    ABS_MT_TRACKING_ID,
    ABS_MT_PRESSURE,
    ABS_MT_DISTANCE,
    ABS_MT_TOOL_X,
    ABS_MT_TOOL_Y,
    };
}
