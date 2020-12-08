package Squirrels;

public class Squirrel{
  int intage;
  int intweight;
  int intteethlength;
  String strcolor;

  public Squirrel(int newintage, int newintweight, int newintteethlength, String newstrcolor) {
    
    this.intage = newintage;
    this.intweight = newintweight;
    this.intteethlength = newintteethlength;
    this.strcolor = newstrcolor;
  }

  public void jump(int height) {
    System.out.println("jumped " + height);
  }
  public void dig(String location) {
    System.out.println("digged at" + location);
  }
  public void sleep(int duration) {
    System.out.println("sleeps for " + duration + " minutes");
  }
}