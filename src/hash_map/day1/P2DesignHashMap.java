package hash_map.day1;

import java.util.LinkedList;

public class P2DesignHashMap {

}

//https://leetcode.com/problems/design-hashmap/description/

class HMNode{
    int key;
    int value;

    HMNode(int key, int value){
        this.key = key;
        this.value = value;
    }

}

class MyHashMap {

    private int size;
    private LinkedList<HMNode>[] buckets;

    public MyHashMap() {
        initbuckets(4);
        size = 0;
    }

    private void initbuckets(int N){
        buckets = new LinkedList[N];
        for(int i=0; i<buckets.length; i++){
            buckets[i] = new LinkedList<>();
        }
    }

    
    public void put(int key, int value) {
        int bi = hashfn(key);
        int di = getIndexWithinBucket(key, bi);

        if(di != -1){
            HMNode node = buckets[bi].get(di);
            node.value = value;
        }
        else{
            HMNode node = new HMNode(key, value);
            buckets[bi].add(node);
            size++;
        }

        double lambda = size*1.0 / buckets.length;
        if(lambda > 2.0){
            rehash();
        }
    }

    private int hashfn(int val){
        int hc = Integer.hashCode(val);
        return Math.abs(hc) % buckets.length;
    }

    private int getIndexWithinBucket(int key, int bi){
        int di =0;
        for(HMNode node : buckets[bi]){
            if(node.key == key){
                return di;
            }
            di++;
        }
        return -1;
    }
    
    private void rehash(){
        LinkedList<HMNode>[] oba = buckets;

        initbuckets(oba.length * 2);
        size = 0;

        for(int i=0; i<oba.length; i++){
            for(HMNode node : oba[i]){
                put(node.key, node.value);
            }
        } 
    }

    public int get(int key) {
        int bi = hashfn(key);
        int di = getIndexWithinBucket(key, bi);

        if(di != -1){
            HMNode node = buckets[bi].get(di);
            return node.value;
        }
        else{
            return -1;
        }
    }
    
    public void remove(int key) {
        int bi = hashfn(key);
        int di = getIndexWithinBucket(key, bi);

        if(di != -1){
            HMNode node = buckets[bi].remove(di);
            size--;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */