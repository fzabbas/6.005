package expressivo;

import java.util.Map;

public class Plus implements Expression {
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
    
    @Override public Double value() {
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
    public Expression derive(String var) {
        return new Plus(left.derive(var), right.derive(var));
    }


    @Override
    public Expression simplify(Map<String, Double> val) {
        if (this.left.isNum() && this.right.isNum()) {
            Double num = this.left.value() + this.right.value();
            return new Number(num);
        } else {
            return new Plus (this.left.simplify(val),this.right.simplify(val)).simplify(val);
        }
    }


    @Override
    public boolean isNum() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
