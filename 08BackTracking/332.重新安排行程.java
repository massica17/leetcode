/*
 * @lc app=leetcode.cn id=332 lang=java
 *
 * [332] 重新安排行程
 */

// @lc code=start

import java.util.*;

class Solution {
    
    HashMap<String,List<String>> map=new HashMap<>();
    List<String>  res=new ArrayList<>();
    HashMap<String,boolean []> visited=new HashMap<>();
    // 边的数目
    int n;

    public List<String> findItinerary(List<List<String>> tickets) {
        n=tickets.size();
        // 建立邻接表
        for(List<String> t:tickets){
            if(!map.containsKey(t.get(0))){
                map.put(t.get(0),new ArrayList<String>());
            }
            map.get(t.get(0)).add(t.get(1));
        }
        for(List<String> list:map.values()){
            Collections.sort(list);
        }

        //  建立  访问标志映射
        for(String key:map.keySet()){
            boolean []a=new boolean[map.get(key).size()];
            visited.put(key,a);
        }
        
        dfs("JFK",0);
        return res;
    }

    public boolean dfs(String cur,int count){
        res.add(cur);
        if(count>=n){
            return true;
        }
        
        List<String> list=map.get(cur);
        
        if(list!=null){
            for(int i=0;i<list.size();i++){
                if(visited.get(cur)[i]==false){
                    visited.get(cur)[i]=true;
                    if(dfs(list.get(i),count+1)){
                        return true;
                    }
                    // 回溯
                    visited.get(cur)[i]=false;
                }
            }
        }
        res.remove(res.size()-1);
        return false;
       
    }
}
// @lc code=end

