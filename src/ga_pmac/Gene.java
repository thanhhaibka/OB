/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga_pmac;

/**
 *
 * @author tuna1_000
 */
public class Gene implements Comparable<Gene> {
    public double x;
    public double y;
    public double r;
    public double S;
    public Gene(){
        
    }
    
    public Gene(double x, double y){
        this.x= x;
        this.y= y;
    }
    
    public Gene(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
        this.S = Math.PI * r * r;
    }
    
    public Gene(double r){
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getS() {
        return S;
    }
    
    public boolean isEqual(Gene gene){
        return !((x != gene.x)||(y != gene.y)||(r != gene.r));
    }

    @Override
    public int compareTo(Gene t) {
        if(this.r < t.r){
            return -1;
        }else if(this.r == t.r){
            if(this.x < t.x){
                return -1;
            }else if(this.x == t.x){
                if(this.y < t.y){
                    return -1;
                }else{
                    return 1;
                }
            }else{
                return 1;
            }
        }else{
            return 1;
        }
    }
    @Override
    public String toString(){
        return "("+x+" , "+ y+" , "+r +")";
    }
}
