import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
class RepeatedWords{
	static class WordCount {
        protected final String word;
        protected final int count;
        WordCount(String word, int count) {
            this.word = word;
            this.count = count;
        }
        @Override
        public String toString() {
            return "{" + "word='" + word + '\'' + ", count=" + count + '}'+"\r\n";
        }
    }
	public static void main(String[] args) throws IOException {
		int max_size=10;
		//PriorityQueue<WordCount> q=new PriorityQueue<WordCount>(Comparator.comparingInt((WordCount wc)->wc.count).reversed());	//for descending order
		PriorityQueue<WordCount> q=new PriorityQueue<WordCount>(Comparator.comparingInt(wc->wc.count));	//for ascending order
		String contents=new String(Files.readAllBytes(Paths.get("random.txt")));
		String cleaned_cont=contents.replaceAll("[^a-zA-Z ]","").toLowerCase();
		String[] words=cleaned_cont.split("\\s+");
		//List wl=Arrays.asList(words);
		ArrayList<String> wl=new ArrayList<>(Arrays.asList(words));
		Set<String> w=new HashSet<String>(wl);
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		for(String s:w){
			h.put(s,Collections.frequency(wl,s));
		}
		for(Map.Entry<String,Integer>e:h.entrySet()){
			if(q.size()>=max_size)
			{
				if(q.peek().count<e.getValue()){
					q.remove(q.peek());
					q.add(new WordCount(e.getKey(),e.getValue()));
				}

			}
			else
				q.add(new WordCount(e.getKey(),e.getValue()));
		}
		System.out.println(q.size());
		Iterator<WordCount> it=q.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}
}
