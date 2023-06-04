package Ch08;
/*
 * 날짜 : 2022/08/31
 * 이름 : 조주영
 * 내용 : 다형성 테스트하기
 * 참조 페이지 : 275
 * 
 */

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");	//P.275에서 추가
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");	 //P.275에서 추가
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");  // P.275에서 추가
	}
}


public class P259 {
	ArrayList<Animal> aniList = new ArrayList<Animal>();	// P.275에서 추가
	
	public static void main(String[] args) {
		P259 aTest = new P259();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
		
		P259 bTest = new P259();
		bTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		bTest.testCasting();						// P.275에서 추가
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());			// P.275에서 추가

	
	for (Animal ani : aniList) {
		ani.move();
	}
	}	


public void testCasting() {
	for(int i=0; i<aniList.size(); i++) {
		Animal ani = aniList.get(i);
		if(ani instanceof Human) {
			Human h = (Human)ani;
			h.readBook();
		
	}
		
		else if (ani instanceof Tiger) {
			Tiger t = (Tiger)ani;
			t.hunting();
		}
		
		else if (ani instanceof Eagle) {
			Eagle e = (Eagle)ani;
			e.flying();
		}
		else {
			System.out.println("지원되지 않는 형입니다.");
		}
}
}

}

