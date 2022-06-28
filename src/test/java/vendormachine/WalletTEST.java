package vendormachine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import vendormachine.users.util.Wallet;

public class WalletTEST {
	
	@Test
	public void testStartCredit() {
		Wallet wallet = new Wallet(1F);
		assertEquals(wallet.getAllCredit(), 1L);
	}
	
	@Test
	public void testAddCredit() {
		Wallet wallet1 = new Wallet();
		wallet1.addCredit(2f);
		assertEquals(2.5f, wallet1.getAllCredit());
	}
	
	
	}
