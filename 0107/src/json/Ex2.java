package json;

import com.fasterxml.jackson.databind.ObjectMapper;

import vo.Reply;

public class Ex2 {

	public static void main(String[] args) throws Exception{
		String json="{\"no\":1, \"comment\":\"재밌어요\",\"likeCount\":3}";
		System.out.println(json);
		
		//json -> Reply 객체로
		//json -> Reply[]로
		//json -> List<Reply>로
		
		ObjectMapper om = new ObjectMapper();
		Reply reply = om.readValue(json,Reply.class);
		System.out.println(reply.getComment());
	}

}
