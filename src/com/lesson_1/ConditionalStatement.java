package com.lesson_1;

class ConditionalStatement {
    public static void main(String[] args) {
        int age = 27;
        boolean male = true;
        double height = 1.76;
        String firstNameLetter = "М";
        //String firstNameLetter = "И";

        if(age > 20) {
            System.out.println("Вам больше 20 лет");
        }

        if(male) {
            System.out.println("Вы - мужчина");
        }

        if(!male) {
            System.out.println("Вы - женщина");
        }

        if(height < 1.80) {
            System.out.println("Ваш рост менее 180 сантиметров");
        } else {
            System.out.println("Ваш рост более 180 сантиметров");
        }

        if(firstNameLetter == "М") {
            System.out.println("Ваше имя начинается с буквы \"М\"");
        } else if(firstNameLetter == "И") {
            System.out.println("Ваше имя начинается с буквы \"И\"");
        } else {
            System.out.println("Ваше имя начинается с неизвестной нам буквы");
        }
    }
}
