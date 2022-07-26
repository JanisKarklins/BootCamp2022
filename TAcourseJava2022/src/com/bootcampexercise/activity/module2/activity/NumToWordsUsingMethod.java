package com.bootcampexercise.activity.module2.activity;

public class NumToWordsUsingMethod {
    public static void main(String[] args) { //activity 9
        // complete the code to print text value of 8, 9 and 10

        printMyWord(1);
        printMyWord(3);
        printMyWord(5);


    }

    private static void printMyWord(int case_numb) {
        final String numText;



        switch(case_numb) {
            case 1:
                numText = "ONE";break;
            case 2:
                numText = "TWO";break;
            case 3:
                numText = "THREE";break;
            case 4:
                numText = "FOUR";break;
            case 5:
                numText = "FIVE";break;
            case 6:
                numText = "SIX";break;
            case 7:
                numText = "SEVEN";break;
            case 8:
                numText = "EIGHT";break;
            case 9:
                numText = "NINE";break;
            case 10:
                numText = "TEN";break;
            default:
                numText = "NUMBER " + case_numb;
        }
        System.out.println(numText);

    }
}
