package expressivo;

class Number implements Expression {
    private final int n;
    
    // Abstraction function
    //    represents the integer n
    // Rep invariant
    //    true
    // Safety from rep exposure
    //    all fields are immutable and final
    
    /** Make a Number. */
    public Number(int n) {
        this.n = n;
    }
    
    @Override public int value() {
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
        return this.value() == that.value();
    }
    
    @Override
    public int hashCode() {
        return Integer.valueOf(n).hashCode();
        }
    
    @Override
    public Expression simplify() {
        return null;
    }

    @Override
    public Expression derive() {
        return null;
    }

}
