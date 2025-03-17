/*
 * @description:
 * @author: ngphthinh
 * @date: 3/17/2025
 * @version: 1.0
 * @last_modified: 3/17/2025
 */


package iuh.se.config;

import java.net.URL;


public class Config {
    // Define the relative path for images inside resources
    public static final String IMAGE_PATH = "images/";

    // Get the full image path from the classpath
    public static String getImagePath(String fileName) {
        URL url = Config.class.getClassLoader().getResource(IMAGE_PATH + fileName);
        if (url == null) {
            throw new RuntimeException("Image not found: " + IMAGE_PATH + fileName);
        }
        return url.toExternalForm().replace("file:/",""); // Returns a URL for JavaFX or Swing
    }
}
