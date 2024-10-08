
// in Settings search:
// debug.console.collapseIdenticalLines
// and turn it off


package com.cc.java.singleton;

public class App {
    
    public static void main(String[] args) {

        // output(Singleton.getInstance());


        // Helper.output(Singleton.getInstance());
        // Helper.output(Singleton.getInstance());
        // Helper.output(Singleton.getInstance());


            // Feld, auf das NACH der Objektbildung zugegriffen wird

  
  // → App()
  
    
          Singleton obj1 = Singleton.getInstance();
          Helper.output(obj1);
          obj1.actOnEvent();
          obj1.actOnEvent();
          // Events werden kumuliert ... 0 + 2
          Helper.output(obj1.getCounter());
          Helper.output("--------------");
          
          Singleton obj2 = Singleton.getInstance();
          Helper.output(obj2);
          obj2.actOnEvent();
          obj2.actOnEvent();
          obj2.actOnEvent();
          // Events werden kumuliert ... 2 + 3
          Helper.output(obj2.getCounter());
          Helper.output("--------------");
  
          Singleton obj3 = Singleton.getInstance();
          Helper.output(obj3);
          obj3.actOnEvent();
          obj3.actOnEvent();
          obj3.actOnEvent();
          obj3.actOnEvent();
          obj3.actOnEvent();
          
          // Events werden kumuliert ... 5 + 5
          Helper.output(obj3.getCounter());
          Helper.output("--------------");

    }




    
    // private static void output(String outputStr) {
    //     System.out.println(outputStr);
    // }

    // private static void output(Singleton obj) {
    //     System.out.println(obj);
    // }



}

