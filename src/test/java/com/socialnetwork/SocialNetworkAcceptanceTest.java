package com.socialnetwork;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alessiocoser on 19/01/2018.
 */
public class SocialNetworkAcceptanceTest {
    @Test
    public void userCanPostAndReadMessages() {
        SocialNetwork socialNetwork = new SocialNetwork();

        socialNetwork.send("Alice -> I love the weather today");

        String output = socialNetwork.send("Alice");

        Assert.assertEquals("I love the weather today (some time ago)", output);
    }
}
