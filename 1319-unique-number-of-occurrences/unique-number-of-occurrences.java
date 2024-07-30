class Solution 
{
    public boolean uniqueOccurrences(int[] arr)
    {
        // Map to store the frequency of each element in the array
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int e : arr) 
        {
            frequencyMap.put(e, frequencyMap.getOrDefault(e, 0) + 1);
        }

        // Set to store the unique occurrence counts
        Set<Integer> uniqueOccurrences = new HashSet<>();
        for (int count : frequencyMap.values()) 
        {
            // If the occurrence count is already in the set, return false
            if (!uniqueOccurrences.add(count)) {
                return false;
            }
        }

        // All occurrence counts are unique
        return true;
    }
}
