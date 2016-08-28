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
 * @author tuna1_000
 */
public class SA_PMAC {

    public static final double rateAreaObstacle = 0.1;
    public static final int L = 1000000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double s2 = 0;
        Individual ind0;
        for (int index = 1; index < 2; index++) {
            String filename = "test3" +index+ ".txt";
            ArrayList<Obstacle> obstacles = loadObstaclesFromFile(filename);
            double s1 = 0;
            Individual ind = new Individual(obstacles), in = new Individual(obstacles);
            for (int m = 0; m < 1; m++) {
                Individual ind1 = new Individual(obstacles);
                Individual ind2 = ind1;
                Individual ind3 = ind1;
                ind1.setGeneRandomInitilization();
//        ind1.setGeneHeuristicInitilization();
                double t1, t2 = 0, t3 = 0;
                t1 = ind1.setAdaptiveIndex();
                double alpha = 0.95;
                for (int T = 1000; T > 0.5; T *= alpha) {
                    for (int i = 0; i < 200; i++) {
                        Random rd = new Random();
                        for (int j = 0; j < ind1.genes.size(); j++) {
//                    if (rd.nextDouble()*1 < (1 / ind1.genes.size())) {
                            Gene g1 = ind1.genes.get(j);
                            Gene g2 = ind2.genes.get(j);
                            g2.setX(g1.getX() - 0.1 + rd.nextDouble() * 0.2);
                            g2.setY(g1.getY() - 0.1 + rd.nextDouble() * 0.2);
//                    }
                        }
                        t3 = rd.nextDouble() * 1;
                        ind2 = ind1;
                        ind2.VFA();
                        ind2.edit();
                        t2 = ind2.setAdaptiveIndex();
                        if (t2 < t1 || t3 <= Math.exp(-Math.abs(t2 - t1) / T)) {
                            ind1 = ind2;
                            t1 = t2;
                        }
                    }
                }
                double tempArea = 0;
                double tempAdaptive = 0;
//        for (int i = 0; i < 30; i++) {
//            ind1.setGeneRandomInitilization();
////            ind1.printIndividual();
//            ind1.setAdaptiveIndex();
//            ind1.setArea(1000000);
//            tempArea += ind1.getArea();
//            tempAdaptive += ind1.getAdaptiveIndex();
//        }
//            ind3.setGeneRandomInitilization2();
                s1 += ind1.setArea(1000000);
//            s2+=ind3.setArea(1000000);
                ind = ind1;
                
//            in=ind3;

            }

            //Draw d = new Draw(ind);
//            s2+=s1/30;
//            System.out.print(s1 / 15+" ");
            System.err.println(ind);
        }
//        for (int m = 0; m < 30; m++) {
//            Individual ind1 = new Individual(obstacles);
//            ind1.setGeneRandomInitilization2();
//            s2 += ind1.setArea(1000000);
//            in = ind1;
//        }

//        System.out.println(" AdaptiveIndex = " + s1/30 );
//        Draw draw1 = new Draw(ind0);
//        Draw draw = new Draw(in);
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
