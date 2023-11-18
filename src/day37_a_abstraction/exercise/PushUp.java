package day37_a_abstraction.exercise;

public class PushUp extends Exercise {

    public PushUp () {
        super("PushUp");
    }


    @Override
    public void performExercise (){
        System.out.println("Doing push up on floor");
    }

    @Override
    public int caloriesBurned (int min){
        return min * 2;
    }


    @Override
    public void generalInfo (){
        System.out.println(name + " exercise if better for your health");
    }

}

