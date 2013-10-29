package cx.cad.nfsn.integration;

import static org.junit.Assert.*;

import cx.cad.nfsn.API;
import cx.cad.nfsn.Account;
import cx.cad.nfsn.AccountStatus;
import org.junit.Before;
import org.junit.Test;

public class APITest {

  private API api;

  @Before
  public void setUp() throws Exception {
    String user = System.getenv("NSFN_USER");
    String key = System.getenv("NSFN_KEY");
    this.api = new API(user, key, true);
  }

  @Test
  public void testAccountStatus(){
    Account a = api.getAccount(System.getenv("NSFN_TEST_ACCOUNT"));
    AccountStatus status = a.getStatus();
    assertNotNull(status.getStatus());
    assertNotNull(status.getColor());
    assertNotNull(status.getShortCode());
  }
}
