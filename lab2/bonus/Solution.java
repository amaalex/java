package lab2.bonus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * this class describes solution(s) for a problem already described / created
 */
public class Solution {
    Problem problem;
    Map<String, String> result = new HashMap<>();

    Solution(Problem problem) {
        this.problem = problem;
    }

    /**
     * this method gets an instance of the problem (which contains rooms and events) and using Greedy
     * will assign events to available rooms comparing endTime of event X with startTime of event Y.
     *
     * @return a HashMap containing the solution. The key is the Event and the value is the Room.
     */
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
                        ArrayList<Integer> time = room.interval.get(room.interval.size() - 1);
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
