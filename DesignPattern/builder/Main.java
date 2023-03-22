package DesignPattern.builder;

public class Main {
    public static void main(String args[]) {
        NutritionalFacts n = 
            new NutritionalFacts.Builder(10).carbo(23).build();
        System.out.println("carbo: "+n.getCargo());
        System.out.println("fat: "+n.getFat());
        System.out.println("sodium: "+n.getSodium());
    }
}