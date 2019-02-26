class Rewarder
{
  int firstThresholdReward = 0;
  int secondThresholdReward = 0;
  int thirdThresholdReward = 0;
  int thresholdOne = 0;
  int thresholdTwo = 0;
  int thresholdThree = 0;
  
  
  public void setThresholdOne (int numResources, int reward)
  {
    thresholdOne = numResources;
    firstThresholdReward = reward;
  }
  public void setThresholdTwo (int numResources, int reward)
  {
    thresholdTwo = numResources;
    secondThresholdReward = reward;
  }
  public void setThresholdThree (int numResources, int reward)
  {
    thresholdThree = numResources;
    thirdThresholdReward = reward;
  }
  public int reward (int numResources)
  {
    int rewardGiven = 0;
    
    if (numResources >= thresholdThree)
    {
      rewardGiven = thirdThresholdReward;
    }
    else if (numResources >= thresholdTwo)
    {
      rewardGiven = secondThresholdReward;
    }
    else if (numResources >= thresholdOne)
    {
      rewardGiven = firstThresholdReward;
    }
    
    return rewardGiven;
  }
}