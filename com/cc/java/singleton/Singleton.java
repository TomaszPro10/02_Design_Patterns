package com.cc.java.singleton;


public class Singleton {
    
// Objektbidung in der Klasse
private static Singleton instance;

// Feld, auf das NACH der Objektbildung zugegriffen wird
private int counter;

private Singleton() {
    
}

// ... in der Klasse
public static Singleton getInstance() {

    // if (instance == null) {
    //     instance = new Singleton();
    //     return instance;
    // } else {
    //     return instance;
    // }


    // if (instance == null) {
    //     return instance = new Singleton();
    // }
    // return instance;


    return instance == null ? instance = new Singleton() : instance;
}

// Funktionalität im Objekt

public int getCounter() {
    return counter;
}

public void actOnEvent() {
    this.counter ++;

}

}
