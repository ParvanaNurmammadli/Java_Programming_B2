package day37_a_abstraction.exercise;

public class Running extends Exercise {
    public Running () {
        super("Running");
    }

    @Override
    public void performExercise (){
        System.out.println("Running on treadmill");
    }

    @Override
    public int caloriesBurned (int min){
        return min * 5;
    }

    @Override
    public void generalInfo (){
        System.out.println(name + " exercise if better for your health");
    }


}

