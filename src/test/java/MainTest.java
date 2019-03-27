
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testReadFile() {
		Main main = new Main();
		List<MeteoDuJour> result = main.readFile();
		Assertions.assertThat(result).isNotEmpty();
	}

}
