package ch07;

public class Ch07_12_14 {

	public static void main(String[] args) {

		// 패키지
		// 서로 관련된 클래스의 묶음
		// 클래스는 클래스 파일(*.class), 패키지는 폴더. 하위 패키지는 폴더
		// 클래스의 실제 이름(full name)은 패키지를 포함(java.lang.String)
		// rt.jar는 클래스들을 압축한 파일(JDK설치경로₩jre₩lib에 위
		
		// 패키지 선언
		// 패키지는 소스파일의 첫 번째 문장으로 단 한번 선언
		// 같은 소스 파일의 클래스들은 모두 같은 패키지에 속하게 된다
		// 패키지 선언이 없으면 이름없는(unnamed) 패키지에 속하게 된다
		
		System.out.println("Hello");
		
		// 클래스 패스(classpath)
		// 클래스 파일(*.class)의 위치를 알려주는 경로(path)
		// 환경변수 classpath로 관리하며, 경로간의 구분자는 ';'를 사용
		// classpath(환경변수)에 패키지의 루트를 등록해줘야함
		
		// 윈도우처럼 제어판 들어가서 환경변수 설정 불가..
		// 터미널 이용해서 해야하는데 나중에 해보기!
		
	}

}
