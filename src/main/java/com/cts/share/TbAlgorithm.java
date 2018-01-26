package com.cts.share;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;  
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;  
  
import java.util.Collection;  
  
public class TbAlgorithm implements SingleKeyTableShardingAlgorithm<Integer> {  
  
  
    @Override  
    public String doEqualSharding(Collection<String> availableTargetNames, ShardingValue<Integer> shardingValue) {  
        int id = shardingValue.getValue();  
        int index = (id) % 4; //4表示1个库中四个表
        
        for (String each : availableTargetNames) {  
            if (each.endsWith(index + "")) {  
                return each;  
            }  
        }  
        throw new UnsupportedOperationException();  
    }  
  
    @Override  
    public Collection<String> doInSharding(Collection<String> availableTargetNames, ShardingValue<Integer> shardingValue) {  
        return null;  
    }  
  
    @Override  
    public Collection<String> doBetweenSharding(Collection<String> availableTargetNames, ShardingValue<Integer> shardingValue) {  
        return null;  
    }  
    public static void main(String[] args) {
    	for(int id=1;id<20;id++){
    		int index = (id) % 4;
    		System.out.println(index);
    	}
    	
	}
}  