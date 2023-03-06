package student_oksana_tarasova.lesson_7.level_1;

class WordService {

    String text;

    /*
        WordService(String text) {
            this.text = text;
        }
    */
    public String[] textAsAnArrayWords(String text) {
        String[] words = text.split(" ");
        return words;
    }

    public String repeatedWordsInText(String[] words) {
        String repeatedWord = "";
        for (int i = 0; i < words.length; i++) {
            repeatedWord = words[i];
            for (i = 1; i < words.length - 1; i++) {
                if (repeatedWord.equals(words[i])) {
                }


            }

            repeatedWord = "";
        }
        return repeatedWord;
    }


}

/*
    public int theFirstOccurrenceOfAWordInAText(String text, String word) {
        int indexWord = text.indexOf(word);
        return indexWord;
    }
}
*/
/*1. создаем две переменные: int count = 0 и String word;
2. проходим циклом по списку и поочередно присваиваем каждое его значение переменной word;
3. внутри первого цикла создаем внутренний цикл по этому же списку, где проверяем каждое значение на equals с переменной word и если они совпадают: count++;
4. выходим из тела внутренного цикла в тело внешнего и добавляем в мапу (word, count);
5. не забываем снова обнулить count;
6. тестируем
 Счетчик слов начинал с нуля, а надо с единицы, ибо слово-то одно уже есть.
*/
