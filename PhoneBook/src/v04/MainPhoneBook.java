package v04;

import util.Util;

public class MainPhoneBook {

	public static void main(String[] args) {
		Manager_v4 frenManager = Manager_v4.getInstance();
		
		while(true) {
			int choice = frenManager.startMenu();
			
			switch(choice) {
			case Util.INSERT: //1) 신규정보등록 선택 --> 2) 소속 선택 구조
				frenManager.deptInput();
				break;
			case Util.SEARCH: 
				frenManager.searchInfo();
				break;
			case Util.DELETE: 
				frenManager.searchDelete();
				break;
			case Util.ALLINFO: 
				frenManager.showAllInfo();
				break;
			case Util.BASICINFO: 
				frenManager.showBasicInfo();
				break;
			case Util.END: 
				System.out.println("이용해주셔서 감사합니다. 프로그램이 종료됩니다. ");
				return;
			}
			
		}
	}

}

/* 기본구조분석 
 * 1. 메인클래스 - Manager 인스턴스 생성 -> 호출하여 그 안의 기능들을 사용할 수 있도록!
 * 
 * 2. PhoneInfor (상위) - 기본데이터: 이름, 전화번호, 주소, 이메일
 * 
 * 3. PhoneUnivInfor - phoneInfor 상속: 이름, 전화번호, 주소, 이메일 + 전공, 학년 추가로 받기
 * 
 * 4. PhoneCompanyInfor - phoneInfor 상속: 이름, 전화번호, 주소, 이메일 +회사
 * 
 * 5. PhonefamilyInfor - phoneinfor 상속:
 * 
 * 5. Manager class 기능 구현 
 * - 0) 초기 메뉴 입력 기능 
 * - 1) 정보 저장 기능: 소속에 따라서 다른 클래스에 저장하기 
 * -  2) 정보 검색 기능 
 * - 3) 정보 검색+출력 기능 
 * - 4) 정보 검색+삭제 기능 
 * 3-1) 정보 수정 기능 
 * - 5) 전체 정보 조회 기능
 * - 6) 기본 정보 조회 기능
 */ 

