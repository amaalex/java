package lab2.homework;

import java.util.*;

public class Solution {
    Problem problem;
    Map<String, String> result = new HashMap<>();

    Solution(Problem problem) {
        this.problem = problem;
    }

    public Map<String, String> computeGreedyMethod() {
        for (Event event : problem.getEvents()) {
            ArrayList<Integer> eventTime = new ArrayList<>();
            eventTime.add(event.getStartTime());
            eventTime.add(event.getEndTime());
            for (Room room : problem.getRooms()) {
                if (room.getCapacity() >= event.getSize()) {
                    if (room.interval.isEmpty()) {
                        result.put(event.getName(), room.getName());
                        room.interval.add(eventTime);
                        break;
                    } else {
                        ArrayList<Integer> time = room.interval.get(room.interval.size()-1);
                        if (time.get(1) <= event.getStartTime()) {
                            result.put(event.getName(), room.getName());
                            room.interval.add(eventTime);
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
}
