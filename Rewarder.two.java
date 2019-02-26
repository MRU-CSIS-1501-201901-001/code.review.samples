class Rewarder {
  
  private int firstThreshold = 0;
  private int firstReward = 0;
  private int secondThreshold = 0;
  private int secondReward = 0;
  private int thirdThreshold = 0;
  private int thirdReward = 0;
  private int reward = 0;
  
  
  public void setThresholdOne(int firstResources, int first) {
      firstThreshold += firstResources;
      firstReward += first;
  }
  public void setThresholdTwo(int secondResources, int second) {
    secondThreshold += secondResources;
    secondReward += second;
  }
  public void setThresholdThree(int thirdResources, int third) {
    thirdThreshold += thirdResources;
    thirdReward += third;
  }
  public int reward(int numResources) {
    if (numResources >= firstThreshold) {
      reward = firstReward;
    }
    else if (numResources < firstReward) {
      reward = 0;
    
    }
    if (numResources >= secondThreshold) {
      reward = firstReward;
    }
    else if (numResources < secondThreshold && numResources >= firstThreshold) {
      reward = firstReward;
    }
    if (numResources >= thirdThreshold) {
      reward = thirdReward;
    }
    else if (numResources < thirdThreshold && numResources >= secondThreshold) {
      reward = secondReward;
    }
    return reward;
 }
}