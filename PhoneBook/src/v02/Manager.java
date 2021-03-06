package v02;


class Manager {
	/*
	 * Singleton pattern 적용 
	 * 1. 생성자의 접근제어지시자를 private으로 정의 
	 * : 외부에서 생성자 호출 불가 --> 인스턴스 생성 불가
	 */
	
	private Manager() {} 
	
	//2. 사용할 인스턴스 생성
	//static method에서 사용가능하도록 변수에 static 처리
	//외부의 직접참조를 막기위해 private 처리 
	private static Manager m = new Manager();
	
	//3. 외부에서 인스턴스 요청할 메서드 생성
	//static을 통한 외부 호출이 가능하도록 처리해주어야함. 
	//외부 호출이 가능하도록 public 처리 
	public static Manager getinstance() {
		if(m==null) {
			m = new Manager();
		}
		return m;
	}
	

	static void insertMethod() {
		//입력받기 - 인스턴스 생성 - 출력 
		//지역변수의 경우에는 초기화 선언 반드시 필요 
		//사용자의 입력데이터 임시 저장;
		
		// 현재 입력 스캐너에 버퍼(입력 뒤의 빈공간)를 삭제 		
		util.phinfo.nextLine(); 
		
		String name = null;
		String pNumber = null;
		String bday = null;
		
		
		System.out.println("데이터 입력");
		System.out.println("친구의 이름을 입력해주세요. ");
		name = util.phinfo.nextLine();
		
		System.out.println("친구의 전화번호를 입력해주세요.");
		pNumber = util.phinfo.nextLine();
		
		System.out.println("친구의 생일을 입력해주세요.");
		bday = util.phinfo.nextLine();
		
		//사용자로부터 입력받은 데이터로 인스턴스 생성(객체의 변수에 저장)
		PhoneInfor_v02 pi = null; 
		
		//null을 앞에 조건으로 넣어서 null 일 경우 trim 부분까지 이어지지 않도록 한다. 오류방지. 
		//조건문을 이용해서 두 가지 상황에 대해 다른 생성자 호출 
		if(bday == null || bday.trim().length()<1) {
			pi = new PhoneInfor_v02(name, pNumber);
		} else {
			pi = new PhoneInfor_v02(name, pNumber, bday);
		}
		
		pi.getInfo();
	}
}
