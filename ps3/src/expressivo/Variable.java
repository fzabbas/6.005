package expressivo;

import java.util.Map;

public class Variable implements Expression {
    private final String x;
    
    // Abstraction function
    //    represents the variable x
    // Rep invariant
    //    true
    // Safety from rep exposure
    //    all fields are immutable and final
    
    private void checkRep() {
        assert !x.equals("");
        assert x.matches("[a-zA-z]+");
    }
    
    /** Make a Variable. */
    public Variable(String x) {
        
        this.x = x.trim();
    }

    @Override
    public Double value() {
        return null;
//        throw new AssertionError("Variable does not have value");
    }


    @Override 
    public String toString() {
        return this.x;
    }
    
    @Override
    public boolean equals(Object thatObject) {
        if (!(thatObject instanceof Variable)) {
            return false;
        }
        Variable that = (Variable) thatObject;
        checkRep();
        return this.x.equals(that.x);
    }
    
    @Override
    public int hashCode() {
        return x.hashCode();
        }
    

    @Override
    public Expression derive(String var) {
        if (var.contentEquals(this.x)) {
            return new Number(1.0);
        } else {
            throw new RuntimeException("Invalid variable");
        }
    }

    @Override
    public Expression simplify(Map<String, Double> val) {
        // TODO Auto-generated method stub
        if (val.keySet().contains(this.x)) {
            Expression num = new Number(val.get(this.x));
            return num;
        } else {
            return new Variable (this.x);
        }
    }

    @Override
    public boolean isNum() {
        // TODO Auto-generated method stub
        return false;
    }

}
