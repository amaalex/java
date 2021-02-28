package com.company;

import java.util.ArrayList;
import java.util.List;

public class Problem {
    private List<Source> sources = new ArrayList<Source>();
    private List<Destination> destinations = new ArrayList<Destination>();

    public Problem(List<Source> sources, List<Destination> destinations) {
        this.sources = sources;
        this.destinations = destinations;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "sources=" + sources +
                ", destinations=" + destinations +
                '}';
    }
}
