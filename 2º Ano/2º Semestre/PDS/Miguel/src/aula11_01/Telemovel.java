package aula11_01;

public class Telemovel {
    private static int    all_id = 0;
    private        int    id;
    private        double price;
    private        int    cpuCores;
    private        double cpuSpeed;
    private        double camera_res;

    public Telemovel(double price, int cpuCores, double cpuSpeed, double camera_res) {
        all_id++;
        id = all_id;
        this.price = price;
        this.cpuCores = cpuCores;
        this.cpuSpeed = cpuSpeed;

        this.camera_res = camera_res;
    }

    public double getPrice() {
        return price;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public int getId() {
        return id;
    }

    public double getCamera_res() {
        return camera_res;
    }

    @Override
    public String toString() {
        return String.format(
                "Telemovel - id=%2d {price=%s, cpuCores=%d, cpuSpeed=%s, camera_res=%s}",
                id,
                price,
                cpuCores,
                cpuSpeed,
                camera_res);
    }
}
