/**
 * Created by gbagony on 2017/2/20.
 */
public abstract class Mission {

    protected String state;

    public String getState() {
        return state;
    }

    public Mission setState(String state) {
        this.state = state;
        return this;
    }
}
