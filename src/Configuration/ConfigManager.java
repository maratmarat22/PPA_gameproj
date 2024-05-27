package Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

    private final Properties properties;
    private final File configFile;

    public ConfigManager(String filePath) throws IOException {

        configFile = new File(filePath);
        properties = new Properties();
        properties.load(new FileInputStream(configFile));
    }

    public void switchParam(String param) throws IOException {

        String currentValue = properties.getProperty(param);

        //if (currentValue != null) {
            // Инвертируем значение настройки
            String newValue = currentValue.equals("1") ? "0" : "1";
            properties.setProperty(param, newValue);
            // Сохраняем изменения в файл
            properties.store(new FileOutputStream(configFile), null);
        //} else {
        //    System.out.println("Setting not found: " + param);
        //}
    }

    public static String returnParamValueString(ConfigManager configManager, String param) {

        String value = configManager.properties.getProperty(param);
        return value.equals("1") ? "on" : "off";
    }
}
