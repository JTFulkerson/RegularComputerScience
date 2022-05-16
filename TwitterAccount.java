public class TwitterAccount {
   private String accountName;
   private int followerCount;
   private int followingCount;
   public TwitterAccount(String a, int f, int fing) {
      accountName = a;
      followerCount = f;
      followingCount = fing;
   }
   public TwitterAccount() {
      accountName = "mcleanhigh";
      followerCount = 2586;
      followingCount = 79;
   }
   public void setAccountName(String a) {
      accountName = a;
   }
   public void setFollowerCount(int f) {
      followerCount = f;
   }
      public void setFollowingCount(int fing) {
      followingCount = fing;
   }
   public String getAccountName() {
      return accountName;
   }
   public int getFollowerCount() {
      return followerCount;
   }
   public int getFollowingCount() {
      return followingCount;
   }
   public String toString() {
      return "@" + accountName + " has " + followerCount + " followers, and follows " + followingCount + " people";
   }
   public String calcPopularity() {
   String d = "null";
      if (followerCount < 50) {
         d = "not popular";
      }
      else if (followerCount >= 50 && followerCount <= 10000) {
         d = "somewhat popular";
      }
      else if (followerCount > 10000) {
         d = "popular";
      }
      return d;
   }
      public String calcFollowing() {
   String d = "null";
      if (followingCount < 100) {
         d = "does not follow many people";
      }
      else if (followingCount >= 100) {
         d = "folows a decent number of people";
      }
      else if (followingCount > 1500) {
         d = "follows way to many people";
      }
      return d;
   }
}