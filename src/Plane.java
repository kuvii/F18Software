import java.io.Serializable;

public class Plane implements Serializable {
    private float fuelLevel;
    private String pilotCallSign;
    private String squadNumber;

    private boolean flaps;
    private boolean landingGear;
    private boolean ejectionSystem;

    private boolean seatOccupation;

    public Plane(float fuelLevel, String pilotCallSign, String squadNumber) {
         this.fuelLevel = fuelLevel;
         this.pilotCallSign = pilotCallSign;
         this.squadNumber = squadNumber;

        // Completa el código para cumplir con los requisitos.
        }

    public void toggleFlaps() {
            flaps = !flaps;
        }

    public void toggleLandingGear() {
            landingGear = !landingGear;
        }

    public void ejectionSystem() {
            ejectionSystem = !ejectionSystem;
        }

    public void setSeatOccupation(boolean pilotSeated) {
            seatOccupation = pilotSeated;
        }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    @Override
    public String toString() {
         return "Plane: " +
                "fuelLevel=" + fuelLevel +
                ", pilotCallSign='" + pilotCallSign + '\'' +
                ", squadNumber='" + squadNumber + '\'' +
                ", flaps=" + flaps +
                ", landingGear=" + landingGear +
                ", ejectionSystem=" + ejectionSystem +
                ", seatOccupation=" + seatOccupation;
        }

}