package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales){
        Salesperson maxAmountPerson=null;
        for (Salesperson p:sales) {
            if(maxAmountPerson==null||maxAmountPerson.getAmount()<p.getAmount()){
                maxAmountPerson=p;
            }
        }
        return maxAmountPerson;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales){
        Salesperson maxBonus=null;
        int bonusCurrent;
        for (Salesperson p:sales) {
            bonusCurrent=p.getAmount()-p.getTarget();
            if(maxBonus==null||maxBonus.getAmount()-maxBonus.getTarget()<bonusCurrent){
                maxBonus=p;
            }
        }
        return maxBonus;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales){
        Salesperson minBonus=null;
        int bonusCurrent;
        for (Salesperson p:sales) {
            bonusCurrent=p.getAmount()-p.getTarget();
            if(minBonus==null||minBonus.getAmount()-minBonus.getTarget()>bonusCurrent){
                minBonus=p;
            }
        }
        return minBonus;
    }
}
