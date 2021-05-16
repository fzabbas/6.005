package expressivo;

import java.util.Map;

public class Multiply implements Expression {
    private final Expression left, right;
    
    // Abstraction function
    //    represents the sum of two expressions left+right
    // Rep invariant
    //    true
    // Safety from rep exposure
    //    all fields are immutable and final
    
    public Multiply (Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    private void checkRep() {
        assert left != null;
        assert right != null;
    }
    
    @Override public Double value() {
        return left.value() * right.value();
    }
    
    @Override public String toString() {
        return "("+left+")*("+right+")";
    }
    
    @Override
    public boolean equals(Object thatObject) {
        if (!(thatObject instanceof Multiply)) {
            return false;
        }
        Multiply that = (Multiply) thatObject;
        checkRep();
        return this.left.equals(that.left) && this.right.equals(that.right);
    }
    
    @Override
    public int hashCode() {
        return left.hashCode()*right.hashCode();
        }

    @Override
    public Expression derive(String var) {
        Expression prod1 = new Multiply (this.left, this.right.derive(var));
        Expression prod2 = new Multiply (this.right, this.left.derive(var));
        return new Plus (prod1, prod2);
    }

    @Override
    public Expression simplify(Map<String, Double> val) {
        if (this.left.isNum() && this.right.isNum()) {
            Double num = this.left.value() * this.right.value();
            return new Number(num);
        } else {
        return new Multiply(this.left.simplify(val),this.right.simplify(val)).simplify(val);
        }
    }

    @Override
    public boolean isNum() {
        // TODO Auto-generated method stub
        return false;
    }
    
}

