package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
//			Member member = new Member();       // 저장
//			member.setId(2L);
//			member.setName("HelloB");
//			em.persist(member);

//			Member findMember = em.find(Member.class, 1L);      // 찾기
//			System.out.println("findMember.id = " + findMember.getId());
//			System.out.println("findMember.name = " + findMember.getName());

//			em.remove(findMember);      // 삭제

//			findMember.setName("HelloJPA");         // 수정

			// JPQL
//			List<Member> result = em.createQuery("select m from Member as m", Member.class)
//					.getResultList();
//			for (Member member : result) {
//				System.out.println("member.getName() = " + member.getName());
//			}

//			// 비영속
//			Member member = new Member();
//			member.setId(101L);
//			member.setName("HelloJPA");

			// 영속
//			em.persist(member);

//			Member findMember1 = em.find(Member.class, 101L);
//			Member findMember2 = em.find(Member.class, 101L);
//
//			System.out.println("result = " + (findMember1 == findMember2));
//			System.out.println("findMember.getId() = " + findMember1.getId());
//			System.out.println("findMember.getName() = " + findMember1.getName());

			Member member = new Member(200L, "member200");
			em.persist(member);


			System.out.println("=================");
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}

		emf.close();
	}
}
