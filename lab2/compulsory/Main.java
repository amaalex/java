package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //creating sources
        Source S1 = new Source("S1", SourceType.FACTORY, 20);
        Source S2 = new Source("S2", SourceType.WAREHOUSE, 10);
        Source S3 = new Source("S3", SourceType.WAREHOUSE, 30);

        //creating destinations
        Destination D1 = new Destination("D1", 20);
        Destination D2 = new Destination("D2", 25);
        Destination D3 = new Destination("D3", 25);

        //creating lists
        List<Source> sources = new ArrayList<Source>();
        sources.add(S1);
        sources.add(S2);
        sources.add(S3);

        List<Destination> destinations = new ArrayList<Destination>();
        destinations.add(D1);
        destinations.add(D2);
        destinations.add(D3);

        // generate problem
        Problem P1 = new Problem(sources,destinations);

        //cleaning memory using GC
        P1 = null;
    }
}
