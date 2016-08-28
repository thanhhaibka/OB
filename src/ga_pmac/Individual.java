/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga_pmac;

import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tuna1_000
 */
public class Individual {

//    public static final int NUMGENS = 15; // so luong sensor
//    public static final double[] GENOTYPE = {14, 11.2, 8.96};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {4, 5, 6}; // mang số lượng mỗi sensor    
    
//    public static final int NUMGENS = 20; // so luong sensor
//    public static final double[] GENOTYPE = {12, 9.6, 7.68};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {6, 7, 7}; // mang số lượng mỗi sensor    
    
//    public static final int NUMGENS = 31; // so luong sensor
//    public static final double[] GENOTYPE = {10, 8, 6.4};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {7, 10, 14}; // mang số lượng mỗi sensor    

//    public static final int NUMGENS = 50; // so luong sensor
//    public static final double[] GENOTYPE = {8, 6.4, 5.12};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {10, 15, 25}; // mang số lượng mỗi sensor    
    
//    public static final int NUMGENS = 85; // so luong sensor
//    public static final double[] GENOTYPE = {6, 4.8, 3.84};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {20, 28, 37}; // mang số lượng mỗi sensor    

//    public static final int NUMGENS = 17; // so luong sensor
//    public static final double[] GENOTYPE = {14, 11.2, 8.96};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {5, 5, 7}; // mang số lượng mỗi sensor    

//    public static final int NUMGENS = 24; // so luong sensor
//    public static final double[] GENOTYPE = {12, 9.6, 7.68};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {6, 8, 10}; // mang số lượng mỗi sensor    
   
//    public static final int NUMGENS = 36; // so luong sensor
//    public static final double[] GENOTYPE = {10, 8, 6.4};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {8, 12, 16}; // mang số lượng mỗi sensor    
    
//    public static final int NUMGENS = 57; // so luong sensor
//    public static final double[] GENOTYPE = {8, 6.4, 5.12};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {12, 18, 27}; // mang số lượng mỗi sensor    
    
//    public static final int NUMGENS = 101; // so luong sensor
//    public static final double[] GENOTYPE = {6, 4.8, 3.84};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {22, 32, 47}; // mang số lượng mỗi sensor    

//    public static final int NUMGENS = 21; // so luong sensor
//    public static final double[] GENOTYPE = {14, 11.2, 8.96};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {5, 6, 10}; // mang số lượng mỗi sensor    

//    public static final int NUMGENS = 29; // so luong sensor
//    public static final double[] GENOTYPE = {12, 9.6, 7.68};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {6, 9, 14}; // mang số lượng mỗi sensor    
   
//    public static final int NUMGENS = 41; // so luong sensor
//    public static final double[] GENOTYPE = {10, 8, 6.4};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {9, 13, 19}; // mang số lượng mỗi sensor    
    
//    public static final int NUMGENS = 63; // so luong sensor
//    public static final double[] GENOTYPE = {8, 6.4, 5.12};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {14, 20, 29}; // mang số lượng mỗi sensor    
    
//    public static final int NUMGENS = 116; // so luong sensor
//    public static final double[] GENOTYPE = {6, 4.8, 3.84};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {25, 36, 55}; // mang số lượng mỗi sensor
    
//    public static final int NUMGENS = 23; // so luong sensor
//    public static final double[] GENOTYPE = {14, 11.2, 8.96};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {6, 7, 10}; // mang số lượng mỗi sensor    
    
//    public static final int NUMGENS = 32; // so luong sensor
//    public static final double[] GENOTYPE = {12, 9.6, 7.68};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {7, 11, 14}; // mang số lượng mỗi sensor    
//    
//    public static final int NUMGENS = 46; // so luong sensor
//    public static final double[] GENOTYPE = {10, 8, 6.4};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {11, 14, 21}; // mang số lượng mỗi sensor    

//    public static final int NUMGENS = 73; // so luong sensor
//    public static final double[] GENOTYPE = {8, 6.4, 5.12};  // array bán kính mỗi loại sensor
//    public static final int[] NUM_EACH_GENOTYPE = {16, 23, 34}; // mang số lượng mỗi sensor    
    
