/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga_pmac;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author prnc
 */
public class GA {

    private static int[] selects = new int[50];

    public GA() {

    }

    public static Population evol(Population pop, ArrayList<Obstacle> obs) {
        Population newPopulation = new Population(50, obs);
        Population newP = new Population(75, obs);
        for (int i = 0; i < 50; i++) {
            newP.save(i, pop.getChrom(i));
        }
        rdSelects();
        Random random= new Random();
//        int j = 0;
        for (int i = 50; i < 75; i++) {
            int id1 = random.nextInt(50);
            int id2 = random.nextInt(50);

            while (id2 == id1) {
                id2 = random.nextInt(50);
            }
            Individual pa2=pop.getChrom(id2);
            Individual pa1=pop.getChrom(id1);
            Individual child = cross(pa1, pa2, obs);
            newP.save(i, child);
//            j++;
        }
        newP.quickSort(0, 74);
        for (int i = 0; i < 50; i++) {
            newPopulation.save(i, newP.getChrom(i));
        }
        return newPopulation;
    }

    private static void rdSelects() {
        int r, t;
        selects[0] = (int) (Math.random() * 50);
        for (int i = 0; i < 50; i++) {
            t = 1;
            while (t == 1) {
                r = (int) (Math.random() * 50);
                for (int j = 0; j < i; j++) {
                    if (r == selects[j]) {
                        t = 1;
                        break;
                    }
                }
                selects[i] = r;
                t = 0;
            }
        }
    }

    public static Individual cross(Individual pa1, Individual pa2, ArrayList<Obstacle> obs) {
        int nbT1, nbT2, nbT3, nbSensor;
        Random random = new Random();
        Individual child= new Individual(obs);
//        System.err.println(obs);
        nbT1= pa1.NUM_EACH_GENOTYPE[0];
        nbT2= pa1.NUM_EACH_GENOTYPE[1];
        nbT3= pa1.NUM_EACH_GENOTYPE[2];
        nbSensor= pa1.NUMGENS;
        pa2.normalize(pa1, nbT1, nbT2, nbT3);
        for (int i = 0; i < nbSensor; ++i) {
            Gene x = pa1.getGenes().get(i);
            Gene y = pa2.getGenes().get(i);
            child.genes.set(i, new Gene(num_cross(x.getX(), y.getX()), num_cross(x.getY(), y.getY()), x.getR()));
        }
        child = mutation(child, pa1, pa2);
//        mutate(child);
        child.VFA();
        child.edit();
        return child;
    }

    private static Individual mutation(Individual indi, Individual p1, Individual p2) {
        Random random = new Random();
        for (int i = 0; i < p1.NUMGENS; ++i) {
            double tmp = random.nextDouble();
            if (tmp < 1.0 / p1.NUMGENS && p1.genes.get(i).x != p2.genes.get(i).x) {
                indi.genes.get(i).x += Math.exp(-Math.pow(indi.genes.get(i).x
                        / (p1.genes.get(i).x - p2.genes.get(i).x), 2) / 2)
                        / ((p1.genes.get(i).x - p2.genes.get(i).x) * Math.sqrt(2 * Math.PI));
            }
            tmp = random.nextDouble();
            if (tmp < 1.0 / p1.NUMGENS && p1.genes.get(i).y != p2.genes.get(i).y) {
                indi.genes.get(i).y += Math.exp(-Math.pow(indi.genes.get(i).y
                        / (p1.genes.get(i).y - p2.genes.get(i).y), 2) / 2)
                        / ((p1.genes.get(i).y - p2.genes.get(i).y) * Math.sqrt(2 * Math.PI));
            }
        }
        return indi;
    }
    
    private static double num_cross(double x, double y) {
        double dx = Math.abs(x - y);
        double x1 = Math.min(x, y) - 0.5 * dx;
        x1 = Math.max(x1, 0);
        double x3 = Math.max(x, y) + 0.5 * dx;
        x3 = Math.min(x3, 100);
        double t = Math.random() * (x3 - x1);
        return t + x1;
    }

    public static void mutate(Individual chrom) {
        int n = (int) (chrom.NUMGENS);
        double t;
        for (int i = 0; i < n; i++) {
            t = Math.random() * 1;
            if (t <= 1 / (n * 1.0)) {
                Gene g = chrom.getGenes().get(i);
                double x = g.getX();
                double y = g.getY();
                double z = g.getR();
                double gX = (1 / (Math.sqrt(2 * 3.14) * 50)) * Math.pow(2.718, -1 / 2 * (x * x) / 2500);
                double gY = (1 / (Math.sqrt(2 * 3.14) * 50)) * Math.pow(2.718, -1 / 2 * (y * y) / 2500);
                chrom.getGenes().set(i, new Gene(x - gX, y - gY, z));
            }
        }
    }

    public static Individual select(Population pop) {
        int p = (int) (pop.getPopSize());
        p = (int) (Math.random() * p);
        Individual best = pop.getChrom(p);
        return best;
    }
}
