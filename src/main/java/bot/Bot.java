package bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    final private String botToken = "5691318627:AAH9GUzblXHU2aT7602Y992Rhdn9KY7RS0c";
    final private String botName = "JapanMotherBot";
    Storage storage;

    Bot() {
        storage = new Storage();
    }
    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
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
            } else {
                throw new TelegramApiException();
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public String checkMessage(String textMessage) {
        String answer;
        if (textMessage.equals("/start")) {
            answer = "���������� ��������. ����� /get ���� ������� �������� ������������";
        } else if (textMessage.equals("/get")) {
            answer = storage.rndLine();
        } else {
            answer = "���� �������� �� ����������.";
        }
        return answer;
    }
}
