public class CanCompleteCircuit {
    public static void main(String[] args) {
        int [] gas  = {1,2,3,4,5,5,70};
        int [] cost = {2,3,4,3,9,6,2};
        System.out.println(cir(gas, cost));        
    }
    public static int cir(int [] gas, int [] cost){
        int possible = -1;
        for(int i=0;i<gas.length;i++){
            int g = gas[i];
            for(int j=i;j<i+gas.length;j++){
                int f = j%gas.length;
                int next = (j+1)%gas.length;
                System.err.println("g: "+g+" cost "+cost[f]);
                if (g>=cost[f])
                    g += gas[next]-cost[f];
                else g=-1;
            }
            
            if (g>=gas[i]) return i;
    }
        return possible;
    }

    public static int cir2(int [] gas, int [] cost){
        
        for(int i=0;i<gas.length;i++){
            if(gas[i]-cost[i]<0) continue;
            int g = gas[i];
            for(int j=i;j<i+gas.length;j++){
                int f = j%gas.length;
                int next = (j+1)%gas.length;
                System.err.println("g: "+g+" cost "+cost[f]);
                if (g>=cost[f])
                    g += gas[next]-cost[f];
                else g=-1;
            }
            
            if (g>=gas[i]) return i;
    }
        return -1;
    }

}
