package task2;

import java.util.HashMap;

enum Currency {
    dollar,
    euro,
    poundSterling,
    ian
        }
public class CurrencyConverter {
    public HashMap< Currency,  Double> dollar;
    public HashMap< Currency,  Double> euro;
    public HashMap< Currency,  Double> poundSterling;
    public HashMap< Currency,  Double> ian;

    public CurrencyConverter() {
        this.dollar = new HashMap<>();
        this.euro = new HashMap<>();
        this.poundSterling = new HashMap<>();
        this.ian = new HashMap<>();
    }

    public double convertDollar(Currency operand, int money){
        return money*dollar.get(operand);
    }
    public double convertEuro(Currency operand, int money){
        return money*euro.get(operand);
    }
    public double convertPoundSterling(Currency operand, int money){
        return money*poundSterling.get(operand);
    }
    public double convertIan(Currency operand, int money){
        return money*ian.get(operand);
    }

}
