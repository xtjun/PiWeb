package cn.xtjun.piweb.tools;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalMultipurpose;
import com.pi4j.io.gpio.PinMode;
import com.pi4j.io.gpio.RaspiPin;

import java.util.HashMap;
import java.util.Map;

public class GpioUnit {

    private static final GpioController GPIO;
    private static final GpioPinDigitalMultipurpose GPIO_00;
    private static final GpioPinDigitalMultipurpose GPIO_01;
    private static final GpioPinDigitalMultipurpose GPIO_02;
    private static final GpioPinDigitalMultipurpose GPIO_03;
    private static final GpioPinDigitalMultipurpose GPIO_04;
    private static final GpioPinDigitalMultipurpose GPIO_05;
    private static final GpioPinDigitalMultipurpose GPIO_06;
    private static final GpioPinDigitalMultipurpose GPIO_07;
    private static final GpioPinDigitalMultipurpose GPIO_08;
    private static final GpioPinDigitalMultipurpose GPIO_09;
    private static final GpioPinDigitalMultipurpose GPIO_10;
    private static final GpioPinDigitalMultipurpose GPIO_11;
    private static final GpioPinDigitalMultipurpose GPIO_12;
    private static final GpioPinDigitalMultipurpose GPIO_13;
    private static final GpioPinDigitalMultipurpose GPIO_14;
    private static final GpioPinDigitalMultipurpose GPIO_15;
    private static final GpioPinDigitalMultipurpose GPIO_16;
//    private static final GpioPinDigitalMultipurpose GPIO_17;
//    private static final GpioPinDigitalMultipurpose GPIO_18;
//    private static final GpioPinDigitalMultipurpose GPIO_19;
//    private static final GpioPinDigitalMultipurpose GPIO_20;
//    private static final GpioPinDigitalMultipurpose GPIO_21;
//    private static final GpioPinDigitalMultipurpose GPIO_22;
//    private static final GpioPinDigitalMultipurpose GPIO_23;
//    private static final GpioPinDigitalMultipurpose GPIO_24;
//    private static final GpioPinDigitalMultipurpose GPIO_25;
//    private static final GpioPinDigitalMultipurpose GPIO_26;
//    private static final GpioPinDigitalMultipurpose GPIO_27;
//    private static final GpioPinDigitalMultipurpose GPIO_28;
//    private static final GpioPinDigitalMultipurpose GPIO_29;

    private static final Map<String, GpioPinDigitalMultipurpose> GPIO_MAP;

    static {
        GPIO = GpioFactory.getInstance();
        GPIO_MAP = new HashMap<>();
        GPIO_00 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_00, "GPIO_00", PinMode.DIGITAL_INPUT);
        GPIO_01 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_01, "GPIO_01", PinMode.DIGITAL_INPUT);
        GPIO_02 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_02, "GPIO_02", PinMode.DIGITAL_INPUT);
        GPIO_03 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_03, "GPIO_03", PinMode.DIGITAL_INPUT);
        GPIO_04 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_04, "GPIO_04", PinMode.DIGITAL_INPUT);
        GPIO_05 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_05, "GPIO_05", PinMode.DIGITAL_INPUT);
        GPIO_06 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_06, "GPIO_06", PinMode.DIGITAL_INPUT);
        GPIO_07 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_07, "GPIO_07", PinMode.DIGITAL_INPUT);
        GPIO_08 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_08, "GPIO_08", PinMode.DIGITAL_INPUT);
        GPIO_09 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_09, "GPIO_09", PinMode.DIGITAL_INPUT);
        GPIO_10 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_10, "GPIO_10", PinMode.DIGITAL_INPUT);
        GPIO_11 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_11, "GPIO_11", PinMode.DIGITAL_INPUT);
        GPIO_12 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_12, "GPIO_12", PinMode.DIGITAL_INPUT);
        GPIO_13 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_13, "GPIO_13", PinMode.DIGITAL_INPUT);
        GPIO_14 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_14, "GPIO_14", PinMode.DIGITAL_INPUT);
        GPIO_15 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_15, "GPIO_15", PinMode.DIGITAL_INPUT);
        GPIO_16 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_16, "GPIO_16", PinMode.DIGITAL_INPUT);
