class PasswordValidator {
  
  private int minPasswordLen;
  private int numSpecialChars;
  private int numDigits;
  private int numUppercase;
  
  public PasswordValidator(int minPasswordLen, int numSpecialChars, int numDigits, int numUppercase) {
    
    this.minPasswordLen = minPasswordLen;
    this.numSpecialChars = numSpecialChars;
    this.numDigits = numDigits;
    this.numUppercase = numUppercase;
  }
  
  public boolean validated(String passwordCandidate) {

  return passwordCandidate.length() >= minPasswordLen &&
  numSpecialChars(passwordCandidate) >= numSpecialChars &&
  numDigits(passwordCandidate) >= numDigits &&
  numUppercase(passwordCandidate) >= numUppercase &&
  !passwordCandidate.contains(" "); 
    
  }
  
  
}