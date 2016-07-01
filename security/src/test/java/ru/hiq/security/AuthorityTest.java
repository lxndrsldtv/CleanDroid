package ru.hiq.security;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by alex.soldatov on 12/05/16.
 */
public class AuthorityTest {

    @Test
    public void test_that_authority_is_as_constructed() {
        Authority theAuthority = new Authority("admin");
        Assert.assertEquals("Autority name differs from what was constructed",
                "admin", theAuthority.getAuthorityName());
    }

}
