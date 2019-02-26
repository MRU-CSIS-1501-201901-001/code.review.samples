class FancyCoffeeCup {
  
  int cupCapacity;
  int currCoffee;
 
 
  
  public FancyCoffeeCup(int cupCapacity) {
  this.cupCapacity = cupCapacity;
  currCoffee = cupCapacity;
  }
  
  
  
  public int sip(int slurp) {
  if (slurp > currCoffee) {
  slurp = currCoffee % slurp;
  currCoffee = Math.max(currCoffee - slurp, 0);
  return slurp;
  } else {
  currCoffee -= slurp;
  return slurp;
  }
  
  
  }

  public String toString(){
  return "" + currCoffee + "!";
  }
}


class Person {
String name;
int defaultSipAmt;
int mlsInBelly = 0;
private FancyCoffeeCup fancyCoffeeCup;


public Person(String name, int defaultSipAmt) {
this.name = name;
this.defaultSipAmt = defaultSipAmt;
}


public void sip(FancyCoffeeCup fancyCoffeeCup) {
this.fancyCoffeeCup = fancyCoffeeCup;
mlsInBelly += fancyCoffeeCup.sip(defaultSipAmt);
}
public void gulp(FancyCoffeeCup fancyCoffeeCup) {
this.fancyCoffeeCup = fancyCoffeeCup;
mlsInBelly += fancyCoffeeCup.sip((defaultSipAmt * 2));
} 


public int amountCoffeeDrunk() {
return mlsInBelly;
}