package naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ReviewCrawlingApp {

	//HTML
	public static void main(String[] args) throws IOException {//예외를 위임해버리기 지금은 수업이니 어쩔수 없다..
		
		//Document 문서
		Document doc = Jsoup.connect("https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code=163834&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false").get();//서버 주소 get방식
		//page를 for문 돌려라
		
		//HTML이 모두 출력됨
		//System.out.println(doc);
		
		Elements list =  doc.select(".score_result ul li");
		
		for(Element item : list) {
			
			Elements starScoreDivs = item.select(".star_score");
//
//			Element startScoreDiv = starScoreDivs.get(0);
//			System.out.println(startScoreDiv);
//			System.out.println(starScore);
			String startScore = item.select(".star_score").get(0).text();
			//System.out.println(startScore);
			
			String nickname = item.select(".score_reple dl dt em").get(0).text();
			
			String comment = item.select(".score_reple span").get(1).text();
			
			String id = item.select(".score_reple span").get(1).attr("id");
			
			//속성을 얻어오는 것 attr
			
			String regdate = item.select(".score_reple dl dt em").get(1).ownText();
			
//			Reply re = new Reply(nickname,comment,regdate);
//			String insert = "INSERT INTO replies(no,commnet,nickname,regdate)"
			
		}// for end
		
		
		
	}//main() end
	
}//ReviewCrawlingApp end