    public static final int NUMGENS = 130; // so luong sensor
    public static final double[] GENOTYPE = {6, 4.8, 3.84};  // array bán kính mỗi loại sensor
    public static final int[] NUM_EACH_GENOTYPE = {28, 41, 61}; // mang số lượng mỗi sensor    

    public static final double WIDTH = 100.0;  // chiều rộng miền bao phủ
    public static final double HEIGHT = 100.0; // chiều dài miền bao phủ
    private static final Random rd = new Random();
    private final ArrayList<Obstacle> obstacles;
    public ArrayList<Gene> genes;
    private double adaptiveIndex;
    private double area;
    
    public Individual(ArrayList<Obstacle> obstacles) {
        this.obstacles = obstacles;
        setGeneRandomInitilization();
    }

//    public Individual() {
//        this.obstacles = loadObstaclesFromFile("Obstacle");
//        setGeneRandomInitilization();
//    }
    // load obstacles from file
    private ArrayList<Obstacle> loadObstaclesFromFile(String fileName) {
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
//            System.out.println("Lỗi nhập file chướng ngại vật");
        }
        return obstacles_;
    }

    // adptiveIndex
    public double setAdaptiveIndex() {
        double temp = 0;// temp cua AdaptiveIndex
        double tempXi, tempYi, tempRi;
        // tim Rmax         
        double rMax = 0;
        for (int i = 0; i < GENOTYPE.length; i++) {
            if (GENOTYPE[i] > rMax) {
                rMax = GENOTYPE[i];
            }
        }
        for (int i = 0; i < NUMGENS; i++) {
            tempXi = this.genes.get(i).getX();
            tempYi = this.genes.get(i).getY();
            tempRi = this.genes.get(i).getR();
            double tempXj, tempYj, tempRj, d, tr, hr;
            for (int j = i + 1; j < NUMGENS; j++) {
                tempXj = this.genes.get(j).getX();
                tempYj = this.genes.get(j).getY();
                tempRj = this.genes.get(j).getR();
                d = (tempXj - tempXi) * (tempXj - tempXi) + (tempYj - tempYi) * (tempYj - tempYi);
                tr = (tempRi + tempRj) * (tempRi + tempRj);
                hr = (tempRj - tempRi) * (tempRj - tempRi);

                if (d < tr) {
                    if (d > hr) {
                        temp += (Math.sqrt(tr) - Math.sqrt(d)) * (tempRi + tempRj) * Math.min(tempRi, tempRj) / (rMax * Math.max(tempRi, tempRj));
//                        double p= (Math.sqrt(d)+tempRi+tempRj)/2;
//                        p=Math.sqrt(p*(p-Math.sqrt(d))*(p-tempRi)*(p-tempRj));
//                        double h= 2*p/Math.sqrt(d);
//                        double halfAi= Math.asin(h/tempRi)*tempRi*tempRi-h*Math.sqrt(tempRi*tempRi-h*h);
//                        double halfAj= Math.asin(h/tempRj)*tempRj*tempRj-h*Math.sqrt(tempRj*tempRj-h*h);
//                        temp+=halfAi+halfAj;
                    } else {
                        temp += Math.min(tempRi, tempRj) * 4;
//                        temp+= Math.min(tempRi, tempRj)*3.14*Math.min(tempRi, tempRj);
                    }
                }
            }
            d = HEIGHT - tempYi;
            if (d < tempRi) {
                temp += (tempRi - d) * tempRi;
            } else {
                d = tempYi;
                if (d < tempRi) {
                    temp += (tempRi - d) * tempRi;
                }
            }
            d = tempXi;
            if (d < tempRi) {
                temp += (tempRi - d) * tempRi;
            } else {
                d = WIDTH - tempXi;
                if (d < tempRi) {
                    temp += (tempRi - d) * tempRi;
                }
            }
            for (int j = 0; j < obstacles.size(); j++) {
                Obstacle obs = obstacles.get(j);
//                
                if (IsCut(obs, this.genes.get(i))) {
                    temp += (2 * tempRi - 2 * MinDist(obstacles.get(j), this.genes.get(i))) * (tempRi) * tempRi / (rMax * Math.max(tempRi, tempRi));
//                    double dMin= MinDist(obs, this.genes.get(i));
//                    if(distance(tempXi, tempYi, obs.getXmin(), obs.getYmin())<tempRi){
//                        double h=
//                    }else if(distance(tempXi, tempYi, obs.getXmax(), obs.getYmin())<tempRi){
//                        
//                    }else if(distance(tempXi, tempYi, obs.getXmin(), obs.getYmax())<tempRi){
//                        
//                    }else if(distance(tempXi, tempYi, obs.getXmax(), obs.getYmax())<tempRi){
//                        
//                    }else{
//                        
//                    }
                }
            }
        }
        return temp;
    }

    // Compare
    public boolean isEqual(Individual ind) {
        for (int i = 0; i < NUMGENS; i++) {
            if (!this.genes.get(i).isEqual(ind.genes.get(i))) {
                return false;
            }
        }
        return true;
    }

    // Random Initilization an individual 
    public void setGeneRandomInitilization() {
        this.genes = new ArrayList<>();
        double x, y;
        int type;
        for (int i = 0; i < GENOTYPE.length; i++) {
            for (int j = 0; j < NUM_EACH_GENOTYPE[i]; j++) {
                x = this.randomDouble(GENOTYPE[i], WIDTH - GENOTYPE[i]);
                y = this.randomDouble(GENOTYPE[i], HEIGHT - GENOTYPE[i]);
                this.genes.add(new Gene(x, y, GENOTYPE[i]));
            }
        }

//        for(int i=0; i<500; i++){
        this.VFA();
        this.edit();
//        }
//        this.genes.sort(null);
    }

    public void setGeneRandomInitilization2() {
        this.genes = new ArrayList<>();
        double x, y;
        int type;
        for (int i = 0; i < GENOTYPE.length; i++) {
            for (int j = 0; j < NUM_EACH_GENOTYPE[i]; j++) {
                x = this.randomDouble(GENOTYPE[i], WIDTH - GENOTYPE[i]);
                y = this.randomDouble(GENOTYPE[i], HEIGHT - GENOTYPE[i]);
                this.genes.add(new Gene(x, y, GENOTYPE[i]));
            }
        }

        for (int i = 0; i < 500; i++) {
            this.VFA();
        }
//        this.genes.sort(null);
    }

    //Heuristic Initilization an individual
    public void setGeneHeuristicInitilization() {
        this.genes = new ArrayList<>();
        ArrayList<Integer> tempNumEachGenoType = new ArrayList<>();
        ArrayList<Double> tempGenoType = new ArrayList<>();
        for (int i = 0; i < GENOTYPE.length; i++) {
            tempNumEachGenoType.add(NUM_EACH_GENOTYPE[i]);
            tempGenoType.add(GENOTYPE[i]);
        }
        double xMark = 0, yMark = 0, rMax = 0; // danh dau vi tri dat gen tiep theo
        int temp, typeGen;
        double tempR;// giá trị bán kình tạm thời
        boolean isFull = false; // true khi da in day so dong
        while (!tempNumEachGenoType.isEmpty()) {
            typeGen = rd.nextInt(tempNumEachGenoType.size());
            // check số lượng của loại sensor vừa chọn, = 0 thì remove khỏi list
            temp = tempNumEachGenoType.get(typeGen) - 1;
            tempR = tempGenoType.get(typeGen);
            if (temp == 0) {
                tempNumEachGenoType.remove(typeGen);
                tempGenoType.remove(typeGen);
            } else {
                tempNumEachGenoType.set(typeGen, temp);
            }

            if (!isFull) {
                // tinh lại xMark 
                xMark += 2 * tempR;//GENOTYPE[typeGen];
                // kiểm tra điều kiện xuống dòng        
                if (xMark > WIDTH) {
                    yMark += 2 * rMax;
                    xMark = 0;
                    // kiem tra con dong trong khong
                    if ((yMark + 2 * tempR) > HEIGHT) {
                        isFull = true;
                        this.genes.add(new Gene(this.randomDouble(WIDTH - 2 * tempR, WIDTH - tempR), this.randomDouble(tempR, HEIGHT - tempR), tempR));
                    } else {
                        this.genes.add(new Gene(xMark + tempR, yMark + tempR, tempR));
                    }
                } else {
                    if (rMax < tempR) {
                        rMax = tempR;
                    }
                    this.genes.add(new Gene(xMark - tempR, yMark + tempR, tempR));
                }
            } else {
                int select = rd.nextInt(3);
                switch (select) {
                    case 0:
                        this.genes.add(new Gene(this.randomDouble(WIDTH - 2 * tempR, WIDTH - tempR), this.randomDouble(tempR, HEIGHT - tempR), tempR));
                        break;
                    case 1:
                        this.genes.add(new Gene(this.randomDouble(tempR, WIDTH - tempR), this.randomDouble(HEIGHT - 2 * tempR, HEIGHT - tempR), tempR));
                        break;
                    case 2:
                        this.genes.add(new Gene(this.randomDouble(tempR, WIDTH - tempR), this.randomDouble(tempR, HEIGHT - tempR), tempR));
                        break;
                    default:
                        break;

                }

            }

        }
//        for(int i = 0; i<5000; i++){
//            this.VFA();        
////        }
//        this.VFA();
//        this.genes.sort(null);
    }

    // VFA
    public void VFA() {
        double tempXi, tempYi, tempRi;
        for (int i = 0; i < NUMGENS; i++) {
            // VFA tính với các gene khác
            int j = 0, nr = 0;
            // dung cho VFA cac gene khác
            double frx = 0, fry = 0, tempD = 0, tempR = 0;
            tempXi = this.genes.get(i).getX();
            tempYi = this.genes.get(i).getY();
            tempRi = this.genes.get(i).getR();
            double tempXj, tempYj, tempRj;
            for (j = 0; j < NUMGENS; j++) {
                if (j != i) {
                    tempXj = this.genes.get(j).getX();
                    tempYj = this.genes.get(j).getY();
                    tempRj = this.genes.get(j).getR();
                    if ((tempXi == tempXj) && (tempYi == tempYj)) {
                        tempXj += rd.nextDouble() / 100;
                        tempYj += rd.nextDouble() / 100;
                    }
                    tempD = Math.sqrt((tempXi - tempXj) * (tempXi - tempXj) + (tempYi - tempYj) * (tempYi - tempYj));
                    tempR = tempRi + tempRj;
                    if (tempD < tempR) {
                        frx += (1 - tempR / tempD) * (tempXj - tempXi);
                        fry += (1 - tempR / tempD) * (tempYj - tempYi);
                        nr += 1;
                    }
                }
            }
            // VFA tính cho biên si(xi,yi)           
            tempR = tempRi;
            // b = (xi, 0)
            tempD = tempYi;
            if (tempD < tempR) {
                fry += tempR - tempD;
                nr += 1;
            }
            // b = (xi , H)
            tempD = HEIGHT - tempYi;
            if (tempD < tempR) {
                fry += tempD - tempR;
                nr += 1;
            }
            // b = (0, yi)
            tempD = tempXi;
            if (tempD < tempR) {
                frx += tempR - tempD;
                nr += 1;
            }
            // b = (W, yi)
            tempD = WIDTH - tempXi;
            if (tempD < tempR) {
                frx += tempD - tempR;
                nr += 1;
            }

            // tính lại vị trí sensor
            if (nr != 0) {
                this.genes.get(i).setX(tempXi + frx / nr);
                this.genes.get(i).setY(tempYi + fry / nr);
            }

            // VFA cho chướng ngại vật  
            // hiệu chỉnh
            tempXi = this.genes.get(i).getX();
            tempYi = this.genes.get(i).getY();
            tempRi = this.genes.get(i).getR();
            if (tempXi < tempRi) {
                this.genes.get(i).setX(tempRi);
            }
            if (tempYi < tempRi) {
                this.genes.get(i).setY(tempRi);
            }
            if ((WIDTH - tempXi) < tempRi) {
                this.genes.get(i).setX(WIDTH - tempRi);
            }
            if ((HEIGHT - tempYi) < tempRi) {
                this.genes.get(i).setY(HEIGHT - tempRi);
            }
            double alpha = 1, beta = 0.01;
            tempXi = this.genes.get(i).getX();
            tempYi = this.genes.get(i).getY();
            Object[] res;
            frx = 0;
            fry = 0;
            nr = this.obstacles.size();
            double d;
            boolean isIn, check = false;
            int loc;
            for (j = 0; j < this.obstacles.size(); j++) {
                res = minDist(this.obstacles.get(j), this.genes.get(i));
                d = (double) res[0];
                isIn = (boolean) res[1];
                loc = (int) res[2];
                if (isIn) {
                    check = true;
//                    switch (loc) {
//                        case 1:
//                            this.genes.get(i).setY(this.obstacles.get(j).getYmax()+tempRi);
//                            break;
//                        case 3:
//                            this.genes.get(i).setX(this.obstacles.get(j).getXmax()+tempRi);
//                            break;
//                        case 5:
//                            this.genes.get(i).setY(this.obstacles.get(j).getYmin()-tempRi);
//                            break;
//                        case 7:
//                            this.genes.get(i).setX(this.obstacles.get(j).getXmin()-tempRi);
//                            break;
//                    }
                } else {
                    if (d < tempRi) {
                        switch (loc) {
                            case 1:
                                fry += beta * (tempRi - d) / d;
                                break;
                            case 2:
                                frx += beta * (tempRi - d) / d;
                                fry += beta * (tempRi - d) / d;
                                break;
                            case 3:
                                frx += beta * (tempRi - d) / d;
                                break;
                            case 4:
                                frx += beta * (tempRi - d) / d;
                                fry -= beta * (tempRi - d) / d;
                                break;
                            case 5:
                                fry -= beta * (tempRi - d) / d;
                                break;
                            case 6:
                                frx -= beta * (tempRi - d) / d;
                                fry -= beta * (tempRi - d) / d;
                                break;
                            case 7:
                                frx -= beta * (tempRi - d) / d;
                                break;
                            case 8:
                                frx -= beta * (tempRi - d) / d;
                                fry += beta * (tempRi - d) / d;
                                break;
                        }
                    }
                }
            }

            if (!check) {
                if (nr != 0) {
                    this.genes.get(i).setX(tempXi + frx / nr);
                    this.genes.get(i).setY(tempYi + fry / nr);
                }
            }
        }
    }

    public void edit() {
        for (int i = 0; i < NUMGENS; i++) {
            Gene g = genes.get(i);
            for (int j = 0; j < obstacles.size(); j++) {
                double tempXi = this.genes.get(i).getX();
                double tempYi = this.genes.get(i).getY();
                double tempRi = this.genes.get(i).getR();
                Object[] res;
                double d;
                boolean isIn, check = false;
                int loc;
                for (j = 0; j < this.obstacles.size(); j++) {
                    res = minDist(this.obstacles.get(j), this.genes.get(i));
                    d = (double) res[0];
                    isIn = (boolean) res[1];
                    loc = (int) res[2];
                    if (isIn) {
                        check = true;
                        switch (loc) {
                            case 1:
                                this.genes.get(i).setY(this.obstacles.get(j).getYmax());
                                break;
                            case 3:
                                this.genes.get(i).setX(this.obstacles.get(j).getXmax());
                                break;
                            case 5:
                                this.genes.get(i).setY(this.obstacles.get(j).getYmin());
                                break;
                            case 7:
                                this.genes.get(i).setX(this.obstacles.get(j).getXmin());
                                break;
                        }
                    } else {
//                    if (d < tempRi) {
//                        switch (loc) {
//                            case 1:
//                                fry += beta * (tempRi - d) / d;
//                                break;
//                            case 2:
//                                frx += beta * (tempRi - d) / d;
//                                fry += beta * (tempRi - d) / d;
//                                break;
//                            case 3:
//                                frx += beta * (tempRi - d) / d;
//                                break;
//                            case 4:
//                                frx += beta * (tempRi - d) / d;
//                                fry -= beta * (tempRi - d) / d;
//                                break;
//                            case 5:
//                                fry -= beta * (tempRi - d) / d;
//                                break;
//                            case 6:
//                                frx -= beta * (tempRi - d) / d;
//                                fry -= beta * (tempRi - d) / d;
//                                break;
//                            case 7:
//                                frx -= beta * (tempRi - d) / d;
//                                break;
//                            case 8:
//                                frx -= beta * (tempRi - d) / d;
//                                fry += beta * (tempRi - d) / d;
//                                break;
//                        }
//                    }
                    }
                }
            }
        }
    }

    private boolean IsCut(Obstacle obstacle, Gene gene) {
        if (gene.getX() < obstacle.getXmin() && gene.getY() < obstacle.getYmin()) {
            return gene.getR() > distance(obstacle.getXmin(), obstacle.getYmin(), gene.getX(), gene.getY());
        } else if (gene.getX() > obstacle.getXmax() && gene.getY() < obstacle.getYmin()) {
            return gene.getR() > distance(obstacle.getXmax(), obstacle.getYmin(), gene.getX(), gene.getY());
        } else if (gene.getX() < obstacle.getXmin() && gene.getY() > obstacle.getYmax()) {
            return gene.getR() > distance(obstacle.getXmin(), obstacle.getYmax(), gene.getX(), gene.getY());
        } else if (gene.getX() > obstacle.getXmax() && gene.getY() > obstacle.getYmax()) {
            return gene.getR() > distance(obstacle.getXmax(), obstacle.getYmax(), gene.getX(), gene.getY());
        } else if (MinDist(obstacle, gene) < gene.getR()) {
            return true;
        } else {
            return false;
        }
    }

    // random double trong khoang (a,b)
    private double randomDouble(double min, double max) {
        return (min + (max - min) * rd.nextDouble());
    }

    private double MinDist(Obstacle Ob, Gene g) {
        double min = 10000;
        double Xmin = Ob.getXmin();
        double Xmax = Ob.getXmax();
        double Ymin = Ob.getYmin();
        double Ymax = Ob.getYmax();
        double x = g.getX();
        double y = g.getY();
        if (min > Math.abs(x - Xmax)) {
            min = Math.abs(x - Xmax);
        }
        if (min > Math.abs(x - Xmin)) {
            min = Math.abs(x - Xmin);
        }
        if (min > Math.abs(y - Ymax)) {
            min = Math.abs(y - Ymax);
        }
        if (min > Math.abs(y - Ymin)) {
            min = Math.abs(y - Ymin);
        }
        return min;
    }

    // khoang cach 2 Gene
    private double d(Gene gene1, Gene gene2) {
        return Math.sqrt(Math.pow(gene1.getX() - gene2.getX(), 2) + Math.pow(gene1.getY() - gene2.getY(), 2));
    }

    // in danh sach gen
    public void printIndividual() {
        for (int i = 0; i < NUMGENS; i++) {
            System.out.println(i + " : r = " + this.genes.get(i).getR() + " | x = " + this.genes.get(i).getX() + " | y = " + this.genes.get(i).getY());
        }
    }

    public ArrayList<Gene> getGenes() {
        return genes;
    }

    public double getAdaptiveIndex() {
        return adaptiveIndex;
    }

    public double getArea() {
        return area;
    }

    public double setArea(int nbSample) {
        double x, y;
        int sum = 0;
        boolean isIn;
        for (int idSample = 0; idSample < nbSample; idSample++) {
            x = this.randomDouble(0, WIDTH);
            y = this.randomDouble(0, HEIGHT);
            isIn = false;
            for (int idGen = 0; idGen < NUMGENS; idGen++) {
                if (Math.pow(this.genes.get(idGen).getX() - x, 2.0) + Math.pow(this.genes.get(idGen).getY() - y, 2.0) <= Math.pow(this.genes.get(idGen).getR(), 2.0)) {
                    for (int i = 0; i < this.obstacles.size(); i++) {
                        if ((x >= this.obstacles.get(i).getXmin()) && (x <= this.obstacles.get(i).getXmax()) && (y >= this.obstacles.get(i).getYmin()) && (y <= this.obstacles.get(i).getYmax())) {
                            isIn = true;
                        }
                    }
                    if (!isIn) {
                        sum += 1;
                    }
                    break;
                }
            }
        }
        area = sum * WIDTH * HEIGHT / nbSample;
        return area;
    }

    public ArrayList<Obstacle> getObstacles() {
        return obstacles;
    }

    private double GetForceX(double x1, double y1, double x2, double y2) {
        if (x1 == x2 || y1 == y2) {
            return 0;
        } else {
            return (1 / distance(x1, y1, x2, y2)) * (x2 - x1);
        }
    }

    private double GetForceY(double x1, double y1, double x2, double y2) {
        if (x1 == x2 || y1 == y2) {
            return 0;
        } else {
            return (1 / distance(x1, y1, x2, y2)) * (y2 - y1);
        }
    }

    private double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    private Object[] minDist(Obstacle obstacle, Gene gene) {
        Object[] res = new Object[3];
        double d, temp;
        boolean isIn = false;
        int loc = 0;
        temp = Math.abs(gene.getY() - obstacle.getYmax());
        d = temp;
        temp = Math.sqrt((gene.getX() - obstacle.getXmax()) * (gene.getX() - obstacle.getXmax()) + (gene.getY() - obstacle.getYmax()) * (gene.getY() - obstacle.getYmax()));
        if (d < temp) {
            d = temp;
        }
        temp = Math.abs(gene.getX() - obstacle.getXmax());
        if (d < temp) {
            d = temp;
        }
        temp = Math.sqrt((gene.getX() - obstacle.getXmax()) * (gene.getX() - obstacle.getXmax()) + (gene.getY() - obstacle.getYmin()) * (gene.getY() - obstacle.getYmin()));
        if (d < temp) {
            d = temp;
        }
        temp = Math.abs(gene.getY() - obstacle.getYmin());
        if (d < temp) {
            d = temp;
        }
        temp = Math.sqrt((gene.getX() - obstacle.getXmin()) * (gene.getX() - obstacle.getXmin()) + (gene.getY() - obstacle.getYmin()) * (gene.getY() - obstacle.getYmin()));
        if (d < temp) {
            d = temp;
        }
        temp = Math.abs(gene.getX() - obstacle.getXmin());
        if (d < temp) {
            d = temp;
        }
        temp = Math.sqrt((gene.getX() - obstacle.getXmin()) * (gene.getX() - obstacle.getXmin()) + (gene.getY() - obstacle.getYmax()) * (gene.getY() - obstacle.getYmax()));
        if (d < temp) {
            d = temp;
        }
        // kiem tra nếu gene bị nằm trong
        if ((gene.getX() >= obstacle.getXmin()) && (gene.getX() <= obstacle.getXmax()) && (gene.getY() >= obstacle.getYmin()) && (gene.getY() <= obstacle.getYmax())) {
            isIn = true;
        }
        // tim vi tri
        double x = gene.getX();
        double y = gene.getY();
        double cc = obstacle.hamCheoChinh(x, y);
        double cp = obstacle.hamCheoPhu(x, y);
        if (isIn) {
            if ((cc > 0) && (cp < 0)) {
                loc = 1;
            } else if ((cc > 0) && (cp > 0)) {
                loc = 3;
            } else if ((cc < 0) && (cp > 0)) {
                loc = 5;
            } else {
                loc = 7;
            }
        } else {
            if ((x > obstacle.getXmin()) && (x < obstacle.getXmax()) && (y > obstacle.getYmax())) {
                loc = 1;
            } else if ((x > obstacle.getXmax()) && (y > obstacle.getYmax())) {
                loc = 2;
            } else if ((x > obstacle.getXmax()) && (y < obstacle.getYmax()) && (y > obstacle.getYmin())) {
                loc = 3;
            } else if ((x > obstacle.getXmax()) && (y < obstacle.getYmin())) {
                loc = 4;
            } else if ((y < obstacle.getYmin()) && (x > obstacle.getXmin()) && (x < obstacle.getXmax())) {
                loc = 5;
            } else if ((x < obstacle.getXmin()) && (y < obstacle.getYmin())) {
                loc = 6;
            } else if ((x < obstacle.getXmin()) && (y > obstacle.getYmin()) && (y < obstacle.getYmax())) {
                loc = 7;
            } else if ((x < obstacle.getXmin()) && (y > obstacle.getYmax())) {
                loc = 8;
            }
        }
        res[0] = d;
        res[1] = isIn;
        res[2] = loc;
        return res;
    }
    
    public void normalize(Individual indi, int nbT1, int nbT2, int nbT3) {
        normalize(indi, 0, nbT1);
        normalize(indi, nbT1, nbT2);
        normalize(indi, nbT1 + nbT2, nbT3);
    }

    private void normalize(Individual indi, int nbSensor, int start) {
        double d[][] = new double[nbSensor][nbSensor];
        double fx[] = new double[nbSensor], fy[] = new double[nbSensor];
        double[] kcd = new double[nbSensor];
        int arg[] = new int[nbSensor];
        int matchX[] = new int[nbSensor], matchY[] = new int[nbSensor];
        int trace[] = new int[nbSensor], queue[] = new int[nbSensor];
        int front, rear;
        int s, finish;
        //tinh khoang cach giua tung cap sensor
        for (int i = start; i < start + nbSensor; ++i) {
            for (int j = start; j < start + nbSensor; ++j) {
                d[i - start][j - start] = Math.sqrt(Math.pow(this.genes.get(j).x - indi.genes.get(i).x, 2)
                        + Math.pow(this.genes.get(j).y - indi.genes.get(i).y, 2));
            }
        }

        for (int i = 0; i < nbSensor; ++i) {
            matchX[i] = -1;
            matchY[i] = -1;
        }

        // thu ghep lan luot cac s[1].. s[nbSensor]
        for (int si = 0; si < nbSensor; ++si) {
            s = si;
//            initBFS(nbSensor);
            front = 0;
            rear = 1;
            queue[0] = s;
//            reset(trace);
            for (int i = 0; i < nbSensor; ++i) {
                trace[i] = -1;
            }

            for (int j = 0; j < nbSensor; ++j) {
                kcd[j] = d[si][j] - fx[si] - fy[j];
                arg[j] = s;
            }
            finish = -1;

            do {
//                findAugmentingPath(nbSensor);
                int i, j;
                double w;

                do {
//                    i = pop();
                    i = queue[front];
                    ++front;
                    for (j = 0; j < nbSensor; ++j) {
                        if (trace[j] == -1) {
                            w = d[i][j] - fx[si] - fy[j];
                            if (w == 0.0) {
                                trace[j] = i;
                                if (matchY[j] == -1) {
                                    finish = j;
                                    return;
                                }
//                                push(matchY[j]);
                                queue[rear] = matchY[j];
                                ++rear;
                            }
                            if (kcd[j] > w) {
                                kcd[j] = w;
                                arg[j] = i;
                            }
                        }
                    }
                } while (front < rear);
                if (finish == -1) {
//                    subX_addY(nbSensor);
                    double delta;
                    int i1, j1;

                    // delta la gia tri nho nhat trong so cac kcd[j] ma y[j] chua tham
                    delta = 100000;
                    for (j1 = 0; j1 < nbSensor; ++j1) {
                        if (trace[j1] == -1 && kcd[j1] < delta) {
                            delta = kcd[j1];
                        }
                    }

                    fx[s] += delta;

                    for (j1 = 0; j1 < nbSensor; ++j1) {
                        if (trace[j1] != -1) {
                            i1 = matchY[j1];
                            fy[j1] -= delta;
                            fx[i1] += delta;
                        } else {
                            kcd[j1] -= delta;
                        }
                    }

                    for (j1 = 0; j1 < nbSensor; ++j1) {
                        if (trace[j1] == -1 && kcd[j1] == 0) {
                            trace[j1] = arg[j1];
                            if (matchY[j1] == -1) {
                                finish = j1;
                                return;
                            }
//                            push(matchY[j1]);
                            queue[rear] = matchY[j1];
                            ++rear;
                        }
                    }
                }
            } while (finish == -1);
//            enlarge();
            int i, next;
            do {
                i = trace[finish];
                next = matchX[i];
                matchX[i] = finish;
                matchY[finish] = i;
                finish = next;
            } while (finish != -1);
        }
//        write();
        Gene[] tmp = new Gene[nbSensor];
        for (int i = start; i < start + nbSensor; ++i) {
            tmp[i - start] = new Gene(this.genes.get(start + matchX[i - start]).x, this.genes.get(start + matchX[i - start]).y, this.genes.get(start + matchX[i - start]).getR());
        }

        for (int i = start; i < start + nbSensor; ++i) {
            this.genes.get(i).x = tmp[i - start].x;
            this.genes.get(i).y = tmp[i - start].y;
        }

    }
    
    @Override
    public String toString(){
        String s="";
        for(int i=0; i<genes.size(); i++){
            s+=genes.get(i)+" ";
        }
        return s;
    }
}
