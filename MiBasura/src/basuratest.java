import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class basuratest {

	@Test
	void test() {
		
		
		assertEquals(0, Desechos.cuentavocales(""));
		assertEquals(1, Desechos.cuentavocales("a"));
		assertEquals(1, Desechos.cuentavocales("al"));
		assertEquals(5, Desechos.cuentavocales("aeiou"));
		assertEquals(2, Desechos.cuentavocales("nepe"));
		assertEquals(6, Desechos.cuentavocales("hola como estas"));
		assertEquals(0, Desechos.cuentavocales("A"));
		assertEquals(0, Desechos.cuentavocales("xd"));
		assertEquals(0, Desechos.cuentavocales("123345462"));
		assertEquals(8, Desechos.cuentavocales("mi gato es muy bonito"));
		assertEquals(0, Desechos.cuentavocales("          "));
		assertEquals(6, Desechos.cuentavocales("guau guau"));
		assertEquals(10, Desechos.cuentavocales("la bola del projector esta op"));
		assertEquals(2, Desechos.cuentavocales("pq te mors"));
		assertEquals(8, Desechos.cuentavocales("ya no se que mas poner"));
		
		
		assertEquals(0, Desechos.cuentaconsonantes(""));
		assertEquals(0, Desechos.cuentaconsonantes("a"));
		assertEquals(1, Desechos.cuentaconsonantes("al"));
		assertEquals(2, Desechos.cuentaconsonantes("nepe"));
		assertEquals(0, Desechos.cuentaconsonantes("aeiou"));
		assertEquals(0, Desechos.cuentaconsonantes("           "));
		assertEquals(8, Desechos.cuentaconsonantes("do you know the wae"));
		assertEquals(10, Desechos.cuentaconsonantes("mi gato sabe conducir"));
		assertEquals(5, Desechos.cuentaconsonantes("hola a todos"));
		assertEquals(12, Desechos.cuentaconsonantes("este programa es muy util"));
		assertEquals(10, Desechos.cuentaconsonantes("xdxdxdxdxd"));
		assertEquals(0, Desechos.cuentaconsonantes("LLLLLL"));
		assertEquals(9, Desechos.cuentaconsonantes("esto no se acaba nunca"));
		assertEquals(5, Desechos.cuentaconsonantes("pues quiza si"));
		assertEquals(9, Desechos.cuentaconsonantes("ya no se que mas poner"));
		
		
	}

}
