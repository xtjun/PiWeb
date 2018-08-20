package cn.xtjun.piweb.service;

import com.pi4j.io.gpio.GpioPinDigitalMultipurpose;

import java.util.List;

public interface IGpio {

    List<String> getGpioList();

    String cmdhandler(String cmd, String gpioid, String mode, GpioPinDigitalMultipurpose gpio);
}
