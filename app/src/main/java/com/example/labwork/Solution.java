package com.example.labwork;

public class Solution {

    private int R;

    Solution(String strR) {
        R = Integer.parseInt(strR);
    }

    public double GetSolution() {
        double x, y, z, result;
        int k = 1;
        int N = 1000000;
        for (int i = 0; i < N; i++) {
            x = Math.random() * (R / Math.sqrt(2));
            y = Math.random() * (R / Math.sqrt(2));
            z = Math.random() * R;
            if ((y >= 0) && (y <= Math.sqrt((R * R / 2) - x * x)) && (z >= Math.sqrt(x * x + y * y)) && (z <= Math.sqrt(R * R - x * x - y * y))) {
                k = k + 1;
            }
        }
        result = (double) k / N;
        result = result * (R / Math.sqrt(2)) * (R / Math.sqrt(2)) * R;
        return result;


    }
}