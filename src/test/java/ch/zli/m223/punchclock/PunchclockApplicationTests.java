package ch.zli.m223.punchclock;

import ch.zli.m223.punchclock.domain.Entry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PunchclockApplicationTests {
	@RunWith(Parameterized.class)
	public class ParameterizedTestFields {
		@Parameterized.Parameter(0)
		public int m1;
		@Parameterized.Parameter(1)
		public String name;
		@Parameterized.Parameter(2)
		public String result;

	}


	@Test
	public void contextLoads() {
	}



	@Test
	public void variabelsEntry() {
		Entry entry = new Entry(entry.getId());

	}


}
