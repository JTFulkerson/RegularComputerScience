public class LaserTagPlayer {
   private String name;
   private int laserPower;
   private int shieldStrength;

   public LaserTagPlayer(String n, int l, int s) {
      name = n;
      laserPower = l;
      shieldStrength = s;
   }
   public LaserTagPlayer(String n) {
      name = n;
      laserPower = (int)(Math.random()*10)+1;
      shieldStrength = 100;
   }
   public void setName(String n) {
      name = n;
   }
   public void setLaserPower(int l) {
      laserPower = l;
   }
   public void setShieldStrength(int s) {
      shieldStrength = s;
   }
   public String getName() {
      return name;
   }
   public int getLaserPower() {
      return laserPower;
   }
   public int getShieldStrength() {
      return shieldStrength;
   }
   public String toString() {
      return name + ": laser @ " + laserPower + " and shield @ " + shieldStrength;
   }
   public boolean isShieldDepleted(){
      return (shieldStrength<=0);
   }
   public void attemptToTag(LaserTagPlayer that)  {
   int newStrength = 0;
      int percent = (int)(Math.random()*2)+1;
      if(percent==1){
         newStrength = (that.getShieldStrength()) - (this.getLaserPower());
         that.setShieldStrength(newStrength);
      }
   }
}
