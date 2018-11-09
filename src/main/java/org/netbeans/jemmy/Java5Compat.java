package org.netbeans.jemmy;

public class Java5Compat {
   
   public static Class init( Class klass ) {
      try {
         Class.forName(klass.getName(), true, klass.getClassLoader());
      } catch (ClassNotFoundException e) {
         throw new AssertionError(e);
      }
      return klass;
   }
   
}
