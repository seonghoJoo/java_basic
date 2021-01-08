package json;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;

import vo.Reply;

public class Ex1 {
	
	public static void main(String[] args) throws Exception {
		
		String json = 
			"[{\"comment\":\"테스터\",\"nickname\":\"재밌어요\",\"no\":1},{\"comment\":\"테스터2\",\"nickname\":\"재미없어요\",\"no\":2},{\"comment\":\"테스터3\",\"nickname\":\"슬퍼요\",\"no\":3},{\"comment\":\"테스터4\",\"nickname\":\"놀라와요!\",\"no\":4}]";
		
		ObjectMapper om = new ObjectMapper();
		
		List<Reply> replies = 
				  om.readValue(json,new TypeReference<List<Reply>>(){});
		
		for (Reply reply : replies) {
			System.out.println(reply);
		}//for end
		
	}//main end

}//Ex1 end
