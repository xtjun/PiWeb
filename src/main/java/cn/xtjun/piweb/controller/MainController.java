package cn.xtjun.piweb.controller;

import cn.xtjun.piweb.service.IGpio;
import cn.xtjun.piweb.service.ISystemInfo;
import cn.xtjun.piweb.tools.GpioUnit;
import com.pi4j.io.gpio.GpioPinDigitalMultipurpose;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class MainController {


    @Autowired
    private IGpio iGpio;
    @Autowired
    private ISystemInfo iSystemInfo;


    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index(ModelMap model) throws IOException {
        return info(model);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/info")
    public String info(ModelMap model) {
        try {
            model.addAttribute("info", iSystemInfo.getSystemInfo());
            return "info";
        } catch (Exception e) {
            model.addAttribute("msg", e.toString());
            return "error";
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/gpio")
    public String gpio(ModelMap model) {
        try {
            model.addAttribute("gpio", this.iGpio.getGpioList());
            return "gpio";
        } catch (Exception e) {
            model.addAttribute("msg", e.toString());
            return "error";
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/pin")
    public String pin(ModelMap model) {
        try {
            model.addAttribute("pin", this.iGpio.getGpioList());
            return "pin";
        } catch (Exception e) {
            model.addAttribute("msg", e.toString());
            return "error";
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "gpio.json")
    @ResponseBody
    public String gpio(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws ServletException, IOException {

        String cmd = request.getParameter("cmd") == null ? "" : request.getParameter("cmd");
        String gpioid = request.getParameter("gpioid") == null ? "" : request.getParameter("gpioid");
        String mode = request.getParameter("mode") == null ? "" : request.getParameter("mode");

        GpioPinDigitalMultipurpose gpio = GpioUnit.getInstance().getGpioPinDigitalMultipurpose(gpioid);

        return iGpio.cmdhandler(cmd, gpioid, mode, gpio);
    }
}
