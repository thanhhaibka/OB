/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga_pmac;

import java.io.FileWriter;
import java.util.Random;

/**
 *
 * @author prnc
 */
public class GenerateData {

    public static void main(String args[]) {
        try (FileWriter fw = new FileWriter("test.txt")) {
            double[][] ob = new double[100][4];
            int i = 0;
            Random rd = new Random();
            boolean flag = true;
            double k1 = 0, k2 = 0;
            double sumA = 0;
            while (true) {
                double xmin = 0, xmax = 0, ymin = 0, ymax = 0;
                if (i == 0) {
                    xmin = rd.nextDouble() * 100;
                    ymin = rd.nextDouble() * 100;
                    while (xmax <= xmin + 3) {
                        xmax = rd.nextDouble() * 100;
                    }
                    while (ymax <= ymin + 3) {
                        ymax = rd.nextDouble() * 100;
                    }
                } else {
                    while (flag) {
                        xmin = rd.nextDouble() * 100;
                        ymin = rd.nextDouble() * 100;
                        while (xmax <= xmin + 3) {
                            xmax = rd.nextDouble() * 100;
                        }
                        while (ymax <= ymin + 3) {
                            ymax = rd.nextDouble() * 100;
                        }
                        boolean f=false;
                        for (int k = 0; k < i; k++) {
                            if ((ob[k][0]<xmin&&ob[k][1]<ymin&&ob[k][2]>xmin&&ob[k][3]>ymin) || (ob[k][0]<xmax&&ob[k][1]<ymax&&ob[k][2]>xmax&&ob[k][3]>ymax)) {
                                f=true;
                                break;
                            }
                        }
                        if(f=true) flag=true;
                        else flag=false;
                    }
                }
                ob[i][0] = xmin;
                ob[i][1] = ymin;
                ob[i][2] = xmax;
                ob[i][3] = ymax;
                fw.write(xmin + " " + ymin + " " + xmax + " " + ymax + "\n");
                sumA += (xmax - xmin) * (ymax - ymin);
                if (sumA >= 3000) {
                    break;
                }
            }
        } catch (Exception e) {
        }
    }
}
