  class GapCounter {
    
  char firstChar;
  char secondChar;
    
    public GapCounter(char firstChar, char secondChar) {
      if (firstChar > secondChar) {
        this.secondChar = firstChar;
        this.firstChar = secondChar;
      } else {
        this.firstChar = firstChar;
        this.secondChar = secondChar;
      }
    }


    public String result() {
      return String.format("There %s %d letter%s between %c and %c.", connecter(), gapCalculator(), letterEnd(), firstChar, secondChar);
    }


public int gapCalculator() {
  if (secondChar - firstChar == 0) {
    return 0; 
  } else {
  return secondChar - firstChar - 1;
  }
}

public String connecter() {
  if (secondChar - firstChar - 1 == 1) {
    return "is";
  } else {
    return "are";
  }
}

public String letterEnd() {
  if (secondChar - firstChar - 1 == 1) {
    return "";
  } else {
  return "s";
}
}
}