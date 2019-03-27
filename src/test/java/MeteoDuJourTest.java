import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MeteoDuJourTest {

	@Test
	void testComparateur() {
		MeteoDuJour first = new MeteoDuJour(1, 100, 0); // => spread = 100
		MeteoDuJour second = new MeteoDuJour(2, 0, 0); // => spread = 0
		BySpreadComparator spreadComparator = new BySpreadComparator();
		Assertions.assertThat(spreadComparator.compare(first, second)).isGreaterThan(0);
	}

}
