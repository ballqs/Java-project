package com.exam.dao;

import java.util.List;

import com.exam.vo.Member;

public class MemberDaoTest {

	public static void main(String[] args) {
		// ������ ȣ��� ���̺� ������ ���� ������ �׳� ����
		MemberDao memberdao = new MemberDao();
		
		// member ���̺� ���� ��� ����!
		memberdao.deleteAll();
		
		// ù��° ���� ������ �غ�
		Member member1 = new Member();
		member1.setId(1);// ����� �Է� ��
		member1.setName("ȫ�浿");//����� �Է°�2
		memberdao.insert(member1);
		
		
		Member member2 = new Member(2, "�ں���");
		
		Member member3 = new Member(3, "������");
		memberdao.insert(member2);
		memberdao.insert(member3);
		
		
		
		// select��
		List<Member> list = memberdao.getMembers();
		for(Member m : list) {
			System.out.println(m); // m.toString() �ڵ�ȣ���
		}
		
		System.out.println("========================================");
		
		// id�� 1�� member�� name�� "����"���� ������Ʈ ����
		Member updateMember = new Member(1,"����"); // ������Ʈ ��ų ������
		Member updatedMember = memberdao.getMemberById(updateMember.getId());
		
		
		//select�� ���ǽ�
		memberdao.getMemberById(updatedMember.getId());
		
		
		System.out.println("���α׷� ��������!");

	}

}
