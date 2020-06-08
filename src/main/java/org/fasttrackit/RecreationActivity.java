package org.fasttrackit;

public class RecreationActivity {

    String name;
    double duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public RecreationActivity(String name, double duration){
        this.name = name;
        this.duration = duration;
    }

}
