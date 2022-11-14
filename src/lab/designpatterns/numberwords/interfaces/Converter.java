package lab.designpatterns.numberwords.interfaces;

import lab.designpatterns.numberwords.bean.Digit;

public interface Converter {
    void chain(Converter converter);
    void convert(Digit digit);
}
