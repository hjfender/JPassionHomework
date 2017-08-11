package com.jpassion.dp;

public abstract class GreetingAbstract implements IGreeting {
  
  protected IGreeting decoratedTarget;

  public GreetingAbstract(IGreeting decoratedTarget) {
      this.decoratedTarget = decoratedTarget;
  }
 
}
