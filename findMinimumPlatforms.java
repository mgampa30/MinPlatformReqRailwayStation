import java.util.*;
class findMinPlatforms {
   public static void main(String[] args) {
        String[] arrivals = {"1:00", "1:40", "1:50", "2:00", "2:15", "4:00"};
        String[] departures = {"1:10", "3:00", "2:20", "2:30", "3:15", "6:00"};
        int minPlatforms = findMinimumPlatforms(arrivals,departures);
        System.out.println(minPlatforms);
    }
    public static int convertToMinutes(String time){
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours*60+minutes;
    }
    public static int findMinimumPlatforms(String[] arrivals, String[] departures){
        int n = arrivals.length;
        int[] arrivalsMinutes = new int[n];
        int[] departureMinutes = new int[n];
        
          for (int i = 0; i < n; i++) {
            arrivalsMinutes[i] = convertToMinutes(arrivals[i]);
            departureMinutes[i] = convertToMinutes(departures[i]);
        }
        
        Arrays.sort(arrivalsMinutes);
        Arrays.sort(departureMinutes);
        
        int platformsNeeded = 0;
        int currentTrains = 0;
        int i =0;
        int j =0;
        
        while(i<n && j<n){
            if(arrivalsMinutes[i] <= departureMinutes[j]){
                currentTrains++;
                platformsNeeded = Math.max(platformsNeeded,currentTrains);
                i++;
            } else{
                currentTrains--;
                j++;
            }
        }
        return platformsNeeded;
    }
}
