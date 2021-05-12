package expressivo;

class Plus implements Expression {
    private final Expression left, right;
    
    // Abstraction function
    //    represents the sum of two expressions left+right
    // Rep invariant
    //    true
    // Safety from rep exposure
    //    all fields are immutable and final
    
    public Plus (Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    
    private void checkRep() {
        assert left != null;
        assert right != null;
    }
    
    @Override public int value() {
        return left.value() + right.value();
    }
    
    
    @Override public String toString() {
        return "("+left+")+("+right+")";
    }
    
    @Override
    public boolean equals(Object thatObject) {
        if (!(thatObject instanceof Plus)) {
            return false;
        }
        Plus that = (Plus) thatObject;
        checkRep();
        return this.left.equals(that.left) && this.right.equals(that.right);
    }
    
    @Override
    public int hashCode() {
        return left.hashCode()+ right.hashCode();
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
    
}
