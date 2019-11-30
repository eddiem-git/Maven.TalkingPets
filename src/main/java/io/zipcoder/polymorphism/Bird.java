package io.zipcoder.polymorphism;

public class Bird extends Pets {

        public Bird(String name, String type) {
            super(name, type);
        }

        public String speak(){return "Caaw";}
    }
