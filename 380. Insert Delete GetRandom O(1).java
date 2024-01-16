Ques Link - https://leetcode.com/problems/insert-delete-getrandom-o1

--------------------------------------- Solution ---------------------------------------------

class RandomizedSet {
    private Map<Integer, Integer> mp = new HashMap<>();
    private List<Integer> ls = new ArrayList<>();
    private Random rand = new Random();

    public boolean insert(int val) {
        if(mp.containsKey(val))
            return false;
        mp.put(val,ls.size());
        ls.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!mp.containsKey(val))
            return false;
        int ind = mp.get(val);
        int size = ls.size();
        ls.set(ind,ls.get(size-1));
        mp.put(ls.get(size-1),ind);
        ls.remove(size-1);
        mp.remove(val);
        return true;
    }
    
    public int getRandom() {
        int ind = rand.nextInt(ls.size());
        return ls.get(ind);
    }
}
