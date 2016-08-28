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
public class Population {
    
    Individual []chroms;
    public Population(int size, ArrayList<Obstacle> obs){
        chroms=new Individual[size];
        for(int i=0;i<size;i++){
            Individual newChrom=new Individual(obs);
            this.save(i,newChrom);
        }
    }
    
    public void remove(int i){
        chroms[i]=null;
    }
    
    public void save(int i, Individual newChrom){
        chroms[i]=newChrom;
    }
    
    public Individual getChrom(int i){
        return chroms[i];
    }
    
    public int getPopSize(){
        return chroms.length;
    }
    
    public int partition(int left, int right){
            int i = left, j = right;
            Individual tmp;
            Random rnd= new Random();
            double pivot = chroms[left + rnd.nextInt(right - left)].setAdaptiveIndex();
            while (i <= j){
                  while (chroms[i].setAdaptiveIndex()< pivot)
                        i++;
                  while (chroms[j].setAdaptiveIndex() > pivot)
                        j--;
                  if (i <= j) {
                        tmp = chroms[i];
                        chroms[i] = chroms[j];
                        chroms[j] = tmp;
                        i++;
                        j--;
                  }
            };
            return i;
      }

      public void quickSort(int left, int right) {
            int index = partition( left, right);
            if (left < index - 1)
                  quickSort(left, index - 1);
            if (index < right)
                  quickSort(index, right);
      }
}
