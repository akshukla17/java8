package com.app.gc;

class Animal {
    public static void main(String[] args) {
    	for(int i=0;i<100000;i++) {
        Animal lion = new Animal();
    	}
        System.gc();
        System.out.print("Main is completed. \t ");
    }

    protected void finalize() {
        System.out.println("Rest in Peace!");
    }
}