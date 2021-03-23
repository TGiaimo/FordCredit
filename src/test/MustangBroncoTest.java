package test;

import main.MustangBronco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MustangBroncoTest {

  private MustangBronco mustangBroncoFactory() {
    MustangBronco mustangBronco;
    mustangBronco = new MustangBronco();
    return mustangBronco;
  }

  @Test
  public void testDistanceNormal1() {
    MustangBronco mustangBronco = mustangBroncoFactory();
    mustangBronco.setNum(2);
    assertEquals(mustangBronco.calculateMustangBronco(), "2");
  }

  @Test
  public void testDistanceNormal2() {
    MustangBronco mustangBronco = mustangBroncoFactory();
    mustangBronco.setNum(6);
    assertEquals(mustangBronco.calculateMustangBronco(), "Mustang");
  }

  @Test
  public void testDistanceNormal3() {
    MustangBronco mustangBronco = mustangBroncoFactory();
    mustangBronco.setNum(10);
    assertEquals(mustangBronco.calculateMustangBronco(), "Bronco");
  }

  @Test
  public void testDistanceNormal4() {
    MustangBronco mustangBronco = mustangBroncoFactory();
    mustangBronco.setNum(15);
    assertEquals(mustangBronco.calculateMustangBronco(), "MustangBronco");
  }

  @Test
  public void testDistanceNegative1() {
    MustangBronco mustangBronco = mustangBroncoFactory();
    mustangBronco.setNum(-2);
    assertEquals(mustangBronco.calculateMustangBronco(), "-2");
  }

  @Test
  public void testDistanceNegative2() {
    MustangBronco mustangBronco = mustangBroncoFactory();
    mustangBronco.setNum(-6);
    assertEquals(mustangBronco.calculateMustangBronco(), "Mustang");
  }

  @Test
  public void testDistanceNegative3() {
    MustangBronco mustangBronco = mustangBroncoFactory();
    mustangBronco.setNum(-10);
    assertEquals(mustangBronco.calculateMustangBronco(), "Bronco");
  }

  @Test
  public void testDistanceNegative4() {
    MustangBronco mustangBronco = mustangBroncoFactory();
    mustangBronco.setNum(-15);
    assertEquals(mustangBronco.calculateMustangBronco(), "MustangBronco");
  }
}