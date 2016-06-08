import javax.inject.Inject;

public class Learning {

    private Goal goal;

    @Inject
    public Learning(Goal goal) {
        this.goal = goal;
    }

    public int lol(){
        return goal.getId();
    }
  }



