import java.util.*;
class HighestScores{
	public static void main(String[] args) {
		HashMap<String,Integer> stud=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String name;
		int score;
		for(int i=0;i<n;i++)
		{
			name=sc.next();
			score=sc.nextInt();
			//sc.nextLine();
			stud.put(name,score);
		}
		String stud_name=Collections.max(stud.entrySet(),Map.Entry.comparingByValue()).getKey();
		System.out.println("Student with First highest value:"+stud_name); 
		Map.Entry<String,Integer>max2=null;
		System.out.println(stud);
		for(Map.Entry<String,Integer>entry:stud.entrySet()){
			if(max2==null)
				if(entry.getKey()!=stud_name)
					max2=entry;
				else
					continue;
			else
				if(entry.getValue().compareTo(max2.getValue())>0 && entry.getKey()!=stud_name)
					max2=entry;
		}
		System.out.println("Student with Second highest Value:"+max2.getKey());
		
	}
}