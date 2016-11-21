package com.leetcode.easy;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description: https://leetcode.com/problems/island-perimeter/
 * <p>
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
 * <p>
 * Grid cells are connected horizontally/vertically (not diagonally).
 * <p>
 * The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * <p>
 * The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
 * <p>
 * One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100.
 * <p>
 * Determine the perimeter of the island.
 * <p>
 * Example:
 * <p>
 * [[0,1,0,0],
 * [1,1,1,0],
 * [0,1,0,0],
 * [1,1,0,0]]
 * <p>
 * Answer: 16
 * <p>
 * Explanation: The perimeter is the 16 yellow stripes in the image below:
 * <p>
 * https://github.com/qiaodaimadelaowang/screenshots/blob/master/island.png?raw=true
 * <p>
 * Author: wanghui<tinyhui.wang@gmail.com>
 * Created on: 2016-11-21 11:23
 */

public class IslandPerimeter {

    public int solution(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 || grid[i - 1][j] == 0) {
                    perimeter += p(grid, i, j);
                }
                if (i == grid.length - 1 || grid[i + 1][j] == 0) {
                    perimeter += p(grid, i, j);
                }
                if (j == 0 || grid[i][j - 1] == 0) {
                    perimeter += p(grid, i, j);
                }
                if (j == grid[i].length - 1 || grid[i][j + 1] == 0) {
                    perimeter += p(grid, i, j);
                }
            }
        }
        return perimeter;
    }

    private int p(int[][] grid, int i, int j) {
        if (grid[i][j] == 1) {
            return 1;
        }
        return 0;
    }


    public static void main(String[] args) {
        IslandPerimeter ip = new IslandPerimeter();
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(ip.solution(grid));
    }
}
