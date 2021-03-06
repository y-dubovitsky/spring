package space.dubovitsky.ioc.factory;

import space.dubovitsky.ioc.component.MessageProvider;
import space.dubovitsky.ioc.component.MessageRender;

import java.io.InputStream;
import java.util.Properties;

/**
 * Это очень очень ооооочень упрощенная реализация IOC, т.е. этот класс берет на себя функции по созданию и предоставления 'БИНОВ'
 */
public class MessageFactory {

    private static MessageProvider messageProvider;
    private static MessageRender messageRender;

    static {
        Properties properties = new Properties();
        try(InputStream is = MessageFactory.class
                .getClassLoader()
                .getResourceAsStream("properties.properties")
        ) {
            properties.load(is);
            messageProvider = (MessageProvider) Class.forName(properties.getProperty("MessageProvider")).newInstance();
            messageRender = (MessageRender) Class.forName(properties.getProperty("MessageRender"))
                    .getConstructor(MessageProvider.class)
                    .newInstance(messageProvider);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static MessageProvider getMessageProvider() {
        return messageProvider;
    }

    public static MessageRender getMessageRender() {
        return messageRender;
    }
}
