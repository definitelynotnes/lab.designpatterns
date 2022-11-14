package lab.designpatterns.strategy.beans;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Tax {
    private double tax = 0.12;
   
    public double getTax() {
        return this.tax;
    }
    
    public void setTax(double tax) {
        this.tax = tax;
    }
    
    
}
