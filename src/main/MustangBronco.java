package main;

public class MustangBronco {
  private int num;

  public String calculateMustangBronco() {
    StringBuilder out = new StringBuilder();
    if(num % 3 == 0)
      out.append("Mustang");
    if(num % 5 == 0)
      out.append("Bronco");
    if((num % 3 != 0) && (num % 5 != 0)) out.append(num);
    return out.toString();
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }
}
