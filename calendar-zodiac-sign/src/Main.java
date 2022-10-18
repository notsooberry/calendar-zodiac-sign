import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Year: ");
        int year = in.nextInt();
        System.out.println("Month Number: ");
        int month = in.nextInt();
        System.out.println("Day: ");
        int day = in.nextInt();

        zodiac(month, day);
        moonDate(year, month, day);

    }
    public void zodiac(int month, int day){
        String zodiac_sign = "";
        switch (month) {
            case (1):
                if (day > 19) {
                    zodiac_sign = "Aquarius";
                }
                else {
                    zodiac_sign = "Capricorn";
                }
                break;
            case (2):
                if (day > 18) {
                    zodiac_sign = "Pisces";
                }
                else {
                    zodiac_sign = "Aquarius";
                }
                break;
            case (3):
                if (day > 20) {
                    zodiac_sign = "Aries";
                }
                else {
                    zodiac_sign = "Pisces";
                }
                break;
            case (4):
                if (day > 19) {
                    zodiac_sign = "Taurus";
                }
                else {
                    zodiac_sign = "Aries";
                }
                break;
            case (5):
                if (day > 20) {
                    zodiac_sign = "Gemini";
                }
                else {
                    zodiac_sign = "Taurus";
                }
                break;
            case (6):
                if (day > 20) {
                    zodiac_sign = "Cancer";
                }
                else {
                    zodiac_sign = "Gemini";
                }
                break;
            case (7):
                if (day > 22) {
                    zodiac_sign = "Leo";
                }
                else {
                    zodiac_sign = "Cancer";
                }
                break;
            case (8):
                if (day > 22) {
                    zodiac_sign = "Virgo";
                }
                else {
                    zodiac_sign = "Leo";
                }
                break;
            case (9):
                if (day > 22) {
                    zodiac_sign = "Libra";
                }
                else {
                    zodiac_sign = "Virgo";
                }
                break;
            case (10):
                if (day > 22) {
                    zodiac_sign = "Scorpio";
                }
                else {
                    zodiac_sign = "Libra";
                }
                break;
            case (11):
                if (day > 21) {
                    zodiac_sign = "Sagittarius";
                }
                else {
                    zodiac_sign = "Scorpio";
                }
                break;
            case (12):
                if (day > 21) {
                    zodiac_sign = "Capricorn";
                }
                else {
                    zodiac_sign = "Sagittarius";
                }
                break;
        }
        System.out.println("Your Zodiac Sign: " + zodiac_sign + "\n");
    }
    public void moonDate(int year, int month, int day){
        int lunar_age;
        int lunar_number = 0;
        int number = 1;

        for (int i = 0; i < year; i++) {
            if(number == 19){
                number = 0;
            }
            number++;
            lunar_number = number;
        }

        lunar_age = lunar_number * 11 - 14 + day + month;
        while(lunar_age > 30){
            lunar_age = lunar_age - 30;
        }

        if(lunar_age == 0 || lunar_age == 30){
            System.out.println("New moon. Moon not visible");
        }
        else if(lunar_age > 0 && lunar_age <=7){
            System.out.println("First quarter. The best time to observe is in the evening");
        }
        else if(lunar_age > 7 && lunar_age <= 15){
            System.out.println("Full Moon. Visible all night from sunset to sunrise");
        }
        else if(lunar_age > 15){
            System.out.println("Last Quarter. The Moon is best observed in the second half of the night, in the morning");
        }
    }

}
