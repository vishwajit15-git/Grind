class TimeMap { 
    private Map<String, ArrayList<TimeStampedValue>> entriesByKey; 

    public TimeMap() { 
        entriesByKey = new HashMap<>(); 
    } 
    
    public void set(String key, String value, int timestamp) { 
        if (!entriesByKey.containsKey(key)) { 
            entriesByKey.put(key, new ArrayList<>()); 
        } 
        entriesByKey.get(key).add(new TimeStampedValue(timestamp, value)); 
    } 
    
    public String get(String key, int timestamp) { 
        if (!entriesByKey.containsKey(key)) { 
            return ""; 
        } 
        
        ArrayList<TimeStampedValue> timeStampedValues = entriesByKey.get(key); 
        Optional<TimeStampedValue> matchedValue = binarySearch(timeStampedValues, timestamp); 
        
        if (matchedValue.isEmpty()) { 
            return ""; 
        } 
        return matchedValue.get().value; 
    } 
    
    private Optional<TimeStampedValue> binarySearch(ArrayList<TimeStampedValue> arr, int target) { 
        int left = 0; 
        int right = arr.size() - 1; 
        int matchedIndex = -1; 
        
        while (left <= right) { 
            int mid = left + (right - left) / 2; 
            TimeStampedValue curr = arr.get(mid); 
            
            if (curr.timestamp <= target) { 
                matchedIndex = mid; 
                left = mid + 1;
            } else { 
                right = mid - 1; 
            } 
        } 
        
        if (matchedIndex == -1) { 
            return Optional.empty(); 
        } 
        return Optional.of(arr.get(matchedIndex)); 
    } 
} 

class TimeStampedValue { 
    public int timestamp; 
    public String value; 
    
    public TimeStampedValue(int timestamp, String value) { 
        this.timestamp = timestamp; 
        this.value = value; 
    } 
}
