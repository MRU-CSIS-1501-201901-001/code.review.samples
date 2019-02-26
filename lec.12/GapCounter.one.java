class GapCounter {
    
    private char firstChar;
    private char secondChar;
    private int letterDiff;
    private boolean rightOrder;
    
    public GapCounter(char firstChar, char secondChar) {
      
      if (firstChar > secondChar) {
        this.firstChar = secondChar;
        this.secondChar = firstChar;
      }else {
        this.firstChar = firstChar;
        this.secondChar = secondChar;
      }
      
      this.letterDiff = secondChar - firstChar;
      this.rightOrder = secondChar > firstChar;
      }

    public String result() {
      if (firstChar == secondChar || (secondChar > firstChar && letterDiff == 1)) {
        return same();
      } else if (gapSize() == 1) {
          return adjacent();
      } else {
          return String.format("There are %d letters between %c and %c.", gapSize(), firstChar, secondChar);
      }
    }
    
    private String same() {
      return String.format("There are %d letters between %c and %c.", gapSize(), firstChar, secondChar);
    }
    
    private String adjacent() {
      return String.format("There is %d letter between %c and %c.", gapSize(), firstChar, secondChar);
    }
    
    private int gapSize() {
      if (firstChar == secondChar) {
        return 0;
      } else {
          return Math.abs(letterDiff) - 1;
      }
    }
  
  
}