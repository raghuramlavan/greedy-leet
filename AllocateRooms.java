import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Arrays;

public class AllocateRooms {
    public static void main(String[] args) {
        //int[][] intervals ={{7,10},{2,4}};
        int[][] intervals ={{0,30},{5,10},{15,20}};
        System.out.println(minMeetingRooms(intervals));
    }
    public static int minMeetingRooms(int[][] intervals) {
        List<List<Integer>> ints = new ArrayList(intervals.length);
        for(int i=0;i<intervals.length;i++){
            ints.add(Arrays.asList(intervals[i][0],intervals[i][1]));
        }
     ints.sort((a,b)->Integer.compare(a.get(0),b.get(0)));
     
     PriorityQueue<Integer> pq = new PriorityQueue<>();
     int max_rooms= 0;
     for (List<Integer> meetings :ints ) {
        Integer endTime =meetings.get(1);
        Integer startTime =meetings.get(0);
        
        while(!pq.isEmpty()){
            if(pq.element() < startTime)
                pq.poll();
            else break;
        }
            pq.add(endTime);
            if (pq.size()>max_rooms) max_rooms = pq.size();
        
     }
     System.out.println(ints.toString());
     
     return max_rooms;
    }

}
