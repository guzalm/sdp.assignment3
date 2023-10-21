class TwitterPostAdapter implements PostAdapter {
    private TwitterService twitterService;

    public TwitterPostAdapter() {
        this.twitterService = new TwitterService();
    }

    @Override
    public void post(String message) {
        twitterService.tweetOnTwitter(message);
    }
}
