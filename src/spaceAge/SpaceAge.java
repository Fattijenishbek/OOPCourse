package spaceAge;

public class SpaceAge {
    private long period;
    private double Earth=31557600;

    public SpaceAge(long period) {
        this.period = period;
    }
    public double onEarth(){
        return period/Earth;
    }
    public double onMercury(){
        return period/(Earth*0.2408467);
    }
    public double onVenus(){
        return period/(Earth*0.61519726 );
    }
    public double onMars(){
        return period/(Earth*1.8808158 );
    }
    public double onJupiter(){
        return period/(Earth*11.862615 );
    }
    public double onSaturn(){
        return period/(Earth*29.447498 );
    }
    public double onUranus(){
        return period/(Earth*84.016846 );
    }
    public double onNeptune(){
        return period/(Earth*164.79132 );
    }
}
