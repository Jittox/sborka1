package org.example;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        // Разделение текста на предложения
        String[] sentences = text.split("[.!?]");

        for (String sentence : sentences) {
            //игнорирование пустых предложений
            if (!sentence.trim().isEmpty()) {
                int vowelsCount = countVowels(sentence);
                int consonantsCount = countConsonants(sentence);

                System.out.println("В предложении: \"" + sentence.trim() + "\"");
                System.out.println("Гласных: " + vowelsCount);
                System.out.println("Согласных: " + consonantsCount);
                System.out.println("Больше " + (vowelsCount > consonantsCount ? "гласных" : "согласных"));
                System.out.println();
            }
        }
    }

    // Метод для подсчета количества гласных и согласных букв в строке
    private static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    private static int countConsonants(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (isConsonant(c)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiouАЕОУЫЭЮЯаеиоуыэюя".indexOf(c) != -1;
    }

    private static boolean isConsonant(char c) {
        return "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyzБВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ".indexOf(c) != -1;
    }
}
