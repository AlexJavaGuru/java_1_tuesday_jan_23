package student_vladislav_romanov.lesson_12.level_3;

class NullPointerExceptionDemo {

    public static void main(String[] args) {
        String str = null;
        int length = str.length();
        System.out.println(length);
    }

//    Это исключение возникает когда JVM пытается получить доступ к объекту или пытается вызвать метод объекта, а вместо ссылки на объект получает null. Так же в Java Doc указаны следующие причины:
//     - Доступ или изменения метода на объекте, который является недействительным. (т.е. вместо ссылки на объект JVM получает null)
//     - Получение длину массива, когда он является недействительным. (не инициализированный к примеру)
//     - Попытка доступа к несуществующему элементу массива типа Object. (т.е. Когда вместо ссылки на объект элемент массива содержит null)


}
