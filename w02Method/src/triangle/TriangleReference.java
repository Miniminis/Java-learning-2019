package triangle;

public class TriangleReference {
	float width; // 삼각형의 밑변 데이터, 단위 cm, 자동 초기화 값은 0;
	float height; // 삼각형의 높이 데이터, 단위 cm, 자동 초기화 값은 0;

	// 삼각형의 밑변, 높이 데이터를 설정한다.
	// @ w: 설정할 밑변 데이터,
	// @ h: 설정할 높이 데이터
	void setData(float w, float h) {
		width = w;
		height = h;
	}

	// 객체가 가지고 있는 높이, 밑변 데이터를 가지고 삼각형의 넓이 계산해서 '반환'
	// * return : 삼각형의 넓이 계산 후 float 형의 데이터 변환
	//
	float calArea() {
		float result = width * height / 2f;
		return result;
	}
}
