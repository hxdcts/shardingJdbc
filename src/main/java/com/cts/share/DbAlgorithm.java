package com.cts.share;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;  
import com.dangdang.ddframe.rdb.sharding.api.strategy.database.SingleKeyDatabaseShardingAlgorithm;  
  
import java.util.Collection;  
  
public class DbAlgorithm implements SingleKeyDatabaseShardingAlgorithm<Integer> {  
  
    @Override  
    public String doEqualSharding(Collection<String> collection, ShardingValue<Integer> shardingValue) {  
        int id = shardingValue.getValue();  
        int index = (id/4) % 2;   //2库四表
        for (String each : collection) {  
            if (each.endsWith(index + "")) {  
                return each;  
            }  
        }  
        throw new UnsupportedOperationException();  
    }  
  
    @Override  
    public Collection<String> doInSharding(Collection<String> collection, ShardingValue<Integer> shardingValue) {  
        return null;  
    }  
  
    @Override  
    public Collection<String> doBetweenSharding(Collection<String> collection, ShardingValue<Integer> shardingValue) {  
        return null;  
    }  
}