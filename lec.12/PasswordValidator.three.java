class PasswordValidator {
  
  // you'll need some instance variables....
  private int minNumChars ;
  private int minNumSpecialChars ;
  private int minNumDigits ;
  private int minNumUpperChars ;
  
  private boolean check;
  
  
  public PasswordValidator(int minPasswordLen, int numSpecialChars, int numDigits, int numUppercase) {
  this.minNumChars = minPasswordLen ;
  this.minNumSpecialChars = numSpecialChars ;
  this.minNumDigits = numDigits ;
  this.minNumUpperChars = numUppercase ;
    
  }
  
  
  public boolean validated(String passwordCandidate) {
    if ( (numSpecialChars(passwordCandidate) >= minNumSpecialChars) 
      && (numDigits(passwordCandidate) >= minNumDigits) 
      && (numUppercase(passwordCandidate) >= minNumUpperChars) 
      && (passLength(passwordCandidate) >= minNumChars) 
      && (spaceChecker(passwordCandidate) == false) ){
        
     check = true ;
     
    } else {
      check = false ;
    }
    
    return check ;

  }
  
  // Returns the number of special (not letters of the alphabet or digits)
  // characters in a given string.
  //
  
  private boolean spaceChecker(String passwordCandidate){
    boolean spaceCheck = false ;
  if (passwordCandidate.contains(" ") ) {
    spaceCheck = true ;
  }  
  return spaceCheck ;
  
  }
  
  
  private int passLength(String passwordCandidate){
   int charCount = passwordCandidate.length() ;
    
    return charCount ;
  }
  
  
}