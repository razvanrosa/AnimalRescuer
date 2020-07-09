package org.fasttrackit;

public class RecreationActivity {

    String name;
    int duration;

    public static RecreationActivity[] recreationActivities;

    public RecreationActivity(){

    }

    public RecreationActivity(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    public static void initRecreationActivities(){

        if(recreationActivities == null) {
            recreationActivities = new RecreationActivity[4];

            RecreationActivity recreationActivity1 = new RecreationActivity();
            recreationActivity1.setName("Play with freisbee");
            recreationActivity1.setDuration(30);

            recreationActivities[0] = recreationActivity1;

            RecreationActivity recreationActivity2 = new RecreationActivity();
            recreationActivity2.setName("Walk in the forest");
            recreationActivity2.setDuration(60);

            recreationActivities[1] = recreationActivity2;

            RecreationActivity recreationActivity3 = new RecreationActivity();
            recreationActivity3.setName("Play with toys");
            recreationActivity3.setDuration(30);

            recreationActivities[2] = recreationActivity3;

            RecreationActivity recreationActivity4 = new RecreationActivity();
            recreationActivity4.setName("Go to swim");
            recreationActivity4.setDuration(30);

            recreationActivities[3] = recreationActivity4;

        }


    }

        public static void displayRecreationActivities() {

        System.out.println("Available recreation activities are: ");
        for (int i = 0; i < recreationActivities.length; i++) {
            if (recreationActivities[i] != null) {
                System.out.println(i + 1 + ".  Activity is : " + recreationActivities[i].getName() + " and duration is: " + recreationActivities[i].getDuration() + " minutes.");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static RecreationActivity[] getRecreationActivities() {
        return recreationActivities;
    }

    public static void setRecreationActivities(RecreationActivity[] recreationActivities) {
        RecreationActivity.recreationActivities = recreationActivities;
    }


}
