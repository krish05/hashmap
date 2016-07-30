package hashmap;

public class HashMapImpl implements HashMap{

	private static final int s_hashTableSize = 100000;
	
	private LinkedList[] _backingLinkedListArray = new LinkedList[s_hashTableSize];
	
			@Override
	public String get(String key) {
				
		int hashCode = key.hashCode();
		int hashIndex = hashCode%s_hashTableSize;
		
		LinkedList targetBucket = _backingLinkedListArray[hashIndex];
		
		if(targetBucket == null) {
			return null;
		}
		
		return targetBucket.getValue(key);
		
	}

	@Override
	public void put(String key, String value) {
	
		int hashCode = key.hashCode();
		int hashIndex = hashCode%s_hashTableSize;
		
		LinkedList targetBucket = _backingLinkedListArray[hashIndex];
		
		if(targetBucket == null) {
			targetBucket = new LinkedList();
			_backingLinkedListArray[hashIndex] = targetBucket;
		}
		
		targetBucket.insert(key, value);
	}


}
