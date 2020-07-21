/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;

/**
 *
 * @author jgale
 */
public class Client {

    private static final String colors[] = { "Alfa", "Bravo", "Charlie", "Delta", "Echo" };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      for(int i=0; i < 20; ++i) {
         Canal channel = (Canal)CanalFactory.getCanal(getRandomName());
         channel.setUpFrecuencia(getUpFrecuency());
         channel.setLowFrecuency(getLowFrecuency());
         channel.asignar();
      }
    }
   private static String getRandomName() {
      return colors[(int)(Math.random()*colors.length)];
   }
   private static int getUpFrecuency() {
      return (int)(Math.random()*100 );
   }
   private static int getLowFrecuency() {
      return (int)(Math.random()*100);
   }
    
}
