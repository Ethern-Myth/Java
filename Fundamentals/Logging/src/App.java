import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) throws Exception {
        // Basic Logging
        // Logger.getGlobal().info("File -> Open menu item selected");

        // Advanced Logging
        Logger logger = Logger.getLogger("com.mycompany.myapp");
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);
        FileHandler handler2 = new FileHandler();
        logger.addHandler(handler2);

    }
}
