package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
        String str = System.getProperty("java.specification.version");
        Double version = Double.parseDouble(str);
        return version;
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
	    System.out.println("Version is " + getVersion());
    }
}
