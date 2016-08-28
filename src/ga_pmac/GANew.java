/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga_pmac;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author prnc
 */
public class GANew {

    public static final double rateAreaObstacle = 0.1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int index = 1; index < 2; index++) {
            String filename = "empty"+ ".txt";
            ArrayList<Obstacle> obstacles = loadObstaclesFromFile(filename);
            Individual ind = new Individual(obstacles);
            double s1 = 0;
            for (int k = 0; k < 30; k++) {
//        System.err.println(obstacles.get(0));
                Population pop = new Population(50, obstacles);
//        Chromosome c= pop.getChrom(0);
                for (int i = 0; i < 1000; i++) {
                    pop = GA.evol(pop, obstacles);
                    Individual newC = pop.getChrom(0);
//            for(int k=0; k< 50; k++){
//                System.err.println(k+": "+pop.getChrom(k).setAdaptiveIndex());
//                System.out.println(k+": "+pop.getChrom(k).setArea(1000000));
//            }
//            System.out.println(newC.setAdaptiveIndex()+" ");
                }
                ind = pop.getChrom(0);
                s1 += ind.setArea(1000000);
            }
//            new Draw(ind);
            System.out.print(s1 / 30 + " ");
        }
//        Draw d= new Draw(pop.getChrom(0));
    }

    private static ArrayList<Obstacle> loadObstaclesFromFile(String fileName) {
        ArrayList<Obstacle> obstacles_ = new ArrayList<>();
        try (FileReader fr = new FileReader(fileName)) {
            double xmin, ymin, xmax, ymax;
            Scanner sc = new Scanner(fr);
            while (sc.hasNextDouble()) {
                xmin = sc.nextDouble();
                ymin = sc.nextDouble();
                xmax = sc.nextDouble();
                ymax = sc.nextDouble();
                obstacles_.add(new Obstacle(xmin, ymin, xmax, ymax));
            }

        } catch (Exception e) {
            System.out.println("Lỗi nhập file chướng ngại vật");
        }
        return obstacles_;
    }

    private static ArrayList<Obstacle> loadRandomObstacles(int n) {
        Random rd = new Random();
        int maxObstacleArea = (int) (n * n * rateAreaObstacle);
        boolean area[][] = new boolean[n][n]; // true la co roi, false la chua co
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                area[i][j] = false;
            }
        }
        int count = 0;
        int x = 0, y = 0, width = 0, height = 0;
        boolean checkPoint = false, checkWidthHeight = false;
        int directionX = 0, directionY = 0;
        ArrayList<Obstacle> obstacles = new ArrayList<>();
        Obstacle obs;
        while (count < maxObstacleArea) {
            // chọn đỉnh trên trái
            while (!checkPoint) {
                x = rd.nextInt(n);
                y = rd.nextInt(n);
                if (area[x][y] == false) {
                    checkPoint = true;
                }
            }
            // chọn hướng của hình
            if (rd.nextInt(2) == 0) {
                directionX = 1;
            } else {
                directionX = -1;
            }
            if (rd.nextInt(2) == 0) {
                directionY = 1;
            } else {
                directionY = -1;
            }
            // chọn độ dài rộng
            while (!checkWidthHeight) {
                if (directionX == 1) {
                    width = rd.nextInt(n - x) + 1;
                } else {
                    width = rd.nextInt(x + 1) + 1;
                }
                if (directionY == 1) {
                    height = rd.nextInt(n - y) + 1;
                } else {
                    height = rd.nextInt(y + 1) + 1;
                }
                boolean check = true;
                for (int i = 0; i < width; i++) {
                    for (int j = 0; j < height; j++) {
                        if (area[x + i * directionX][y + j * directionY] == true) {
                            check = false;
                            break;
                        }
                    }
                }
                if (check == true) {
                    checkWidthHeight = true;
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < height; j++) {
                            area[x + i * directionX][y + j * directionY] = true;
                        }
                    }
                    count = count + width * height;
//                    System.out.println("x = "+ x+" y = "+y+" width : " + width + " height : "+ height);
                    obstacles.add(createObstacle(x, y, width, height, n, directionX, directionY));
                }

            }

            checkPoint = false;
            checkWidthHeight = false;
        }
        return obstacles;
    }

    private static Obstacle createObstacle(int x, int y, int width, int height, int n, int directX, int directY) {
        double xmin, ymin, xmax, ymax;
        double dcnnx = Individual.WIDTH / ((double) n);
        double dcnny = Individual.HEIGHT / ((double) n);
        if (directX == 1) {
            xmin = x * dcnnx;
            xmax = (x + width * directX) * dcnnx;
        } else {
            xmin = (x + (width - 1) * directX) * dcnnx;
            xmax = (x + 1) * dcnnx;
        }
        if (directY == 1) {
            ymin = y * dcnny;
            ymax = (y + height * directY) * dcnny;
        } else {
            ymin = (y + (height - 1) * directY) * dcnny;
            ymax = (y + 1) * dcnny;
        }
        return new Obstacle(xmin, ymin, xmax, ymax);
    }
}
