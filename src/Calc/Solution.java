package Calc;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
Восьмеричный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] second;
        String first = scanner.nextLine();
        int intResult;
        int answRomeToDecimal;
        String[] answer1 = {"Samoe neveroyatnoe chislo", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        if (first.indexOf("+") > 0) {
            second = first.split("\\+");
            try {
                intResult = Integer.parseInt(second[0]) + Integer.parseInt(second[1]);
                if(intResult < 21 && intResult > 0)
                    System.out.println(intResult);
                else System.out.println("Вы вышли за пределы значений");
            }
            catch (NumberFormatException e) {
                try {
                    answRomeToDecimal = RomeToDecimar(second[0]) + RomeToDecimar(second[1]);
                    if(answRomeToDecimal < 21 && answRomeToDecimal > 0)
                        System.out.println(answer1[answRomeToDecimal]);
                    else System.out.println(answer1[110]);
                }
                catch (ArrayIndexOutOfBoundsException a){
                    System.out.println("Вы ввели некорректные данные");
                }
            }
        } else if (first.indexOf("-") > 0) {
            second = first.split("-");
            try {
                intResult = Integer.parseInt(second[0]) - Integer.parseInt(second[1]);
                if(intResult > -10 && intResult < 10)
                    System.out.println(intResult);
                else System.out.println("Вы вышли за пределы значений");
            }
            catch (NumberFormatException e) {
                try {
                    answRomeToDecimal = RomeToDecimar(second[0]) - RomeToDecimar(second[1]);
                    if(answRomeToDecimal > 0 && answRomeToDecimal < 10)
                        System.out.println(answer1[answRomeToDecimal]);
                    else
                        System.out.println(answer1[110]);
                }
                catch (ArrayIndexOutOfBoundsException a){
                    System.out.println("Вы ввели некорректные данные");
                }
            }
        } else if (first.indexOf("*") > 0) {
            second = first.split("\\*");
            try {
                intResult = Integer.parseInt(second[0]) * Integer.parseInt(second[1]);
                if(intResult < 101 && intResult > -101)
                    System.out.println(intResult);
                else System.out.println("Вы вышли за пределы значений");
            }
            catch (NumberFormatException e){
                try {
                    answRomeToDecimal = RomeToDecimar(second[0]) * RomeToDecimar(second[1]);
                    if( answRomeToDecimal < 101 && answRomeToDecimal > -101)
                        System.out.println(answer1[answRomeToDecimal]);
                    else System.out.println(answer1[110]);
                }
                catch (ArrayIndexOutOfBoundsException a){
                    System.out.println("Вы ввели некорректные данные");
                }
            }
        } else if (first.indexOf("/") > 0) {
            second = first.split("/");
            try {
                intResult = Integer.parseInt(second[0]) / Integer.parseInt(second[1]);
                if(intResult < 11 && intResult > 0)
                    System.out.println(intResult);
                else System.out.println("Вы вышли за пределы значений");
            }
            catch (NumberFormatException e){
                try {
                    answRomeToDecimal = RomeToDecimar(second[0]) / RomeToDecimar(second[1]);
                    if(answRomeToDecimal < 11 && answRomeToDecimal > 0)
                        System.out.println(answer1[answRomeToDecimal]);
                    else System.out.println(answer1[110]);
                }
                catch (ArrayIndexOutOfBoundsException a){
                    System.out.println("Вы ввели некорректные данные");
                }
            }
        } else {
            second = new String[1];
            System.out.println("Вы ввели неверные данные, вы мразь");
        }
    }
    public static int RomeToDecimar(String str) {
        String[] answer = {"Samoe neveroyatnoe chislo", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C",};
        String withoutSpace = str.trim();
        for(int i = 0; i < answer.length; i++){
            if (withoutSpace.equals(answer[i])) {
                return i;
            }
        }
        return -300;
    }

}