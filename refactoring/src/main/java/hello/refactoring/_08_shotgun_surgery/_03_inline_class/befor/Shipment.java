package hello.refactoring._08_shotgun_surgery._03_inline_class.befor;

public class Shipment {

    private TrackingInformation trackingInformation;

    public Shipment(TrackingInformation trackingInformation) {
        this.trackingInformation = trackingInformation;
    }

    public TrackingInformation getTrackingInformation() {
        return trackingInformation;
    }

    public void setTrackingInformation(TrackingInformation trackingInformation) {
        this.trackingInformation = trackingInformation;
    }

    public String getTrackingInfo() {
        return this.trackingInformation.display();
    }
}
