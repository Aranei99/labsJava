package com.aranei.var1;

public class Computer {

    String name;
    TechSpecs specs;

    public Computer(String name, TechSpecs specs) {
        this.name = name;
        this.specs = specs;
    }

    public Computer(String os, String processor, int ram) {
        specs = new TechSpecs(os, processor, ram);
    }


    static class TechSpecs{
        String os;
        String processor;
        int ram;

        public TechSpecs(String os, String processor, int ram) {
            this.os = os;
            this.processor = processor;
            this.ram = ram;
        }

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public String getProcessor() {
            return processor;
        }

        public void setProcessor(String processor) {
            this.processor = processor;
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        @Override
        public String toString() {
            return "TechSpecs{" +
                    "os='" + os + '\'' +
                    ", processor='" + processor + '\'' +
                    ", ram=" + ram +
                    '}';
        }
    }
}
