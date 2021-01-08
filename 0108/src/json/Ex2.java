package json;

import com.fasterxml.jackson.databind.ObjectMapper;

import vo.Comment;

public class Ex2 {
	
	public static void main(String[] args)
	throws Exception {
		
		String json = 
				"{\"id\":619477749,\"userId\":192524,\"postId\":149655001,\"forumId\":53,\"parentId\":0,\"type\":\"COMMENT\",\"status\":\"S\",\"flags\":257,\"rating\":1,\"content\":\"내 소원은 예매하기전으로 돌아가는것...\",\"createdAt\":\"2020-12-23T19:31:36+0900\",\"updatedAt\":\"2020-12-23T19:31:36+0900\",\"childCount\":0,\"likeCount\":107,\"dislikeCount\":27,\"recommendCount\":80,\"screenedByKeeper\":false,\"user\":{\"id\":192524,\"status\":\"S\",\"type\":\"USER\",\"flags\":0,\"icon\":\"https://t1.daumcdn.net/profile/RDey7IURK6g0\",\"url\":\"\",\"username\":\"DAUM:8ia9g\",\"roles\":\"ROLE_USER,ROLE_DAUM,ROLE_IDENTIFIED\",\"providerId\":\"DAUM\",\"providerUserId\":\"8ia9g\",\"displayName\":\"케이\",\"description\":\"\",\"commentCount\":1}}";
		
		ObjectMapper mapper = 
				new ObjectMapper();
		
		Comment comment = 
				mapper.readValue(json,
						Comment.class);
		
		System.out.println(comment.getContent());
		
	}

}
