package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint point) {
        this.trackPoints.add(point);

    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = trackPoints.stream().mapToDouble(t -> t.getCoordinate().getLatitude()).max().orElse(0.0);
        double maxLongitude = trackPoints.stream().mapToDouble(t -> t.getCoordinate().getLongitude()).max().orElse(0.0);
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public Coordinate findMinimumCoordinate() {
        double minLatitude = trackPoints.stream().mapToDouble(t -> t.getCoordinate().getLatitude()).min().orElse(0.0);
        double minLongitude = trackPoints.stream().mapToDouble(t -> t.getCoordinate().getLongitude()).min().orElse(0.0);
        return new Coordinate(minLatitude, minLongitude);

    }

    public double getDistance() {
        double distance=0;
        for (int i = 1; i < trackPoints.size(); i++) {
            distance+=trackPoints.get(i).getDistanceFrom(trackPoints.get(i-1));
        }
        return distance;
    }


    public double getFullDecrease() {
        double decrease = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i - 1).getElevation() > trackPoints.get(i).getElevation()) {
                decrease += trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation();
            }
        }
        return decrease;

    }

    public double getFullElevation() {
        double increase = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i - 1).getElevation() < trackPoints.get(i).getElevation()) {
                increase += trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation();
            }
        }
        return increase;
    }

    public double getRectangleArea() {
        Coordinate c1 = findMinimumCoordinate();
        Coordinate c2 = findMaximumCoordinate(); //átlók
        Coordinate c3 = new Coordinate(c2.getLatitude(), c1.getLongitude()); //3. csúcs

        double a = Math.sqrt(Math.pow(c3.getLatitude() - c1.getLatitude(), 2) + Math.pow(c3.getLongitude() - c1.getLongitude(), 2));
        double b = Math.sqrt(Math.pow(c3.getLatitude() - c2.getLatitude(), 2) + Math.pow(c3.getLongitude() - c2.getLongitude(), 2));
        return a * b;
    }

    public void loadFromGpx(Path path) {
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line = "";
            double lat = 0.0;
            double lon = 0.0;
            Coordinate cord = new Coordinate(lat, lon);
            while ((line = bf.readLine()) != null) {
                if (line.strip().startsWith("<trkpt")) {
                    lat = Double.parseDouble(line.substring(15, 25));
                    lon = Double.parseDouble(line.substring(32, 42));
                    cord = new Coordinate(lat, lon);
                }
                if (line.strip().startsWith("<ele")) {
                    double ele = Double.parseDouble(line.substring(9, 14));
                    trackPoints.add(new TrackPoint(cord, ele));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot reach file!", ioe);
        }
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

}
