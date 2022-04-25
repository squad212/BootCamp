package com.example.demoProject;

public class PrintingName {

    String name;

    public PrintingName(String name){
        this.name = name;
    }

    private String name(String saroj) {
        return name;
    }
    public static void main(String[] args) {
        PrintingName printingName = new PrintingName("saroj");
        String name = printingName.name("Saroj");

        System.out.println("Hello all this is me : " + name);
    }


}
