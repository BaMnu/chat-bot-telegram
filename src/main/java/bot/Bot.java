package bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;

public class Bot extends TelegramLongPollingBot {
    Storage storage;

    Bot() {
        storage = new Storage();
    }
    @Override
    public String getBotUsername() {
        return "JapanMotherBot";
    }

    @Override
    public String getBotToken() {
        return "ТУТЫ ЧОЛИ ТОКЕН ТО ПИСАТЬ?)))))))))))))";
    }

    @Override
    public void onUpdateReceived(Update update) {

        try {
            if(update.hasMessage() && update.getMessage().hasText()) {
                Message message = update.getMessage();
                String chatId = message.getChatId().toString();
                String answer = checkMessage(message.getText());
                SendMessage response = new SendMessage();
                response.setChatId(chatId);
                response.setText(answer);
                execute(response);
            } else {
                throw new TelegramApiException();
            }
        } catch (TelegramApiException | IOException e) {
            e.printStackTrace();
        }
    }

    public String checkMessage(String textMessage) throws IOException {
        String answer;
        try {
            if (textMessage.equals("/start")) {
                answer = "Добро пожаловать напечатайте /get , чтобы получить предсказание.";
            } else if (textMessage.equals("/get")) {
                answer = storage.randomLine();
            } else {
                answer = "Текст не распознан.";
            }
            return answer;
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}
