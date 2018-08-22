package cn.xtjun.piweb.service;

import java.util.Map;

/**
 * Created by Harry on 16/2/13.
 */
public interface ISysInfo {
    Map<String, Map<String, String>> getSystemInfo() throws Exception;
}
