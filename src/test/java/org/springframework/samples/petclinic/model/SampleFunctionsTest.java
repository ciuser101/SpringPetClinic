package org.springframework.samples.petclinic.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SampleFunctionsTest {

	@Test
	public void testAdditionOfNumbers() {
        String oldName = "AA";
        String newName = "A" + "A";
        assertThat(oldName).isEqualTo(newName);
	}
	
	@Test
	public void testAdditionOfNumbers1() {
        String oldName = "AA";
        String newName = "A" + "A";
        assertThat(oldName).isEqualTo(newName);
	}
}
