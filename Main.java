//Marc Encarnacion
//3/7/21
//CW 8.0
//--------------------------------------------------
//  SolveTowers.java    Author: Lewis/Loftus
//
//  Demonstrates recursion
//--------------------------------------------------
class Main 
{
  //--------------------------------------------------
  //  Creates a TowersOfHanoi puzzles and solves it
  //--------------------------------------------------
  public static void main(String[] args) 
  {
    System.out.println("Marc Encarnacion, CW 8.0");
    TowersOfHanoi towers = new TowersOfHanoi(4);
    towers.solve();
  }//end main method
}//end class main