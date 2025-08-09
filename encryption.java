import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CaesarDecrypt {
    
    // Метод для расшифровки текста шифром Цезаря
    public static String decrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            // Обработка строчных букв
            if (c >= 'a' && c <= 'z') {
                // Сдвигаем символ назад в алфавите
                char shifted = (char)(((c - 'a' - shift + 26) % 26) + 'a');
                result.append(shifted);
            } 
            // Обработка заглавных букв
            else if (c >= 'A' && c <= 'Z') {
                char shifted = (char)(((c - 'A' - shift + 26) % 26) + 'A');
                result.append(shifted);
            } 
            // Остальные символы оставляем как есть
            else {
                result.append(c);
            }
        }
        return result.toString();
    }
