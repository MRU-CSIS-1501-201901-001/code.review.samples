class FancyCoffeeCup {
  
private int coffeeAmt;

public FancyCoffeeCup(int cupCapacity) {
  coffeeAmt = cupCapacity;
  
}


public int sip (int sipAmt) {
  int actualSipAmt = Math.min(sipAmt, coffeeAmt);
  coffeeAmt -= actualSipAmt;
  return actualSipAmt;
  
  
}

@Override 
public String toString() {
  return coffeeAmt + "mL";
}

}
class Person {
  private String drinkerName = "";
  private int defaultSipAmt;
  private int coffeDrunk = 0;
  
  public Person (String drinkerName, int defaultSipAmt) {
    this.drinkerName = drinkerName;
    this.defaultSipAmt = defaultSipAmt;
  }
  
  public void sip (FancyCoffeeCup cup) {
    coffeDrunk += cup.sip(defaultSipAmt);
  }
  
  public void gulp (FancyCoffeeCup cup) {
    
    coffeDrunk +=cup.sip(defaultSipAmt * 2);
    
    
  }

  public int amountCoffeeDrunk() {
    return Math.min(coffeDrunk, 100);
  }
  
  
}