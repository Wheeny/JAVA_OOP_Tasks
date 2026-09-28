package problem;

public class Problem {

    private String description;
    private ProblemType type;
    private boolean status;

    private Problem(String description, ProblemType type){
        this.description = description;
        this.type = type;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setType(ProblemType type){
        this.type = type;
    }

    public ProblemType getType(){
        return type;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }
}
