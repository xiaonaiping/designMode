package builderMode.domain;

/**
 * Created by wangxc on 2017/8/19 15:33.
 */
public class AirShip {
    private OrbitalModule orbitalModule;//轨道仓
    private Engineer engineer;//发动机
    private EscapeTower escapeTower;//逃逸塔

    public AirShip(OrbitalModule orbitalModule, Engineer engineer, EscapeTower escapeTower) {
        this.orbitalModule = orbitalModule;
        this.engineer = engineer;
        this.escapeTower = escapeTower;
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engineer getEngineer() {
        return engineer;
    }

    public void setEngineer(Engineer engineer) {
        this.engineer = engineer;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
class OrbitalModule{
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Engineer{
    private String name;

    public Engineer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class EscapeTower{
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
