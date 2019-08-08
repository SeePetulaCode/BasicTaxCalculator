//Name: Mr. Jesse Byers
//Student Number: 11559304
//Instructor: Dr.Rain Xiao Dusselaar
//Date: 30/07/2019
//Class Name: Tax11559304.java

//Description: This program takes in a tax amount that the user types in and also takes in what tax category
//they belong to. Using this information, the program then calculates how much tax they have to pay. Currently the program
//only allows 4 calculations at each run.

//package itc206.assignment1

import java.util.*;

public class Tax11559304 {

    public static void main(String[] args) {

        int statusInput; //status, married single etc
        double taxableIncome; //taxable income to calculate
        double taxAmount = 0;
        int sampleCount = 1; //counts samples to 4

        Scanner console = new Scanner(System.in);


        while (sampleCount < 5) {
            System.out.println("Sample " + sampleCount);


            System.out.println("Enter the filling status: ");
            statusInput = console.nextInt();

            System.out.println("Enter the taxable income: ");
            taxableIncome = console.nextInt();


            if (statusInput == 0) {

                taxAmount = single(taxableIncome); //get the single tax amount

            } else if (statusInput == 1) {

                taxAmount = marriedJoint(taxableIncome); //get the married joint tax amount

            } else if (statusInput == 2) {

                taxAmount = marriedSeperate(taxableIncome); //get the married seperet tax amount

            } else if (statusInput == 3) { //get head of house tax amount

                taxAmount = headOfHouse(taxableIncome);

            }

            System.out.println("Tax is: " + taxAmount); //tax amount returned


            //below resets values
            taxAmount = 0.0;
            statusInput = 0;
            taxableIncome = 0.0;

            sampleCount++; //count incremented and is checked

        }
    }

    private static double single(double taxableIncome) {

        double margin = 0.1; //initial tax margin
        double taxed = 0; //taxed amount


        if (taxableIncome >= 0 & taxableIncome <= 8350) { //tax bracket 1

            taxed = taxableIncome * margin;

        } else if (taxableIncome >= 8351 & taxableIncome <= 33950) { //tax bracket 2

            taxed = margin * 8350;

            taxed = taxed + (0.15 * (taxableIncome - 8350));


        } else if (taxableIncome >= 33951 & taxableIncome <= 82250) { //tax bracket 3
            taxed = margin * 8350;

            taxed = taxed + (0.15 * (33950 - 8350));

            taxed = taxed + (0.25 * (taxableIncome - 33950));

        } else if (taxableIncome >= 82251 & taxableIncome <= 171550) { //tax bracket 4
            taxed = margin * 8350;

            taxed = taxed + (0.15 * (33950 - 8350));

            taxed = taxed + (0.25 * (82250 - 33950));

            taxed = taxed + (0.28 * (taxableIncome - 82250));

        } else if (taxableIncome >= 171551 & taxableIncome <= 372950) { //tax bracket 5
            taxed = margin * 8350;

            taxed = taxed + (0.15 * (33950 - 8350));

            taxed = taxed + (0.25 * (82250 - 33950));

            taxed = taxed + (0.28 * (171550 - 82250));

            taxed = taxed + (0.33 * (taxableIncome - 171550));

        } else if (taxableIncome > 372950) { //tax bracket 6

            taxed = margin * 8350;

            taxed = taxed + (0.15 * (33950 - 8350));

            taxed = taxed + (0.25 * (82250 - 33950));

            taxed = taxed + (0.28 * (171550 - 82250));

            taxed = taxed + (0.33 * (379250 - 171550));

            taxed = taxed + (0.35 * (taxableIncome - 372950));

        }
        return taxed; //return taxed amount
    }

    private static double marriedJoint(double taxableIncome) {

        double margin = 0.1; //initial tax margin
        double taxed = 0; //taxed amount

        if (taxableIncome >= 0 & taxableIncome <= 16700) { //tax bracket 1


            taxed = taxableIncome * margin;


        } else if (taxableIncome >= 16701 & taxableIncome <= 67900) {//tax bracket 2

            taxed = margin * 16700;

            taxed = taxed + (0.15 * (taxableIncome - 16700));


        } else if (taxableIncome >= 67901 & taxableIncome <= 137050) {//tax bracket 3
            taxed = margin * 16700;

            taxed = taxed + (0.15 * (67900 - 16700));

            taxed = taxed + (0.25 * (taxableIncome - 67900));

        } else if (taxableIncome >= 137051 & taxableIncome <= 208850) {//tax bracket 4

            taxed = margin * 16700;

            taxed = taxed + (0.15 * (67900 - 16700));

            taxed = taxed + (0.25 * (137050 - 67900));

            taxed = taxed + (0.28 * (taxableIncome - 137050));

        } else if (taxableIncome >= 208851 & taxableIncome <= 372950) {//tax bracket 5
            taxed = margin * 16700;

            taxed = taxed + (0.15 * (67900 - 16700));

            taxed = taxed + (0.25 * (137050 - 67900));

            taxed = taxed + (0.28 * (208850 - 137050));

            taxed = taxed + (0.33 * (taxableIncome - 208850));

        } else if (taxableIncome > 372950) {//tax bracket 6

            taxed = margin * 16700;

            taxed = taxed + (0.15 * (67900 - 16700));

            taxed = taxed + (0.25 * (137050 - 67900));

            taxed = taxed + (0.28 * (208850 - 137050));

            taxed = taxed + (0.33 * (300339 - 208850));

            taxed = taxed + (0.35 * (taxableIncome - 372950));


        }
        return taxed;//return taxed amount
    }

