
package pkgpackage;


public class InsuredPackage extends Package{
   
    public InsuredPackage(int weight, char shipMet){
        super(weight, shipMet);
           setWeightM(weight, shipMet);
           this.CalculateCost(weight, shipMet);
    }
    private void CalculateCost(int weight, char shipMet){
        double cst = 0;
        if(getShipCost() <= 1.00){
            cst = getShipCost() + 1.00;
        }
        else if(getsShipCost() > 1.00 && getShipCost() <= 3.00){
            cst = getShipCost() + 3.95;
            
        }
        else{
            cst = getShipCost() + 5.55;

        }
        setShipCost(cst);
    }
    
}
