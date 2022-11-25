package bot;

import org.apache.log4j.BasicConfigurator;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        BasicConfigurator.configure();

        try {
            TelegramBotsApi tba = new TelegramBotsApi(DefaultBotSession.class);
            tba.registerBot(new Bot());
        } catch (TelegramApiException e) {
            System.out.println("Sorry something went wrong. Please try again later.");
            throw new TelegramApiException(e);
        }
    }
}
