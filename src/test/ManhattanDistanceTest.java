package test;
import org.junit.Test;
import main.ManhattanDistance;

import static org.junit.Assert.assertEquals;

public class ManhattanDistanceTest {

  private ManhattanDistance distanceFactory() {
    ManhattanDistance distance;
    distance = new ManhattanDistance();
    return distance;
  }

  @Test
  public void testDistanceNormal1() {
    ManhattanDistance distance = distanceFactory();
    distance.setaX(5);
    distance.setaY(4);
    distance.setbX(3);
    distance.setbY(2);
    assertEquals(distance.computeDistance(), 4);
  }

  @Test
  public void testDistanceNormal2() {
    ManhattanDistance distance = distanceFactory();
    distance.setaX(-1);
    distance.setaY(2);
    distance.setbX(1);
    distance.setbY(-2);
    assertEquals(distance.computeDistance(), 6);
  }

  @Test
  public void testDistanceNormal3() {
    ManhattanDistance distance = distanceFactory();
    distance.setaX(8);
    distance.setaY(2);
    distance.setbX(4);
    distance.setbY(7);
    assertEquals(distance.computeDistance(), 9);
  }

  @Test
  public void testDistanceZero() {
    ManhattanDistance distance = distanceFactory();
    distance.setaX(0);
    distance.setaY(0);
    distance.setbX(0);
    distance.setbY(0);
    assertEquals(distance.computeDistance(),0);
  }

  @Test
  public void testDistanceEqual() {
    ManhattanDistance distance = distanceFactory();
    distance.setaX(2);
    distance.setaY(2);
    distance.setbX(2);
    distance.setbY(2);
    assertEquals(distance.computeDistance(), 0);
  }

  @Test
  public void testDistanceNegative() {
    ManhattanDistance distance = distanceFactory();
    distance.setaX(-8);
    distance.setaY(-6);
    distance.setbX(-4);
    distance.setbY(-1);
    assertEquals(distance.computeDistance(), 9);
  }

  @Test
  public void testDistanceNegativePositive() {
    ManhattanDistance distance = distanceFactory();
    distance.setaX(-10);
    distance.setaY(-10);
    distance.setbX(10);
    distance.setbY(10);
    assertEquals(distance.computeDistance(), 40);
  }
}