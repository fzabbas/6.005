package abc.player;

/** Fraction information and methods. */
class Fraction {
  private static double totalVal = 0; // static, or class variables are useful 
                                      // for maintaining information for the class
                                      // such as the totals of all the objects, 
                                      // or constants like the ones we've seen (PI)
  // the following are instance variables - they are fields that are present for each
  // Fraction object.
  /** The numerator. */
  private int num; // since we did not declare this variable to be private (as we normally should),
           // it is private to this class and any other class which participates in the
           // same package as this class.  This type of access is called "protected".
           // see section 6.4 of the text for further explanation. and pg 192 for
           // package intro.
  /** The denominator. */
  private int den;
  
  // note: there are two ways to construct a fraction - we can overload Constructors
  //       just as we can overload methods.  Note also, that when defining the sig-
  //       nature for a constructor, we never provide a return value type.
  /** Provide the numerator and denominator when constructing a fraction.
   *  If the denominator provided is zero, terminate with a runtime exception.
   * @param n the numerator
   * @param d the denominator
   */
  public Fraction(int n, int d) {
    this.setFraction(n, d);
  }
  
  /** Construct the default fraction which sets the denominator to 1
   *  and the numerator to zero so that a divide by zero error cannot occur.
   */
  public Fraction() {
    this.num = 0;
    this.den = 1;
  }
  
  /** Add a fraction (f) to the current fraction.
   * @param f the fraction to be added. */
  public void addFraction(Fraction f) {
    this.num = (this.num * f.den) 
      + (this.den * f.num);
    this.den *= f.den;
  }  
  /** Create a string literal for the fraction.
   * @return the fraction expressed as a String.
   */
  public String toString() {
    return num + " / " + den;
  }
  
  /** Determine the absolute size of the fraction.
   * @return the fraction size as a double.
   */
  public double size() {
    return Math.abs((double)num/den);
  }
  
  /** Compare this fraction to another fraction
   *  and determine which is larger.
   * @return the larger fraction.
   */
  public Fraction larger(Fraction f) {
    if (this.size() > f.size() ) {
      return this; // note that whenever a return statement is issued, control
                   // returns immediately to the point from which the method was called.
    }
    return f;
  }
  
  /** Invert the fraction.  If the numerator is zero,
   * terminate with a runtimeException and do not complete the inversion.
   */ 
  public void inverse() {
    if (this.num == 0) {
      throw new RuntimeException
        ("Attempted to invert fraction with zero numerator");
    }
    int temp;
    temp = this.num;
    num = den; 
    den = temp;
  }
  
  /** Invert the fraction. f the numerator is zero,
   * terminate with a runtimeException and do not complete the inversion.
   * @param f the fraction to be inverted.
   */ 
  // note: not only have we overloaded this method, but we have created
  //       a static or class method to invert any Fraction.
  public static void inverse(Fraction f) {
       if (f.num == 0) {
      throw new RuntimeException
        ("Attempted to invert fraction with zero numerator");
    }
    int temp;
    temp = f.num;
    f.num = f.den;
    f.den = temp;
  }
  
  // To be completed by students as an exercise.
  /** Reduce the fraction. After reduction is performed, the 
   * numerator and denominator cannot both be divided evenly by
   * any number except 1.
   */
  public void reduce() {
    
  }
  
  
  /** get the numerator of the fraction.  This is an accessor method.
   * @return the numerator.
   */
  public int getNumerator(){
    return this.num;
  }
  
  /** get the denominator of the fraction.  This is an accessor method.
   * @return the denominator.
   */
  public int getDenominator() {
    return this.den;
  }
  
  /** set the numerator of the fraction. This is a mutator method.
   * @param n the new numerator  value.
   */
  public void setNum(int n) {
    this.num = n;
  }
  
    /** set the denominator of the fraction. This is a mutator method.
   * @param d the new denominator value.
   */
  public void setDen(int d) {
    if (d == 0) {
      throw new RuntimeException  ("cannot use zero for denominator!!");
    } else {
      this.den = d;
    }
  }
  
  /** set the new fraction value.
   * @param n the new numerator value.
   * @param d the new denominator value.
   */
  public void setFraction(int n, int d) {
    this.setNum(n);
    this.setDen(d);
  }
  
  
  /** Compare the fraction to another fraction and return true if
   *  they are equal.
   * @param f the fraction to be compared.
   * @return true if the two fractions are equal, otherwise, false.
   */
  public boolean equals(Object f) {
    return (f != null && f instanceof Fraction && 
            this.num == ((Fraction)f).num && this.den == ((Fraction)f).den);
  }
  
  

}