//        GPIO_17 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_17, "GPIO_17", PinMode.DIGITAL_INPUT);
//        GPIO_18 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_18, "GPIO_18", PinMode.DIGITAL_INPUT);
//        GPIO_19 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_19, "GPIO_19", PinMode.DIGITAL_INPUT);
//        GPIO_20 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_20, "GPIO_20", PinMode.DIGITAL_INPUT);
//        GPIO_21 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_21, "GPIO_21", PinMode.DIGITAL_INPUT);
//        GPIO_22 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_22, "GPIO_22", PinMode.DIGITAL_INPUT);
//        GPIO_23 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_23, "GPIO_23", PinMode.DIGITAL_INPUT);
//        GPIO_24 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_24, "GPIO_24", PinMode.DIGITAL_INPUT);
//        GPIO_25 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_25, "GPIO_25", PinMode.DIGITAL_INPUT);
//        GPIO_26 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_26, "GPIO_26", PinMode.DIGITAL_INPUT);
//        GPIO_27 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_27, "GPIO_27", PinMode.DIGITAL_INPUT);
//        GPIO_28 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_28, "GPIO_28", PinMode.DIGITAL_INPUT);
//        GPIO_29 = GPIO.provisionDigitalMultipurposePin(RaspiPin.GPIO_29, "GPIO_29", PinMode.DIGITAL_INPUT);

        GPIO_MAP.put("GPIO_00", GPIO_00);
        GPIO_MAP.put("GPIO_01", GPIO_01);
        GPIO_MAP.put("GPIO_02", GPIO_02);
        GPIO_MAP.put("GPIO_03", GPIO_03);
        GPIO_MAP.put("GPIO_04", GPIO_04);
        GPIO_MAP.put("GPIO_05", GPIO_05);
        GPIO_MAP.put("GPIO_06", GPIO_06);
        GPIO_MAP.put("GPIO_07", GPIO_07);
        GPIO_MAP.put("GPIO_08", GPIO_08);
        GPIO_MAP.put("GPIO_09", GPIO_09);
        GPIO_MAP.put("GPIO_10", GPIO_10);
        GPIO_MAP.put("GPIO_11", GPIO_11);
        GPIO_MAP.put("GPIO_12", GPIO_12);
        GPIO_MAP.put("GPIO_13", GPIO_13);
        GPIO_MAP.put("GPIO_14", GPIO_14);
        GPIO_MAP.put("GPIO_15", GPIO_15);
        GPIO_MAP.put("GPIO_16", GPIO_16);
//        GPIO_MAP.put("GPIO_17", GPIO_17);
//        GPIO_MAP.put("GPIO_18", GPIO_18);
//        GPIO_MAP.put("GPIO_19", GPIO_19);
//        GPIO_MAP.put("GPIO_20", GPIO_20);
//        GPIO_MAP.put("GPIO_21", GPIO_21);
//        GPIO_MAP.put("GPIO_22", GPIO_22);
//        GPIO_MAP.put("GPIO_23", GPIO_23);
//        GPIO_MAP.put("GPIO_24", GPIO_24);
//        GPIO_MAP.put("GPIO_25", GPIO_25);
//        GPIO_MAP.put("GPIO_26", GPIO_26);
//        GPIO_MAP.put("GPIO_27", GPIO_27);
//        GPIO_MAP.put("GPIO_28", GPIO_28);
//        GPIO_MAP.put("GPIO_29", GPIO_29);

    }

    private final static GpioUnit INSTANCE = new GpioUnit();

    private GpioUnit() {
    }

    public static GpioUnit getInstance() {
        return INSTANCE;
    }

    /**
     * 用gpio名称获取该gpio的对象
     *
     * @param gpioname 该gpio的名字
     * @return 该gpio对象
     */
    public GpioPinDigitalMultipurpose getGpioPinDigitalMultipurpose(String gpioname) {
        return GPIO_MAP.get(gpioname);
    }

    /**
     * 获取gpio总个数
     *
     * @return
     */
    public int getGpioCount() {
        return GPIO_MAP.size();
    }

    /**
     * 获取存储gpio的Map
     *
     * @return
     */
    public Map<String, GpioPinDigitalMultipurpose> getGpioMap() {
        return GPIO_MAP;
    }

}
