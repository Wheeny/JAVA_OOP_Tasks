package problem;

import java.util.ArrayList;

public class Person {
    private String name;

    private ArrayList<Problem> problems = new ArrayList<>();

    public void add(Problem problem){
        problems.add(problem);
    }

    public void solve(Problem problem){
        problems.remove(problem);
    }

    public ArrayList<Problem> tell(){
        return problems;
    }



}
