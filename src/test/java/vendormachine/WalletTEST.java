package vendormachine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import vendormachine.users.util.Wallet;

public class WalletTEST {
	
	public final Wallet wallet1 = new Wallet();
	
	@Test
	public void testStartCredit() {
		Wallet wallet1 = new Wallet(1F);
		assertEquals(wallet1.getAllCredit(), 1L);
	}
	
	
	@Test
	public void testAddCredit() {
		Wallet wallet1 = new Wallet();
		wallet1.addCredit(2f);
		assertEquals(2.5f, wallet1.getAllCredit());
	}
	
	@Test
	public void testGetCredit() {
		assertEquals(wallet1.getCredit(0.5F), 0.5F);
	}

	@Test
	public void testGetTooMuchCredit() {
		assertEquals(wallet1.getCredit(2F), 0);
	}


	@Test
	public void testSetCredit() {
		wallet1.setCredit(2F);
		assertEquals(wallet1.getAllCredit(), 2F);
	}

	
	}
