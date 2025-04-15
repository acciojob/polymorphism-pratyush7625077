package com.driver;

public class Main {
    static class Product{
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(10, 35));
        System.out.println(p.product(10, 20, 30));
        System.out.println(p.product(11.5, 12.6));
    }
}