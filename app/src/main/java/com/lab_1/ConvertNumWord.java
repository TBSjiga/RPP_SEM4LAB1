package com.lab_1;

public class ConvertNumWord {
    public String getNumber(int x) {
        if (x == 1000000){
            return "миллион";
        }

        StringBuilder ansBuilder = new StringBuilder();

        if (x / 1000 > 0) {
            ansBuilder.append(getNumberTo999(x / 1000, true));
            ansBuilder.append(" ");
            ansBuilder.append(getWord1000(x / 1000));
            ansBuilder.append(" ");
        }

        x = x % 1000;

        if (x > 0){
            ansBuilder.append(getNumberTo999(x, false));
        }
        return ansBuilder.toString().trim();
    }

    //Тысячи в слово
    private String getWord1000(int i) {
        if ((5 <= i % 100) && (i % 100 <= 20))
            return "тысяч";
        if (i % 10 == 1)
            return "тысяча";
        if ((2 <= i % 10) && (i % 10 <= 4))
            return "тысячи";
        return "тысяч";
    }

    //Вывод цифр от 1 до 9
    private String getNumFrom1to9(int x, boolean is_female){
        switch (x){
            case 1:
                return is_female ? "одна" : "один";
            case 2:
                return is_female ? "две" : "два";
            case 3:
                return "три";
            case 4:
                return "четыре";
            case 5:
                return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";
            default:
        }
        return null;
    }

    //Вывод чисел от 10 до 19
    private String getNumFrom10to19(int x){
        switch (x){
            case 10:
                return "десять";
            case 11:
                return "одиннадцать";
            case 12:
                return "двенадцать";
            case 13:
                return "тринадцать";
            case 14:
                return "четырнадцать";
            case 15:
                return "пятнадцать";
            case 16:
                return "шестнадцать";
            case 17:
                return "семнадцать";
            case 18:
                return "восемнадцать";
            case 19:
                return "девятнадцать";
            default:
        }
        return null;
    }

    //Вывод десятков
    private String getTens(int x){
        switch (x){
            case 2:
                return "двадцать";
            case 3:
                return "тридцать";
            case 4:
                return "сорок";
            case 5:
                return "пятьдесят";
            case 6:
                return "шестьдесят";
            case 7:
                return "семьдесят";
            case 8:
                return "восемьдесят";
            case 9:
                return "девяносто";
            default:
        }
        return null;
    }

    //Вывод сотен
    private String getHundreds(int x){
        switch (x){
            case 1:
                return "сто";
            case 2:
                return "двести";
            case 3:
                return "триста";
            case 4:
                return "четыреста";
            case 5:
                return "пятьсот";
            case 6:
                return "шестьсот";
            case 7:
                return "семьсот";
            case 8:
                return "восемьсот";
            case 9:
                return "девятьсот";
            default:
        }
        return null;
    }

    //Вывод числа полностью
    private String getNumberTo999(int x, boolean b) {
        StringBuilder ansBuilder = new StringBuilder();
        if (x / 100 > 0){
            ansBuilder.append(getHundreds(x / 100));
            ansBuilder.append(" ");
        }

        x = x % 100;
        if ((10 <= x) && (x <= 19)){
            ansBuilder.append(getNumFrom10to19(x));
            return ansBuilder.toString();
        }

        if (x / 10 > 0){
            ansBuilder.append(getTens(x / 10));
            ansBuilder.append(" ");
        }

        x = x % 10;

        if (x > 0){
            ansBuilder.append(getNumFrom1to9(x, b));
        }

        return ansBuilder.toString().trim();
    }
}
