package lab.designpatterns.numberwords.bean;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Digit {
    private BigDecimal number;
    
    public Digit(int number) {
        this.number = new BigDecimal(number);
    }
}
