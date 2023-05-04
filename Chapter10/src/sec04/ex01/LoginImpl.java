package sec04.ex01;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener; // 세션에서 속성(attribute) 값이 변형될 때 알림을 받을 수 있게 해주는 메서드

//세션에 바인딩 시 이벤트 처리
public class LoginImpl implements HttpSessionBindingListener {
	String user_id;
	String user_pw;
	static int total_user=0; //세션 바인딩 시 접속자 수
	public LoginImpl( ) {	
	}
	public LoginImpl(String user_id, String user_pw) {
		this.user_id = user_id;
		this.user_pw = user_pw;
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {	
		System.out.println("사용자 접속");
		++total_user;
		//세션에 저장 시 접속자수  증가
		//valueBound()메서드는 세션 속성이 추가될 때 호출되며,
		//HttpSessionBindingEvent 객체를 인자로 받음
		//이 객체는 세션에서 추가된 속성의 이름과 값을 가져올 수 있음
}
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
			System.out.println("사용자 접속 해제");
			total_user--;
			//세션에서 소멸 시 접속자 수 감소
			//valueBound()메서드는 세션 속성이 감소될 때 호출되며,
			//HttpSessionBindingEvent 객체를 인자로 받음
			//이 객체는 세션에서 추가된 속성의 이름과 값을 가져올 수 있음
	}
}
