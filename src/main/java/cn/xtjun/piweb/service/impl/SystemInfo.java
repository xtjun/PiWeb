package cn.xtjun.piweb.service.impl;

import cn.xtjun.piweb.service.ISystemInfo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SystemInfo implements ISystemInfo {

    @Override
    public Map<String, Map<String, String>> getSystemInfo() throws Exception {
        Map<String, Map<String, String>> group = new HashMap<>();

        Map<String, String> info1 = new HashMap<>();
        info1.put("Serial Number", com.pi4j.system.SystemInfo.getSerial());
        info1.put("CPU Revision", com.pi4j.system.SystemInfo.getCpuRevision());
        info1.put("CPU Architecture", com.pi4j.system.SystemInfo.getCpuArchitecture());
        info1.put("CPU Part", com.pi4j.system.SystemInfo.getCpuPart());
        info1.put("CPU Temperature", String.valueOf(com.pi4j.system.SystemInfo.getCpuTemperature()));
        info1.put("CPU Core Voltage", String.valueOf(com.pi4j.system.SystemInfo.getCpuVoltage()));
        info1.put("CPU Model Name", com.pi4j.system.SystemInfo.getModelName());
        info1.put("Processor", com.pi4j.system.SystemInfo.getProcessor());
        info1.put("Hardware Revision", com.pi4j.system.SystemInfo.getRevision());
        info1.put("Is Hard Float ABI", String.valueOf(com.pi4j.system.SystemInfo.isHardFloatAbi()));
        info1.put("Board Type", String.valueOf(com.pi4j.system.SystemInfo.getBoardType()));
        group.put("HARDWARE INFO", info1);

        Map<String, String> info7 = new HashMap<>();
        info7.put("ARM Frequency", String.valueOf(com.pi4j.system.SystemInfo.getClockFrequencyArm()));
        info7.put("CORE Frequency", String.valueOf(com.pi4j.system.SystemInfo.getClockFrequencyCore()));
        info7.put("H264 Frequency", String.valueOf(com.pi4j.system.SystemInfo.getClockFrequencyH264()));
        info7.put("ISP Frequency", String.valueOf(com.pi4j.system.SystemInfo.getClockFrequencyISP()));
        info7.put("V3D Frequency", String.valueOf(com.pi4j.system.SystemInfo.getClockFrequencyV3D()));
        info7.put("UART Frequency", String.valueOf(com.pi4j.system.SystemInfo.getClockFrequencyUART()));
        info7.put("PWM Frequency", String.valueOf(com.pi4j.system.SystemInfo.getClockFrequencyPWM()));
        info7.put("EMMC Frequency", String.valueOf(com.pi4j.system.SystemInfo.getClockFrequencyEMMC()));
        info7.put("Pixel Frequency", String.valueOf(com.pi4j.system.SystemInfo.getClockFrequencyPixel()));
        info7.put("VEC Frequency", String.valueOf(com.pi4j.system.SystemInfo.getClockFrequencyVEC()));
        info7.put("HDMI Frequency", String.valueOf(com.pi4j.system.SystemInfo.getClockFrequencyHDMI()));
        info7.put("DPI Frequency", String.valueOf(com.pi4j.system.SystemInfo.getClockFrequencyDPI()));
        group.put("CLOCK INFO", info7);

        Map<String, String> info2 = new HashMap<>();
        info2.put("Total Memory", String.valueOf(com.pi4j.system.SystemInfo.getMemoryTotal()));
        info2.put("Used Memory", String.valueOf(com.pi4j.system.SystemInfo.getMemoryUsed()));
        info2.put("Free Memory", String.valueOf(com.pi4j.system.SystemInfo.getMemoryFree()));
        info2.put("Shared Memory", String.valueOf(com.pi4j.system.SystemInfo.getMemoryShared()));
        info2.put("Memory Buffers", String.valueOf(com.pi4j.system.SystemInfo.getMemoryBuffers()));
        info2.put("Cached Memory", String.valueOf(com.pi4j.system.SystemInfo.getMemoryCached()));
        info2.put("SDRAM_C Voltage", String.valueOf(com.pi4j.system.SystemInfo.getMemoryVoltageSDRam_C()));
        info2.put("SDRAM_I Voltage", String.valueOf(com.pi4j.system.SystemInfo.getMemoryVoltageSDRam_I()));
        info2.put("SDRAM_P Voltage", String.valueOf(com.pi4j.system.SystemInfo.getMemoryVoltageSDRam_P()));
        group.put("MEMORY INFO", info2);

        Map<String, String> info4 = new HashMap<>();
        info4.put("Java Vendor", com.pi4j.system.SystemInfo.getJavaVendor());
        info4.put("Java Vendor URL", com.pi4j.system.SystemInfo.getJavaVendorUrl());
        info4.put("Java Version", com.pi4j.system.SystemInfo.getJavaVersion());
        info4.put("Java VM", com.pi4j.system.SystemInfo.getJavaVirtualMachine());
        info4.put("Java Runtime", com.pi4j.system.SystemInfo.getJavaRuntime());
        group.put("JAVA ENVIRONMENT INFO", info4);

//        Map<String, String> info5 = new HashMap<>();
//        info5.put("Hostname", NetworkInfo.getHostname());
//        for (String ipAddress : NetworkInfo.getIPAddresses())
//            info5.put("IP Addresses", ipAddress);
//        for (String fqdn : NetworkInfo.getFQDNs())
//            info5.put("FQDN", fqdn);
//        for (String nameserver : NetworkInfo.getNameservers())
//            info5.put("Nameserver", nameserver);
//        group.put("NETWORK INFO", info5);

//        Map<String, String> info6 = new HashMap<>();
//        info6.put("H264 Codec Enabled", String.valueOf(com.pi4j.system.SystemInfo.getCodecH264Enabled()));
//        info6.put("MPG2 Codec Enabled", String.valueOf(com.pi4j.system.SystemInfo.getCodecMPG2Enabled()));
//        info6.put("WVC1 Codec Enabled", String.valueOf(com.pi4j.system.SystemInfo.getCodecWVC1Enabled()));
//        group.put("CODEC INFO", info6);

        Map<String, String> info3 = new HashMap<>();
        info3.put("OS Name", com.pi4j.system.SystemInfo.getOsName());
        info3.put("OS Version", com.pi4j.system.SystemInfo.getOsVersion());
        info3.put("OS Architecture", com.pi4j.system.SystemInfo.getOsArch());
        info3.put("OS Firmware Date", com.pi4j.system.SystemInfo.getOsFirmwareDate());
        group.put("OPERATING SYSTEM INFO", info3);

        return group;
    }
}
