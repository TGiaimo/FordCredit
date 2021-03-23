package main;

import java.util.*;

public class ManhattanDistance {
  int aX, aY, bX, bY; //initialize integers for point A and point B

  public void setaX(int aX) {
    this.aX = aX;
  }

  public void setaY(int aY) {
    this.aY = aY;
  }

  public void setbX(int bX) {
    this.bX = bX;
  }

  public void setbY(int bY) {
    this.bY = bY;
  }

  public int getXDistance() {
    return Math.max(aX, bX) - Math.min(aX, bX);
  }

  public int getYDistance() {
    return Math.max(aY, bY) - Math.min(aY, bY);
  }

  public int computeDistance() {
    return getXDistance() + getYDistance();
  }

  public static void main(String args[]) {
    ManhattanDistance distance = new ManhattanDistance();
    Scanner scan = new Scanner(System.in); //scanner to accept values

    System.out.println("Enter point A in the form 'x y': ");
    distance.setaX(scan.nextInt());
    distance.setaY(scan.nextInt());
    System.out.println("Enter point B in the form 'x y': ");
    distance.setbX(scan.nextInt());
    distance.setbY(scan.nextInt());

    int manhattanDistance = distance.computeDistance();
    System.out.println("The distance between A and B is: " + distance.getXDistance() + " + " + distance.getYDistance() + " = " + manhattanDistance);
  }

}
