/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;

import java.util.HashMap;

/**
 *
 * @author jgale
 */
public class CanalFactory {

   // Uncomment the compiler directive line and
   // javac *.java will compile properly.
   // @SuppressWarnings("unchecked")
   private static final HashMap list = new HashMap();

   public static Espectro getCanal(String name) {
      Canal canal = (Canal)list.get(name);

      if(canal == null) {
         canal = new Canal(name);
         list.put(name, canal);
         System.out.println("Creating Canal of name : " + name);
      }
      return canal;
   }
}
