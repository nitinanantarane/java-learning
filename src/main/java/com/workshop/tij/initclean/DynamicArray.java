package com.workshop.tij.initclean;

public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle", "de", "dum"});
        System.out.println("First main method");
    }
}

class Other {
    public static void main(String[] args) {
        for (String s : args)
            System.out.print(s + " ");

     /*try {
      Thread.sleep(500);
     } catch (InterruptedException e) {
      throw new RuntimeException(e);
     }*/
    }
}