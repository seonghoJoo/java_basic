package json;

import com.fasterxml.jackson.databind.ObjectMapper;

import vo.Reply;

public class Ex3 {
	public static void main(String[] args) throws Exception {
		
		String json = "[{\"comment\":\"테스터1\",\"nickname\":\"재밌어요\",\"no\":1},{\"comment\":\"테스터2\",\"nickname\":\"재밌어요\",\"no\":2},{\"comment\":\"테스터3\",\"nickname\":\"재밌어요\",\"no\":3},{\"comment\":\"테스터4\",\"nickname\":\"재밌어요\",\"no\":4}]";
		
		ObjectMapper om = new ObjectMapper();
		Reply[] replies = om.readValue(json, Reply[].class);
		
		for(Reply reply : replies) {
			System.out.println(reply.getComment());
			System.out.println(reply.getNickname());
			System.out.println(reply.getNo());
		}
		
	}//main() end
}//Ex3 end
