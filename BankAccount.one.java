class BankAccount {

  private static final double HIGHER_INTEREST_PERCENT = 0.05;
  private static final double SERVICE_CHARGE = 10.00;
  private static final double LOWER_THRESHOLD = 1000.00;
  private static final double HIGHER_THRESHOLD = 10000.00;
  private static final double LOWER_INTEREST_PERCENT = 0.04;

  double accountBalance = 0.00;

  public BankAccount (double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public boolean incursServiceCharge() {
    boolean balanceUnderOneThousand = (this.accountBalance < LOWER_THRESHOLD);
    return balanceUnderOneThousand;
  }

  public double serviceChargeAmt() {
    if (incursServiceCharge()) {
    return SERVICE_CHARGE;
    } else {  
      return 0d;
    }
  }

  public double interestEarned() {
    if ((this.accountBalance >= LOWER_THRESHOLD) && (this.accountBalance < HIGHER_THRESHOLD)) {
      return interestOneThousandTenThousand();
    } else if (this.accountBalance >= HIGHER_THRESHOLD) {
      return interestOverTenThousand();
    } else if (this.accountBalance < LOWER_THRESHOLD) {
      return 0d;
    }
      return 0d;
    }
  
    private boolean isInterestOverTenThousand() {
      boolean isLoaded = (this.accountBalance > HIGHER_THRESHOLD);
      return isLoaded;
      
    }
    private double interestOneThousandTenThousand() {
      double interestAccruedBtwOnekTenk = this.accountBalance * LOWER_INTEREST_PERCENT;
      if (isInterestOverTenThousand()) {
        return HIGHER_THRESHOLD * LOWER_INTEREST_PERCENT;
      } else {
        return interestAccruedBtwOnekTenk;
      }
  }
    private double interestOverTenThousand() {
    double balanceAfterFirstTenk = (this.accountBalance - HIGHER_THRESHOLD);
    double interestAccruedOverTenk = (balanceAfterFirstTenk * HIGHER_INTEREST_PERCENT);
    double balanceOverTenk = (interestOneThousandTenThousand() + interestAccruedOverTenk);
    return balanceOverTenk;
    }
  }