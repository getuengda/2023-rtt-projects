package controlflow_practice;

import java.util.Scanner;

public class PA303_4_1_Question7 {

	public static void main(String[] args) {
		/*
		 * 7. Create a program that lets the users input their filing status and income.
		 * Display how much tax the user would have to pay according to status and
		 * income. The U.S. federal personal income tax is calculated based on the
		 * filing status and taxable income. There are four filing statuses: Single,
		 * Married Filing Jointly, Married Filing Separately, and Head of Household. The
		 * tax rates for 2009 are shown below.
		 */

		Scanner input = new Scanner(System.in);

        System.out.println("Enter your filing status:");
        String filing_Status = input.nextLine();

        System.out.println("Enter your Your taxable income:");
        double taxable_income = input.nextDouble();

        double taxRate = getTaxRate(filing_Status, taxable_income);

        double taxOwed = taxable_income * taxRate;

        System.out.println("You owe $" + taxOwed + " in federal income tax.");

	}

	private static double getTaxRate(String filing_Status, double taxable_income) {
		switch (filing_Status) {
		case "Single":
			if (taxable_income >= 0 && taxable_income <= 8350) {
				return 0.10;
			} else if (taxable_income >= 8351 && taxable_income <= 33950) {
				return 0.15;
			} else if (taxable_income >= 33951 && taxable_income <= 82250) {
				return 0.25;
			} else if (taxable_income >= 82251 && taxable_income <= 171550) {
				return 0.28;
			} else if (taxable_income >= 171550 && taxable_income <= 372950)  {
				return 0.33;
			} else {
				return 0.35;
			}
		case "Married Filing Jointly or Qualifying Widow(er)":
			if (taxable_income >= 0 && taxable_income <= 16700) {
				return 0.10;
			} else if (taxable_income >= 16701 && taxable_income <= 67900) {
				return 0.15;
			} else if (taxable_income >= 67901 && taxable_income <= 137050) {
				return 0.25;
			} else if (taxable_income >= 137051 && taxable_income <= 208850) {
				return 0.28;
			} else if (taxable_income >= 208851 && taxable_income <= 372950) {
				return 0.33;
			} else {
				return 0.35;
			}
		case "Married Filing Separatly":
			if (taxable_income >= 0 && taxable_income <= 8350) {
				return 0.10;
			} else if (taxable_income >= 8351 && taxable_income <= 33950) {
				return 0.15;
			} else if (taxable_income >= 33951 && taxable_income <= 68525) {
				return 0.25;
			} else if (taxable_income >= 68526 && taxable_income <= 104425) {
				return 0.28;
			} else if (taxable_income >= 104426 && taxable_income <= 186475) {
				return 0.33;
			} else {
				return 0.35;
			}
		case "Head of Household":
			if (taxable_income >= 0 && taxable_income <= 11950)  {
				return 0.10;
			} else if (taxable_income >= 11951 && taxable_income <= 45500)  {
				return 0.15;
			} else if (taxable_income >= 45501 && taxable_income <= 117450)  {
				return 0.25;
			} else if (taxable_income >= 117451 && taxable_income <= 190200)  {
				return 0.28;
			} else if (taxable_income >= 190201 && taxable_income <= 372950)  {
				return 0.33;
			} else {
				return 0.35;
			}
		default:
            throw new IllegalArgumentException("Invalid filing status");
		}
	}

}
