package lab.designpatterns.numberwords;

import java.text.DecimalFormat;

import lab.designpatterns.numberwords.bean.Digit;
import lab.designpatterns.numberwords.interfaces.Converter;

public abstract class AbstractConverter {
    private Converter converter;
    
    public static String numbers [] = {"", "One", "Two", "Three", "Four", 
                                       "Five", "Six", "Seven", "Eight", 
                                       "Nine", "Ten","Eleven","Tweleve" ,
                                       "Thirteen", "Fourteen", "Fifteen", 
                                       "Sixteen", "Seventeen", "Eighteen", 
                                    "Nineteen"};
                      
    public static String tens [] = {"","Ten","Twenty", "Thirty", 
                                    "Fourty", "Fifty", "Sixty", 
                                    "Seventy", "Eighty", "Ninety"};
    
    public String separateAndConvert(int number, int start, int end) {
        String stringFormat = "000000000";
        DecimalFormat decimalFormat = new DecimalFormat(stringFormat);
        String numberString = "";
        String convertedNumber = Integer.toString(number);
        convertedNumber = decimalFormat.format(number);
        
        return numberString;
    }
    
    public void chain(Converter converter) {
        this.converter = converter;
    }
    
    public abstract String getWordEnd();
}
