package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    //static으로 생성했기 때문에, new member가 아무리 많아도 '하나만 생성될 것이란 것' 짐작 가능
    //다만, 밑에서 '싱글톤'으로 만들었기 때문에 static 굳이 쓰지 않아도, 하나인 것이 보장됨
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    //싱글톤으로 만들것 것
    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance(){
        return instance;
    }
    //싱글톤 이므로 -> private으로 생성자 막아야하는 것 주의!
    private MemberRepository(){
    }


    //저장
    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    //조회
    public Member findById(Long id){
        return store.get(id);
    }

    //전체 조회
    public List<Member> findAll(){
        return new ArrayList<>(store.values()); //store에 있는 모든 값 꺼내어, arraylist로 넘겨줌
    }

    public void clearStore(){
        store.clear(); //test에서만 사용함, store 날림
    }
}
