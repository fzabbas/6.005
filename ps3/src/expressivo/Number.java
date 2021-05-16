package expressivo;

import java.util.Map;

public class Number implements Expression {
    private final Double n;
    
    // Abstraction function
    //    represents the integer n
    // Rep invariant
    //    true
    // Safety from rep exposure
    //    all fields are immutable and final
    
    /** Make a Number. */
    public Number(Double n) {
        this.n = n;
    }
    
    @Override public Double value() {
        return n;
    }
    
    @Override public String toString() {
        return String.valueOf(n);
    }

    @Override
    public boolean equals(Object thatObject) {
        if (!(thatObject instanceof Number)) {
            return false;
        }
        Number that = (Number) thatObject;

        return Double.compare(this.value(), that.value()) == 0;
    }
    
    @Override
    public int hashCode() {
        return this.n.hashCode();
        }

    @Override
    public Expression derive(String var) {
        return new Number(0.0);
    }

    @Override
    public Expression simplify(Map<String, Double> val) {
        return new Number(this.n);
    }

    @Override
    public boolean isNum() {
        // TODO Auto-generated method stub
        return true;
    }

}
