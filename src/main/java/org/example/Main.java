package org.example;

import org.example.programmers.MissileDefenseSystem;

public class Main {
    public static void main(String[] args) {
        int[][] targets = {{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}};
        int answer = MissileDefenseSystem.solve(targets);
        System.out.println(answer);
    }
}