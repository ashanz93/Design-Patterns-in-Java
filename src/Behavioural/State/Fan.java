package Behavioural.State;

import lombok.Getter;

public class Fan {
    @Getter State fanOffState;
    @Getter State fanLowState;
    @Getter State fanMedState;
    @Getter State fanHighState;

    State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public String toString() {
        return state.toString();
    }
}
