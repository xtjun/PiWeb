package cn.xtjun.piweb.service.impl;

import cn.xtjun.piweb.service.IGpio;
import cn.xtjun.piweb.tools.GpioUnit;
import cn.xtjun.piweb.tools.JsonHelper;
import com.pi4j.io.gpio.GpioPinDigitalMultipurpose;
import com.pi4j.io.gpio.PinMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class Gpio implements IGpio {

    private static final Logger logger = LoggerFactory.getLogger(Gpio.class);

    @Override
    public List<String> getGpioList() {
        Map<String, GpioPinDigitalMultipurpose> gpioMap = GpioUnit.getInstance().getGpioMap();
        List<String> gpiolist = new ArrayList<>(gpioMap.keySet().stream().collect(Collectors.toList()));
        return gpiolist;
    }

    @Override
    public String cmdhandler(String cmd, String gpioid, String mode, GpioPinDigitalMultipurpose gpio) {
        switch (cmd) {
            case "get":
                if (gpio != null) {
                    JsonHelper json = new JsonHelper().setReturnCode("0", "success");
                    json.addkeyvalue("mode", gpio.getMode().toString());
                    json.addkeyvalue("state", gpio.getState().toString());

                    return json.getJsonString();
                } else {
                    JsonHelper json = new JsonHelper().setReturnCode("-1", "出现错误");
                    return json.getJsonString();
                }

            case "setmode":
                if (gpio != null) {

                    if (mode.equals("输入")) {
                        gpio.setMode(PinMode.DIGITAL_OUTPUT);
                    }
                    if (mode.equals("输出")) {
                        gpio.setMode(PinMode.DIGITAL_INPUT);
                    }
                    if (mode.equals("未知")) {
                        gpio.setMode(PinMode.DIGITAL_OUTPUT);
                    }

                    JsonHelper json = new JsonHelper().setReturnCode("0", "success");
                    json.addkeyvalue("mode", gpio.getMode().toString());
                    json.addkeyvalue("state", gpio.getState().toString());
                    return json.getJsonString();
                } else {
                    JsonHelper json = new JsonHelper().setReturnCode("-1", "出现错误");
                    return json.getJsonString();
                }

            case "setstate":
                if (gpio != null) {

                    if (mode.equals("低电平")) {
                        gpio.high();
                    }
                    if (mode.equals("高电平")) {
                        gpio.low();
                    }
                    if (mode.equals("未知")) {
                        gpio.high();
                    }

                    JsonHelper json = new JsonHelper().setReturnCode("0", "success");
                    json.addkeyvalue("mode", gpio.getMode().toString());
                    json.addkeyvalue("state", gpio.getState().toString());
                    return json.getJsonString();
                } else {
                    JsonHelper json = new JsonHelper().setReturnCode("-1", "出现错误");
                    return json.getJsonString();
                }

            case "getall":

                Iterator iter = GpioUnit.getInstance().getGpioMap().entrySet().iterator();
                JsonHelper json = new JsonHelper().setReturnCode("0", "success");

                while (iter.hasNext()) {
                    Map.Entry entry = (Map.Entry) iter.next();
                    String gpioname = (String) entry.getKey();
                    GpioPinDigitalMultipurpose pin = (GpioPinDigitalMultipurpose) entry.getValue();

                    if (pin != null) {
                        json.addcontent("gpioname", gpioname);
                        json.addcontent("mode", pin.getMode().toString());
                        json.addcontent("state", pin.getState().toString());
                        json.finishline();
                    } else {
                        json.addcontent("gpioname", gpioname);
                        json.addcontent("mode", "UNKNOW");
                        json.addcontent("state", "UNKNOW");
                        json.finishline();
                    }
                }
                json.finisharray("allgpio");
                return json.getJsonString();

            default:
                JsonHelper errorjson = new JsonHelper().setReturnCode("-1", "无法解析意图");
                return errorjson.getJsonString();
        }
    }
}
