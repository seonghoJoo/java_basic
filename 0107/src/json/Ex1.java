package json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import vo.Reply;

public class Ex1 {
	
	
	public static void main(String[] args) throws Exception {
		
		List<Reply> replies = new ArrayList<Reply>();
		replies.add(new Reply(1,"테스터1","재밌어요"));
		replies.add(new Reply(2,"테스터2","재밌어요"));
		replies.add(new Reply(3,"테스터3","재밌어요"));
		replies.add(new Reply(4,"테스터4","재밌어요"));
		
		ObjectMapper om = new ObjectMapper();
		
		Reply reply = new Reply(5,"후후","하하하");
		
		String json = om.writeValueAsString(replies);
		
		System.out.println(json);
		
	}//main() end
}//Ex1 end
