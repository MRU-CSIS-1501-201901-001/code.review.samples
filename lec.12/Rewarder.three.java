class Rewarder {
  
private int firstThreshold = 0;
private int secondThreshold = 0;
private int thirdThreshold = 0;
private int firstThresholdReward = 0;
private int secondThresholdReward = 0;
private int thirdThresholdReward = 0;

public void setThresholdOne(int firstThreshold, int firstThresholdReward) {
  this.firstThreshold = firstThreshold;
  this.firstThresholdReward = firstThresholdReward;
  
}


public void setThresholdTwo(int secondThreshold, int secondThresholdReward) {
  this.secondThreshold = secondThreshold;
  this.secondThresholdReward = secondThresholdReward;
  
}

public void setThresholdThree(int thirdThreshold, int thirdThresholdReward) {
  this.thirdThreshold = thirdThreshold;
  this.thirdThresholdReward = thirdThresholdReward;
  
}


public int reward (int numResources) {
  
  if (numResources >= this.thirdThreshold) {
    return this.thirdThresholdReward;
    } else if ((numResources >= this.secondThreshold) && (numResources < this.thirdThreshold)) {
      return this.secondThresholdReward;
    } else if ((numResources >= this.firstThreshold) && (numResources < this.secondThreshold)) {
      return this.firstThresholdReward;
    } else {
    return 0;
    }
    
  
  
}
}