class RecentCounter {
    ArrayList<Integer> arr;
    int counter;

    public RecentCounter() {
        arr = new ArrayList<>();
    }
    
    public int ping(int t) {
        arr.add(t);
        counter = 0;
        for (int x : arr) {
            if (t - 3000 <= x && x <= t) {
                counter++;
            }
        }
        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
