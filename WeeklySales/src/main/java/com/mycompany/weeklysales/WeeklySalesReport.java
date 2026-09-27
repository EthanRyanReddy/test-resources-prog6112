/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weeklysales;

/**
 *
 * @author reddy
 */
public class WeeklySalesReport {

    public static void main(String[] args) {

        // Single-dimensional array containing the weeks
        String[] weeks = {
            "Week 1",
            "Week 2",
            "Week 3",
            "Week 4",
            "Week 5"
        };

        // Single-dimensional array containing the products
        String[] products = {
            "Bread",
            "Milk",
            "Cereal"
        };

        // Two-dimensional array containing the sales
        int[][] sales = {
            {25, 30, 18},
            {32, 27, 21},
            {28, 35, 24},
            {40, 31, 29},
            {36, 38, 32}
        };

        // ========================================
        // WEEKLY SALES REPORT
        // ========================================

        System.out.println("========================================");
        System.out.println("          WEEKLY SALES REPORT");
        System.out.println("========================================");

        System.out.printf("%-10s %-10s %-10s %-10s%n",
                "", products[0], products[1], products[2]);

        // Display the rows and columns
        for (int row = 0; row < sales.length; row++) {

            System.out.printf("%-10s", weeks[row]);

            for (int col = 0; col < sales[row].length; col++) {
                System.out.printf("%-10d", sales[row][col]);
            }

            System.out.println();
        }

        // ========================================
        // WEEKLY TOTALS
        // ========================================

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("WEEKLY TOTALS");
        System.out.println("----------------------------------------");

        // Calculate total for each week (row)
        for (int row = 0; row < sales.length; row++) {

            int total = 0;

            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
            }

            System.out.printf("%-10s %d%n", weeks[row], total);
        }

        // ========================================
        // PRODUCT TOTALS
        // ========================================

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("PRODUCT TOTALS");
        System.out.println("----------------------------------------");

        // Calculate total for each product (column)
        for (int col = 0; col < sales[0].length; col++) {

            int total = 0;

            for (int row = 0; row < sales.length; row++) {
                total += sales[row][col];
            }

            System.out.printf("%-10s %d%n", products[col], total);
        }

        // ========================================
        // OVERALL SALES
        // ========================================

        int overallTotal = 0;

        for (int row = 0; row < sales.length; row++) {

            for (int col = 0; col < sales[row].length; col++) {
                overallTotal += sales[row][col];
            }
        }

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("OVERALL SALES");
        System.out.println("----------------------------------------");
        System.out.println("Total products sold: " + overallTotal);
    }
}