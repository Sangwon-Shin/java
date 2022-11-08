package day20_221108.Ex02;

import oracle.net.aso.f;

public interface Figure extends Comparable {
	double getArea();
	// 이 인터페이스는 Comparable 인터페이스가 가지고 있는
	// compareTo() 추상함수도 가지고 있다.
	void toPrint();
	@Override
	default int compareTo(Object o) {
		Figure f = (Figure) o;
		int res = this.getArea() == f.getArea() ? 0 :
					this.getArea() < f.getArea() ? 1 : -1;
		return res;
	}
}