    private static double marriedSeperate(double taxableIncome) {

        double margin = 0.1; //initial tax margin
        double taxed = 0; //taxed amount

        if (taxableIncome >= 0 & taxableIncome <= 8350) {//tax bracket 1


            taxed = taxableIncome * margin;

        } else if (taxableIncome >= 8351 & taxableIncome <= 33950) {//tax bracket 2

            taxed = margin * 8350;

            taxed = taxed + (0.15 * (taxableIncome - 8350));

        } else if (taxableIncome >= 33951 & taxableIncome <= 68525) {//tax bracket 3
            taxed = margin * 8350;
            taxed = taxed + (0.15 * (33950 - 8350));
            taxed = taxed + (0.25 * (taxableIncome - 33950));

        } else if (taxableIncome >= 68526 & taxableIncome <= 104425) {//tax bracket 4
            taxed = margin * 8350;
            taxed = taxed + (0.15 * (33950 - 8350));
            taxed = taxed + (0.25 * (68525 - 33950));
            taxed = taxed + (0.28 * (taxableIncome - 68525));


        } else if (taxableIncome >= 104426 & taxableIncome <= 186475) {//tax bracket 5
            taxed = margin * 8350;
            taxed = taxed + (0.15 * (33950 - 8350));
            taxed = taxed + (0.25 * (68525 - 33950));
            taxed = taxed + (0.28 * (104425 - 68525));
            taxed = taxed + (0.33 * (taxableIncome - 104425));

        } else if (taxableIncome > 186475) {//tax bracket 6
            taxed = margin * 8350;
            taxed = taxed + (0.15 * (33950 - 8350));
            taxed = taxed + (0.25 * (68525 - 33950));
            taxed = taxed + (0.28 * (104425 - 68525));
            taxed = taxed + (0.33 * (186475 - 104425));
            taxed = taxed + (0.35 * (taxableIncome - 186475));


        }
        return taxed;//return taxed amount
    }

    private static double headOfHouse(double taxableIncome) {

        double margin = 0.1; //initial tax margin
        double taxed = 0; //taxed amount

        if (taxableIncome >= 0 & taxableIncome <= 11950) {//tax bracket 1


            taxed = taxableIncome * margin;

        } else if (taxableIncome >= 11951 & taxableIncome <= 45500) {//tax bracket 2

            taxed = margin * 11950;
            taxed = taxed + (0.15 * (taxableIncome - 11950));

        } else if (taxableIncome >= 45501 & taxableIncome <= 117450) {//tax bracket 3
            taxed = margin * 11950;
            taxed = taxed + (0.15 * (45500 - 11950));
            taxed = taxed + (0.25 * (taxableIncome - 45500));

        } else if (taxableIncome >= 117451 & taxableIncome <= 190200) {//tax bracket 4
            taxed = margin * 11950;
            taxed = taxed + (0.15 * (45500 - 11950));
            taxed = taxed + (0.25 * (117450 - 45500));
            taxed = taxed + (0.28 * (taxableIncome - 117450));

        } else if (taxableIncome >= 190201 & taxableIncome <= 372950) {//tax bracket 5
            taxed = margin * 11950;
            taxed = taxed + (0.15 * (45500 - 11950));
            taxed = taxed + (0.25 * (117450 - 45500));
            taxed = taxed + (0.28 * (190200 - 117450));
            taxed = taxed + (0.33 * (taxableIncome - 190200));

        } else if (taxableIncome > 372950) {//tax bracket 6
            taxed = margin * 11950;
            taxed = taxed + (0.15 * (45500 - 11950));
            taxed = taxed + (0.25 * (117450 - 45500));
            taxed = taxed + (0.28 * (190200 - 117450));
            taxed = taxed + (0.33 * (372950 - 190200));
            taxed = taxed + (0.35 * (taxableIncome - 372950));
        }
        return taxed;//return taxed amount
    }

}
