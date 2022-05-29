package com.aranei.var1;

public class Park {

    String name;
    Attraction attraction;


    public Park(String name, String work, int cost) {
        attraction = new Attraction(name, work, cost);
    }

    public Park(String name, Attraction attraction) {
        this.name = name;
        this.attraction = attraction;
    }


    static class Attraction{
        String name;
        String work;
        int cost;

        public Attraction(String name, String work, int cost) {
            this.name = name;
            this.work = work;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWork() {
            return work;
        }

        public void setWork(String work) {
            this.work = work;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", work='" + work + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }


}
