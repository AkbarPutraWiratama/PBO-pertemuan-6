package Latihan;

public class VolumeDanLuasPermukaan {
	double x, y, z;
	public double volume(double x) {
	return x*x*x;
	}
	public double volume(double x, double y, double z) {
	return x*y*z;
	}
	public double luaspermukaan(double x) {
	return 6*x;
	}
	public double luaspermukaan(double x, double y, double z) {
	return 2*((x * y) + (x * z) + (y * z ));	
	}
}
