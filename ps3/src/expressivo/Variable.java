package expressivo;

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
        this.x = x;
    }

    @Override
    public int value() {
        throw new AssertionError("Variable does not have value");
    }

    @Override
    public Expression simplify() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Expression derive() {
        // TODO Auto-generated method stub
        return null;
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

}
