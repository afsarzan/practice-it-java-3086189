package _02_02;

public class Tickets {
  public Tickets(){}

  private String destination;
  private double price;
  private boolean isReturn;

  public void setDestinations( String destination){
    this.destination = destination;
  }

  public void setPrice( double price) {
    this.price = price;
  }

  public void setIsreturn( boolean isReturn){
    this.isReturn = isReturn;
  }

  public String getDestination(){
    return destination;
  }

  public double getPrice() {
    return price;
  }

  public boolean getIsreturn(){
    return isReturn;
  }
}
