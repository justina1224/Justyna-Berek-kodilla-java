package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTestSuite {

    static int testCounter = 1;

    @Before
    public void getTestNumber() {
        System.out.println("\nTest number " + testCounter++);
    }

    @Test
    public void testDefaultSharingStrategies() {

        SocialPublisher socialPublisher;
        //Given
        User joanna = new Millenials("Joanna Zieba");
        User adam = new YGeneration("Adam Zych");
        User pawel = new ZGeneration("Pawel Trynda");

        //When
        String joannaSocialMedia = joanna.socialPublisher.share();
        System.out.println(joanna.getName() + " prefer " + joannaSocialMedia);
        String adamSocialMedia = adam.socialPublisher.share();
        System.out.println(adam.getName() + " prefer " + adamSocialMedia);
        String pawelSocialMedia = pawel.socialPublisher.share();
        System.out.println(pawel.getName() + " prefer " + pawelSocialMedia);

        //Then
        Assert.assertEquals("sharing posts on Twitter", joannaSocialMedia);
        Assert.assertEquals("sharing posts on Facebook", adamSocialMedia);
        Assert.assertEquals("sharing posts on Snapchat", pawelSocialMedia);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User joanna = new Millenials("Joanna Zieba");

        //When
        String joannaSocialMedia = joanna.socialPublisher.share();
        System.out.println(joanna.getName() + " prefer " + joannaSocialMedia);
        joanna.setSharingPostsDefaultMethod(new FacebookPublisher("Facebook"));
        joannaSocialMedia = joanna.socialPublisher.share();
        System.out.println(joanna.getName() + " default sharing posts method is now " + joannaSocialMedia);

        //Then
        Assert.assertEquals("sharing posts on Facebook", joannaSocialMedia);

    }
}
