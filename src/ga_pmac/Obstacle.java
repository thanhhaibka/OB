/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga_pmac;


public class Obstacle {
    public double xmax;
    public double ymax;
    public double xmin;
    public double ymin;
    
    public Obstacle(){
        
    }
    public Obstacle(double xmin, double ymin, double xmax, double ymax){
        this.xmin = xmin;
        this.xmax = xmax;
        this.ymin = ymin;
        this.ymax = ymax;
    }

    public double getXmax() {
        return xmax;
    }

    public void setXmax(double xmax) {
        this.xmax = xmax;
    }

    public double getYmax() {
        return ymax;
    }

    public void setYmax(double ymax) {
        this.ymax = ymax;
    }

    public double getXmin() {
        return xmin;
    }

    public void setXmin(double xmin) {
        this.xmin = xmin;
    }

    public double getYmin() {
        return ymin;
    }

    public void setYmin(double ymin) {
        this.ymin = ymin;
    }
    
    public double hamCheoChinh(double x, double y){
        return (x - xmax)*(ymax -ymin) - (xmin - xmax)*(y - ymin);
    }
    
    public double hamCheoPhu(double x,double y){
        return (x - xmax)*(ymin - ymax) - (xmin - xmax)*(y -ymax);
    }
    
    @Override
    public String toString(){
        return xmin+" "+ymin;
    }
}
