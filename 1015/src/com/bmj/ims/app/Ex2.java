package com.bmj.ims.app;

import java.util.List;

import com.bmj.ims.dao.IdolsDAO;
import com.bmj.ims.vo.Idol;
public class Ex2 {

	public static void main(String[] args) {
		// 아이돌 전부 출력
		// 1) 유노윤호 동방신기
		List<Idol> idols = IdolsDAO.selectList();
		for (Idol idol : idols) {
			System.out.println(idol);
		}//for each end
	}//main() end

}//Ex2 end
