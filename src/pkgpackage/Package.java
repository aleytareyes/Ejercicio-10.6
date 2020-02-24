
package pkgpackage;

public class Package {
    private int weight;
    private char shipMet;
    private double shipCost;
    public Package(int weight, char shipMet){
        setWeight(weight, shipMet);
        CalculateCost(this.weight, this.shipMet);
    }
    protected void setWeight(int weight, char shipMet){
        this.weight = weight;
        this.shipMet = shipMet;
    }
    protected void setShipCost(double shipCost){
        this.shipCost = shipCost;
    }
    protected int getWeight(){
        return this.weight;
    }
    protected char getShipMet(){
        return this.shipMet;
    }
    protected double getShipCost(){
        return this.shipCost;
    }
    private void CalculateCost(int weight, char shipMet){
        double cst = 0;
        switch(shipMet){
            case 'A':
            if(weight <= 8){
                cst = 2;
            }
            else if(weight > 8 && weight <= 16){
                cst = 3;
            }
            else{
                cst = 4.50;
            }
            break;
            case 'T':
            if(weight <= 8){
                cst = 1.50;
            }
            else if(weight > 8 && weight <= 16){
                cst = 2.35;
    
            }
            else{
                cst = 3.25;
            }
            break;
            case 'M':
            if(weight <= 8){
                cst = .50;
            }
            else if(weight > 8 && weight <= 16){
                cst = 1.50;
            }
            else{
                cst = 2.15;
            }
            break;
        }
        this.shipCost = cst;
    }
    public String display(){
        return "Weight: " + this.weight + " Shipping Metod: " + this.shipMet + " Cost: " + this.shipCost;
    }
}
