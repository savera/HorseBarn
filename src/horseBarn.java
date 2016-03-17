
public class horseBarn {

	static Horse[] spaces;  
	
	public static Object[] getSpaces() {
			
		spaces[0] = ("Trigger", 1340); 
		
		spaces[1] = (null, null); 
		
		spaces[2] = ("Silver", 1210); 
		
		spaces[3] = ("Lady", 1575); 
		
		spaces[4] = ("Silver", 1210); 
		
		spaces[5] = ("Silver", 1210); 
		
		spaces[6] = ("Silver", 1210); 
		
	}
	
	public horseBarn createTestBarn() {
		
		
		
		return null;
	}

	public Object findHorseSpace(String name) {
		
		String indexName; 
		
		int index = -1; 
		
		for (int i = 0; i < spaces.length; i++) {
			
			indexName = spaces[i].getName(); 
			
			if (name.equals(indexName)) {
				
				index = i; 
				
				break; 
				
			}
			
		}
		
		return index;
	}

	public static void consolidate() {
	
		for (int i = 0; i < spaces.length; i++) {
			
			if (spaces[i].getName() == null) {
				
				for (int j = 0; j < spaces.length; j++) {
					
					spaces[j] = spaces[j+1]; 
					
				}
				
			}
			
		}
		
	}

}
