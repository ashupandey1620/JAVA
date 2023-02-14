import java.util.PriorityQueue;

class Reorganize_String {


public String reorganizeString(String s) {
    int[] map=new int[26];
    for(int i=0;i<s.length();i++)
    {
        map[s.charAt(i)-'a']++;
    }
    
    PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->b.f-a.f);
     
    
    for(int i=0;i<26;i++){
        if(map[i]>0)
        {
            pq.add(new pair((char)('a'+i),map[i]));
        }
        
    }
    
    StringBuilder result = new StringBuilder();
    
    pair block = pq.poll();
    result.append(block.ch);
    block.f--;
    while(pq.size()>0){
        pair temp = pq.poll();
        result.append(temp.ch);
        temp.f--;
        if(block.f>0)
        {
            pq.add(block);
        }
        block = temp;
    }
    
    if(block.f>0){
        return "";
    }
    
    return result.toString();
    
     
    
    
    
}
}
 class pair
{
    char ch;
    int f;
    public pair(char ch,int f){
        this.ch=ch;
        this.f=f;
    }
    
}
