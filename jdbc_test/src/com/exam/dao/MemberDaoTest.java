package com.exam.dao;

import java.util.List;

import com.exam.vo.Member;

public class MemberDaoTest {

	public static void main(String[] args) {
		// 생성자 호출시 테이블 없으면 생성 있으면 그냥 있음
		MemberDao memberdao = new MemberDao();
		
		// member 테이블 내용 모두 삭제!
		memberdao.deleteAll();
		
		// 첫번째 샘플 데이터 준비
		Member member1 = new Member();
		member1.setId(1);// 사용자 입력 값
		member1.setName("홍길동");//사용자 입력값2
		memberdao.insert(member1);
		
		
		Member member2 = new Member(2, "박보검");
		
		Member member3 = new Member(3, "송혜교");
		memberdao.insert(member2);
		memberdao.insert(member3);
		
		
		
		// select문
		List<Member> list = memberdao.getMembers();
		for(Member m : list) {
			System.out.println(m); // m.toString() 자동호출됨
		}
		
		System.out.println("========================================");
		
		// id가 1인 member의 name을 "원빈"으로 업데이트 수행
		Member updateMember = new Member(1,"원빈"); // 업데이트 시킬 데이터
		Member updatedMember = memberdao.getMemberById(updateMember.getId());
		
		
		//select문 조건식
		memberdao.getMemberById(updatedMember.getId());
		
		
		System.out.println("프로그램 정상종료!");

	}

}
