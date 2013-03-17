/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package sensors;
 
import java.io.*;
import java.nio.*;
import java.util.*;
import lcm.lcm.*;
 
public final class dvl_t implements lcm.lcm.LCMEncodable
{
    public long utime;
    public short dvl_number;
    public double altitude;
    public double bottom_vel[];
    public double bottom_rng[];
    public short bt_good_beams;
    public double water_vel[];
    public short wt_good_beams;
    public double temp;
    public double sv;
    public double salinity;
    public double depth;
    public double sec_since_midnight;
 
    public dvl_t()
    {
        bottom_vel = new double[4];
        bottom_rng = new double[4];
        water_vel = new double[4];
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x029dc894ead5ec48L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class>());
    }
 
    public static long _hashRecursive(ArrayList<Class> classes)
    {
        if (classes.contains(sensors.dvl_t.class))
            return 0L;
 
        classes.add(sensors.dvl_t.class);
        long hash = LCM_FINGERPRINT_BASE
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        outs.writeLong(this.utime); 
 
        outs.writeShort(this.dvl_number); 
 
        outs.writeDouble(this.altitude); 
 
        for (int a = 0; a < 4; a++) {
            outs.writeDouble(this.bottom_vel[a]); 
        }
 
        for (int a = 0; a < 4; a++) {
            outs.writeDouble(this.bottom_rng[a]); 
        }
 
        outs.writeShort(this.bt_good_beams); 
 
        for (int a = 0; a < 4; a++) {
            outs.writeDouble(this.water_vel[a]); 
        }
 
        outs.writeShort(this.wt_good_beams); 
 
        outs.writeDouble(this.temp); 
 
        outs.writeDouble(this.sv); 
 
        outs.writeDouble(this.salinity); 
 
        outs.writeDouble(this.depth); 
 
        outs.writeDouble(this.sec_since_midnight); 
 
    }
 
    public dvl_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public dvl_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static sensors.dvl_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        sensors.dvl_t o = new sensors.dvl_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.utime = ins.readLong();
 
        this.dvl_number = ins.readShort();
 
        this.altitude = ins.readDouble();
 
        this.bottom_vel = new double[(int) 4];
        for (int a = 0; a < 4; a++) {
            this.bottom_vel[a] = ins.readDouble();
        }
 
        this.bottom_rng = new double[(int) 4];
        for (int a = 0; a < 4; a++) {
            this.bottom_rng[a] = ins.readDouble();
        }
 
        this.bt_good_beams = ins.readShort();
 
        this.water_vel = new double[(int) 4];
        for (int a = 0; a < 4; a++) {
            this.water_vel[a] = ins.readDouble();
        }
 
        this.wt_good_beams = ins.readShort();
 
        this.temp = ins.readDouble();
 
        this.sv = ins.readDouble();
 
        this.salinity = ins.readDouble();
 
        this.depth = ins.readDouble();
 
        this.sec_since_midnight = ins.readDouble();
 
    }
 
    public sensors.dvl_t copy()
    {
        sensors.dvl_t outobj = new sensors.dvl_t();
        outobj.utime = this.utime;
 
        outobj.dvl_number = this.dvl_number;
 
        outobj.altitude = this.altitude;
 
        outobj.bottom_vel = new double[(int) 4];
        System.arraycopy(this.bottom_vel, 0, outobj.bottom_vel, 0, 4); 
        outobj.bottom_rng = new double[(int) 4];
        System.arraycopy(this.bottom_rng, 0, outobj.bottom_rng, 0, 4); 
        outobj.bt_good_beams = this.bt_good_beams;
 
        outobj.water_vel = new double[(int) 4];
        System.arraycopy(this.water_vel, 0, outobj.water_vel, 0, 4); 
        outobj.wt_good_beams = this.wt_good_beams;
 
        outobj.temp = this.temp;
 
        outobj.sv = this.sv;
 
        outobj.salinity = this.salinity;
 
        outobj.depth = this.depth;
 
        outobj.sec_since_midnight = this.sec_since_midnight;
 
        return outobj;
    }
 
}
