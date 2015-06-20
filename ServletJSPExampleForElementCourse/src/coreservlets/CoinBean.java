package coreservlets;

public class CoinBean {
  public String getFlip() {
    if (Math.random() < 0.5) {
      return("Heads");
    } else {
      return("Tails");
    }
  }
}