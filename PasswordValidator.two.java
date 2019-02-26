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
    int passwordLength = passwordCandidate.length();
    
    if (passwordCandidate.contains(" ")) {
      return false;
    }
    
    if (passwordLength >= minPasswordLen && numSpecialChars(passwordCandidate) >= numSpecialChars &&
        numDigits(passwordCandidate) >= numDigits && numUppercase(passwordCandidate) >= numUppercase) {
          return true;
        } else {
          return false;
        }
  }
  
}