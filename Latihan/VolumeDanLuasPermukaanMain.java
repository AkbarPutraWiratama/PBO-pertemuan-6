package Latihan;

public class VolumeDanLuasPermukaanMain {
    public static void main(String[] args) {
	VolumeDanLuasPermukaan VolumeDanLuasPermukaan = new VolumeDanLuasPermukaan();
	double x = 5;
	System.out.println("Volume Kubus: " + VolumeDanLuasPermukaan.volume(x));
	System.out.println("Luas Permukaan Kubus: " + VolumeDanLuasPermukaan.luaspermukaan(x));
	double y = 10;
	double z = 2;
	System.out.println("Volume Balok: " + VolumeDanLuasPermukaan.volume(x,y,z));
	System.out.println("Luas Permukaan Balok: " + VolumeDanLuasPermukaan.luaspermukaan(x,y,z));
    }
}
