package chapterEight;

import java.util.List;

public class Person {
    private  String name;
    private List<Problem> problems;

    public String tellProblem(){
        String ourProblem = "";
        for(Problem problem: problems){
            if(!problem.isSolved()){
                ourProblem += problem.getName() + "\n";
            }
        }
        return ourProblem;
    }
}
